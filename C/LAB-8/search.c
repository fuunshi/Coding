//Program to search a files content by address

#include <stdio.h>
#include <string.h>

int main()
{
    struct
    {
        char name[20];
        char address[20];
        int salary;
    }
    employee;
    char add[20];
    FILE *ptr = fopen("file/employee.txt", "r");
    if (ptr == NULL)
        printf("FILE ERROR!!!...");
    printf("Address to find: ");
    scanf("%s", add);
    while (!feof(ptr))
    {
        fscanf(ptr, "%s %s %d", employee.name, employee.address, &employee.salary);
        if (strcmp(add, employee.address) == 0)
            printf("Name: %s\tAddress: %s\tSalary: %d\n", employee.name, employee.address, employee.salary);
    }
    fclose(ptr);
    return 0;
}