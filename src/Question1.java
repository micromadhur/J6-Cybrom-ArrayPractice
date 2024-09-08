// ### Java Single-Dimension Array Practice Questions
// #### Instructions:
// - Fork the repository
// - Clone it on your system
// - For each question create a separate class
// - Follow clean coding guidelines
// - Commit the code, for each solution, use proper commit messages.
// - Once completed all the questions, push the repository.
// - Do not use any library functionality, not even for printing array.

// 1. **Integer Array Initialization:**
//     - **Task:** Create an integer array of size 5 and initialize it with the values 10, 20, 30, 40, and 50.
//     - **Sample Input:** None (initialize directly).
//     - **Sample Output:** `[10, 20, 30, 40, 50]`

public class IntegerArrayInitialization {
    public static void main(String[] args) {
        // Initialize the integer array with values 10, 20, 30, 40, and 50
        int[] numbers = {10, 20, 30, 40, 50};
        // Output the array elements
        System.out.print("[");
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index]);
            if (index < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
