#include <stdio.h>
#include <math.h>
int main()
{
    int i, j, k, n, iteration;
    float a[10][10], x[10], y[10], error, lamda;
    printf("Enter the error tolerance level: ");
    scanf("%f", &error);
    printf("Enter the size of the coefficient matrix: ");
    scanf("%d", &n);
    for (i = 1; i <= n; i++)
    {
        for (j = 1; j <= n; j++)
        {
            printf("Enter the element a[%d][%d]: ", i, j);
            scanf("%f", &a[i][j]);
        }
    }
    iteration = 0;
    x[1] = 1.0;
    for (i = 2; i <= n; i++)
    {
        x[i] = 0.0;
    }
    while (1)
    {
        iteration++;
        for (i = 1; i <= n; i++)
        {
            y[i] = 0.0;
            for (j = 1; j <= n; j++)
            {
                y[i] += a[i][j] * x[j];
            }
        }
        lamda = y[1];
        for (i = 1; i <= n; i++)
        {
            y[i] /= lamda;
        }
        int should_continue = 0;
        for (k = 1; k <= n; k++)
        {
            if (fabs(x[k] - y[k]) > error)
            {
                should_continue = 1;
                break;
            }
        }
        if (!should_continue)
        {
            break;
        }
    }
    printf("\nIteration %d:", iteration);
    for (i = 1; i <= n; i++)
    {
        x[i] = y[i];
        printf("\nY[%d] = %f", i, y[i]);
    }
    printf("\nThe final result is achieved!\n");
    return 0;
}
