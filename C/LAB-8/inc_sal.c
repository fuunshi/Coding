//Program to increase salary by 15%.

#include <stdio.h>
#include <string.h>

int main()
{
    struct
    {
        char name[20];
        char address[20];
        float salary;
    }
    employee;
    FILE *ptr1 = fopen("file/employee.txt", "r");
    FILE *ptr2 = fopen("file/new_employee.txt", "w");
    if (ptr1 == NULL || ptr2 == NULL)
        printf("FILE ERROR!!!...");
    while (!feof(ptr1))
    {
        fscanf(ptr1, "%s %s %f", employee.name, employee.address, &employee.salary);
        employee.salary += employee.salary * 0.15;
        fprintf(ptr2, "%s %s %.2f\n", employee.name, employee.address, employee.salary);
    }
    fclose(ptr1);
    fclose(ptr2);
    return 0;
}