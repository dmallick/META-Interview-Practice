//Given a positive integer n, generate an n × n matrix filled with numbers from 1 to n² in clockwise spiral order.
public class SpiralMatrix2 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {

            // 1. Left → Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 2. Top → Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 3. Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            // 4. Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }

    // Main method to test
    public static void main(String[] args) {
        int n = 4;
        int[][] result = generateMatrix(n);

        for (int[] row : result) {
            for (int col : row) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
