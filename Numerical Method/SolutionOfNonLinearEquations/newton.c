#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define f(x) (3 * x - cos(x) - 1) // defining function
#define g(x) (3 + sin(x))         // defining derivative of f(x)

int main() {
    float x0, x1, f0, f1, g0, e;
    int step = 1, N;
    printf("\n Enter initial guess:");
    scanf("%f", &x0);
    printf("\n Enter tolerable error:");
    scanf("%f", &e);
    printf("\n Enter Maximum iteration:");
    scanf("%d", &N);
    printf("\nStep\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\n");
    do {
        g0 = g(x0);
        f0 = f(x0);
        if (g0 == 0.0) {
            printf("\n Mathematical Error!!!");
            exit(0);
        }
        x1 = x0 - f0 / g0;
        f1 = f(x1);
        printf("\n%d\t\t%f\t%f\t%f\t%f \n", step, x0, f0, x1, f1);
        x0 = x1;
        step = step + 1;
        if (step > N) {
            printf("\n Not Convergent.");
            exit(0);
        }
    } while (fabs(f1) > e);
    printf("\n Hence the Required Root is:%f", x1);
    return 0;
}
