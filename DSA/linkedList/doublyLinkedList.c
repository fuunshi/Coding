#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* prev;
    struct node* next;
} node;

node* head = NULL;
node* tail = NULL;
int count = 0;

void display() {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    node* current = head;
    while (current != NULL) {
        printf("%d\t", current->data);
        current = current->next;
    }
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
        temp = temp->next;
        counter++;
    }
    return temp;
}

void insert_head(int data) {
    node* new_node = malloc(sizeof(node));
    new_node->data = data;
    new_node->prev = NULL;
    new_node->next = head;
    if (head != NULL) {
        head->prev = new_node;
    } else {
        tail = new_node;
    }
    head = new_node;
    count++;
}

void insert_tail(int data) {
    node* new_node = malloc(sizeof(node));
    new_node->data = data;
    new_node->next = NULL;
    new_node->prev = tail;
    if (tail != NULL) {
        tail->next = new_node;
    } else {
        head = new_node;
    }
    tail = new_node;
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
        new_node->next = temp->next;
        new_node->prev = temp;
        temp->next->prev = new_node;
        temp->next = new_node;
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

    node* temp = head;
    head = head->next;
    if (head != NULL) {
        head->prev = NULL;
    } else {
        tail = NULL;
    }
    free(temp);
    count--;
}

void delete_last() {
    if (head == NULL) {
        printf("List is empty. Nothing to delete.\n");
        return;
    }

    node* temp = tail;
    tail = tail->prev;
    if (tail != NULL) {
        tail->next = NULL;
    } else {
        head = NULL;
    }
    free(temp);
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
        node* temp = traverse_till(placeValue - 1);
        node* delete_node = temp->next;
        temp->next = delete_node->next;
        if (delete_node->next != NULL) {
            delete_node->next->prev = temp;
        } else {
            tail = temp;
        }
        free(delete_node);
        count--;
    }
    printf("After: ");
    display();
}

int main() {
    head = NULL;
    tail = NULL;

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
