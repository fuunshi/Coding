#include <stdio.h>
int main()
{
    int i, j, k, n;
    float a[20][20], x[20]; // Matrix 'a' for coefficients and vector 'x' for
    double s, p;
    // Input: Number of equations
    printf("Enter the number of equations: ");
    scanf("%d", &n);
    // Input: Coefficients of the equations
    printf("\nEnter the coefficients of the equations:\n\n");
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("a[%d][%d] = ", i, j);
            scanf("%f", &a[i][j]);
        }
        printf("b[%d] = ", i + 1); // Right-hand side value for augmented
            scanf("%f", &a[i][n]); // Store it in the last column of matrix 'a'
    }
    // Gaussian Elimination: Forward Elimination
    for (k = 0; k <= n - 1; k++)
    {
        for (i = k + 1; i < n; i++)
        {
            p = a[i][k] / a[k][k]; // Calculate the factor to eliminate the
             for (j = k; j <= n; j++)
            {
                a[i][j] = a[i][j] - (p * a[k][j]); // Update the coefficients and right-
            }
        }
    }
    // Back Substitution: Solving for 'x'
    x[n - 1] = a[n - 1][n] / a[n - 1][n - 1]; // Solve the last equation directly
    for (i = n - 2; i >= 0; i--)
    {
        s = 0;
        for (j = i + 1; j < n; j++)
        {
            s += (a[i][j] * x[j]); // Calculate the sum of other solution terms
        }
        x[i] = (a[i][n] - s) / a[i][i]; // Calculate the solution for the current variable
    }
    // Display the solutions
    printf("\nThe result is:\n");
    for (i = 0; i < n; i++)
    {
        printf("x[%d] = %.2f\n", i + 1, x[i]);
    }
    return 0;
}