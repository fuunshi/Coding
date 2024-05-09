#include <stdio.h>
#include <math.h>
/* Define the function to be integrated */
double f(double x)
{
    // Replace this function with your desired function
    return 1 / (1 + pow(x, 2));
}
int main()
{
    double a, b, h, sum = 0.0;
    int n, i;
    /* Input */
    printf("Enter the lower limit of the interval: ");
    scanf("%lf", &a);
    printf("Enter the upper limit of the interval: ");
    scanf("%lf", &b);
    printf("Enter the number of sub-intervals (should be a multiple of 3): ");
    scanf("%d", &n);
    /* Calculation */
    h = (b - a) / n;
    /* Evaluate f(a) and f(b) and add them to the sum */
    sum = f(a) + f(b);
    /* Evaluate the function for the intermediate points and add them to the
    sum */
    for (i = 1; i < n; i++)
    {
        double x_i = a + i * h;
        if (i % 3 == 0)
        {
            sum += 2 * f(x_i);
        }
        else
        {
            sum += 3 * f(x_i);
        }
    }
    /* Multiply the sum by (3 * h / 8) to get the final approximate integral
    value */
    sum *= 3 * h / 8;
    /* Output the final approximate integral value */
    printf("The approximate integral value is: %lf\n", sum);
    return 0;
}