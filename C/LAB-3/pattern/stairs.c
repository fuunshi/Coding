//Program to display
/*
*
**
***
****
*****
*/

#include <stdio.h>

int main()
{
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j != i+1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}