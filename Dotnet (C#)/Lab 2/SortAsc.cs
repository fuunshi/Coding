using System;

class SortAsc {
    static void Main(string[] args) {
        int[] arr = {8,7,6,5,4,3,2,1};
        Array.Sort(arr);
        foreach (int n in arr) {
            Console.Write(n + " ");
        }
    }
}