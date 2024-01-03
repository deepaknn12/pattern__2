
import java.util.Scanner;

public class inverted_number_pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Read the number of rows from the user

        int n = scanner.nextInt();
        // Print the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
            scanner.close();
        }
    }
}
