//Program to sort user given array of numbers

#include <stdio.h>

int main()
{
    int n, i, j, k, temp;
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
    for (i = 0; i < n; i++)
    {
        for (j = i; j < n; j++)
        {
            if (mem[i] < mem[j])
            {
                temp = mem[i];
                mem[i] = mem[j];
                mem[j] = temp;
                printf("Process: \n");
                for (k = 0; k < n; k++)
                {
                    printf("%d ", mem[k]);
                }
                printf("\n\n");
            }

        }
    }
    printf("Final Position\n");
    for (i = 0; i < n; i++)
    {
        printf("%d ", mem[i]);
    }
    printf("\n\n");
    return 0;
}