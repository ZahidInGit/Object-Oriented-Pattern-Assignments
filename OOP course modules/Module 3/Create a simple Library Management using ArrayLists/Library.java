import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> collection;

    public Library() {
        this.collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        collection.add(book);
    }

    public void removeBook(Book book) {
        collection.remove(book);
    }

    public void displayBooks() {
        for (Book book : collection) {
            System.out.println(book.toString());
        }
    }
}
