public class PremiumBook extends BookDecorator {
    public PremiumBook(BookInterface book) {
        super(book);
    }

    @Override
    public int getBorrowDays() {
        return super.getBorrowDays() + 10;
    }

}
