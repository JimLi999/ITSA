import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static class Vector {
        int x;
        int yi;

        public Vector(int x, int yi) {
            this.x = x;
            this.yi = yi;
        }

        public Vector plus(Vector vector) {
            return new Vector(x + vector.x, yi + vector.yi);
        }

        public Vector minus(Vector vector) {
            return new Vector(x - vector.x, yi - vector.yi);
        }

        public Vector times(Vector vector) {
            return new Vector(
                    x * vector.x - yi * vector.yi,
                    yi * vector.x + x * vector.yi);
        }

        public Vector div(Vector vector) {
            return new Vector(
                    (x * vector.x + yi * vector.yi) / (vector.x * vector.x + vector.yi * vector.yi),
                    (yi * vector.x - x * vector.yi) / (vector.x * vector.x + vector.yi * vector.yi));
        }

        @Override
        public String toString() {
            return x + " " + yi;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int dataCount;

        //process inputs.
        while (sc.hasNextInt()) {
            dataCount = sc.nextInt();
            for (int i = 0; i < dataCount; i++) {
                String operator = sc.next();
                if (Objects.equals(operator, "-")) {
                    Vector a = new Vector(sc.nextInt(), sc.nextInt());
                    Vector b = new Vector(sc.nextInt(), sc.nextInt());
                    System.out.println(a.minus(b));

                } else if (Objects.equals(operator, "+")) {
                    Vector a = new Vector(sc.nextInt(), sc.nextInt());
                    Vector b = new Vector(sc.nextInt(), sc.nextInt());
                    System.out.println(a.plus(b));

                } else if (Objects.equals(operator, "*")) {
                    Vector a = new Vector(sc.nextInt(), sc.nextInt());
                    Vector b = new Vector(sc.nextInt(), sc.nextInt());
                    System.out.println(a.times(b));

                } else if (Objects.equals(operator, "/")) {
                    Vector a = new Vector(sc.nextInt(), sc.nextInt());
                    Vector b = new Vector(sc.nextInt(), sc.nextInt());
                    System.out.println(a.div(b));
                }
            }
        }
    }

}