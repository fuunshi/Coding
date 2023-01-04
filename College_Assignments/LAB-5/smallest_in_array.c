//Program to find smallest number in array using function

#include <stdio.h>

int small(int n[], int x);

int main()
{
    int n, i;
    printf("Enter how many numbers would you like to enter in the array: ");
    scanf("%d", &n);

    int arr[n];
    for (i = 0; i < n; i++)
    {
        printf("Input in %d's place: ", i + 1);
        scanf("%d", &arr[i]);
    }
    printf("%d is the smallest in array.\n", small(arr, n));
    return 0;
}

int small(int n[], int x)
{
    int check = n[0], i;
    for (i = 1; i < x; i++)
    {
        if (n[i] < check)
            check = n[i];
    }
    return check;
}