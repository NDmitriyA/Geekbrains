import java.util.Random;
import java.util.Scanner;

public class javaLesson3 {

    public static void main(String[] args) {
        gramMatik ();
        guessNumber();

    }
    private static void gramMatik () {
        String s = "Предложение     один   Теперь предложение       два   Предложение    три";
        String s1 = s.replaceAll(" +", " ");
        StringBuilder s2 = new StringBuilder(s1);
                for (int i = 1; i < s2.length(); i++) {
            if (s2.charAt(i) >= 'А' && s2.charAt(i) <= 'Я') {
                s2.setCharAt(i - 1, '.');
            }
                }
                    StringBuffer strBuffer = new StringBuffer(s2);
                    strBuffer.append('.');
                    System.out.println(strBuffer.toString());
            }
        private static void guessNumber () {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            do {
                int numMach = random.nextInt(10);
                System.out.println("Угадай число от 0 до 9 с 3-х попыток");
                for (int i = 3; i > 0; i--) {
                    System.out.println("Введите число: ");
                    int numHum = scanner.nextInt();
                    if (numHum == numMach) {
                        System.out.println("МОЛОДЕЦ ! Вы угадали число!");
                        break;
                    }
                    System.out.println(numHum > numMach ? "Ваше число больше" : "Ваше число меньше");
                    System.out.println((i - 1) > 0 ? "У Вас осталось " + (i - 1) + "попыток" : "Попытки закончились, Вы проиграли.");
                }
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            }
            while (scanner.nextInt() == 1);
        }
}
