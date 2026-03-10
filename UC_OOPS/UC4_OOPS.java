 /**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

// Extend the user story 3 to further develop the OOPS Banner Application
// by using String arrays to hold banner lines and printing them in a loop.
// This use case improves upon UC3 by using a String array to store banner lines
// and iterating through them with a for-each loop, eliminating hardcoded print
// statements and improving modularity and reusability.

// Hint:


public class UC4_OOPS {

    public static void main(String[] args) {

        // 1. Define a String array for 7 banner lines
        String[] lines = new String[7];

        // 2. Populate each index using String.join()
        lines[0] = String.join(" ", "  *****   ", "  *****   ", " ******   ", "  ***** ");
        lines[1] = String.join(" ", " **   **  ", " **   **  ", " **   **  ", " **     ");
        lines[2] = String.join(" ", " **   **  ", " **   **  ", " **   **  ", " **     ");
        lines[3] = String.join(" ", " **   **  ", " **   **  ", " ******   ", "  ***** ");
        lines[4] = String.join(" ", " **   **  ", " **   **  ", " **       ", "      **");
        lines[5] = String.join(" ", " **   **  ", " **   **  ", " **       ", " **   **");
        lines[6] = String.join(" ", "  *****   ", "  *****   ", " **       ", "  ***** ");

        // 3. Use for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}