import java.util.Scanner;

public class Tasklar5 {

    public static class Person {

        String name;
        int age;

        static String insan = "insan";

        void inputData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ad daxil edin: ");
            name = sc.nextLine();
            System.out.print("Yaş daxil edin: ");
            age = sc.nextInt();
        }
        void displayData() {
            System.out.println("Ad: " + name);
            System.out.println("Yaş: " + age);
        }
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person other = (Person) obj;
            return age == other.age && name.equals(other.name);
        }

        public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person();

            System.out.println("1-ci şəxsin məlumatları:");
            p1.inputData();

            System.out.println("\n2-ci şəxsin məlumatları:");
            p2.inputData();

            System.out.println("\n1-ci şəxsin məlumatları:");
            p1.displayData();

            System.out.println("\n2-ci şəxsin məlumatları:");
            p2.displayData();
            if (p1.equals(p2)) {
                System.out.println("\nHər iki şəxs eynidir.");
            } else {
                System.out.println("\nHər iki şəxs fərqlidir.");
            }
        }
    }

}
