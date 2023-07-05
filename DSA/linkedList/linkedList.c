#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int data;
    struct node *link;
}
node;

node *head = NULL;
int count = 0;

void display(){
    node *temp = head;
    while (temp != NULL)
    {
        printf("%d\t", temp->data);
        temp = temp->link;
    }
    printf("\n");
    return;
}

node *traverse_till(int placeValue) {
    if (head == NULL) {
        printf("Error: Linked list is empty.\n");
        exit(-1);
    }

    node *temp = head;
    int counter = 0;
    while (counter != placeValue) {
        temp = temp->link;
        counter++;
    }
    return temp;
}


void insert_head(int data){
    node *temp = malloc(sizeof(node));
    temp->link = head;
    head = temp;
    temp->data = data;
    count++;
}

void insert_tail(int data){
    node *ptr = malloc(sizeof(node));
    ptr->data = data;
    ptr->link = NULL;

    if (head == NULL){
        head = ptr;
    } else {
        node *temp;
        temp = traverse_till(count-1);
        temp->link = ptr;
    }
    count++;
}

void insert(){
    int placeValue, data;
    printf("Enter the data: ");
    scanf("%d", &data);
    printf("0 means first while %d means last\nWhere would you like to enter 0 to %d: ", count, count);
    scanf("%d", &placeValue);
    printf("Before: ");
    display();
    if (placeValue == 0){
        insert_head(data);
    } else if (placeValue == count){
        insert_tail(data);
    } else if (placeValue > count){
        printf("Place value doesnt exist.\n");
    } else {
        node *temp = malloc(sizeof(node));
        temp = traverse_till(placeValue - 1);
        node *ptr = malloc(sizeof(node));
        ptr->data = data;
        ptr->link = temp->link;
        temp->link = ptr;
        count++;
    }
    printf("After: ");
    display();
}

void delete_first(){
    if (head == NULL){
        printf("The list is empty\n");
        return;
    }
    node *temp = head;
    head = temp->link;
    free(temp);
    count--;
}

void delete_last() {
    if (head == NULL) {
        printf("List is empty. Nothing to delete.\n");
        return;
    } else if (head->link == NULL) {
        // If only one node is present
        free(head);
        head = NULL;
        return;
    }

    node *prev = traverse_till(count-2);
    node *temp = prev->link;

    prev->link = NULL;
    free(temp);
    count--;
}

void delete(){
    int placeValue;
    printf("0 means first while %d means last\nWhere would you like to delete 0 to %d: ", count-1, count-1);
    scanf("%d", &placeValue);
    printf("Before: ");
    display();
    if (placeValue == 0){
        delete_first();
    } else if (placeValue == count){
        delete_last();
    } else if (placeValue > count){
        printf("Place value doesnt exist.\n");
    } else {
        node *prev = traverse_till(placeValue-1);
        node *temp = prev->link;

        prev->link = temp->link;
        free(temp);
        count--;
    }
    printf("After: ");
    display();
}

int main(){
    struct node *head, *temp;
    struct node *ptr = malloc(sizeof(struct node));
    ptr->data = 0;
    ptr->link = NULL;
    head = ptr;

    int choice;

    printf("Choices:\n1.Insert\n2.Delete\n3.Display\n4.Exit\n");
    while (1)
    {
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
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
}