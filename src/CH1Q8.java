/**
 * Created by issacholguin1 on 7/4/18.
 */
public class CH1Q8 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 1, 1, 1, 1}, {1, 0, 1, 1, 0}, {1, 1, 1, 1 ,1}, {1, 1, 1, 1, 1}};
        matrix = zeroMatrix(matrix);

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }



    }

    private static int[][] zeroMatrix(int[][] matrix) {
        boolean[] zeroRow = new boolean[matrix.length];
        boolean[] zeroCol = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }

        }

        // Zero Rows
        for (int i = 0; i < matrix.length; i++) {
            if (zeroRow[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero Cols

        for (int i = 0; i < matrix[0].length; i++) {
            if (zeroCol[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }


        return matrix;




    }


}