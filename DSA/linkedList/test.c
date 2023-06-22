#include <stdio.h>
#include <stdlib.h>

typedef struct node{
    int data;
    struct node *link;
}
node;


int main(){
    
    node *list = NULL;


    int data;

    scanf("%d", &data);
    node *n = malloc(sizeof(node));

    n->data = data;
    n->link = NULL;

    n->link = list;
    list = n;

}