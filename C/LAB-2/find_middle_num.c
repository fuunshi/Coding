//Program to find the middle number among given 3 numbers.

#include <stdio.h>

int main()
{
    int a, b, c;
    printf("Enter any Three numebrs\nA, B, C:");
    scanf("%d %d %d", &a, &b, &c);

    //Conditionals with And and Or Operators
    if ((a < b && a > c) || (a < c && a > b))
        printf("%d is the middle number.\n", a);
    else if ((b < a && b > c) || (b < c && b > a))
        printf("%d is the middle number.\n", b);
    else
        printf("%d is the middle number.\n", c);
    return 0;
}