/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalessons1;

import javax.swing.JOptionPane;

/**
 *
 * @author nikif
 */
public class JavaLessons1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null, "Hello World");
        System.out.println("Задание№2");
        byte h = 47;
        short s = 2000;
        int i = 29999999;
        long n = -939393939;
        float f = 5.7f;
        double d1 = 35.39;
        boolean bool = true; //false
        char c1 = 'D';

        String str = "My string";
        String result = "";
        result += "Byte h = " + h + "\n";
        result += "Short s = " + s + "\n";
        result += "Int i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "Float f = " + f + "\n";
        result += "Double d = " + d1 + "\n";
        result += "Boolean bool = " + bool + "\n";
        result += "Char c = " + c1 + "\n";
        result += "String str = " + str + "\n";
        System.out.println(result);
        System.out.println("Задание№3");
        float a = 3.0f;
        float b = 4.0f;
        float c = 5.0f;
        float d = 2.5f;
        System.out.println("Результат вычисления выражения: a * (b + (c / d)) = " + calculate(a, b, c, d) + ".\n");
        System.out.println("Задание№4");
        int x = 11;
        int y = 8;
        System.out.println("Истина="+ between( x, y)+".\n");
        System.out.println("Задание№5");
        int num = -32768;
        System.out.println("Значение переменной =  " + num);
        System.out.println( plusOrMinus(num) ? "положительное" : "отрицательное");
        System.out.println("Задание№6");
        int chislo = -3452;
        System.out.println("Значение переменной = " + chislo);
        System.out.println(yesMinus(chislo) ? "true":"false");
        System.out.println("Задание№7");
        String name = "Дмитрий";
        System.out.println(Hello(name) + "!\n");
            }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
    public static boolean between(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }
    public static boolean plusOrMinus(int num) {
        return num >= 0;
    }
    public static boolean yesMinus(int chislo){
        return chislo < 0;
    }
    public static String Hello(String name) {
        return "Привет, " + name;
    }
}  // TODO code application logic here
    
    

