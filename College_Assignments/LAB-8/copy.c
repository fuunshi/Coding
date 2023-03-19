//Program to copy content of 'tu.txt. to 'university.txt'

#include <stdio.h>

int main()
{
    char c;
    FILE *ptr1=fopen("file/tu.txt","r");
    if(ptr1==NULL)
    {
        printf("Unble to open file!");
    }
    FILE *ptr2=fopen("file/university.txt","w");
    if(ptr2==NULL)
    {
        printf("Unable to open file!");
    }
    while((!feof(ptr1)))
    {
        c = fgetc(ptr1);
        fputc(c,ptr2);
    }
    printf("\n Copied....");
    fclose(ptr1);
    fclose(ptr2);
}