import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(isBissextileYear(rawData) ? "Bissextile Year" : "Common Year");
        }
    }

    private static boolean isBissextileYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return (year % 4 == 0);
    }

}