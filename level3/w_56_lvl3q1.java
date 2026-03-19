 import java.util.Scanner;

public class w_56_lvl3q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        temp = num;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Frequency array (0–9 digits)
        int[] freq = new int[10];

        // Count frequency
        for (int i = 0; i < count; i++) {
            freq[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}