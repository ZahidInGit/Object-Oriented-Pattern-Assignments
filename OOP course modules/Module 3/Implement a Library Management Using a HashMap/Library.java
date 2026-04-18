class Library {
    private Map<String, Book> collection = new HashMap<>();

    public void addBook(String isbn, Book book) {
        collection.put(isbn, book);
    }

    public void removeBook(String isbn) {
        collection.remove(isbn);
    }

    public Book getBook(String isbn) {
        return collection.get(isbn);
    }

    public void displayBooks() {
        for (Map.Entry<String, Book> entry : collection.entrySet()) {
            System.out.println("ISBN: " + entry.getKey() + " - " + entry.getValue().toString());
        }
    }
}
