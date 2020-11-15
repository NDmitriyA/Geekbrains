package javacore4;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {
    private HashMap<String, List<String>> book;


    public Phonebook(){
        this.book = new HashMap<>();
    }
    public void add(String firstname, String number) {
        if (book.containsKey(firstname)) {
            List<String> numbers = book.get(firstname);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, firstname));
            } else System.out.println(String.format("Номер %s уже существует для фамилии %s", number, firstname));}
            else{
                book.put(firstname, new ArrayList<>(Arrays.asList(number)));
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, firstname));
            }
        }

        public List<String> get (String firstname){
            if(book.containsKey(firstname)){
                return book.get(firstname);
            } else {
                System.out.println(String.format("В справочнике нет записи для фамилии %s",firstname));
                return new ArrayList<>();
            }
        }
    }

