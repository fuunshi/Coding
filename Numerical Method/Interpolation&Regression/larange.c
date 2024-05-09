#include <stdio.h>
#include <math.h>
void main()
{
    float x[10], y[10], x1, nr, dr, li = 0;
    int i, j, n;
    printf("\nEnter the no of data:");
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        printf("\nx%d:", i + 1);
        scanf("%f", &x[i]);
        printf("\ny%d:", i + 1);
        scanf("%f", &y[i]);
    }
    printf("\nEnter the value of x=");
    scanf("%f", &x1);
printf("\nX\tY=f(x)");
for(i=0;i<n;i++)
{
        printf("\n%.2f\t%.2f", x[i], y[i]);
}
for(i=0;i<n;i++)
{
        nr = dr = 1;
        for (j = 0; j < n; j++)
        {
            if (i != j)
            {
                nr = nr * (x1 - x[j]);
                dr = dr * (x[i] - x[j]);
            }
        }
        li = li + (nr / dr) * y[i];
}
printf("\nvalue of function P(x) at x=%.2f is %.2f",x1,li);
}