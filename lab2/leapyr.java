import java.util.Scanner;

public class leapyr {
    public static void main(String args[]) {
        // A program to check for leap year
        Scanner mj = new Scanner(System.in);
        System.out.print("Enter a year to check: ");
        int yr = mj.nextInt();

        // Boolean logic to check leap year
        boolean isLeap = false;
        if(yr%4==0){
            if(yr%100!=0){
                isLeap=true;
            }
            else{
                if(yr%400==0){
                    isLeap=true;
                }
            }
        }

        if (isLeap) {
            System.out.println("It's a leap year!");
        } else {
            System.out.println("It's a common year!");
        }

        System.out.println("\nThank You!");
        mj.close();
    }
}