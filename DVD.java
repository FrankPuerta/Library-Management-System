public class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, int itemID, int borrowedDays, int duration) {
        super(title, itemID, borrowedDays);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemID);
        System.out.println("Duration: " + duration + " minutes");
    }

    @Override
    public double calculateLateFee(int lateDays) {
        return 1.00 * lateDays;
    }
}