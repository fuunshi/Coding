#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#define f(x) cos(x) - x *exp(x)
int main()
{
    float x0, x1, x2, f0, f1, f2, e;
    int step = 1, N;
up:
    printf("\n Enter frist initial guess:");
    scanf("%f", &x0);
    printf("\n Enter second initial guess:");
    scanf("%f", &x1);
    printf("\n Enter tolerable error:");
    scanf("%f", &e);
    printf("\n Enter Maximum iteration:");
    scanf("%f", &N);
    printf("\nStep\t\tx0\t\tx1\t\tx2\t\tf(x2)\n");
    do
    {
        f0 = f(x0);
        f1 = f(x1);
        if (f0 == f1)
        {
            printf("Mathematical Error.");
            exit(0);
        }
        x2 = x1 - (x1 - x0) * f1 / (f1 - f0);
        f2 = f(x2);
        printf("\n%d\t\t%f\t%f\t%f\t%f \n", step, x0, x1, x2, f2);
        x0 = x1;
        f0 = f1;
        x1 = x2;
        f1 = f2;
        step = step + 1;
        if (step > N)
        {
            printf("Not Convergent.");
            exit(0);
        }
    } while (fabs(f2) > e);
    printf("\n Required Root is:%f", x2);
    return 0;
}