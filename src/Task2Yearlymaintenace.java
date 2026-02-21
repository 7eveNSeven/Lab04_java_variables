public class Task2Yearlymaintenace {
    public static void main(String[] args) {

        double springCost = 320.00;
        double summerCost = 185.50;
        double fallCost   = 275.00;
        double winterCost = 440.75;

        double totalYearlyCost;

        totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("=== Yearly Home Maintenance Cost ===");
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost:   $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("-------------------------------------");
        System.out.println("Total yearly cost:       $" + totalYearlyCost);
    }
}
