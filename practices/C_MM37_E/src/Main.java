import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[] rawData = new int[2];
        int i =0;
        //process inputs.
        while (sc.hasNextInt()) {
            if(i<1){
                rawData[i] = sc.nextInt();
                i++;
            }
            else {
                rawData[i] = sc.nextInt();
                System.out.println(checkCartesianCoordinate(rawData));
                i=0;
            }
        }
    }

    private static String checkCartesianCoordinate(int[] coordinate) {
        if(Arrays.equals(coordinate, new int[]{0, 0}))
            return "Origin";
        if(coordinate[0]==0)
            return "y-axis";
        if(coordinate[1]==0)
            return "x-axis";
        if(coordinate[0]>0){
            if(coordinate[1]>0)
                return "1st Quadrant";
            return "4st Quadrant";
        }
        if (coordinate[1] > 0)
            return "2nd Quadrant";
        return "3rd Quadrant";
    }
}