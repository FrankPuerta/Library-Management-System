public class Book extends LibraryItem {
    private String author;

    public Book(String title, int itemID, int borrowedDays, String author) {
        super(title, itemID, borrowedDays);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Author: " + author);
    }

    @Override
    public double calculateLateFee(int lateDays) {
        return 0.50 * lateDays;
    }
}