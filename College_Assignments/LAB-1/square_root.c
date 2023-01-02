//Program to find square root.

#include <stdio.h>
#include <math.h>       //Library related to Calculations

int main()
{
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    printf("The square root of %d is %.2f\n", num, sqrt(num));
    return 0;
}