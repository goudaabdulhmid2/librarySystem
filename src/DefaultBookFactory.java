public class DefaultBookFactory implements BookFactory {
    @Override
    public Book createBook(String title) {
        return new Book(title);
    }
}
