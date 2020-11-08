package Javacore1;

import java.util.Random;




public class Main {
     static class Treadmill implements IObstacle {
        public int l;

        public Treadmill(int l) {
            this.l = l;
        }

        public boolean Start(IMember member) {
            member.Run();
            if (member.getWidth() >= l) {
                System.out.println(" дорожка побеждена!");
                return true;
            } else {
                System.out.println(" неудачная попытка ");
                return false;
            }
        }
    }

         static class Wall implements IObstacle {
            public int h;

            public Wall(int h) {
                this.h = h;
            }


            public boolean Start(IMember member) {
                member.Jump();
                if (member.getHeigh() >= h) {
                    System.out.println(" высота взята!");
                    return true;
                } else {
                    System.out.println(" неудачная попытка ");
                    return false;
                }
            }
        }


     static class Human implements IMember {
        public String name;
        int maxRun;
        double maxJamp;
        public Random random = new Random();

        public Human(String name) {
            this.name = name;
            this.maxRun = random.nextInt(500);
            this.maxJamp = Math.random() * 2;
        }

        public void info() {
            System.out.println(this.name + " Бежать: " + this.maxRun + " m." + " Прыгать:" + this.maxJamp + "м.");
        }

        @Override
        public int getWidth() {
            return maxRun;
        }

        @Override
        public double getHeigh() {
            return maxJamp;
        }

        public void Run() {

            System.out.println(this.name + " может пробежать ");
        }

        public void Jump() {

            System.out.println(this.name + " может прыгнуть ");

        }
    }

     static class Cat implements IMember {
        public String name;
        protected int maxRun;
        protected double maxJamp;
        public Random random = new Random();

        public Cat(String name) {
            this.name = name;
            this.maxRun = random.nextInt(250);
            this.maxJamp = Math.random() * 2;
        }

        public  void info() {
            System.out.println(this.name + " Бежать: " + this.maxRun + " m." + " Прыгать:" + this.maxJamp + "м.");
        }
        @Override
        public int getWidth() {
            return maxRun;
        }

        @Override
        public double getHeigh() {
            return maxJamp;
        }


        @Override
        public void Run() {
            System.out.println(this.name + " может пробежать ");
        }

        @Override
        public void Jump() {
            System.out.println(this.name + " может прыгнуть ");
        }
    }

     static class Robot implements IMember {
        protected String name;
        protected int maxRun;
        protected double maxJamp;
        public Random random = new Random();


        public Robot(String name) {
            this.name = name;
            this.maxRun = random.nextInt(700);
            this.maxJamp = Math.random() * 5;
        }




         @Override
        public int getWidth() {
            return maxRun;
        }

        @Override
        public double getHeigh() {
            return maxJamp;
        }

        @Override
        public void Run() {
            System.out.println(this.name + " может пробежать ");
        }

        @Override
        public void Jump() {
            System.out.println(this.name + " может прыгнуть ");
        }
    }




    public static void main(String[] args) {

IMember[] members = new IMember[]{
        new Human("Добрыня"),
        new Cat("Василий"),
        new Robot("Вертер")};
      //  Human.info();
      //  Cat.info();
       // Robot.info();
        IObstacle[] obstacles =new IObstacle[]{
                new Treadmill(100),
                new Treadmill(150),
                new Wall(1),
                new Wall(2)};

        for( int i = 0; i <= members.length -1; i++){
            for (int j = 0; j <= obstacles.length - 1;j++){
                if (obstacles[j].Start(members[i]) != true){
                    System.out.println("Участник выбывает");
                    break;
                }
            }
        }
    }

}

