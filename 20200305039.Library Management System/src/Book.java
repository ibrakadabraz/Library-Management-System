class Book extends LibraryItem implements Borrowable {
    boolean isBorrowed;

    public Book(String title, String author) {
        super(title, author);
        isBorrowed = false;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed) {
            System.out.println("Book borrowed successfully.");
            isBorrowed = true;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed) {
            System.out.println("Book returned successfully.");
            isBorrowed = false;
        } else {
            System.out.println("Book is not currently borrowed.");
        }
    }
}
