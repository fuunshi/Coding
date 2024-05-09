#include <stdio.h>
#include <math.h>
#define ESP 0.0001
// Define equations to calculate values of x1, x2, and x3
#define X1(x2, x3) ((17 - 20*(x2) + 2*(x3))/20)
#define X2(x1, x3) ((-18 - 3*(x1) + (x3))/20)
#define X3(x1, x2) ((25 - 2*(x1) + 3*(x2))/20)
int main() {
double x1 = 0, x2 = 0, x3 = 0, y1, y2, y3;
int i = 0;
printf("\n_______________________________________\n");
printf("\n x1\t\t x2\t\t x3\n");
printf("\n_______________________________________\n");
printf("\n%f\t%f\t%f", x1, x2, x3);
do {
// Calculate new values using the defined equations
y1 = X1(x2, x3);
y2 = X2(y1, x3);
y3 = X3(y1, y2);
// Check for convergence using the specified tolerance (ESP)
if (fabs(y1 - x1) < ESP && fabs(y2 - x2) < ESP && fabs(y3 - x3) < ESP) {
printf("\n_______________________________________\n");
printf("\n\nx1 = %.3lf", y1);
printf("\n\nx2 = %.3lf", y2);
printf("\n\nx3 = %.3lf", y3);
i = 1; // Set i to 1 to exit the loop
} else {
// Update the values for the next iteration
x1 = y1;
x2 = y2;x3 = y3;
printf("\n%f\t%f\t%f", x1, x2, x3); // Display the current values
}
} while (i != 1);
return 0;
}