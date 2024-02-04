import java.util.Scanner;

public class vacationAdviser {

    public static void main(String[] args) {

        Scanner mScanner = new Scanner(System.in);
        System.out.print("Enter your preference: beach / mountain ");
        String preference = mScanner.next();
        double budgetPerDay = 0;
        boolean hasMoney = true;

        if (preference.equals("beach")) {
            System.out.println("Enter budget per day: ");

            budgetPerDay = mScanner.nextDouble();


            if (budgetPerDay <= 50 && budgetPerDay>=1) {
                System.out.println("Consider this type of vacation somewhere in Bulgaria.");
            }
            else if (budgetPerDay > 50) {
                System.out.println("Consider this type of vacation Outside Bulgaria.");
            }
            if (budgetPerDay == 0){
                System.out.println("Not enough money for vacation at all.");
            }
        }

        else if (preference.equals("mountain")) {
            System.out.println("Enter budget per day: ");

            budgetPerDay = mScanner.nextDouble();

            if (budgetPerDay <= 50 && budgetPerDay>=1) {
                System.out.println("Consider this type of vacation somewhere in Bulgaria.");
            }
            else if (budgetPerDay > 50) {
                System.out.println("Consider this type of vacation Outside Bulgaria.");
            }

            if (budgetPerDay == 0) {
                hasMoney = false;
                System.out.println("Not enough money for vacation at all.");
            }
        }

        else {
            System.out.println("There is no information about this type of vacation");
        }
    }
}
