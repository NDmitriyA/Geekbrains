package lesson3;

import java.util.Random;
import java.util.Scanner;

public class javaLesson3 {
    public static void main (String[] args) {
        guessNumber();

    private static void guessNumber() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int numMach = random.nextInt(10);
            System.out.println("Угадай число от 0 до 9 с 3-х попыток");
            for (int i = 3;i > 0;i--) {
                System.out.println("Введите число: ");
                int numHum = scanner.nextInt();
                if (numHum == numMach){
                    System.out.println("МОЛОДЕЦ ! Вы угадали число!");
                    break;
                }
                System.out.println(numHum > numMach ? "Ваше число больше" : "Ваше число меньше");
                System.out.println((i-1) > 0 ? "У Вас осталось " + (i-1) + "попыток":"Попытки закончились, Вы проиграли.");
                            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }
}
