//Program to either store or display records of people

#include <stdio.h>

void add_record();
void display_record();

struct
{
    char name[20];
    char address[20];
    int salary;
}
employee;

int main()
{
    int a = 0;
    while(1)
    {
        printf("1.Add Record\n2.Display Record\nAnything Else for Exit.\nEnter Your Choice: ");
        scanf("%d", &a);
        if (a == 1)
            add_record();
        else if (a == 2)
            display_record();
        else
            return 0;
    }
}

void add_record()
{
    FILE *ptr = fopen("file/employee.txt", "a");
    if (ptr  == NULL)
    {
        printf("File Error!!!...");
    }
    printf("Enter Name: ");
    scanf("%s", employee.name);
    printf("Enter Address: ");
    scanf("%s", employee.address);
    printf("Enter Salary: ");
    scanf("%d", &employee.salary);
    fprintf(ptr, "%s %s %d\n", employee.name, employee.address, employee.salary);
    fclose(ptr);
}

void display_record()
{
    FILE *ptr = fopen("file/employee.txt", "r");
    if (ptr == NULL)
    {
        printf("FILE ERROR!!!...");
    }
    while ((!feof(ptr)))
    {
        fscanf(ptr, "%s %s %d", employee.name, employee.address, &employee.salary);
        printf("Name: %s\tAddress: %s\tSalary: %d\n", employee.name, employee.address, employee.salary);
    }

}