public class BookJsonAdapter {
    public BookInterface adapt(ExternalBookData data) {
        if ("ebook".equalsIgnoreCase(data.getType())) {
            return new EBook(data.getBookTitle());
        }
        return new Book(data.getBookTitle());
    }

}
