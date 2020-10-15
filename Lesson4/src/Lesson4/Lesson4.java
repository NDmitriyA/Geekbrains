package Lesson4;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char PLAYER_DOT = 'X';
    public static final char BOT_DOT = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {

            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(PLAYER_DOT)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(BOT_DOT)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }
        public static boolean checkWin(char symb) {
            for (int col=0; col<SIZE-DOTS_TO_WIN+1; col++) {
                for (int row=0; row<SIZE-DOTS_TO_WIN+1; row++) {
                    if (checkDiagonal(symb) || checkLanes(symb)) return true;
                }
            }
            return false;
    }
       static boolean checkDiagonal(char symb) {
                boolean toright, toleft;
                toright = true;
                toleft = true;
                for (int i=0; i<DOTS_TO_WIN; i++) {
                    toright &= (map[i][i] == symb);
                    toleft &= (map[DOTS_TO_WIN-i-1][i] == symb);
                }
                if (toright || toleft) return true;
                return false;
            }
       static boolean checkLanes(char symb) {
               boolean cols, rows;
               for (int col=0; col<DOTS_TO_WIN; col++) {
               cols = true;
               rows = true;
                for (int row=0; row<DOTS_TO_WIN; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }
            if (cols || rows) return true;
        }
        return false;
    }
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = BOT_DOT;
        }
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y));
            map[y][x] = PLAYER_DOT;
        }
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }
        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + "  ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                System.out.print("|");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + "|");
                }
                System.out.println();
            }
            System.out.println();

    }
}
