#include <stdio.h>
#include <math.h>

int main() {
    int i, j, n, iteration;
    float a[10][10], x[10], y[10], error, lambda;

    printf("Enter the error tolerance level: ");
    scanf("%f", &error);

    printf("Enter the size of the coefficient matrix: ");
    scanf("%d", &n);

    printf("Enter the elements of the coefficient matrix:\n");
    for (i = 0; i < n; i++) {
        for (j = 0; j < n; j++) {
            printf("Enter the element a[%d][%d]: ", i + 1, j + 1);
            scanf("%f", &a[i][j]);
        }
    }

    iteration = 0;
    for (i = 0; i < n; i++) {
        x[i] = 1.0; // Initialize the initial guess vector x to [1, 1, ..., 1]
    }

    while (1) {
        iteration++;

        // Perform matrix-vector multiplication
        for (i = 0; i < n; i++) {
            y[i] = 0.0;
            for (j = 0; j < n; j++) {
                y[i] += a[i][j] * x[j];
            }
        }

        // Find the element with the largest absolute value
        lambda = fabs(y[0]);
        for (i = 1; i < n; i++) {
            if (fabs(y[i]) > lambda) {
                lambda = fabs(y[i]);
            }
        }

        // Normalize the resulting vector y
        for (i = 0; i < n; i++) {
            y[i] /= lambda;
        }

        // Check convergence
        float max_diff = fabs(x[0] - y[0]);
        for (i = 1; i < n; i++) {
            float diff = fabs(x[i] - y[i]);
            if (diff > max_diff) {
                max_diff = diff;
            }
        }

        if (max_diff < error) {
            break;
        }

        // Update the guess vector x
        for (i = 0; i < n; i++) {
            x[i] = y[i];
        }
    }

    printf("\nNumber of iterations: %d\n", iteration);
    printf("Dominant eigenvector (normalized):\n");
    for (i = 0; i < n; i++) {
        printf("y[%d] = %f\n", i + 1, y[i]);
    }

    printf("\nThe final result is achieved!\n");

    return 0;
}
