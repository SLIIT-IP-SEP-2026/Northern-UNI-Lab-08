import java.util.Scanner;

public class IT26102429Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[6];

        int i = 0;
        while (i < 6) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                arr[i] = num;
                i++;
            }
        }

        // Find maximum
        int max = arr[0];
        for (int k = 1; k < 6; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
        }

        System.out.println("\nArray Contents:");
        for (int k = 0; k < 6; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}