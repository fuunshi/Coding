#include <stdio.h>

void towers(int, char, char, char);
int main()
{
    int n;
    printf("Enter the number of disks : ");
    scanf("%d", &n);
    printf("The sequence of moves involved in the Tower of Hanoi are :\n");
    towers(n, 'A', 'B', 'C');
    printf("\n\n\n\n\n\n");
    return 0;
}
void towers(int n, char source, char auxiliary, char destination)
{
    if (n == 1)
    {
        printf("\n Move disk 1 from peg %c to peg %c", source, destination);
        return;
    }
    towers(n - 1, source, destination, auxiliary);
    printf("\n Move disk %d from peg %c to peg %c", n, source, destination);
    towers(n - 1, auxiliary, source, destination);
}