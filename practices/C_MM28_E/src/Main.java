import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;


        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(calcResult(rawData));
        }
    }

    private static String calcResult(int rawData) {
        StringBuilder strBuilder=new StringBuilder();

        for(int currentValue=35; currentValue<=rawData; currentValue+=35){
            strBuilder.append(currentValue);
            if(currentValue+35<=rawData){
                strBuilder.append(" ");
            }
        }

        return strBuilder.toString();
    }
}