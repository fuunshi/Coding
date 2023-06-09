//Program to count number of digits in a number

#include <stdio.h>

int main()
{
    int n, digits = 0;
    printf("Enter a number: ");
    scanf("%d", &n);
    int x = n;
    while (n != 0)
    {
        n /= 10;
        digits++;
    }
    printf("The number of digits in %d is %d.\n", x, digits);
    return 0;
}