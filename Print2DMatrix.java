public class Print2DMatrix {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through the matrix and print elements
        System.out.println("2D Matrix:");
        for (int i = 0; i < matrix.length; i++) {         // rows
            for (int j = 0; j < matrix[i].length; j++) {  // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
