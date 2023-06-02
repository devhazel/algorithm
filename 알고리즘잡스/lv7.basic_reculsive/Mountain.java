import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMountain(n);
    }

    private static void printMountain(int n) {
        if(n==0) {
            return;
        } else {
            printMountain(n-1);
            System.out.print(n);
            printMountain(n-1);
        }
    }
}