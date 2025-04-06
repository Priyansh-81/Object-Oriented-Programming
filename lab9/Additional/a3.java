import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        StringBuilder concatenatedString = new StringBuilder();

        System.out.println("Enter 5 strings:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter string " + i + ": ");
            String input = mj.nextLine();
            concatenatedString.append(input);
        }

        System.out.println(
            "Concatenated String: " + concatenatedString.toString()
        );
    }
}
