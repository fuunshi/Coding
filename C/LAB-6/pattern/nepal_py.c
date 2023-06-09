/*
   N
  NEP
 NEPAL
*/

#include <stdio.h>

int main()
{
    int i, j, k, a = 3;
    char x[] = "NEPAL";
    for (i = 1; i < 6; i += 2)
    {
        for (k = 0; k < a; k++)
        {
            printf(" ");
        }
        a--;
        for (j = 0; j < i; j++)
        {
            printf("%c", x[j]);
        }
        printf("\n");
    }
    return 0;
}