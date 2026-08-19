import java.util.*;

public class Strong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            int fact = 1;

            // Calculate factorial of the digit
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            // Add factorial to sum
            sum += fact;

            // Remove last digit
            n = n / 10;
        }

        // Check Strong Number
        if (sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is Not a Strong Number.");
        }

        sc.close();
    }
}