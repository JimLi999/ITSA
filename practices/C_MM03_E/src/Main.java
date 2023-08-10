import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rawData = new int[2];
        //process inputs.
        int i=0;
        while(sc.hasNextInt()){
            rawData[i]=sc.nextInt();
            if(i<1)
                i++;
            else {
                //pass the processed data to methods.
                System.out.println(calc(rawData));
                //reset the index.
                i=0;
            }
        }
    }
    private static int calc(int[] rawData){
        return rawData[0]+rawData[1];
    }
}