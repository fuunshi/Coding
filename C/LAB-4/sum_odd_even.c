//Program to Add odd and even seperately in user given number of inputs

#include <stdio.h>

int main()
{
    int n, i, odd_sum = 0, even_sum = 0;
    printf("How many numbers would you like to enter: ");
    scanf("%d", &n);
    int mem[n];
    printf("Enter number:\n");
    for (i = 0; i < n; i++)
    {
        printf("%d: ", i + 1);
        scanf("%d", &mem[i]);
        if (mem[i] % 2 == 0)
            even_sum += mem[i];
        else
            odd_sum += mem[i];
    }
    printf("The sum of odd numbers are %d.\n", odd_sum);
    printf("The sum of even numbers are %d.\n", even_sum);
    return 0;
}