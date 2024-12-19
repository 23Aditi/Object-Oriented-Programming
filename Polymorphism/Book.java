public class Book extends Publication {
    private String author;

    public Book(String title, double price, int copies, String author) {
        super(title, price, copies);
        this.author = author;
    }

    // Method to order additional copies of the book
    public void orderCopies(int additionalCopies) {
        copies += additionalCopies;
        System.out.println("Ordered " + additionalCopies + " more copies of the book: " + title);
    }

    // Overriding the saleCopy method to include book details
    @Override
    public void saleCopy() {
        super.saleCopy();
        System.out.println("This book is authored by: " + author);
    }
}
