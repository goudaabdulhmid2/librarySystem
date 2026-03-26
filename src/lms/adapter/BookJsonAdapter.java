package lms.adapter;

import lms.model.Book;
import lms.model.BookInterface;
import lms.model.EBook;

public class BookJsonAdapter {
    public BookInterface adapt(ExternalBookData data) {
        if ("ebook".equalsIgnoreCase(data.getType())) {
            return new EBook(data.getBookTitle());
        }
        return new Book(data.getBookTitle());
    }

}
