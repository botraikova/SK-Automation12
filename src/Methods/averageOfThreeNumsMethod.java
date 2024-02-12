package Methods;

public class averageOfThreeNumsMethod {
    public static void main(String[] args) {

        double a = 10, b = 30, c = 60;
        double average = computeAverage(a, b, c);
        System.out.println("The average of the three numbers is: " + average);
    }
    public static double computeAverage(double a, double b, double c) {
        double sum = a + b + c;
        return sum / 3;
    }
}
