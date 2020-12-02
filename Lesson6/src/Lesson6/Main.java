package Lesson6;

public class Main {



    public static void main(String[] args) {
Cat cat =new Cat("Васька");
Dog dog = new Dog("Цезарь");
        cat.info();


        System.out.println();

        dog.info();


        System.out.println();

        dog.run(500);
        dog.swim(10);


        System.out.println();

        cat.run(200);
        cat.swim(5);

    }
}
