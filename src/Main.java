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

        BookInterface premiumEBook = new PremiumBook(new EBook("Java 101"));
        System.out.println("Premium EBook period: " + premiumEBook.getBorrowDays() + " days.");

        Approver librarian = new Librarian();
        Approver manager = new Manager();
        Approver director = new Director();

        librarian.setNext(manager);
        manager.setNext(director);
        librarian.approve(5); // Approved by Librarian
        librarian.approve(10); // Approved by Manager
        librarian.approve(20); // Approved by Director

        BorrowFacade borrowFacade = new BorrowFacade(AlexLibrary, librarian);
        borrowFacade.borrowBook("Harry Potter", user, 5); // Approved by Librarian
        borrowFacade.borrowBook("Lord of the Rings", user, 10); // Approved by Manager
        borrowFacade.borrowBook("Clean Code", user, 20); // Approved by Director

        ExternalBookData externalData = new ExternalBookData("Effective Java", "ebook");
        BookJsonAdapter adapter = new BookJsonAdapter();
        BookInterface adaptedBook = adapter.adapt(externalData);
        AlexLibrary.addBook(adaptedBook);
        borrowFacade.borrowBook("Effective Java", user, 14); // Approved by Manager
        System.out.println("Adapted title: " + adaptedBook.getTitle());
        System.out.println("Adapted borrow days: " + adaptedBook.getBorrowDays());

    }
}
