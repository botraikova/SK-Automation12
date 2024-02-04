import java.util.Scanner;

public class revenueIfElse {
    public static void main(String[] args) {
        Scanner mScanner = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        int unitPrice = mScanner.nextInt();
        System.out.print("Enter quantity:");
        int quantity = mScanner.nextInt();
        double discount;
        double revenue;
        double revenueTotal = unitPrice * quantity;
        if (quantity >= 100 && quantity <= 120) {
            discount = revenueTotal * 0.15;
            revenue = revenueTotal - discount;

            System.out.println("The revenue from sale: " + revenue + "$");
            System.out.println("Discount: " + discount + " (15%)");
        }

        else if (quantity > 120) {
            revenue = (unitPrice * quantity);
            discount = revenue * 0.20;
            System.out.println("The revenue from sale: " + revenue + "$");
            System.out.println("Discount: " + discount + " (20%)");
        }

        else {
            revenueTotal = unitPrice * quantity;
            System.out.println("The revenue from sale: " + revenueTotal + "$");
            System.out.println("Discount: 0%");
        }

    }
}

