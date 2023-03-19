//Program to input a line of text store it in a file and then read from file and display its contents.

#include <stdio.h>

int main()
{
    char temp[100];
    FILE *ptr = fopen("file/temp.txt", "w");
    if (ptr  == NULL)
        printf("File Error!!!...");
    printf("Enter a string of text: ");
    scanf("%s", temp);
    fputs(temp, ptr);
    fclose(ptr);
    FILE *ptrr = fopen("file/temp.txt", "r");
    if (ptrr == NULL)
    {
        printf("File Error!!!...");
        return 1;
    }
    fscanf(ptrr, "%s", temp);
    printf("Text from file:\n %s", temp);
    fclose(ptrr);
    printf("\n");
    return 0;

}