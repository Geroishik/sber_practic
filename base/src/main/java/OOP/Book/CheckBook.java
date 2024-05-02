package OOP.Book;

public class CheckBook {
    public static void main(String[] args) {
        Author author = new Author("Chris", "male", "superChrisStar@gmail.com");
        Book book = new Book("My Biography", author, 2020);
        System.out.println(book);
    }



}
