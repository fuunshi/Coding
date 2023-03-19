//Program to store a persons name, address and salary in an structure

#include <stdio.h>

int main()
{
    struct det
    {
        char name[20];
        struct dob
        {
            int dd;
            int mm;
            int yy;
        }dob;
    }s;

    printf("Enter Name and Date of Birth of Employee: ");
    scanf("%s %d%d%d", s.name, &s.dob.dd, &s.dob.mm, &s.dob.yy);
    printf("Name: %s\tDate of Birth: %d/%d/%d\n", s.name, s.dob.dd, s.dob.mm, s.dob.yy);
    return 0;
}