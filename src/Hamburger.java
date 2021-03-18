/*   Created By: IntelliJ Idea
 *    Author: Naman Agarwal (naman2807)
 *    Date: 19-07-2020
 *    Time: 07:39 AM
 */


import java.util.Scanner;

public class Hamburger {
    private final String name;
    private final String meat;
    private final String breadRollType;
    private double price;
    private final int c;
    StringBuilder stringBuilder = new StringBuilder();

    private String addition1;
    private double additionCost1;

    public Hamburger(String name, String meat, String breadRollType, double price, int c) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println("Welcome to the Naman's Burger Shop. " + "\n" + "You had selected the " + this.name + " burger with meat: " +
                this.meat + " and with base price: " + this.price);
        this.c = c;
    }



    private void Addition1(String item, double cost) {
        this.addition1 = item;
        this.additionCost1 = cost;
        this.price += cost;
    }

    private void message1() {
        System.out.println("Addition of " + this.addition1 + " of price " + this.additionCost1);
        stringBuilder.append("Addition of " + this.addition1 + " of price " + this.additionCost1+"\n");
    }

    public void bill() {
        System.out.println("*".repeat(100));
        System.out.println(stringBuilder);
        System.out.println("Grand Total is: " + this.price);

    }

    public void itemizeBurger() {

        System.out.println("Want to add more items ?(yes/no)....");
        Scanner ob = new Scanner(System.in);
        String ans = ob.nextLine();
        if (ans.toLowerCase().equals("yes")) {
            for (int i = 0; i < c; i++) {

                System.out.println("Please enter the item you want to add: ");
                String item = ob.nextLine();
                System.out.println("Please enter the price of item: ");
                double rs = ob.nextDouble();
                ob.nextLine();
                Addition1(item, rs);
                message1();
                if (i == c-1) {
                    break;
                } else {
                    System.out.println("Want to add more?(yes/no)");
                    String enter = ob.nextLine();
                    if (enter.toLowerCase().equals("no")) {
                        break;
                    }
            }



            }
            bill();
        }else{
            bill();
    }
}
}





















