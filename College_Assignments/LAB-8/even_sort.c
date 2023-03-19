//Program to read the numbers and store all even numbers into "even.txt" and all odd numbers into "odd.txt" from a file.

#include <stdio.h>

int main()
{
    int temp;
    FILE *ptr = fopen("file/numbers.txt", "r");
    FILE *odd = fopen("file/odd.txt", "w");
    FILE *even = fopen("file/even.txt", "w");
    if (ptr ==  NULL || odd == NULL || even == NULL)
    {
        printf("Unable to open file..");
        return 1;
    }

    while(!feof(ptr))
    {
        temp = fgetc(ptr);
        if (temp % 2 == 0)
        {
            fputc(temp, even);
            fputs(" ", even);
        }
        else
            fputc(temp, odd);
    }
    return 0;
}