public class Task1SaleTax {
    public static void main(String[] args) {


        double purchasePrice = 48.99;  // simulating user input
        double salesTax;
        double totalWithTax;

        final double TAX_RATE = 0.05;

        salesTax     = purchasePrice * TAX_RATE;
        totalWithTax = purchasePrice + salesTax;

        System.out.println("=== Sales Tax Calculator ===");
        System.out.println("Purchase price:  $" + purchasePrice);
        System.out.println("Sales tax (5%):  $" + salesTax);
        System.out.println("Total with tax:  $" + totalWithTax);
    }
}