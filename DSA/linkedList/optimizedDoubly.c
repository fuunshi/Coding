#include <stdio.h>
#include <stdlib.h>

typedef struct node {
    int data;
    struct node* prev;
    struct node* next;
} node;

node* head = NULL;

void display() {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    node* current = head;
    printf("Doubly Linked List: ");
    while (current != NULL) {
        printf("%d ", current->data);
        current = current->next;
    }
    printf("\n");
}

void insert(int data) {
    node* new_node = (node*)malloc(sizeof(node));
    new_node->data = data;
    new_node->prev = NULL;
    new_node->next = NULL;

    if (head == NULL) {
        head = new_node;
    } else {
        new_node->next = head;
        head->prev = new_node;
        head = new_node;
    }

    printf("Inserted %d\n", data);
    display();
}

void delete(int data) {
    if (head == NULL) {
        printf("List is empty. Nothing to delete.\n");
        return;
    }

    node* current = head;
    while (current != NULL) {
        if (current->data == data) {
            if (current->prev == NULL) {
                // Deleting the first node
                head = current->next;
                if (head != NULL) {
                    head->prev = NULL;
                }
            } else {
                current->prev->next = current->next;
                if (current->next != NULL) {
                    current->next->prev = current->prev;
                }
            }

            free(current);
            printf("Deleted %d\n", data);
            display();
            return;
        }
        current = current->next;
    }

    printf("Data %d not found in the list.\n", data);
}

int main() {
    int choice, data;

    printf("Choices:\n1. Insert\n2. Delete\n3. Display\n4. Exit\n");
    while (1) {
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the data to insert: ");
                scanf("%d", &data);
                insert(data);
                break;
            case 2:
                printf("Enter the data to delete: ");
                scanf("%d", &data);
                delete(data);
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice! Please try again.\n");
                break;
        }
    }

    return 0;
}
