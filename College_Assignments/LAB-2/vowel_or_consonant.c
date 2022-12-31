//Program to check vowel or consonant.

#include <stdio.h>
#include <ctype.h>

int main()
{
    char c;
    printf("Enter an alphabet: ");
    scanf("%c", &c);
    c = tolower(c);     //changing the given alphabet to lowercase
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        printf("The given character is Vowel.\n");
    else
        printf("The given character is Consonant.\n");
    return 0;
}