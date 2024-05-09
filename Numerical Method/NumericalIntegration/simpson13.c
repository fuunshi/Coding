#include <stdio.h>
// Function to be integrated: f(x) = 1 / (1 + x)
float f(float x) {
return 1.0 / (1.0 + x);
}
int main() {
int i, n;
float x0, xn, h, y[20], so = 0, se = 0, ans = 0, x[20];
// Prompt the user to enter values for x0, xn, and h.
printf("Enter values of x0, xn, h: ");
if (scanf("%f%f%f", &x0, &xn, &h) != 3) {
printf("Invalid input. Please enter numeric values for x0, xn, and h.\n");
return 1;
}
// Calculate the number of intervals (n).
n = (xn - x0) / h;
// Ensure that the number of intervals is even.
if (n % 2 == 1) {
n++;
}
// Recalculate the step size (h) to ensure even intervals.
h = (xn - x0) / n;
// Print the refined values of n and h.
printf("Refined value of n and h are: %d %f\n", n, h);
// Calculate and print the values of f(x) at each x_i and store them in the array y.
printf("Y values:\n");
for (i = 0; i <= n; i++) {
x[i] = x0 + i * h;
y[i] = f(x[i]);
printf("%f\n", y[i]);
}
// Calculate the sums for odd and even terms of f(x) using Simpson's 1/3 Rule.
for (i = 1; i < n; i++) {
if (i % 2 == 1) {
so += y[i]; // Sum of odd-indexed terms.
} else {
se += y[i]; // Sum of even-indexed terms.
}
}
// Calculate the final approximation of the integral using Simpson's 1/3 Rule.
ans = h / 3 * (y[0] + y[n] + 4 * so + 2 * se);
// Print the final approximation of the integral.
printf("Final integration is %f\n", ans);
return 0;
}
