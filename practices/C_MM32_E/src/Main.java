import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(isArmstrong(rawData) ? "Yes" : "No");
        }
    }

    private static boolean isArmstrong(int num) {
        return (long) (Math.pow(num % 10, 3)
                + Math.pow(((num - num % 10) % 100) * 0.1, 3)
                + Math.pow(((num - num % 100) % 1000) * 0.01, 3)) == num;
    }
}