package lms.approval;

public class Director extends Approver {
    @Override
    public void approve(int days) {
        System.out.println("Director approved the borrowing for " + days + " days.");
    }

}
