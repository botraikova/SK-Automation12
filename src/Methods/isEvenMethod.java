package Methods;

public class isEvenMethod {
    public static void main(String[] args) {
        int number1 = 15, number2 = 22;

        System.out.println(number1 + " is even: " + isEven(number1));
        System.out.println(number2 + " is even: " + isEven(number2));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}