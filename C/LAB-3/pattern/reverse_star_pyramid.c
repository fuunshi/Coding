//Program to display
/*
 *******
  *****
   ***
    *
*/

#include <stdio.h>

int main()
{
    int i, j, a = 7;
    for (i = 4; i > 0; i--)
    {
        for (j = 4; j != i; j--)
        {
            printf(" ");
        }
        for (j = 0; j != a; j++)
        {
            printf("*");
        }
        a -= 2;
        printf("\n");
    }
    return 0;
}