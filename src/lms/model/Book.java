package lms.model;

import java.util.ArrayList;
import java.util.List;

import lms.observer.Observer;
import lms.observer.Subject;

public class Book implements BookInterface, Subject {
    private String title;
    private boolean isAvailable;
    private List<Observer> observers = new ArrayList<>();

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }

    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(user.getName() + " borrowed " + title + ".");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
        notifyObservers(title + " is now available.");
    }

    public int getBorrowDays() {
        return 7; // Default borrow period
    }

}
