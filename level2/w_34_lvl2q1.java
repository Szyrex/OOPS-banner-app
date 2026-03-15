
public class w_34_lvl2q1 {
    public static void main(String[] args) {

        int number = 2;

        if (number > 0) {

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }

            }

        } else {
            System.out.println("Not a natural number");
        }

    }
}