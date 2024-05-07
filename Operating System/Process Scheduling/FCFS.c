#include <stdio.h>

int main() {
    int p[10], at[10], bt[10], ct[10], tat[10], wt[10], i, j, temp = 0, n;
    float awt = 0, atat = 0;
    
    printf("Enter the number of processes you want: ");
    scanf("%d", &n);
    
    printf("Enter arrival time for %d processes: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &at[i]);
    }
    
    printf("Enter burst time for %d processes: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &bt[i]);
    }
    
    // Assigning process IDs
    for (i = 0; i < n; i++) {
        p[i] = i + 1;
    }
    
    // Sorting processes according to arrival time
    for (i = 0; i < n; i++) {
        for (j = 0; j < (n - i - 1); j++) {
            if (at[j] > at[j + 1]) {
                temp = at[j];
                at[j] = at[j + 1];
                at[j + 1] = temp;
                
                temp = bt[j];
                bt[j] = bt[j + 1];
                bt[j + 1] = temp;
                
                temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
    
    // Calculating completion time
    ct[0] = at[0] + bt[0];
    for (i = 1; i < n; i++) {
        int idleTime = 0;
        if (ct[i - 1] < at[i]) {
            idleTime = at[i] - ct[i - 1];
        }
        ct[i] = ct[i - 1] + bt[i] + idleTime;
    }
    
    // Calculating turnaround time and waiting time
    printf("\nP\t A.T\t B.T\t C.T\t TAT\t WT");
    for (i = 0; i < n; i++) {
        tat[i] = ct[i] - at[i];
        wt[i] = tat[i] - bt[i];
        atat += tat[i];
        awt += wt[i];
    }
    atat = atat / n;
    awt = awt / n;
    for (i = 0; i < n; i++) {
        printf("\nP%d\t %d\t %d\t %d \t %d \t %d", p[i], at[i], bt[i], ct[i], tat[i], wt[i]);
    }
    
    printf("\nAverage turnaround time is %f", atat);
    printf("\nAverage waiting time is %f", awt);
    
    return 0;
}
