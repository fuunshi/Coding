//Program to check if the word is palindrome

//!!DOESNT WORK!! BUGSS!

#include <stdio.h>
#include <string.h>

int main()
{
    char a[30], b[30];
    printf("Enter a word: ");
    scanf("%s", a);
    strlwr(a);
    int x = 0;
    while (a[x] != '\0')
    {
        b[x] = a[x];
        x++;
    }
    if (strcmp(a, b) == 0)
        printf("The word is palindrome.\n");
    else
        printf("The word is not palindrome.\n");
    return 0;
}