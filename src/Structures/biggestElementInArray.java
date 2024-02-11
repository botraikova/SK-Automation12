package Structures;

public class biggestElementInArray {
    public static void main(String[] args) {

        int[] randomArray = {15, 30, 65, -5, 10};

        int max = randomArray[0];

        for (int elem : randomArray) {
            if (elem > max) {
                max = elem;
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
}