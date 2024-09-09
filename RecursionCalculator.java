import java.util.Scanner; //Import necessary Java utility

public class RecursionCalculator {

    public static int calculateProduct(int[] numbers, int index) {
        if (index < 0) { //If statement in-case numbers are below zero
            return 1;
        }
        return numbers[index] * calculateProduct(numbers, index - 1); //Create math equation to multiply numbers in the correct order making it recursive
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5]; //Create an array that will store the numbers the user inputs

        System.out.println("Enter five numbers:"); //Prompt user to enter 5 numbers
        for (int i = 0; i < 5; i++) { //Limits the number of user inputs to 5
            System.out.print("Number " + (i + 1) + ": "); //Tells the user which number they are entering
            numbers[i] = scanner.nextInt();
        }

        int product = calculateProduct(numbers, 4); //Calculates the product of the numbers entered using the recursive method

        System.out.println("The product of the five numbers is: " + product); //Show the user the end result of the recursive multiplication

        scanner.close();
    }
}