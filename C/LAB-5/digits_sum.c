//Program to take input and find sum of the digits in given number using function

#include <stdio.h>

int sum(int n);

int main()
{
    int n;
    printf("Enter any number: ");
    scanf("%d", &n);
    printf("The sum of all the digits in the number is %d.\n", sum(n));
    return 0;
}

int sum(int n)
{
    int sum = 0;
    while (n != 0)
    {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}