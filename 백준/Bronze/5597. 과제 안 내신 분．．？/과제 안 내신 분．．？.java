import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[30];
        while(scanner.hasNextInt()) {
            arr[scanner.nextInt()-1] = 1;
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==0) {
                System.out.println(i+1);
            }
        }
    }
}