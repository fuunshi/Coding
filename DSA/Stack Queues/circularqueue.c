#include <stdio.h>
#include <stdlib.h>

#define maxsize 8

int dataset[maxsize];
int rear = -1;
int front = -1;

void enqueue();
void dequeue();
void display();

int main()
{
    int choice;
    printf("1.Enqueue Operation\n2.Dequeue Operation\n3.Display the Queue\n4.Exit\n");
    while (1)
    {
        printf("Enter your choice of operations : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            exit(0);
        default:
            printf("Incorrect choice \n");
        }
    }
}

void enqueue()
{
    int data;
    if (front == (rear + 1) % maxsize){
        printf("Overflow \n");
    } else {
        if (front == -1 && rear == -1){
            front = 0;
            rear = 0;
        }
        printf("Element to be inserted in the Queue : ");
        scanf("%d", &data);
        if (rear == maxsize - 1 && front != 0)
        {
            rear = 0;
        } else {
            rear = (rear + 1) % maxsize;
        }
        dataset[rear] = data;
    }
}

void dequeue()
{
    if (front == -1 && rear == -1)
    {
        printf("Underflow \n");
        return;
    } else {
        printf("Element deleted from the Queue: %d\n", dataset[front]);
        if (front == rear){
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }
}

void display()
{

    if (front == -1 && rear == -1)
        printf("Empty Queue \n");
    else
    {
        printf("Queue:\n");
        for (int i = front; i != rear; i = (i + 1) % maxsize){
            printf("%d ", dataset[i]);
            printf("\n");                               
        }
    }
}