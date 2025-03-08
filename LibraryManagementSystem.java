import java.util.ArrayList;

public class LibraryManagementSystem {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(Book book) {
        items.add(book);
    }

    public void addItem(Journal journal) {
        items.add(journal);
    }

    public void addItem(DVD dvd) {
        items.add(dvd);
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println("Late Fee: $" + item.calculateLateFee(5)); // Assuming 5 days late
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem system = new LibraryManagementSystem();

        Book book = new Book("Java Programming", 101, 5, "James Gosling");
        Journal journal = new Journal("Science Journal", 102, 5, 12);
        DVD dvd = new DVD("Inception", 103, 5, 148);

        system.addItem(book);
        system.addItem(journal);
        system.addItem(dvd);

        system.displayAllItems();
    }
}