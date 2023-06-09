//Program with function without return value to check odd or even

#include <stdio.h>

void check(int x);

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    check(n);
    return 0;
}

void check(int x)
{
    if (x % 2 == 0)
        printf("The given number is even.\n");
    else
        printf("The given number is odd.\n");
    return;
}