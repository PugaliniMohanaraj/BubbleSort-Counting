
// Question
//  Implement a program to count the number of shifts required to sort an array using 
// the insertion sort algorithm. 
// a) Define a method named countShifts that accepts an array of integers as a 
// parameter and returns the total number of shifts needed to sort the array 
// using insertion sort. 
// b) The program should read an integer n, representing the number of test cases. 
// c) For each test case: 
// • Read an integer m, the length of the array. 
// • Read m space-separated integers representing the elements of the 
// array. 
// d) For each test case, output the original array followed by the total number of shifts 
// required to sort it, formatted as: 
// original_array : number of shifts 


import java.util.Scanner;

public class Count{
    public static int countShifts(int[] array) {
        int countsh = 0;

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                countsh++;
            }
            array[j + 1] = key;
        }
        return countsh;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of test cases: ");
        int n = input.nextInt();

        int[][] sortedArrays = new int[n][];
        int[] shiftCounts = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Array length: ");
            int m = input.nextInt();

            int[] array = new int[m];

            System.out.print("Enter the numbers: ");
            for (int k = 0; k < m; k++) {
                array[k] = input.nextInt();
            }

            shiftCounts[i] = countShifts(array);
            sortedArrays[i] = array.clone();
        }

      
        for (int i = 0; i < n; i++) {

            System.out.print("Sorted array: " + (i + 1) + ": ");
            for (int num : sortedArrays[i]) {
                System.out.print(num + " ");
            }

            
            System.out.println(":: " + shiftCounts[i] + " shifts");
        }

        input.close();
    }
}
