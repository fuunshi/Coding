//Program to find shortest word among the gievn words

#include <stdio.h>
#include <string.h>

int main()
{
    char a[3][20];
    printf("Enter three words: \n");
    scanf("%s %s %s", a[0], a[1], a[2]);
    int x, y, z;
    x = strlen(a[0]);
    y = strlen(a[1]);
    z = strlen(a[2]);
    if (x < y && x < z)
        printf("%s is the shortest word.\n", a[0]);
    else if (y < x && y < z)
        printf("%s is the shortest word.\n", a[1]);
    else
        printf("%s is the shortest word.\n", a[2]);
    return 0;
}