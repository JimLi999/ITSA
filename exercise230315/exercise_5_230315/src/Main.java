public class Main {
    public static void main(String[] args) {
        System.out.println(getSolutionCounts(13));
    }
    public static int getSolutionCounts(int sandbags){
        return fibo(sandbags);
    }

    private static int fibo(int n) {
        if(n<2) return 1;
        return fibo(n-1)+fibo(n-2);
    }
}