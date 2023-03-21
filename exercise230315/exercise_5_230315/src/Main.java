import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Diver Code.
        Scanner sc=new Scanner(System.in);
        int dataCounts=sc.nextInt();
        int[] inputs=new int[dataCounts];
        for (int i = 0; i < dataCounts; i++) {
            inputs[i]=sc.nextInt();
        }
        for (int input:inputs) {
            System.out.println(getSolutionCounts(input));
        }

    }
    //Logic Code.
    public static int getSolutionCounts(int sandbags){
        return fibonacchi(sandbags);
    }

    private static int fibonacchi(int n) {
        if(n<2) return 1;
        return fibonacchi(n-1)+ fibonacchi(n-2);
    }
}