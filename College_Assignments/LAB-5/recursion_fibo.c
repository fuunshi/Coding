//Program to print fibonacci numbers using recursion

#include <stdio.h>

int fibo(int n);

int main()
{
    int i;
    for (i = 0; i < 10; i++)
    {
        printf("%d\t", fibo(i));
    }
    printf("\n");
    return 0;
}

int fibo(int n)
{
    if (n == 0 || n == 1)
        return 1;
    else
        return fibo(n -1) + fibo(n - 2);
}