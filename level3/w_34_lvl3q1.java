
public class w_34_lvl3q1 {

    public static void main(String[] args) {

        int year = 2016;

        if (year >= 1582) {

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }

        } else {
            System.out.println("Enter year greater than or equal to 1582");
        }

    }
}