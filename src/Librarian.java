public class Librarian extends Approver {
    @Override
    public void approve(int days) {
        if (days <= 7) {
            System.out.println("Librarian approved the borrowing for " + days + " days.");
        } else if (next != null) {
            next.approve(days);
        } else {
            System.out.println("Borrowing request denied. Too many days requested.");
        }
    }

}
