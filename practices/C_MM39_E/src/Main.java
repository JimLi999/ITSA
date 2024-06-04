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
                System.out.println(checkTriangleType(rawData));
                i = 0;
            }
        }
    }

    private static boolean canMakeTriangle(int[] lengths) {
        return (lengths[0] + lengths[1] > lengths[2]) &&
                (lengths[0] + lengths[2] > lengths[1]) &&
                (lengths[1] + lengths[2] > lengths[0]);
    }

    private static double sumOfSquares(double a, double b) {
        return Math.pow(a, 2) + Math.pow(b, 2);
    }

    private static boolean equals(double a, double b) {
        return a == b;
    }

    private static boolean less(double a, double b) {
        return a < b;
    }

    private static boolean isRightTriangle(int[] lengths) {
        return (equals(sumOfSquares(lengths[0], lengths[1]), Math.pow(lengths[2], 2)) ||
                equals(sumOfSquares(lengths[1], lengths[2]), Math.pow(lengths[1], 2)) ||
                equals(sumOfSquares(lengths[1], lengths[2]), Math.pow(lengths[0], 2)));
    }

    private static boolean isObtuseTriangle(int[] lengths) {
        return (less(sumOfSquares(lengths[0], lengths[1]), Math.pow(lengths[2], 2)) ||
                less(sumOfSquares(lengths[1], lengths[2]), Math.pow(lengths[1], 2)) ||
                less(sumOfSquares(lengths[1], lengths[2]), Math.pow(lengths[0], 2)));
    }


    private static String checkTriangleType(int[] lengths) {
        if (!canMakeTriangle(lengths))
            return "Not Triangle";

        if (isRightTriangle(lengths))
            return "Right Triangle";

        if(isObtuseTriangle(lengths))
            return "Obtuse Triangle";

        return "Acute Triangle";
    }


}