package Structures;

public class matrix4rows3column {
    public static void main(String[] args) {
        int[][] matrix2dim = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 110, 120}
        };

        for (int i = 0; i < matrix2dim.length; i++) {
            for (int j = 0; j < matrix2dim[i].length; j++) {
                System.out.print(matrix2dim[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//We define a 2-dimensional array matrix with 4 rows and 3 columns.
//We use two nested for loops to iterate through each row and column of the matrix.
//The outer loop (i) iterates over the rows of the matrix (from 0 to 3).
//The inner loop (j) iterates over the columns of each row (from 0 to 2).
//Inside the inner loop, we print each element of the matrix followed by a space.
//After printing all elements of a row, we move to the next line
//using System.out.println() to print the next row on a new line.