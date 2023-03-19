//Program to store 10 persons name, address and salary in an structure

#include <stdio.h>

int main()
{
    struct det
    {
        char name[20];
        char address[40];
        int salary;
    }s[10];
    int i;
    for (i = 0; i < 10; i++)
    {
        printf("Enter Name, Address and Salary of Employee: ");
        scanf("%s %s %d", s[i].name, s[i].address, &s[i].salary);
    }
    for (i = 0; i < 10; i++)
    {
        printf("Name: %s\tAddress: %s\tSalary: %d\n", s[i].name, s[i].address, s[i].salary);
    }
    return 0;
}