import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[] rawData = new int[3];
        int i = 0;

        //process inputs.
        while (sc.hasNextInt()) {
            if (i < rawData.length - 1) {
                rawData[i] = sc.nextInt();
                i++;
            } else {
                rawData[i] = sc.nextInt();
                System.out.println(canMakeTriangle(rawData)? "fit":"unfit");
                i = 0;
            }
        }
    }

    private static boolean canMakeTriangle(int[] lengths) {
        return (lengths[0] + lengths[1] > lengths[2]) &&
                (lengths[0] + lengths[2] > lengths[1]) &&
                (lengths[1] + lengths[2] > lengths[0]);
    }
}