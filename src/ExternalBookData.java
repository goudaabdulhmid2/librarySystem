public class ExternalBookData {
    private String bookTitle;
    private String type;

    ExternalBookData(String bookTitle, String type) {
        this.bookTitle = bookTitle;
        this.type = type;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
