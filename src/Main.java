public class Main {
    public static void main(String[] args) {
        LibraryService AlexLibrary = LibraryService.getInstance();// Singleton
        BookFactory factory = new DefaultBookFactory(); // Factory Pattern

        AlexLibrary.addBook(factory.createBook("Harry Potter"));
        AlexLibrary.addBook(factory.createBook("Lord of the Rings"));

        User user = new User("John", true);

    }
}
