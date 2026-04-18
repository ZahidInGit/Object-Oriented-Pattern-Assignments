public class Main {
    public static void main(String[] args) {
        Library cityLibrary = new Library();

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Dune", "Frank Herbert");

        cityLibrary.addBook("978-0547928227", book1);
        cityLibrary.addBook("978-0451524935", book2);
        cityLibrary.addBook("978-0441172719", book3);

        cityLibrary.displayBooks();

        System.out.println("\n--- Fetching a specific book ---");
        Book foundBook = cityLibrary.getBook("978-0451524935");
        System.out.println("Found: " + foundBook.toString());

        System.out.println("\n--- After removing a book ---");
        cityLibrary.removeBook("978-0441172719");
        cityLibrary.displayBooks();
    }
}

