import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;


        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(calcMPN(rawData));
        }
    }

    private static int calcMPN(int rawData) {
        for (int i = rawData-1; i > 1; i--){
            if(isPrimeNumber(i)){
                return i;
            }
        }
        return 0;
    }
    private static boolean isPrimeNumber(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}