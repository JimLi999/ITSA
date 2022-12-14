import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int layers = scanner.nextInt();
            logic(layers);
        }
    }

    private static void logic(int layers) {
        int[][] odds = new int[layers][];
        for (int n = 0; n < layers; n++) {
            odds[n] = new int[n + 1];

            // fill triangular array

            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }
        }
        // print triangular array
        for (int[] row : odds) {
            int q=0;
            for (int odd : row){
                if(row.length-q==1)
                    System.out.print(odd);
                else System.out.print(odd+" ");
                q++;
            }

            System.out.println();
        }
    }
}