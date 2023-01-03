//Program to find billing amount from electricity units.
/*
First 20 units  =   Rs.0 per unit
Next 100 units  =   Rs.12 per unit
Next 100 units  =   Rs.11 per unit
Above 220 units =   Rs.10 per unit
*/

#include <stdio.h>

int main()
{
    int unit;
    printf("Enter your Electricity Unit: ");
    scanf("%d", &unit);

    int temp = 0;       //Temporary Variable
    if (unit > 20 && unit <= 120)
        temp += (unit - 20) * 12;
    else if (unit > 120 && unit <= 220)
        temp += 1200 + (unit - 120) * 11;
    else if (unit > 220)
        temp += 2300 + (unit - 220) * 10;

    printf("Your billing amount is Rs.%d\n", temp);
    return 0;
}