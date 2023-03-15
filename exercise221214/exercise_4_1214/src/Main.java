import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {
            int input =sc.nextInt();
            ArrayList<Integer> quantity =new ArrayList<>();
            for (int i = 0; i < input; i++) {
                quantity.add(sc.nextInt());
            }
            for (int value: quantity) {
                System.out.println(logic(value));
            }
        }
    }

    private static int logic(int quantity) {
        ArrayList<Integer> num=new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            num.add(i);
        }

        int target=4;
        while (num.size()>1){
            num.remove(target% (num.size()-1));
        }


        return num.get(0);
    }
}