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

    private static int calculateWorms(int month){
        if(month<=4)
            return 1;
        else
            return calculateWorms(month-3)+calculateWorms(month-2);
    }

}
