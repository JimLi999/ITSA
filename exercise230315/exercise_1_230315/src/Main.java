import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //process inputs.
        int dataCount=sc.nextInt();
        ArrayList<String> rawData =new ArrayList<>();
        while (sc.hasNext()) {

            for (int i = 0; i <= dataCount; i++) {
                rawData.add(sc.nextLine());
            }
            rawData.remove(0);  //remove empty data.
            logic(rawData);    //start logic process.
        }
    }

    private static void logic(ArrayList<String> rawData) {
        for (String it: rawData) {

            char[] data=it.toCharArray();
            ArrayList<Character> processedData=new ArrayList<>();
            for (Character c:data) {
                if(!processedData.contains(c))
                    processedData.add(c);
            }
            System.out.printf("%d %d\n", data.length, processedData.size());
        }

    }
}