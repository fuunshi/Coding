#include <stdio.h>
int fact(int n, int product) {
    if(n==1||n==0) {
        return product;
    }
    return fact(n-1, product * n);
}

int main(){
    int n;
    printf("Enter a number:");
    scanf("%d",&n);
    printf("Factorial is %d.\n\n\n\n", fact(n,1));
}