import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] paper = new int[100][100];
        int cnt = scanner.nextInt();
        for(int i=0; i<cnt; i++) {
            int col = scanner.nextInt(), row = scanner.nextInt();
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    paper[row+j][col+k] = 1;
                }
            }
        }
        
        int area = 0;
        for(int i=0; i<100; i++) {
            for(int j=0; j<100; j++) {
                if(paper[i][j] == 1) {
                    area++;
                }
            }
        }
        System.out.print(area);
    }
}