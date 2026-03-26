public class EBook extends Book {

    public EBook(String title) {
        super(title);
    }

    @Override
    public void borrowBook(User user) {
        System.out.println(user.getName() + " borrowed the e-book: " + super.getTitle());

    }

    @Override
    public int getBorrowDays() {
        return 14; // E-books can be borrowed for 14 days
    }

}
