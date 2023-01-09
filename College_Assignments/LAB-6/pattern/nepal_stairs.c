/*
N
NE
NEP
NEPA
NEPAL
*/

#include <stdio.h>

int main()
{
    int i, j;
    char x[] = "NEPAL";
    for (i = 1; i < 6; i++)
    {
        for (j = 0; j < i; j++)
        {
            printf("%c", x[j]);
        }
        printf("\n");
    }
    return 0;
}