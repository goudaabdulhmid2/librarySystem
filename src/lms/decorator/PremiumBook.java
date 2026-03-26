package lms.decorator;

import lms.model.BookInterface;

public class PremiumBook extends BookDecorator {
    public PremiumBook(BookInterface book) {
        super(book);
    }

    @Override
    public int getBorrowDays() {
        return super.getBorrowDays() + 10;
    }

}
