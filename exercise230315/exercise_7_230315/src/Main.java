import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //process inputs.
        int month = sc.nextInt();
        logic(month);    //start logic process.
    }

    private static void logic(int month) {
        System.out.println(calculateBabies(month));
    }

    private static int calculateBabies(int month){
        if(month<=4)
            return 1;
        else
            return calculateBabies(month-3)+calculateBabies(month-2);
    }

}
