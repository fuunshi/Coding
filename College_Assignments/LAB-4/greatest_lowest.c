//Program to find the highest and lowest number in an user given array of numbers

#include <stdio.h>

int main()
{
    int n, i;
    printf("How many numbers would you like to enter: ");
    scanf("%d", &n);
    int mem[n];
    printf("Enter number:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d: ", i + 1);
        scanf("%d", &mem[i]);
    }
    int high = mem[0], low = mem[0];
    for (i = 1; i < n; i++)
    {
        if (high < mem[i])
            high = mem[i];
        if (low > mem[i])
            low = mem[i];
    }
    printf("The greatest number among given numbers is %d.\n", high);
    printf("The lowest number among given numbers is %d.\n", low);
    return 0;
}