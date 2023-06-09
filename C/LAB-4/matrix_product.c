//Product of matrix

#include <stdio.h>

int main()
{
    int x[2][2] = {{1, 2}, {1, 2}};
    int y[2][2] = {{2, 1}, {2, 1}};
    int i, j, k, product[2][2];

    for (i = 0; i < 2; i++)
    {
        for (j = 0; j < 2; j++)
        {
            product[i][j] = 0;
            for (k = 0; k < 2; k++)
            {
                product[i][j] += x[i][k] * y[k][j];
            }
        }
    }
    printf("The product of the two matrices is: \n");
    for (i = 0; i < 2; i++) {
        for (j = 0; j < 2; j++) {
            printf("%d\t", product[i][j]);
        }
        printf("\n");
    }
    return 0;
}