package javacore3;




import java.util.*;




public class Main {

    public static class Box<T extends Fruit> implements Boxbox {

        public ArrayList<T> box = new ArrayList<>();


        protected Box() {

        }

        public int getWeight() {
            int weight = 0;
            for (T o : box) {
                weight += o.getWeight();
            }
            return weight;
        }


        public void addFruit(T fruit, int amount) {
            for (int i = 0; i < amount; i++) {
                box.add(fruit);
            }
        }

        @Override
        public int compare(Box<?> o2) {
            if (this.getWeight() == o2.getWeight())
                return 0;
            return this.getWeight() > o2.getWeight() ? 1 : -1;

        }


        public static class Apple extends Fruit {

            @Override
            int getWeight() {
                return 100;
            }
        }

        public static class Orange extends Fruit {

            @Override
            int getWeight() {
                return 115;
            }

        }

        public int compare(Box<Orange> or, Box<?> o2) {
            if (this.getWeight() == o2.getWeight())
                return 0;
            return this.getWeight() > o2.getWeight() ? 1 : -1;

        }



        public static void swap(Object[] arr, int n1, int n2) {
            System.out.println("Задание№1: " + Arrays.toString(arr));
            Object sw = arr[n1];
            arr[n1] = arr[n2];
            arr[n2] = sw;
            System.out.println("Результат замены: " + Arrays.toString(arr) + "\n================================");
        }


        public static void main(String[] args) {

            Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
            String arr2[] = {"A", "B", "C"};
            swap(arr1, 1, 4);
            swap(arr2, 0, 2);
            System.out.println();
            System.out.println("Задача№2");

            List<Box> Box = new ArrayList<>();
            Box<Main.Box.Orange> or = new Box<>();
            Box<Main.Box.Orange> or1 = new Box<>();
            Box<Main.Box.Apple> ap = new Box<>();
            Box<Main.Box.Apple> ap1 = new Box<>();

            or.addFruit(new Box.Orange(), 10);
            or1.addFruit(new Box.Orange(), 12);
            ap.addFruit(new Box.Apple(), 8);
            ap1.addFruit(new Box.Apple(), 4);
            System.out.println("Box 1: " + or.getWeight());
            System.out.println("Box 2: " + or1.getWeight());
            System.out.println("Box 3: " + ap.getWeight());
            System.out.println("Box 4: " + ap1.getWeight());
            int retval;
            retval = or.compare(or, or1);
            switch (retval) {
                case 1: {
                    System.out.println("Эта коробка" + ap1.getWeight() + " is bigger!");
                    break;

                }
                case -1: {
                    System.out.println("Эта коробка " + ap.getWeight() + " is bigger!");
                    break;
                }
                default:
                    System.out.println("Коробки одинаковые");
            }
        }
    }
}
