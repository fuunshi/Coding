#include <stdio.h>
int main()
{
    float a[3][4], t; // Declare variables for the matrix and a temporary value 't'
    int i, j, k;      // Loop variables
    // Input: Entering elements into the matrix
    printf("Enter the elements in row-wise:\n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 4; j++)
        {
            printf("a[%d][%d] : ", i, j);
            scanf("%f", &a[i][j]); // Read elements from the user
        }
    }
    // Displaying the entered matrix
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 4; j++)
        {
            printf("%.0f ", a[i][j]); // Print the entered matrix
        }
        printf("\n"); // Move to the next row
    }
    printf("\n\n");
    // Applying Gauss Elimination
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 3; j++)
        {
            if (i != j)
            {                          // If not on the diagonal
                t = a[j][i] / a[i][i]; // Calculate the factor 't'
                for (k = 0; k < 4; k++)
                {
                    a[j][k] = a[j][k] - (a[i][k] * t); // Update the matrix rows
                }
            }
        }
    }
    // Displaying the matrix after applying Gauss Elimination
    printf("In Matrix form:\n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < 4; j++)
        {
            printf("\t %.0f", a[i][j]); // Print the updated matrix}
        }
        printf("\n"); // Move to the next row
        // Displaying the solutions
        printf("\n\nSolution is = ");
        for (i = 0; i < 3; i++)
        {
            printf("%f ", a[i][3] / a[i][i]); // Print the solutions for each variable
        }
    }
    return 0;
}