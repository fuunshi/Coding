#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* link;
} node;

node* head = NULL;
int count = 0;

void display() {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    node* temp = head;
    do {
        printf("%d\t", temp->data);
        temp = temp->link;
    } while (temp != head);

    printf("\n");
}

node* traverse_till(int placeValue) {
    if (head == NULL) {
        printf("Error: Linked list is empty.\n");
        exit(-1);
    }

    node* temp = head;
    int counter = 0;
    while (counter != placeValue) {
        temp = temp->link;
        counter++;
    }
    return temp;
}

void insert_head(int data) {
    node* new_node = malloc(sizeof(node));
    new_node->data = data;
    if (head == NULL) {
        new_node->link = new_node;  // Point to itself for the only node
    } else {
        new_node->link = head;
        node* temp = head;
        while (temp->link != head) {
            temp = temp->link;
        }
        temp->link = new_node;
    }
    head = new_node;
    count++;
}

void insert_tail(int data) {
    node* new_node = malloc(sizeof(node));
    new_node->data = data;
    if (head == NULL) {
        new_node->link = new_node;  // Point to itself for the only node
        head = new_node;
    } else {
        node* temp = head;
        while (temp->link != head) {
            temp = temp->link;
        }
        temp->link = new_node;
        new_node->link = head;
    }
    count++;
}

void insert() {
    int placeValue, data;
    printf("Enter the data: ");
    scanf("%d", &data);
    printf("0 means first while %d means last\nWhere would you like to enter 0 to %d: ", count, count);
    scanf("%d", &placeValue);
    printf("Before: ");
    display();
    if (placeValue == 0) {
        insert_head(data);
    } else if (placeValue == count) {
        insert_tail(data);
    } else if (placeValue > count) {
        printf("Place value doesn't exist.\n");
    } else {
        node* temp = malloc(sizeof(node));
        temp = traverse_till(placeValue - 1);
        node* new_node = malloc(sizeof(node));
        new_node->data = data;
        new_node->link = temp->link;
        temp->link = new_node;
        count++;
    }
    printf("After: ");
    display();
}

void delete_first() {
    if (head == NULL) {
        printf("The list is empty.\n");
        return;
    }

    if (head->link == head) {
        free(head);
        head = NULL;
        count--;
        return;
    }

    node* temp = head;
    node* last_node = head;
    while (last_node->link != head) {
        last_node = last_node->link;
    }
    head = head->link;
    last_node->link = head;
    free(temp);
    count--;
}

void delete_last() {
    if (head == NULL) {
        printf("List is empty. Nothing to delete.\n");
        return;
    } else if (head->link == head) {
        free(head);
        head = NULL;
        count--;
        return;
    }

    node* prev = traverse_till(count - 2);
    node* last_node = prev->link;

    prev->link = head;
    free(last_node);
    count--;
}

void delete() {
    int placeValue;
    printf("0 means first while %d means last\nWhere would you like to delete 0 to %d: ", count - 1, count - 1);
    scanf("%d", &placeValue);
    printf("Before: ");
    display();
    if (placeValue == 0) {
        delete_first();
    } else if (placeValue == count) {
        delete_last();
    } else if (placeValue > count) {
        printf("Place value doesn't exist.\n");
    } else {
        node* prev = traverse_till(placeValue - 1);
        node* temp = prev->link;

        prev->link = temp->link;
        free(temp);
        count--;
    }
    printf("After: ");
    display();
}

int main() {
    head = NULL;

    int choice;

    printf("Choices:\n1.Insert\n2.Delete\n3.Display\n4.Exit\n");
    while (1) {
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                delete();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid Choice!\n");
        }
    }
    return 0;
}
