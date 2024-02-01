import java.util.Scanner;
public class trianglesAreaScanner {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter height:");
            double height = scanner.nextDouble();

            System.out.print("Enter base:");
            double base = scanner.nextDouble();

            scanner.close();

            double area = (height * base)/2;

            System.out.println("The triangle's area is:" + '\t' + area);
        }
}
