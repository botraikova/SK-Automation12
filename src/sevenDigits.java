import java.util.Scanner;

public class sevenDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter digit:");
        int digit = scanner.nextInt();
        switch (digit) {
            case 1:
                System.out.println("“The"+'\t' +digit + "-st day of the week is Monday”");
                break;
            case 2:
                System.out.println("“The"+'\t' +digit + "-nd day of the week is Tuesday”");
                break;
            case 3:
                System.out.println("“The"+'\t' +digit + " -rd day of the week is Wednesday”");
                break;
            case 4:
                System.out.println("“The"+'\t' +digit + " -th day of the week is Thursday”");
                break;
            case 5:
                System.out.println("“The"+'\t' +digit + " -th day of the week is Friday”");
                break;
            case 6:
                System.out.println("“The"+'\t' +digit + "-th day of the week is Saturday”");
                break;
            case 7:
                System.out.println("“The"+'\t' +digit + "-th day of the week is Sunday”");
                //System.out.println("“The " + digit + "-th day of the week is Sunday”");
                break;
            default:
                System.out.print("Invalid input. Please enter a number between 1 and 7.");
        }
    }

}
