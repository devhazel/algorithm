public class Main {
    public static void main(String[] args) {
        for(int i=1; i<=10000; i++) {
            boolean hasConductor = false;
            for(int j=1; j<=i; j++) {
                if (checkConductor(i, j)) {
                    hasConductor = true;
                    break;
                }
            }
            if(!hasConductor) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkConductor(int i, int j) {
        return i == j + (j/10000) + (j%10000)/1000 + (j%1000)/100 + (j%100)/10 + j%10;
    }
}