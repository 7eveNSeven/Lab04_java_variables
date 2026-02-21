public class Task3Monthlyccbalance {
    public static void main(String[] args) {
        double balance = 5000.00;
        double monthlyInterest;
        double newBalance;

        final double ANNUAL_RATE   = 0.17;
        final double MONTHLY_RATE  = ANNUAL_RATE / 12;

        // Month 1
        monthlyInterest = balance * MONTHLY_RATE;
        newBalance      = balance + monthlyInterest;

        System.out.println("=== Monthly Credit Card Balance ===");
        System.out.println("Starting balance:          $" + balance);
        System.out.printf( "Monthly interest rate:      %.4f%%%n", MONTHLY_RATE * 100);
        System.out.println("--- Month 1 ---");
        System.out.printf( "Interest due month 1:      $%.2f%n", monthlyInterest);
        System.out.printf( "Balance after month 1:     $%.2f%n", newBalance);

        // Month 2 (compounded - interest applies to new balance)
        balance         = newBalance;
        monthlyInterest = balance * MONTHLY_RATE;
        newBalance      = balance + monthlyInterest;

        System.out.println("--- Month 2 ---");
        System.out.printf("Interest due month 2:      $%.2f%n", monthlyInterest);
        System.out.printf("Balance after month 2:     $%.2f%n", newBalance);
    }
}