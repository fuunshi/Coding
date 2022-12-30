//Program to find average of three numbers.

#include <stdio.h>

int main()
{
    int n1, n2, n3;
    printf("Enter any Three numbers.\nA, B, C:");
    scanf("%d %d %d", &n1, &n2, &n3);
    printf("Average = %2f\n", (n1 + n2 + n3) / 3.0);
    return 0;
}