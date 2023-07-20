#include <stdio.h>

int gcd(int a, int b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

// Driver program to test above function
int main()
{
    int a, b;
    printf("Enter the numbers: ");
    scanf("%d%d", &a, &b);
    printf("GCD of %d and %d is %d \n\n\n\n", a, b, gcd(a, b));
    return 0;
}
