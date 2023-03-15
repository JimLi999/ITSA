import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //process inputs.
        int dataCount = sc.nextInt();
        ArrayList<String> rawData = new ArrayList<>();

        for (int i = 0; i <= dataCount; i++) {
            rawData.add(sc.nextLine());
        }
        rawData.remove(0);  //remove empty data.
        logic(rawData);    //start logic process.
    }

    private static void logic(ArrayList<String> rawData) {
        ArrayList<Character> processData = new ArrayList<>();
        for (String it : rawData) {
            for (char c : it.toCharArray())
                processData.add(c);

            for (int i = 0; i < processData.size(); i++) {
                if(processData.get(i).equals('X')){
                    for (int j = i; j < processData.size(); j++) {
                        if(processData.get(j).equals('Y')) {
                            processData.set(j,'0');
                            processData.set(i,'0');
                            break;
                        }
                    }
                }
            }

            boolean allPaired=false;
            for (Character processDatum : processData) {
                if (!processDatum.equals('0')) {
                    allPaired = false;
                    break;
                } else allPaired = true;
            }

            if(allPaired)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}