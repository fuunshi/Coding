//Program to sort user given array of numbers

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
    printf("Initial Position\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", mem[i]);
    }
    printf("\n\n");
    //TO BE CONTINUED
    return 0;
}