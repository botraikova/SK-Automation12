import java.util.Scanner;

public class workAge {
    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = mScanner.nextInt();
        if (age >= 16) {
            System.out.println("You are eligible to work.");
        }
        else {
            System.out.println("You are not eligible to work.");
        }

        System.out.print("Enter sex: m/f ");
        String sex = mScanner.next();
        if (sex.equals("m")) {
            System.out.println("You are eligible to work.");
        }
        else if (sex.equals("f")) {
            System.out.println("You are eligible to work.");
        }
        else {
            System.out.println("Invalid data. Please enter your sex. ");
        }
    }
}
