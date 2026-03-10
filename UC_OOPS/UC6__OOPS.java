
public class  UC6__OOPS {

    // Single method returning full OOPS banner pattern
    public static String[] OOPS_PATTERN () {
        return new String[] {

            "    ***        ***       ******      ****** ",
            "  **   **    **   **     **   **     **     ",
            "  **    **  **     **    **   **     **     ",
            "  **    **  **     **    ******       ***   ",
            "  **    **  **     **    **              **",
            "   **  **    **   **     **               **",
            "    ***        ***       **          ******"

        };
    }

    public static void main(String[] args) {

        String[] banner = OOPS_PATTERN ();

        for (String line : banner) {
            System.out.println(line);
        }
    }
}