import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rawData = new int[3];

        //process inputs.
        int i = 0;
        while (sc.hasNextInt()){
            rawData[i] = sc.nextInt();
            if(i < 2)
                i++;
            else {
                //pass the processed data to methods.
                System.out.print("Trapezoid area:");
                System.out.println(calcArea(rawData));
                //reset the index.
                i=0;
            }
        }
    }

    private static double calcArea(int[] rawData){
        return (double) ((rawData[0] + rawData[1]) * rawData[2]) /2;
    }
}