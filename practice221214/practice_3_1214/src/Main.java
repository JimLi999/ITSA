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
        //reference
        //https://zh.wikipedia.org/zh-tw/%E6%9D%A8%E8%BE%89%E4%B8%89%E8%A7%92%E5%BD%A2#:~:text=ShowYangHuiTriangle()%0A%7D-,Java,-%5B%E7%B7%A8%E8%BC%AF%5D
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
