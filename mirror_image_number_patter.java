
import java.util.Scanner;
public class mirror_image_number_patter {
    

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRows = scanner.nextInt();
 int i = 1;
        while (i <= numRows) {
            // Print spaces
            int spaces = 0;
            while (spaces < numRows - i) {
                System.out.print(" ");
                spaces++;
            }
            // Print stars
            int stars = 1;
            while (stars <= 2 * i - 1) {
                System.out.print("*");
                stars++;
            } // Move to the next line
            System.out.println();
            i++;
        }
        scanner.close();
    }
}
