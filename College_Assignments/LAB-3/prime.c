//Program to print all Prime numbers between 100 and 200

#include <stdio.h>

int main()
{
    int i, j, check;
    for (i = 100; i <= 200; i++)
    {
        check = 0;
        for (j = 2; j < i / 2; j++)
        {
            if (i % j == 0)
            {
                check++;
                break;
            }
        }
        if (check == 0)
        {
            printf("%d\t", i);
        }
    }
    printf("\n");
    return 0;
}