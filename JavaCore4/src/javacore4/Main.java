package javacore4;

import java.util.*;

public class Main {

        public static void main(String[] args){
            List<String> words = Arrays.asList(
                    "Mercedes", "BMW", "Audi", "Toyota", "Volkswagen",
                    "Opel", "Subaru", "Range Rover", "Toyota", "Volkswagen",
                    "BMW", "Audi", "Toyota", "Subaru", "LADA",
                    "Audi", "Toyota", "LADA", "Subaru", "Toyota"
            );

            Set<String> unique = new HashSet<String>(words);

            System.out.println("Первоначальный массив");
            System.out.println(words.toString());
            System.out.println("Уникальные слова");
            System.out.println(unique.toString());
            System.out.println("Частота встречаемости слов");
            for (String key : unique) {
                System.out.println(key + ": " + Collections.frequency(words, key));
            }

            System.out.println("Создаем справочник");
            Phonebook phonebook = new Phonebook();
            System.out.println("-----------------");

            System.out.println("Наполняем справочник");
            phonebook.add("Иванов", "+79099091234");
            phonebook.add("Иванов", "+79089081234");
            phonebook.add("Петров", "+79079071234");
            phonebook.add("Сидоров", "66-15-25");
            phonebook.add("Иванов", "78-00-58");
            System.out.println("-----------------");

            System.out.println("Получаем номера");
            System.out.println("Иванов");
            System.out.println(phonebook.get("Иванов"));
            System.out.println("Петров");
            System.out.println(phonebook.get("Петров"));
            System.out.println("Сидоров");
            System.out.println(phonebook.get("Сидоров"));
            System.out.println("-----------------");

            System.out.println("Случай отсутствия записи");
            System.out.println("Кузнецов");
            System.out.println(phonebook.get("Кузнецов"));
            System.out.println("-----------------");

            System.out.println("Пробуем записать существующий номер");
            phonebook.add("Иванов", "78-00-58");
            System.out.println("Иванов");
            System.out.println(phonebook.get("Иванов"));
        }

        }


