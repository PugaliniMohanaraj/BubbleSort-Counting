// Question
// Consider an array of integers. You are required to sort the array in ascending order 
// using the Bubble Sort algorithm. The Bubble Sort algorithm works by repeatedly 
// stepping through the list to be sorted, comparing each pair of adjacent items and 
// swapping them if they are in the wrong order. This process is repeated until the 
// array is sorted. After sorting the array, perform the following. 
// a) Print the sorted array. 
// b) Count the total number of swaps made during the sorting process. 
// c) Identify the first element in the sorted array. 
// d) Identify the last element in the sorted array. 


import java.util.Scanner;


public class bubbleSor{
	public static int Bubblesort(int[] array){
	int n= array.length;
	int swapCount = 0;
	
	boolean swapped;
	   do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
        
        return swapCount;
    }
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter length of Array : ");
		int n =input.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " numbers:");
		
		 for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
		 int swapCount = Bubblesort(array);
		 
		
		System.out.print("Sorted Array:{ ");
        for (int number : array) {
            System.out.print(number + " ");
        }
		
        System.out.println("}");
		
		System.out.println("Total number of swaps made during the sorting process is: " + swapCount);
        System.out.println("First element in sorted array: " + array[0]);
        System.out.println("Last element in sorted array: " + array[n - 1]);

        input.close();
		
	}
}
