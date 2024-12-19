public class Magazine extends Publication {
    private int orderQty;
    private String currentIssue;

    public Magazine(String title, double price, int copies, int orderQty, String currentIssue) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    // Method to order additional copies of the magazine
    public void receiveIssue(int quantity) {
        copies += quantity;
        System.out.println("Received " + quantity + " copies of the magazine: " + title);
    }

    // Overriding the saleCopy method to include magazine details
    @Override
    public void saleCopy() {
        super.saleCopy();
        System.out.println("This magazine's current issue is: " + currentIssue);
    }
}
