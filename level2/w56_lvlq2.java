import java.util.Scanner;
public class levelq2 {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }

        // Assume first person is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}

