import java.util.Scanner;

public class Bookdetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Book title:");
        book.title = scanner.nextLine();

        System.out.println("Author:");
        book.author = scanner.nextLine();

        System.out.println("Price:");
        book.price = scanner.nextDouble();

        book.printDetails();

        };
    }
