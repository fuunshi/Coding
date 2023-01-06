//Program to count vowel in a word

#include <ctype.h>
#include <stdio.h>
#include <string.h>

int main()
{
    char word[20];
    printf("Enter a word: ");
    scanf("%s", word);
    int a = 0, x = 0;
    while (word[a] != '\0')
    {
        char c = tolower(word[a]);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            x++;
        a++;
    }
    printf("There are %d vowels in the word\n", x);
    return 0;
}