import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }

    public static void logic(){
        int month=0;
        ArrayList<Worm> worms=new ArrayList<>();
        worms.add(new Worm());
        for (int i = 0; i < worms.size(); i++) {
            worms.get(i).setAge(worms.get(i).getAge()+1);
            Worm.checkAndModifyStatus(worms.get(i));
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
            else if (worm.getAge() > 1) worm.setStatus(1);  //adult.
            else worm.setStatus(0); //baby.
        }
    }

}