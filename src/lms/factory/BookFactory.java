package lms.factory;

import lms.model.Book;

public interface BookFactory {

    Book createBook(String title);
}
