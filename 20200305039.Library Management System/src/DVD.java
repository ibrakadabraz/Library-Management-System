class DVD extends LibraryItem implements Borrowable {
    boolean isBorrowed;

    public DVD(String title, String director) {
        super(title, director);
        isBorrowed = false;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed) {
            System.out.println("DVD borrowed successfully.");
            isBorrowed = true;
        } else {
            System.out.println("DVD is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            System.out.println("DVD returned successfully.");
            isBorrowed = false;
        } else {
            System.out.println("DVD is not currently borrowed.");
        }
    }
}
