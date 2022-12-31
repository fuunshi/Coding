//Program to input two numbers and then input the operator(+,-,*,/) and find the result using switch.

#include <stdio.h>

int main()
{
    int a, b;
    char c;

    printf("Enter any two numbers:\nA, B: ");
    scanf("%d %d", &a, &b);
    printf("What action would you like for A to perform on B.\n1.Addition(+)\n2.Substraction(-)\n3.Multiplication(*)\n4.Division(/)\nOperation to perform: ");
    scanf(" %c", &c);

    int result = 0;
    float f_result = 0;
    switch (c)
    {
        case '+':
            result = a + b;
            break;
        case '-':
            result = a - b;
            break;
        case '*':
            result = a * b;
            break;
        case '/':
            f_result = (float) a / b;
            printf("%d %c %d = %2f\n", a, c, b, f_result);
            return 0;
        default:
            printf("Invalid Operator. Expected Input: (+, -, * or /)\n");
            return 1;
    }
    printf("%d %c %d = %d\n", a, c, b, result);
    return 0;
}