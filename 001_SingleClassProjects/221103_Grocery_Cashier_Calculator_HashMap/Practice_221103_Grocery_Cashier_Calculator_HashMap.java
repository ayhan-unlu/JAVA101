import java.util.HashMap;
import java.util.Scanner;

public class Practice_221103_Grocery_Cashier_Calculator_HashMap {
    public static void main(String[] args) {
        // defining variables, specificially vegetables and fruits
        String pear="pear",  apple="apple", tomatoe="tomatoe", banana="banana", eggplant="eggplant";

        double purchaseAmount, totalPrice;

        //HashMap is used to practice hashmap
        HashMap<String,Double> priceList = new HashMap<>();//prices per kg.

        priceList.put(pear, 2.14);
        priceList.put(eggplant, 5.00);
        priceList.put(banana, 0.95);
        priceList.put(tomatoe, 1.11);
        priceList.put(apple, 3.67);

        HashMap<String,Double> purchasedAmountList = new HashMap<>();//the amount of the purchases

        HashMap<String,Double> purchasePriceList = new HashMap<>(); // the price payed for the purchases one by one

        try (Scanner input = new Scanner(System.in)) {
            System.out.println();
            System.out.print("Please Enter the Amount You Bought in Kilograms \t\n");


            System.out.print("Pear\t:");

            purchaseAmount = input.nextDouble();
            purchasedAmountList.put(pear, purchaseAmount);
            purchasePriceList.put(pear, purchaseAmount*priceList.get(pear));

            System.out.print("Apple\t:");

            purchaseAmount = input.nextDouble();
            purchasedAmountList.put(apple, purchaseAmount);
            purchasePriceList.put(apple, purchaseAmount*priceList.get(apple));

            System.out.print("Tomatoe\t:");

            purchaseAmount = input.nextDouble();
            purchasedAmountList.put(tomatoe, purchaseAmount);
            purchasePriceList.put(tomatoe, purchaseAmount*priceList.get(tomatoe));

            System.out.print("Banana\t:");

            purchaseAmount = input.nextDouble();
            purchasedAmountList.put(banana, purchaseAmount);
            purchasePriceList.put(banana, purchaseAmount*priceList.get(banana));

            System.out.print("Eggplant:");

            purchaseAmount = input.nextDouble();
            purchasedAmountList.put(eggplant, purchaseAmount);
            purchasePriceList.put(eggplant, purchaseAmount*priceList.get(eggplant));

            totalPrice=purchasePriceList.get(pear)+purchasePriceList.get(apple)+purchasePriceList.get(tomatoe)+purchasePriceList.get(banana)+purchasePriceList.get(eggplant);

            System.out.println();
            System.out.println("Individual Price List(kg/TL): \n"+priceList);

            System.out.println("Total Price of the purchase: "+Math.round(100*totalPrice)/100.0);
            System.out.println();

        }

    }

}