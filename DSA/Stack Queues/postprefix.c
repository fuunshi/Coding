#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define max 100

char stack[max];
char infix[max], postfix[max];

int top = -1;

int isempty();
int isfull();
int precedence(char symbol);
void convert();
void result();
void push(char symbol);
char pop();

int main()
{
    printf("Enter the infix: ");
    scanf("%s", infix);
    convert();
    result();
}
void convert()
{
    int j = 0;
    char symbol, next;
    for (int i = 0; i < strlen(infix); i++)
    {
        symbol = infix[i];
        switch (symbol)
        {
        case '(':
            push(symbol);
            break;
        case ')':
            while ((next = pop()) != '(')
            {
                postfix[j++] = next;
            }
            break;
        case '+':
        case '-':
        case '*':
        case '/':
        case '^':
            while (!isempty() && precedence(stack[top]) >= precedence(symbol))
            {
                postfix[j++] = pop();
            }
            push(symbol);
            break;
        default:
            postfix[j++] = symbol;
            break;
        }
    }
    while (!isempty())
    {
        postfix[j++] = pop();
    }
    postfix[j] = '\0';
}

int precedence(char symbol)
{
    switch (symbol)
    {
        // Higher value shows higher precedence
    case '^':
        return 3;
        break;
    case '/':
    case '*':
        return 2;
        break;
    case '+':
    case '-':
        return 1;
        break;
    default:
        return 0;
        break;
    }
}

void result()
{
    int i = 0;
    printf("The equivalent postfix expression is: ");
    while (postfix[i])
    {
        printf("%c", postfix[i++]);
    }
    printf("\n");
}

int isempty()
{
    if (top == -1)
        return 1;
    else
        return 0;
}

int isfull()
{
    if (top == max)
        return 1;
    else
        return 0;
}

void push(char symbol)
{
    if (!isfull())
    {
        top = top + 1;
        stack[top] = symbol;
    }
    else
    {
        printf("Could not insert data, stack is full.\n");
    }
}

char pop()
{
    if (!isempty())
    {
        char symbol;
        symbol = stack[top];
        top = top - 1;
        return symbol;
    }
    else
    {
        printf("Could not retrieve data, Stack is empty.\n");
    }
}