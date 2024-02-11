package Structures;

public class sumOfMatrixDiagonal {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 5, 10, 15},
                {20, 25, 30, 35},
                {40, 45, 50, 55},
                {60, 65, 70, 75}
        };

        int sumDiagonal1 = 0;
        int sumDiagonal2= 0;

        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++){
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++){
                if (rowIndex == columnIndex){
                    sumDiagonal1 += matrix[rowIndex][columnIndex];
                }
                if (rowIndex + columnIndex == matrix.length){
                    sumDiagonal2 += matrix[rowIndex][columnIndex];
                }
            }
        }
        System.out.println("The sum of the first diagonal is: " + sumDiagonal1);
        System.out.println("The sum of the second diagonal is: " + sumDiagonal2);
    }
}