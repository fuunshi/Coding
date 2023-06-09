/*
KATHMANDU
 KATHMAN
  KATHM
   KAT
    K
*/

#include <stdio.h>

int main()
{
    int i, j, k, a = 3;
    char x[] = "KATHMANDU";
    for (i = 9; i > 0; i -= 2)
    {
        for (k = 4; k != a; k--)
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