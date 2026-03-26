package lms.facade;

import lms.approval.Approver;
import lms.model.User;
import lms.service.LibraryService;

public class BorrowFacade {
    private LibraryService libraryService;
    private Approver approver;

    public BorrowFacade(LibraryService libraryService, Approver approver) {
        this.libraryService = libraryService;
        this.approver = approver;
    }

    public void borrowBook(String title, User user, int days) {
        approver.approve(days);
        libraryService.borrowBook(title, user);
    }

}
