package Structures;

public class sumOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            sum += arr1[i];
        }
        System.out.println("The sum of this array's elements is " + sum);
    }
}