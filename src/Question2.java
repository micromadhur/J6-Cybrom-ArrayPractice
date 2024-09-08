
// 2. **Sum of Array Elements:**
//     - **Task:** Write a program to calculate the sum of all elements in an integer array of size 10.
//     - **Sample Input:** `[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]`
//     - **Sample Output:** `Sum = 55`

public class SumOfArrayElements {
    public static void main(String[] args) {
        // Initialize the integer array with 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to store the sum of array elements
        int sum = 0;

        // Loop through the array and calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Output the result
        System.out.println("Sum = " + sum);
    }
}
