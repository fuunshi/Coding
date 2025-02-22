using System;

class Max {
    static void Main(string[] args) {
        int[] arr = { 3, 8, 1, 6, 2, 9, 4 };
        int maxValue = max(arr);
        Console.WriteLine("Maximum value in the array is: " + maxValue);
    }

    static int max(int[] array) {

        int maxVal = array[0];
        for (int i = 1; i < array.Length; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        return maxVal;
    }
}
