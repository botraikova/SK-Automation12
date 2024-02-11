package Structures;

public class Matrix4rows3column {
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
