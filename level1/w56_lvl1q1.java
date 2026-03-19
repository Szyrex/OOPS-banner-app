import java.util.Scanner;
public class level1q1 {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        // Taking input
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        System.out.println("\nResult:");

        // Checking eligibility
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age");
            }
            else if (ages[i] >= 18) {
                System.out.println("Student with age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("Student with age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }

}
