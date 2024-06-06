import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int dataCount;

        //process inputs.
        while (sc.hasNextInt()) {
            dataCount = sc.nextInt();
            for (int i = 0; i < dataCount; i++) {
                System.out.println(f91(sc.nextInt()));
            }
        }
    }

    private static int f91(int value){
        if(value>=101)
            return value-10;
        return f91(f91(value+11));
    }

}