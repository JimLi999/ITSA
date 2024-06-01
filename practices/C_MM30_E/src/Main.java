import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(isPrimeNumber(rawData)? "YES":"NO");
        }
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