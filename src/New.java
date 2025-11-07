import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Student[] studentArray=new Student[2];
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Ad daxil et:");
        student.name = scanner.next();

        System.out.println("Soyad daxil et:");
        student.surname = scanner.next();

        System.out.println("Yaş daxil et:");
        student.age = scanner.nextInt();

        Student student2 = new Student();
        System.out.println("Ad daxil et:");
        student2.name = scanner.next();

        System.out.println("Soyad daxil et:");
        student2.surname = scanner.next();

        System.out.println("Yaş daxil et:");
        student2.age = scanner.nextInt();

        //student.print();
        //student2.print();

        System.out.println(student.equals(student2));
        studentArray[0]=student;
        studentArray[1]=student2;
        for (Student st:studentArray){
            st.print();
        }
    }


}

