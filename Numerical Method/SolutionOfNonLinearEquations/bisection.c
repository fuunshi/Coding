#include <stdio.h>
#include <math.h>
#include <stdlib.h> // for fabs

#define f(x) (cos(x) - x * exp(x))

int main() {
    float x0, x1, x2, f0, f1, f2, e;
    int step = 1;
up:
    printf("\n Enter first initial guess:");
    scanf("%f", &x0);
    printf("\n Enter second initial guess:");
    scanf("%f", &x1);
    printf("\n Enter tolerable error:");
    scanf("%f", &e);
    f0 = f(x0);
    f1 = f(x1);
    if (f0 * f1 > 0.0) {
        printf("\n Incorrect Initial Guesses.\n");
        goto up;
    }
    printf("\n\nStep\t\tx0\t\tx1\t\tx2\t\tf(x2) \n");
    do {
        x2 = (x0 + x1) / 2;
        f2 = f(x2);
        printf("%d\t\t%f\t%f\t%f\t%f\n", step, x0, x1, x2, f2);
        if (f0 * f2 < 0) {
            x1 = x2;
            f1 = f2;
        } else {
            x0 = x2;
            f0 = f2;
        }
        step = step + 1;
    } while (fabs(f2) > e);
    printf("\n\n Required Root is:%f", x2);
    return 0;
}
