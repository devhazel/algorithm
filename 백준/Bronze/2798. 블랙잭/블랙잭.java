import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]), m = Integer.parseInt(nm[1]);
        String[] cards = br.readLine().split(" ");
        int game = 0;
        for(int i=0; i<cards.length-2; i++) {
            for(int j=i+1; j<cards.length-1; j++) {
                for(int k=j+1; k<cards.length; k++) {
                    int sum = Integer.parseInt(cards[i]) + Integer.parseInt(cards[j]) + Integer.parseInt(cards[k]);
                    if(sum <= m && sum > game) {
                        game = sum;
                    }
                }
            }
        }
        System.out.print(game);
    }
}