//Program to convert given Fahrenheit temperature into Celsius.

#include <stdio.h>

int main()
{
    float tem;
    printf("Enter the Temperature in Fahrenheit: ");
    scanf("%f", &tem);
    //Formula for °F to °C is 5/9*(f-32).
    printf("%2lf°F in Celsius is %2lf°C\n", tem, (tem - 32) * 5 / 9);
    return 0;
}