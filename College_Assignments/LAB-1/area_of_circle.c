//Program to find Area of a Cirlce.

#include <stdio.h>

int main()
{
    const float pi = 3.141592654;
    int r;
    printf("Enter the Radius of the Circle: ");
    scanf("%d",&r);
    printf("The Area of the Circle is %.2f\n", r * r * pi);      //Output rounded off to 2 decimal points by %2f.
    return 0;
}