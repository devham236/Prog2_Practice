package woche_08.innereKlassen.innerClass;

import java.util.ArrayList;
import java.util.List;

public class Library {
    //TODO
    public List<Book> list = new ArrayList<>();

    public class Book{
        String title;
        String author;

        public Book(String t, String a){
            this.title = t;
            this.author = a;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Book book = (Book) o;

            if (title != null ? !title.equals(book.title) : book.title != null) return false;
            return author != null ? author.equals(book.author) : book.author == null;
        }

        @Override
        public int hashCode() {
            int result = title != null ? title.hashCode() : 0;
            result = 31 * result + (author != null ? author.hashCode() : 0);
            return result;
        }
    }

    void addBook(String t, String a){
        Book newBook = new Book(t, a);

        if(!list.contains(newBook)){
            list.add(newBook);
        }
    }

    void displayBooks(){
        for (Book b : list) {
            System.out.printf("(%s, %s) \n", b.author, b.title);
        }
    }


    public static void main(String[] args) {
        Library library = new Library();

        for (int i = 0; i < args.length; i+=2) {
            String title = args[i];
            String author = args[i + 1];
            library.addBook(title, author);
        }
        library.displayBooks();
    }
}
