public class Person {
    String FullName;
    String Age;

    Person(String fe, String a) {
        FullName =fe ;
        Age = a;

    }
    Person(){

    }

   public void talk(String FullName) {
        System.out.println("Этого человека зовут " + FullName);
    }

    public void move(String Age) {
        System.out.println( "Этому человеку " + Age + " лет");
    }
        public static void main(String[] args) {
            Person p=new Person();

            p.FullName="Иван Иванов";
            p.Age= "20";

            System.out.println(p.FullName);
            System.out.println();
            System.out.println(p.Age);


            p.talk(p.FullName);
            p.move(p.Age);
        }
    }


