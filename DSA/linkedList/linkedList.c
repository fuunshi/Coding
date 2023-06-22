#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int data;
    struct node *link;
}
node;

node *head = NULL;
int count = 0;

node *traverse_till(int placeValue){
    node *temp = head;
    int counter = 0;
    while(counter != placeValue){
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
    node *temp = malloc(sizeof(node));
    temp = traverse_till(count);
    node *ptr = malloc(sizeof(node));
    ptr->data = data;
    ptr->link = NULL;
    temp->link = ptr;
    count++;
}

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

void insert_middle(int data){
    int placeValue;
    printf("Where would you like to enter 0 to %d: ", count);
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

int main(){
    int data = 4;
    insert_tail(data);
    display();
    insert_tail(1230);
    display();
    insert_tail(123);
    display();  
}