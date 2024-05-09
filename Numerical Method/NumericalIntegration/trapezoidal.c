#include <stdio.h>
#include <math.h>
// Function to be integrated
double func(double x)
{
    return (pow(x, 3) + 1); // Replace this with your desired function
}
// Trapezoidal rule implementation
double trapezoidal_rule(double a, double b, int n)
{
    double h = (b - a) / n;
    double sum = 0.0;
    sum += func(a) + func(b); // Add the first and last terms
    for (int i = 1; i < n; i++)
    {
        double x = a + i * h;
        sum += 2 * func(x); // Add 2 times the value of the function at the intermediate
        
    }
return (h / 2.0) * sum;
}
int main()
{
    double a, b;
    int n;
    printf("Enter the lower limit of the integral: ");
    scanf("%lf", &a);
    printf("Enter the upper limit of the integral: ");
    scanf("%lf", &b);
    printf("Enter the number of sub-intervals (n): ");
    scanf("%d", &n);
    if (n <= 0)
    {
        printf("Error: The number of sub-intervals (n) must be greater than 0.\n");
    }
    return 1;
    double result = trapezoidal_rule(a, b, n);
    printf("Approximate integral: %lf\n", result);
return 0;
}