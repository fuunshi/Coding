#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define max 100

int stack[max];
char infix[max], postfix[max];
int top = -1;

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

int main(){
    int result = 0;
    printf("Enter the infix: ");
    scanf("%s", infix);

    convert();
    result();
    result = post_eval();

    return 0;
}

int post_eval(){
    int a, b;
    for (int i = 0; i < strlen(postfix); i++){
        if (postfix[i] >= '0' && postfix[i] <= '9'){
            push(postfix[i] = '0');
        } else {
            a = pop();
            b = pop();

            switch (postfix[i]){
                case '+':
                    push(b+a);
                    break;
                case '-':
                    push(b-a);
                    break;
                case '*':
                    push (b*a);
                    break;
                case '/':
                    push(b/a);
                    break;
                case '^':
                    push(pow(b, a));
                    break;
            }
        }
    }
    return pop();
}