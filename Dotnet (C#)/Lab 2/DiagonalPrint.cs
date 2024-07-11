using System;

class DiagonalPrint {
    static void Main(string[] args) {
        int[][] arr = {
            new int[] {1,2,3},
            new int[] {4,5,6},
            new int[] {7,8,9}
        };
        for (int i = 0; i < arr.Length; i++){
            for (int j = 0; j < arr[i].Length; j++) {
                if (i == j) {
                    Console.Write(arr[i][i] + " ");
                }
            }
        }
    }
}