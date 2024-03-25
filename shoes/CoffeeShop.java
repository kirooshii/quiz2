package quizes.q2.makar_lavrov_1.shoes;

public class CoffeeShop {

    public static void main(String[] args) {
        int pricePerCoffee = 250; // tetri
        int numCoffeeSold = 100;
        int totalCostOfBeans = 15000; // tetri
        int taxExpenses = 4100;
        int waterExpenses = 61;
        int gasExpenses = 294;
        int electricityExpenses = 12700;
        int parkingExpenses = 3400;
        int otherExpenses = taxExpenses + waterExpenses + gasExpenses + electricityExpenses + parkingExpenses;
        int totalExpenses = totalCostOfBeans + otherExpenses;

        double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
        System.out.println(profit);
    }

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        int profitInTetri = pricePerCoffee*numCoffeeSold - (totalCostOfBeans+otherExpenses);
        double profitInLaris = profitInTetri;
        profitInLaris /= 100;
        return profitInLaris;
    }
}
