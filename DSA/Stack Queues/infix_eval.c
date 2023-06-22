#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

int numbers[50], top_number = -1, top_operator = -1;
char operators[50];

//Functions to Push and Pop Numeric and Operator Data

void push_number(int data){
    numbers[++top_number] = data;
}

void push_operator(char data){
    operators[++top_operator] = data;
}

void pop_number(){
    return numbers[top_number--];
}

void pop_operator(){
    return operator[top_operator--];
}

//Precedence Checker for Evaluation

int precedence(char data){
    switch (data){
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
            return 3;
        default:
            return -1;
    }
}

//Checking if the value is operator

int is_operator(char data){
    return (data == '+' || data == '-' || data == '*' || data == '/' || data == '^');
}

//Executing the operations

int operate(){
    int n1, n2;
    char o;

    if (pop_number() == NULL && pop_operator == NULL){
        printf("Error\n");
        return -1;
    }
    n1 = pop_number();
    n2 = pop_number();

    o = pop_operator();

    switch (o){
        case '+':
            return n1 + n2;
        case '-':
            return n2 - n1;
        case '*':
            return n1 * n2;
        case '/':
            if (n1 == 0){
                printf("Cannot Divide by 0\n");
                exit(0);
            } else {
                return n2/n1;
            }
        case '^':
            return pow(n2, n1);
        default:
            return 0;
    }
}

int evaluate(char data[100]){
    int num, output, result;
    char c;
    for (int i = 0; data[i] != '\0'; i++){
        c = data[i];
        if (isdigit(c) != 0){
            num = 0;
            while(isdigit(c)){
                num = num * 10 + (c - '0');
                i++;
                if (i < strlen(data)){
                    c = data[i];
                } else {
                    break;
                }
                i--;

                push_number(num);
            }
        } else if (c == '('){
            push_operator(c);
        } else if (c == ')'){
            while (operators[top_operator] != '('){
                result = operate();
                push_number(result);
            }
            pop_operator();
        } else if (is_operator(c)){
            while (top_operator != -1 && precedence(c) <= precedence(operators[top_operator])){
                output = operate();
                push_number(output);
            }
            push_operator(c);
        }
    }
    while (top_operator != -1){
        output = operate();
        push_number(output);
    }

    if (pop_number == NULL)
    {
        printf("Error\n");
        return -1;
    }
    return pop_number();
}

int main(){
    char data[100];
    printf("Enter a expression: ");
    scanf("%s", data);

    printf("%d\n", evaluate(data));
}