//Program to add/subtract/multiply/divide two numbers using switch.

#include <stdio.h>

int main()
{
    int a, b, c;

    printf("Enter any two numbers:\nA, B: ");
    scanf("%d %d", &a, &b);
    printf("What action would you like for A to perform on B.\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\nTo perform: ");
    scanf("%d", &c);

    float result = 0;
    switch (c)
    {
        case 1:
            result = a + b;
            break;
        case 2:
            result = a - b;
            break;
        case 3:
            result = a * b;
            break;
        case 4:
            result = (float) a / b;
            break;
        default:
            printf("Invalid Option. Expected Input: (1, 2, 3 or 4)\n");
            return 1;
    }
    printf("The output of the action is %2f\n", result);
    return 0;
}