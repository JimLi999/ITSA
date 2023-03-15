public class Main {
    public static void main(String[] args) {
        int N=13, result=0,x2=1,x1=1;
        for (int i = 0; i < N/2; i++) {
            for (int j = 1; j <= i; j++) {
                x2*=j;
            }
            for (int j = 1; j <= N-i; j++) {
                x1*=j;
            }
        }
        int Na=1;
        for (int i = 1; i <= N; i++) {
            Na*=i;
        }

        System.out.println(Na/x1/x2);
    }
}