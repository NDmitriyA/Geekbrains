package Lesson6;

public class Main {



    public static void main(String[] args) {
            Cat cat =new Cat("Васька");
            Cat cat1 =new Cat("Пушок");
            Dog dog = new Dog("Цезарь");
            Dog dog1 = new Dog("Буран");

           cat.info();
           cat1.info();


        System.out.println();

            dog.info();
            dog1.info();


        System.out.println();

        dog.run(500);
        dog.swim(10);
        dog.jump(0.5);

            System.out.println();

            dog1.run(400);
            dog1.swim(8);
            dog1.jump(0.5);

        System.out.println();

        cat.run(200);
        cat.swim(5);
        cat.jump(2.0);

            System.out.println();

            cat1.run(100);
            cat1.swim(5);
            cat1.jump(2.0);
    }
}
