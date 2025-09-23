package level_3;
import java.util.Random;

public class MatrixOperations {

    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // values between 0–9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular, no inverse.");
        double[][] inv = {
            { matrix[1][1] / det, -matrix[0][1] / det },
            { -matrix[1][0] / det, matrix[0][0] / det }
        };
        return inv;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) throw new ArithmeticException("Matrix is singular, no inverse.");

        double[][] adj = new double[3][3];
        
        // Cofactors
        adj[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]);
        adj[0][1] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]);
        adj[0][2] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        adj[1][0] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]);
        adj[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]);
        adj[1][2] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]);
        adj[2][0] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]);
        adj[2][1] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]);
        adj[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]);

        // Transpose adjoint to get adjugate
        double[][] adjT = transpose(adj);

        // Divide by determinant
        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inv[i][j] = adjT[i][j] / det;
            }
        }
        return inv;
    }

    // Main method
    public static void main(String[] args) {
        // Example: 2x2
        double[][] mat2 = createRandomMatrix(2, 2);
        System.out.println("Original 2x2 Matrix:");
        displayMatrix(mat2);

        System.out.println("Transpose:");
        displayMatrix(transpose(mat2));

        double det2 = determinant2x2(mat2);
        System.out.println("Determinant of 2x2: " + det2);

        if (det2 != 0) {
            System.out.println("Inverse of 2x2:");
            displayMatrix(inverse2x2(mat2));
        }

        // Example: 3x3
        double[][] mat3 = createRandomMatrix(3, 3);
        System.out.println("Original 3x3 Matrix:");
        displayMatrix(mat3);

        System.out.println("Transpose:");
        displayMatrix(transpose(mat3));

        double det3 = determinant3x3(mat3);
        System.out.println("Determinant of 3x3: " + det3);

        if (det3 != 0) {
            System.out.println("Inverse of 3x3:");
            displayMatrix(inverse3x3(mat3));
        }
    }
}
