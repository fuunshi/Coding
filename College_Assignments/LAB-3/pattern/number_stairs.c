/*
5
45
345
2345
12345
*/

#include <stdio.h>

int main()
{
    int i, j;
    for (i = 5; i > 0; i--)
    {
        for (j = i; j < 6; j++)
        {
            printf("%d", j);
        }
        printf("\n");
    }
    return 0;
}