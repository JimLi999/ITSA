import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int layers=scanner.nextInt();
            logic(layers);
        }
    }
    private static void logic(int layers){
        for (int i = 1; i <= layers; i++) {
            for (int j=0; j< layers; j++){
                if(j<layers-i) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}