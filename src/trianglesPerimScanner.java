import java.util.Scanner;
public class trianglesPerimScanner {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter side1:");
            double side1 = scanner.nextDouble();

            System.out.print("Enter side2:");
            double side2 = scanner.nextDouble();

            System.out.print("Enter side3:");
            double side3 = scanner.nextDouble();

            scanner.close();
            double perimeter = side1 + side2 + side3;

            System.out.println(perimeter);
            System.out.println("The triangle's perimeter is:" + '\t'+ perimeter);

        }
}
