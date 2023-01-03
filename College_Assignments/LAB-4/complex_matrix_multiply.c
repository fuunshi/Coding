//Program to input and find the sum of two matrix
!!!WARNING INCOMPLETE!!!

#include <stdio.h>

int main()
{
    int row, column, i, j;
    printf("How many rows and column would you like your matrix to have:\nRows: ");
    scanf("%d", &row);
    printf("Columns: ");
    scanf("%d:", &column);
    int matrix1[row][column], matrix2[row][column], product[row][column];
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


    //TO BE CONTINUED




    printf("The product of given two matrix is:\n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < column; j++)
        {
            printf("%d\t", product[i][j]);
        }
        printf("\n");
    }
    return 0;
}