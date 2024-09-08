// 3. **Average of Array Elements:**
//     - **Task:** Create a float array of size 7. Write a program to calculate the average of the elements in the array.
//     - **Sample Input:** `[1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f]`
//     - **Sample Output:** `Average = 4.7857143`
public class AverageOfArrayElements {
    public static void main(String[] args) {
        // Initialize the float array with 7 elements
        float[] numbers = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f, 6.5f, 7.5f};

        // Variable to store the sum of array elements
        float sum = 0;

        // Loop through the array and calculate the sum
        for (float number : numbers) {
            sum += number;
        }

        // Calculate the average by dividing the sum by the array length
        float average = sum / numbers.length;

        // Output the result
        System.out.println("Average = " + average);
    }
}


