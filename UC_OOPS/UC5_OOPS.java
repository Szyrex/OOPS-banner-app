/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * @author Developer
 * @version 5.0
 */

public class UC5_OOPS  {

    public static void main(String[] args) {

        // Inline initialization of banner lines
        String[] lines = {

            String.join(" ", "  *****  ", "  *****  ", " ******  ", "  ***** "),
            String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **     "),
            String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **     "),
            String.join(" ", " **   ** ", " **   ** ", " ******  ", "  ***** "),
            String.join(" ", " **   ** ", " **   ** ", " **      ", "      **"),
            String.join(" ", " **   ** ", " **   ** ", " **      ", " **   **"),
            String.join(" ", "  *****  ", "  *****  ", " **      ", "  ***** ")

        };

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}