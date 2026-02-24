/**
 * OOPSBannerApp
 * Displays "OOPS" banner using Array and Loop.
 *
 * @author Raj Bardhan
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

                String.join(" ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", "*     *", "*     *"),
                String.join(" ", "*     *", "*     *", "*     *", "*      "),
                String.join(" ", "*     *", "*     *", " ***** ", " ***** "),
                String.join(" ", "*     *", "*     *", "*      ", "      *"),
                String.join(" ", "*     *", "*     *", "*      ", "*     *"),
                String.join(" ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}