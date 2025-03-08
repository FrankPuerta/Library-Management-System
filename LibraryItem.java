public abstract class LibraryItem {
    protected String title;
    protected int itemID;
    protected int borrowedDays;

    public LibraryItem(String title, int itemID, int borrowedDays) {
        this.title = title;
        this.itemID = itemID;
        this.borrowedDays = borrowedDays;
    }

    public abstract void displayDetails();
    public abstract double calculateLateFee(int lateDays);
}