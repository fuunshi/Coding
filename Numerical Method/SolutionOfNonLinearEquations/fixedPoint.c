#include<stdio.h>
#include<math.h>
#include<stdlib.h>
#define f(x) cos(x)-3*x+1//Define function f(x) which is to be solved
#define g(x) (1+cos(x))/3//write f(x) as x=g(x) and define g(x) here
int main()
{
int step=1,N;
float x0,x1,e;
printf("\n Enter the initial guess:");
scanf("%f",&x0);
printf("\n Enter Tolorable error:");
scanf("%f",&e);
//printf("\n Enter Maximum iteration:");
//scanf("%f",&N);
printf("\nStep\t\tx0\t\tf(x0)\t\tx1\t\tf(x1)\n");
do
{
x1=g(x0);
printf("\n%d\t\t%f\t%f\t%f\t%f \n",step,x0,f(x0),x1,f(x1));
step=step+1;
if(step>N)
{
printf("\n Not Convergent.");
exit(0);
}
x0=x1;
}
while(fabs(f(x1))>e);
printf("\n Hence the required root having tolerable error %f is %f.",e,x1);
return 0;
}