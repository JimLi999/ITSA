import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(printPerfectNum(rawData));
        }
    }

    private static String printPerfectNum(int rawData) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 2; i <= rawData; i++) {
            if (isPerfectNum(i)) {
                if (strBuilder.length() > 0) {
                    strBuilder.append(" ");
                    strBuilder.append(i);
                } else {
                    strBuilder.append(i);
                }
            }
        }
        return strBuilder.toString();
    }

    private static boolean isPerfectNum(int num) {
        ArrayList<Integer> factorList = findFactor(num, false);
        return factorSumUp(factorList) == num;
    }

    private static ArrayList<Integer> findFactor(int num, boolean includeSelf) {
        ArrayList<Integer> factorList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorList.add(i);
            }
        }

        if(!includeSelf){
            factorList.remove(Integer.valueOf(num));
        }
        return factorList;
    }

    private static long factorSumUp(ArrayList<Integer> factorList) {
        long sum = 0;
        for (int item : factorList) {
            sum += item;
        }
        return sum;
    }
}