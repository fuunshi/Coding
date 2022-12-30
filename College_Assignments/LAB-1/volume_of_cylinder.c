//Program to find the Volume of Cylinder.

#include <stdio.h>

int main()
{
    const float pi = 3.1415;
    int h, r;
    printf("Enter the Height of the cylinder: ");
    scanf("%d",&h);
    printf("Enter the Radius of the base: ");
    scanf("%d",&r);
    printf("The Volume of given Cylinder is %2f\n", 2 * pi * r * h);
    return 0;
}