public class Main {
    public static void main(String[] args) {
        Library cityLibrary = new Library();

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Dune", "Frank Herbert");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);
        cityLibrary.addBook(book3);

        cityLibrary.displayBooks();

        System.out.println("---");

        cityLibrary.removeBook(book2);
        cityLibrary.displayBooks();
    }
}
