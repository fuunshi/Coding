//Program to check Odd or Even

#include <stdio.h>

int main()
{
    int check;
    printf("Enter a number: ");
    scanf("%d", &check);

    if (check % 2 == 0)             //Even numbers are divisible by 2
        printf("%d is an Even number.\n", check);
    else
        printf("%d is an Odd number.\n", check);
    return 0;
}