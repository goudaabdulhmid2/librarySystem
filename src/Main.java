public class Main {
    public static void main(String[] args) {
        LibraryService AlexLibrary = LibraryService.getInstance();// Singleton
        BookFactory factory = new DefaultBookFactory(); // Factory Pattern

        AlexLibrary.addBook(factory.createBook("Harry Potter"));
        AlexLibrary.addBook(factory.createBook("Lord of the Rings"));

        BookInterface book = new Book("Clean Code");
        BookInterface premiumBook = new PremiumBook(book);
        AlexLibrary.addBook(premiumBook);

        User user = new User("John", true);

        AlexLibrary.borrowBook("Clean Code", user);
        System.out.println("Borrow period: " + premiumBook.getBorrowDays() + " days.");

    }
}
