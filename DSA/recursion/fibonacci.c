#include <stdio.h>
int fibo(int n, int a, int b)
{
    if (n == 0)
        return a;
    if (n == 1)
        return b;
    return fibo(n - 1, b, a + b);
}
int main()
{
    int n;
    printf("Enter the term: ");
    scanf("%d", &n);
    printf("The required term is %d.\n\n\n\n", fibo(n, 0, 1));
}