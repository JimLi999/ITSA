import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()) {
            int inputs= scanner.nextInt();
            ArrayList<Integer> values=new ArrayList<>();

            //store input data
            for (int i = 0; i < inputs; i++) {
                values.add(scanner.nextInt());
            }

            //process input data
            for (int value:values) {
                System.out.println(logic(value));
            }
        }
    }
    private static int logic(int value){
        int result=0;
        for (int i = 1; i <= value; i++) {
            result+=i;
        }
        return result;
    }
}
