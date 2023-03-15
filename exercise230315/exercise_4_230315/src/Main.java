import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Item[] items ={
                new Item(123,"iPhone_13",12),
                new Item(456,"iPad",5),
                new Item(789,"AirPods_Pro",14),
                new Item(321,"iPhone_14",0),
                new Item(654,"Apple_Watch",6)
        };



        //process inputs.
        while (sc.hasNext()){
            int mode=sc.nextInt();
            if(mode==0)break;
            else {
                switch (mode) {
                    case 1:
                        search(items, sc.nextInt());
                        break;
                    case 2:
                        search(items, sc.next());
                        break;
                }
            }
        }

    }

    private static void search(Item[] items, int id) {
        boolean found=false;
        for (Item item : items) {
            if (item.getId() == id) {
                System.out.println(item.toString());
                found = true;
                break;
            }
        }
        if(!found)System.out.println("404");
    }
    private static void search(Item[] items, String name) {
        boolean found=false;
        for (Item item : items) {
            if (Objects.equals(item.getName(), name)) {
                System.out.println(item.toString());
                found = true;
                break;
            }
        }
        if(!found)System.out.println("404");

    }

    public static class Item{
        private int id;
        private String name;
        private int stock;

        Item(int id, String name, int stock){
            setId(id);
            setName(name);
            setStock(stock);
        }

        public void setId(int id) {
            this.id = id;
        }
        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }


        public void setStock(int stock) {
            this.stock = stock;
        }
        public int getStock() {
            return stock;
        }

        @Override
        public String toString() {
            String result;
            result=id+" "+name+" "+stock;
            return result;
        }
    }
}