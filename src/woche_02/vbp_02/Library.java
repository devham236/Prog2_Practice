package woche_02.vbp_02;

public class Library {
    public Book[] books = new Book[10];

    public void addBook(Book b){
        for (int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = b;
                break;
            }
        }
    }

    public Book removeBook() {
        Book b = null;

        for (int i = this.books.length - 1; i >= 0; i--) {
            if(this.books[i] != null){
                b = this.books[i];
                this.books[i] = null;
                break;
            }
        }

        return b;
    }
}
