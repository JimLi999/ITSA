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
            System.out.println(printFactors(rawData));
        }
    }

    private static String printFactors(int num){
       ArrayList<Integer> factorList = findFactor(num, true);
       StringBuilder strBuilder = new StringBuilder();
       for (int i =0; i<factorList.size(); i++){
           strBuilder.append(factorList.get(i));
           if(i+1!=factorList.size()) {
               strBuilder.append(" ");
           }
       }

       return strBuilder.toString();
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

}