import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scale = new int[8];
        for(int i=0; i<scale.length; i++) {
            scale[i] = scanner.nextInt();
        }
        boolean isOrdered = true;
        for(int i=1; i<scale.length; i++) {
            if(Math.abs(scale[i-1]-scale[i]) != 1) {
                isOrdered = false;
                break;
            }
        }
        if(!isOrdered) {
            System.out.print("mixed");
        } else if(scale[0]==1) {
            System.out.print("ascending");
        } else {
            System.out.print("descending");
        }
    }
}