import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[][] cloth=new String[7][7];
        ArrayList<int[][]> dirty=new ArrayList<>();
        while (sc.hasNext()) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    cloth[i][j]=sc.next();
                    if(cloth[i][j].equals("0"))
                        dirty.add(new int[][]{{i,j}});
                }
            }
            logic(cloth, dirty);
        }
    }

    private static void logic(String[][] cloth, ArrayList<int[][]> dirty) {
        for (int[][] dirtyId:dirty) {
            if(checkSurrounding(cloth, dirtyId)){
                cloth[dirtyId[0][0]][dirtyId[0][1]]="I";
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(j==6) System.out.println(cloth[i][j]);
                else System.out.print(cloth[i][j]+" ");
            }
        }

    }

    private static boolean checkSurrounding(String[][] cloth, int[][] dirtyId){
        int[][] testIds={
                {dirtyId[0][0]-1,dirtyId[0][1]},
                {dirtyId[0][0]+1,dirtyId[0][1]},
                {dirtyId[0][0],dirtyId[0][1]-1},
                {dirtyId[0][0],dirtyId[0][1]+1}
        };
        for (int i = 0; i < 4; i++) {
            if(testIds[i][0]>6 || testIds[i][0]<0 || testIds[i][1]>6 || testIds[i][1]<0)
                return false;
            if(!Objects.equals(cloth[testIds[i][0]][testIds[i][1]], "X"))
                return false;
        }
        return true;
    }
}