public class Book {
    String title;
    String author;
    double price;

    public Book(String title,String name,double price) {

        this.author = author;
        this.price = price;
        this.title = title;
    }

    public Book() {
    }

    public void printDetails(){
        System.out.println("Book name:" + " " + title + " " + "Author:" + " " + author + " "
                           + "Price:" + price);
    }
}
