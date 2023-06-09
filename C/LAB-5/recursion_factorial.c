//Program to find out the factorial of a nunmber using recursion

#include <stdio.h>

int recur(int n);

int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("The factorial of the given number is %d.\n", recur(n));
    return 0;
}

int recur(int n)
{
    if (n > 0)
        return n * recur(n - 1);
    else
        return 1;
}