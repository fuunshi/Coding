//Program to sort in descending Order

#include <stdio.h>

int main()
{
    int n[] = {1, 2, 3, 4, 5};
    printf("The unsorted value is:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d\t", n[i]);
    }
    printf("\n");
    for (int i = 0; i < 5; i++)
    {
        for (int j = i; j < 5; j++)
        {
            if (n[i] < n[j])
            {
                int temp = n[i];
                n[i] = n[j];
                n[j] = temp;
            }
        }
    }
    printf("The sorted value is:\n");
    for (int i = 0; i < 5; i++)
    {
        printf("%d\t", n[i]);
    }
    printf("\n\n");
    return 0;
}