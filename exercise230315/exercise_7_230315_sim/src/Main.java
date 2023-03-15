import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        logic(17);
    }

    public static void logic(int month){
        ArrayList<Worm> worms=new ArrayList<>();
        worms.add(new Worm());

        for(int m=1;m<month;m++){
            for (Worm worm : worms) {
                worm.setAge(worm.getAge() + 1);
                Worm.checkAndModifyStatus(worm);
            }
            int inc=0;
            for (int i = 0; i < worms.size(); i++) {
                if(Worm.hasBirth(worms.get(i))){
                    worms.add(new Worm());
                    inc++;
                }
            }
            int dec=0;
            for (int i = worms.size()-1; i>=0; i--) {
                if(Worm.isDead(worms.get(i))){
                    worms.remove(i);
                    dec++;
                }
            }

            int babyCount=0;
            for (Worm worm:worms) {
                if(worm.getStatus()==0){
                    babyCount++;
                }
            }
            System.out.printf("Month: %2d, Total: %2d, Birth: %2d, Death: %2d, Baby: %2d, Adult: %2d\n", m, worms.size(), inc, dec, babyCount, worms.size()-babyCount);
        }
    }


    static class Worm{
        int age;
        int status;

        Worm(){
            age=0;
            status=0;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            if(age>3)age=3;
            this.age = age;
        }

        public int getStatus() {
            return status;
        }
        public void setStatus(int status) {
            this.status = status;
        }

        public static void checkAndModifyStatus(Worm worm){
            if(worm.getAge()==3) worm.setStatus(2); //dead.
            else if (worm.getAge() >= 1) worm.setStatus(1);  //adult.
            else worm.setStatus(0); //baby.
        }
        public static boolean hasBirth(Worm worm){
            return worm.getAge() >= 2;
        }
        public static boolean isDead(Worm worm){
            return worm.getAge() == 3;
        }
    }

}