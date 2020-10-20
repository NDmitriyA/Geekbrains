package Lesson6;
import java.util.Random;
abstract class Animals {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;
    public Random random = new Random();

    public Animals(String name){
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " не смогу столько пробежать.");
        else System.out.println(this.type + " " + this.name + " может пробежать и " + dist + " м.");
    }

    public void swim(int dist) {
        if (this.maxSwim <= dist) System.out.println(this.type + " " + this.name + " может проплыть и  " + dist + " м.");
        else System.out.println(this.type + " " + this.name + "не смогу столько проплыть.");
    }


    public void info() {
        System.out.println(this.type + " " + this.name + " Бежать: " + this.maxRun + " m., Плыть: " + this.maxSwim + " м.");
    }
}

  class Cat extends Animals {
    public Cat(String name) {
        super(name);
                this.maxRun = random.nextInt(250) ;
        this.type = "Кот";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Коты не могут плавать!");
    }
}

  class Dog extends Animals {
    public Dog(String name) {
        super(name);
        this.type = "Пёс";
        this.maxRun = random.nextInt(550) ;
        this.maxSwim = random.nextInt(10) ;

    }
}
