import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<int[]> charShiftPairs = new ArrayList<>();
        while (sc.hasNext()) {
            int inputs = sc.nextInt();
            for (int i = 0; i < inputs; i++) {
                for (int j = 0; j < 5; j++) {
                    charShiftPairs.add(new int[]{sc.nextInt(), sc.nextInt()});
                }
            }
            logic(charShiftPairs);
        }
    }

    private static void logic(ArrayList<int[]> charShiftPairs) {
        //create an a to z array.
        char[] a2z=new char[26];
        for (int i = 0; i < 26; i++) {
            a2z[i]=(char)('a'+i);
        }

        for (int[] charShift:charShiftPairs) {
            //make sure the shift won't exceed 26.
            int shift=charShift[1]%26;

            //if-elseif-else statement for shift left(exceed a to z), right(exceed a to z) or free(in a to z range).
            if(a2z[charShift[0]-1]+shift< 'a'){
                //shift left(exceed a to z)
                a2z[charShift[0]-1]=(char) ('z'+shift+1);
            } else if (a2z[charShift[0]-1]+shift>'z') {
                //shift right(exceed a to z)
                a2z[charShift[0]-1]=(char) ('a'+shift-('z'-a2z[charShift[0]-1])-1);
            }else
                //free shift(in a to z range)
                a2z[charShift[0]-1]+=shift;
        }
        System.out.println(a2z);
    }


}
