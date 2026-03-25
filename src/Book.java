public class Book implements BookInterface {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + " borrowed " + title + ".");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    public int getBorrowDays() {
        return 7; // Default borrow period
    }

}
