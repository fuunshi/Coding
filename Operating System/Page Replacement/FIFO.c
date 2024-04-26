#include <stdio.h>
int main()
{
int referenceString[25], pageFaults = 0, m, n, s, pages, frames;
printf("\nEnter the number of Pages:\t");
scanf("%d",&pages);
printf("\nEnter reference string values:\n");
for( m = 0; m < pages; m++)
{
   printf("Value No. [%d]:\t", m + 1);
   scanf("%d",&referenceString[m]);
}
printf("\n What are the total number of frames:\t");
{
   scanf("%d", &frames);
}
int temp[frames];/*array to keep track of pages currently in memory, initial values
of this array are set to -1, indicating that frames are initially empty*/
for(m = 0; m < frames; m++)
{
  temp[m] = -1;
}

for(m = 0; m < pages; m++)//loop for iterating pages in reference
{
  s = 0;
  for(n = 0; n < frames; n++)/*searching through temp array to see if the page is in memory,
  if it is, s is incremented and pagefault is decremented*/
   {
      if(referenceString[m] == temp[n])
         {
            s++;
            pageFaults--;
         }
   }     
   pageFaults++;//otherwise pagefault is incremented
   if((pageFaults <= frames) && (s == 0))/* check whether total page faults are within frame
   limit and s is 0, means page is not already in memory*/
      {
        temp[m] = referenceString[m];/*the page is added to the temp
   array at the same index as the current page fault count.*/
      }   
   else if(s == 0)//if the page faults exceed the number of avialble frames
      {
        temp[(pageFaults - 1) % frames] = referenceString[m];/*page is added to the temp
        array at the index(pageFaults-1)%frames,which ensures that the oldest page 
		in memory is replaced*/
      }
      printf("\n");
      for(n = 0; n < frames; n++)
       {     
         printf("%d\t", temp[n]);/*aftrer page access,temp is printed to show current
         pages in memory*/
       }
} 
printf("\nTotal Page Faults:\t%d\n", pageFaults);
return 0;
}
