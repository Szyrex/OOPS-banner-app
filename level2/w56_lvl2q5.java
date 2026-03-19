import java.util.Scanner;

public class level2q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = num;

        // Store digits in correct order
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Display reversed number
        System.out.print("Reversed number: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}