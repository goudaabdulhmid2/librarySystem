public abstract class BookDecorator implements BookInterface {
    protected BookInterface book;

    public BookDecorator(BookInterface book) {
        this.book = book;
    }

    public void borrowBook(User user) {
        book.borrowBook(user);
    }

    public void returnBook() {
        book.returnBook();
    }

    public int getBorrowDays() {
        return book.getBorrowDays();
    }

    public String getTitle() {
        return book.getTitle();
    }

    public boolean isAvailable() {
        return book.isAvailable();
    }

}
