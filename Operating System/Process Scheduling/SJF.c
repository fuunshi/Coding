#include<stdio.h>
#include<stdlib.h>

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

void sortat(int p[], int at[], int bt[], int n) {
    int i, j;
    for (i = 0; i < n; i++) {
        for (j = i + 1; j < n; j++) {
            if (at[i] > at[j] || (at[i] == at[j] && bt[i] > bt[j])) {
                swap(&p[i], &p[j]);
                swap(&at[i], &at[j]);
                swap(&bt[i], &bt[j]);
            }
        }
    }
}

void tatwt(int ct[], int at[], int bt[], int tat[], int wt[], int n) {
    int i;
    for (i = 0; i < n; i++) {
        tat[i] = ct[i] - at[i];
        wt[i] = tat[i] - bt[i];
    }
}

int main() {
    int *p, *at, *bt, *tat, *wt, *ct, i, j, pos, n;
    float awt = 0, atat = 0;

    printf("\nEnter the number of processes: ");
    scanf("%d", &n);

    p = (int*)malloc(n * sizeof(int));
    at = (int*)malloc(n * sizeof(int));
    bt = (int*)malloc(n * sizeof(int));
    ct = (int*)malloc(n * sizeof(int));
    wt = (int*)malloc(n * sizeof(int));
    tat = (int*)malloc(n * sizeof(int));

    printf("Enter the process IDs: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &p[i]);
    }

    printf("Enter the arrival times: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &at[i]);
    }

    printf("Enter the burst times: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &bt[i]);
    }

    sortat(p, at, bt, n);

    ct[0] = at[0] + bt[0];
    for (i = 1; i < n; i++) {
        int min_bt = 1000;
        for (j = i; j < n; j++) {
            if (at[j] <= ct[i - 1] && bt[j] < min_bt) {
                min_bt = bt[j];
                pos = j;
            }
        }
        swap(&p[i], &p[pos]);
        swap(&at[i], &at[pos]);
        swap(&bt[i], &bt[pos]);
        ct[i] = ct[i - 1] + bt[i];
    }

    tatwt(ct, at, bt, tat, wt, n);

    printf("\nPID\tAT\tBT\tCT\tTAT\tWT");
    for (i = 0; i < n; i++) {
        printf("\n%d\t%d\t%d\t%d\t%d\t%d", p[i], at[i], bt[i], ct[i], tat[i], wt[i]);
        atat += tat[i];
        awt += wt[i];
    }
    atat /= n;
    awt /= n;
    printf("\nAverage Turnaround Time: %.2f", atat);
    printf("\nAverage Waiting Time: %.2f", awt);

    // Free allocated memory
    free(p);
    free(at);
    free(bt);
    free(ct);
    free(wt);
    free(tat);

    return 0;
}
