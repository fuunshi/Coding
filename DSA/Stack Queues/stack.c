#include <stdio.h>
#include <stdlib.h>

#define maxsize 8

int top = -1;
int dataset[maxsize];

void push();
void pop();
void display();

int main(){
    int choice;
    printf("1.Push\n2.Pop\n3.Display All\n4.Exit\n");
    while(1){
        printf("Enter Your Choice: ");
        scanf("%d", &choice);
        switch (choice){
            case 1:
                push();
                break;
            case 2:
                pop();
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

void push(){
    if (!(top == maxsize)){
        int data;
        printf("Data to Enter into Stack: ");
        scanf("%d", &data);
        top++;
        dataset[top] = data;
    } else {
        printf("Stack Overflow.\n");
    }
}

void pop(){
    if (!(top == -1)){
        printf("%d\n", dataset[top]);
        top--;
    } else {
        printf("Stack Underflow.\n");
    }
}

void display(){
    if (!(top == -1)){
        for(int i = top; i > 0; i--){
            printf("%d\n", dataset[i]);
        }
    } else {
        printf("Stack is Empty.\n");
    }
}