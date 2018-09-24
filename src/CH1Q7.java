/**
 * Created by issacholguin1 on 7/3/18.
 */
import java.util.*;

public class CH1Q7 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};

        // Before
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        matrix = rotateMatrix(matrix);

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }



    // GREAT Tutorial https://www.youtube.com/watch?v=Jtu6dJ0Cb94
    private static int[][] rotateMatrix(int[][] matrix) {

        int last = matrix.length-1;

        for (int layer = 0; layer < matrix.length/2; layer++) {
            for(int i = layer; i < last; i++) {

                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[last-i+layer][layer];
                matrix[last-i+layer][layer] = matrix[last][last-i+layer];
                matrix[last][last-i+layer] = matrix[i][last];
                matrix[i][last] = temp;

            }
            last--;
        }

        return matrix;

    }




}