#include<stdio.h>
#include<stdbool.h>

typedef struct frame
{
  int page;
  bool reference_bit;
} frameType;

void printFrames(int no_of_frames, frameType frames[]) {
    for(int i = 0; i < no_of_frames; i++) {
        printf("%d ", frames[i].page);
    }
    printf("\n");
}

int findAndReplace(int referenced_page, int no_of_frames, frameType frames[], int pointer) {
    while(true) {
        if(frames[pointer].reference_bit == 0) {
            frames[pointer].page = referenced_page;
            pointer = (pointer + 1) % no_of_frames;
            return pointer;
        }
        frames[pointer].reference_bit = 0;
        pointer = (pointer + 1) % no_of_frames;
    }
    return pointer;
}

bool isNeedForUpdate(int referenced_page, int no_of_frames, frameType frames[]) {
    for(int i = 0; i < no_of_frames; i++) {
        if(frames[i].page == referenced_page) {
            frames[i].reference_bit = true;
            return false;
        } 
    }
    return true;
}

int applySecondChanceAlgo(int reference_string[], int n, int no_of_frames, frameType frames[]) {
    int total_page_fault = 0, pointer = 0;
    for(int i = 0; i < n; i++) {
        if(isNeedForUpdate(reference_string[i], no_of_frames, frames)) {
            pointer = findAndReplace(reference_string[i], no_of_frames, frames, pointer);
            total_page_fault++;
        } 
        printFrames(no_of_frames, frames);
    }
    return total_page_fault;
}

int main() {  
    int i, n, no_of_frames, total_page_fault = 0;
    printf("\nEnter the no. of pages:\n");
    scanf("%d", &n);
    int reference_string[n]; 
    printf("\nEnter the reference string (actual page numbers):\n");
    for(int i = 0; i < n; i++)
        scanf("%d", &reference_string[i]);
    printf("\nEnter the no. of frames you want to give to the process: ");
    scanf("%d", &no_of_frames);
    frameType frames[no_of_frames];
    for(int i = 0; i < no_of_frames; i++) {
        frames[i].page = -1;  
        frames[i].reference_bit = false;
    }
    total_page_fault = applySecondChanceAlgo(reference_string, n, no_of_frames, frames);
    printf("\n\n*********** OUTPUT **********\n");
    printf("\nTotal No. of Page faults = %d", total_page_fault);
    printf("\nPage fault Ratio = %.2f", (float)total_page_fault / n);
    printf("\nPage Hit Ratio = %.2f\n\n", (float)(n - total_page_fault) / n);
    return 0;
}
