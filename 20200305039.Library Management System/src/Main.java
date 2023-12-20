import java.util.*;

public class Main {

    interface SingleLineFunctionInterface {
        void print();
    }
    public static void main(String[] args) {

        SingleLineFunctionInterface Print1 = () -> System.out.println("1. Display Library Items");
        SingleLineFunctionInterface Print2 = () ->  System.out.println("2. Borrow Item");
        SingleLineFunctionInterface Print3 = () -> System.out.println("3. Return Item");
        SingleLineFunctionInterface Print4 = () -> System.out.println("4. List Borrowed Items");
        SingleLineFunctionInterface Print5 = () -> System.out.println("0. Exit");
        SingleLineFunctionInterface Print6 = () -> System.out.print("Enter your choice: ");
        Library library = new Library();

        Book book = new Book("Java Programming", "John Doe");
        DVD dvd = new DVD("Introduction to Java", "Jane Smith");

        library.addItem(book);
        library.addItem(dvd);

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {


            Print1.print();
            Print2.print();
            Print3.print();
            Print4.print();
            Print5.print();
            Print6.print();



            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayItems();
                    break;
                case 2:
                    System.out.print("Enter the index of the item to borrow: ");
                    int borrowIndex = scanner.nextInt();
                    library.borrowItem(borrowIndex);
                    break;
                case 3:
                    System.out.print("Enter the index of the item to return: ");
                    int returnIndex = scanner.nextInt();
                    library.returnItem(returnIndex);
                    break;
                case 4:
                    library.listBorrowedItems();
                    break;
                case 0:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
