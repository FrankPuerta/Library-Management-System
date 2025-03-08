public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, int itemID, int borrowedDays, int issueNumber) {
        super(title, itemID, borrowedDays);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Issue Number: " + issueNumber);
    }

    @Override
    public double calculateLateFee(int lateDays) {
        return 0.75 * lateDays;
    }
}