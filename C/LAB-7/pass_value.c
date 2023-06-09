//Program to show how pointer works

#include <stdio.h>

void val(int a, int b);
void ref(int *a, int *b);

int main()
{
    int a = 5, b = 10;
    val(a, b);
    ref(&a, &b);
    return 0;
}

void val(int a, int b)
{
    printf("Values passed by reference: %d, %d\n", a, b);
}

void ref(int *a, int *b)
{
    printf("Values passed by reference: %d, %d\n", *a, *b);
}