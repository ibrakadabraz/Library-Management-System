import java.util.ArrayList;
import java.util.List;

class Library {
    private List<LibraryItem> libraryItems;

    public Library() {
        this.libraryItems = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void displayItems() {
        for (LibraryItem item : libraryItems) {
            item.displayInfo();
            System.out.println("--------------");
        }
    }

    public void borrowItem(int index) {
        if (index >= 0 && index < libraryItems.size() && libraryItems.get(index) instanceof Borrowable) {
            Borrowable borrowableItem = (Borrowable) libraryItems.get(index);
            borrowableItem.borrowItem();
        } else {
            System.out.println("Invalid item index or item is not borrowable.");
        }
    }

    public void returnItem(int index) {
        if (index >= 0 && index < libraryItems.size() && libraryItems.get(index) instanceof Borrowable) {
            Borrowable borrowableItem = (Borrowable) libraryItems.get(index);
            borrowableItem.returnItem();
        } else {
            System.out.println("Invalid item index or item is not borrowable.");
        }
    }

    public void listBorrowedItems() {
        System.out.println("Borrowed Items:");
        for (LibraryItem item : libraryItems) {
            if (item instanceof Borrowable) {
                Borrowable borrowableItem = (Borrowable) item;
                if (borrowableItem instanceof Book) {
                    Book borrowedBook = (Book) borrowableItem;
                    if (borrowedBook.isBorrowed) {
                        borrowedBook.displayInfo();
                        System.out.println("--------------");
                    }
                } else if (borrowableItem instanceof DVD) {
                    DVD borrowedDVD = (DVD) borrowableItem;
                    if (borrowedDVD.isBorrowed) {
                        borrowedDVD.displayInfo();
                        System.out.println("--------------");
                    }
                }
            }
        }
    }
}
