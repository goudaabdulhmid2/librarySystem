package lms.model;

public interface BookInterface {
     String getTitle();

     boolean isAvailable();

     void borrowBook(User user);

     void returnBook();

     int getBorrowDays();
}
