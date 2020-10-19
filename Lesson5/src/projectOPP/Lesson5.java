package projectOPP;
   public class Lesson5{

    public static void main(String[] args) {

                    Person[] perArray = new Person[5];
        perArray [0] = new Person("Иванов Иван", "Рабочий", "ivivan@mailbox.com",   "8909123456", 30000, 39);
        perArray[1] = new Person("Петров Петр", "Контролер","ivivan1@mailbox.com",  "89379382222", 40000, 40);
        perArray[2] = new Person("Сидоров Федот", "Инженер","ivivan2@mailbox.com",  "89877899876", 50000, 52);
        perArray[3] = new Person("Федоров Степан", "Зам.директора","ivivan3@mailbox.com",  "89633699874", 60000, 63);
        perArray [4] = new Person("Степанов Лукьян", "Директор","ivivan4@mailbox.com", "89511596541", 70000, 41);

        for (int i=0;i< perArray.length;i++){
            if (perArray[i].age > 40)perArray [i].Show();
        }



                }
            }
 class Person{
         public String fio;
         public String post;
         public String email;
         public String tel;
         public double salary;
         public int age;

public Person(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
        }
        public void Show(){
            System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
                }
     }


