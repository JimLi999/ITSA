import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //process inputs.
        int dataCount=sc.nextInt();
        ArrayList<Integer> rawData =new ArrayList<>();
        for (int i = 0; i < dataCount; i++) {
            rawData.add(sc.nextInt());
        }
        logic(rawData);    //start logic process.

    }

    private static void logic(ArrayList<Integer> rawData) {

        for (int it: rawData) {
            if(it<1500){
                System.out.println("70");
            }else {
                int extraTime=it-1500, extra,price=70;
                extra=extraTime/500;
                extraTime=extraTime-(500*extra);
                if(extraTime>0)extra+=1;
                price+=extra*5;
                System.out.println(price);
            }
        }

    }
}