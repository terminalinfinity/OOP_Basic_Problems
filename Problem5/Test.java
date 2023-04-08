package Problem5;

public class Test {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayAvailableBooks();

        library.searchByTitle("The Great Gatsby");

        library.searchByAuthor("Harper Lee");

        book1.checkOut();
        library.displayAvailableBooks();

        book2.checkOut();
        book3.checkOut();
        library.displayAvailableBooks();

        library.removeBook(book2);
        library.displayAvailableBooks();
    }
}
