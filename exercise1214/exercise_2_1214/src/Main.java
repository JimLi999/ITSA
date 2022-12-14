import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {
            int people=sc.nextInt();
            ArrayList<Integer> values=new ArrayList<>();
            for (int i = 0; i < people; i++) {
                values.add(sc.nextInt());
            }
            System.out.println(logic(values));
        }
    }

    private static int logic(ArrayList<Integer> values) {
        int avg =0;
        for (int value:values) {
            avg +=value;
        }
        avg /=values.size();
        int passAVG=0;
        for (int value:values) {
            if (value>avg)passAVG++;
        }
        return passAVG;
    }
}