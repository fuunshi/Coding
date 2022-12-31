//Program to print numbers from 100 to 200 which ends with either 0 or 1.

#include <stdio.h>

int main()
{
    for (int i = 100; i <= 200; i++)        //intializing variable in loop
    {
        if (i % 10 == 0 || i % 10 == 1)
            printf("%d\t", i);
    }
    printf("\n");                           //optional
    return 0;
}