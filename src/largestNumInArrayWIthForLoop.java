public class largestNumInArrayWIthForLoop {

    public static void main(String[] args) {
        int[] randomNumbers = {5, 8, 20, 450, 3020};

        int max = randomNumbers[0];

        for (int i = 1; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > max) {
                max = randomNumbers[i];
            }
        }
        System.out.println("In this array the largest number is " + max);
    }
}
