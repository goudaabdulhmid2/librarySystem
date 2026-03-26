package lms.approval;

public class Manager extends Approver {
    @Override
    public void approve(int days) {
        if (days <= 14) {
            System.out.println("Manager approved the borrowing for " + days + " days.");
        } else if (next != null) {
            next.approve(days);
        } else {
            System.out.println("Borrowing request denied. Too many days requested.");
        }
    }
}
