//Program to display using iteration
/*
     1
    212
   32123
  4321234
 543212345
*/

#include <stdio.h>

int main()
{
    int i, j, a = 0;
    for (i = 1; i < 6; i++)
    {
        for (j = 5; j != i; j--)
        {
            printf(" ");
        }
        for (j = i; j != 0; j--)
        {
            printf("%d", j);
        }
        if (a != 0)
        {
            for (j = 2; j != i + 1; j++)
            {
                printf("%d", j);
            }
        }
        a++;
        printf("\n");
    }
    return 0;
}