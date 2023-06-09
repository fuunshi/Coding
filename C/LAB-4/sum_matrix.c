//Program to input and find the sum of two matrix

#include <stdio.h>

int main()
{
    int row, column, i, j;
    printf("How many rows and column would you like your matrix to have:\nRows: ");
    scanf("%d", &row);
    printf("Columns: ");
    scanf("%d:", &column);
    int matrix1[row][column], matrix2[row][column], sum[row][column];
    printf("Enter numbers in first matrix:\n");

    for (i = 0; i < row; i++)
    {
        for (j = 0; j < column; j++)
        {
            scanf("%d", &matrix1[i][j]);
        }
        printf("\n");
    }
    printf("Enter numbers in second matrix:\n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < column; j++)
        {
            scanf("%d", &matrix2[i][j]);
        }
        printf("\n");
    }
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < column; j++)
        {
            sum[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    printf("The sum of given two matrix is:\n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < column; j++)
        {
            printf("%d\t", sum[i][j]);
        }
        printf("\n");
    }
    return 0;
}