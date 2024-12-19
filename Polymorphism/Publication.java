public class Publication {
    protected String title;
    protected double price;
    protected int copies;

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    // Common method to calculate the sale
    public void saleCopy() {
        System.out.println("Total sale of " + title + " is: " + (price * copies));
    }
}
