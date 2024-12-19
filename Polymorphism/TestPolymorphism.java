public class TestPolymorphism {
    public static void main(String[] args) {
        // Creating objects for Book and Magazine
        Book book1 = new Book("Java Programming", 500, 100, "John Doe");
        Magazine magazine1 = new Magazine("Tech Monthly", 200, 50, 30, "December 2024");

        // Demonstrating polymorphism with saleCopy method
        book1.saleCopy();
        magazine1.saleCopy();

        // Ordering additional copies of Book and Magazine
        book1.orderCopies(50);
        magazine1.receiveIssue(20);

        // Displaying the updated sale copy information
        System.out.println("\nAfter ordering additional copies:");
        book1.saleCopy();
        magazine1.saleCopy();
    }
}
