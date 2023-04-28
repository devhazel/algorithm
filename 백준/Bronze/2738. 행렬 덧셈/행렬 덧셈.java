import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt(), col = scanner.nextInt();
        int[][] a = inputMatrix(scanner, row, col), b = inputMatrix(scanner, row, col);
        addMatrix(a, b);
    }
    
    static void addMatrix(int[][] a, int[][] b) {
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a[i].length; j++) {
                System.out.printf("%d ", a[i][j] + b[i][j]);
            }
            System.out.println();
        }
    }
    
    static int[][] inputMatrix(Scanner scanner, int row, int col) {
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}