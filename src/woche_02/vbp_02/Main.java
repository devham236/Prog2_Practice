package woche_02.vbp_02;

public class Main {
    public static void main(String[] args) {
        Book book_1 = new Book("Harry Potter", 1997);
        Book book_2 = new Book("Percy Jackson", 2000);
        Book book_3 = new Book("Song of Ice and Fire", 1899);
        Library lib = new Library();

        lib.addBook(book_1);
        lib.addBook(book_2);
        lib.addBook(book_3);

        for (int i = 0; i < lib.books.length; i++) {
            System.out.println(lib.books[i]);
        }

        lib.removeBook();

        System.out.println("---------------------------");

        for (int i = 0; i < lib.books.length; i++) {
            System.out.println(lib.books[i]);
        }
    }
}
