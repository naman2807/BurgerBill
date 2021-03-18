/*   Created By: IntelliJ Idea
 *    Author: Naman Agarwal (naman2807)
 *    Date: 18-07-2020
 *    Time: 01:13 PM
 */


import java.util.Scanner;

public class HamBurger1 {
    private final String name;
    private final String meat;
    private final String breadRollType;
    private double price;
    private int c;

    private String addition1;
    private double additionCost1;
    private String addition2;
    private double additionCost2;
    private String addition3;
    private double additionCost3;
    private String addition4;
    private double additionCost4;

    public HamBurger1(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println("Welcome to the Naman's Burger Shop. " + "\n" + "You had selected the " + this.name + " burger with meat: " +
                this.meat + " and with base price: " + this.price);
    }


    private void Addition1(String item, double cost) {
        this.addition1 = item;
        this.additionCost1 = cost;
        this.price += cost;
    }

    private void Addition2(String item, double cost) {
        this.addition2 = item;
        this.additionCost2 = cost;
        this.price += cost;
    }

    private void Addition3(String item, double cost) {
        this.addition3 = item;
        this.additionCost3 = cost;
        this.price += cost;
    }

    private void Addition4(String item, double cost) {
        this.addition4 = item;
        this.additionCost4 = cost;
        this.price += cost;
    }

    private void message1() {
        System.out.println("Addition of " + this.addition1 + " of price " + this.additionCost1);
    }

    private void message2() {
        System.out.println("Addition of " + this.addition2 + " of price " + this.additionCost2);
    }

    private void message3() {
        System.out.println("Addition of " + this.addition3 + " of price " + this.additionCost3);
    }

    private void message4() {
        System.out.println("Addition of " + this.addition4 + " of price " + this.additionCost4);
    }

    public double returnPrice() {
        return this.price;
    }

    public void bill() {
        System.out.println("*".repeat(100));
        System.out.println("\n");
        System.out.println("Your final Bill is: ");

        for (int j = 1; j <= c; j++) {
            switch (j) {
                case 1 -> message1();
                case 2 -> message2();
                case 3 -> message3();
                case 4 -> message4();
            }
        }
        System.out.println("Grand Total is: " + this.price);

    }

    public void itemizeBurger() {

        System.out.println("Want to add more items ?(yes/no)....");
        Scanner ob = new Scanner(System.in);
        String ans = ob.nextLine();
        if (ans.toLowerCase().equals("yes")) {
            for (int i = 0; i < 4; i++) {
//                if (i == 3) {
//                    System.out.println("This is the last item you can add. Thank You......̥");
//                }
                System.out.println("Please enter the item you want to add: ");
                String item = ob.nextLine();
                System.out.println("Please enter the price of item: ");
                double rs = ob.nextDouble();
                ob.nextLine();
                if (i == 0) {
                    Addition1(item, rs);
                    c = 1;

                } else if (i == 1) {
                    Addition2(item, rs);
                    c = 2;

                } else if (i == 2) {
                    Addition3(item, rs);
                    c = 3;
                } else {
                    Addition4(item, rs);
                    c = 4;
                }
                if (i == 3) {
                    break;
                } else {
                    System.out.println("Want to add more?(yes/no)");
                    String enter = ob.nextLine();
                    if (enter.toLowerCase().equals("no")) {
                        break;
                    }

                }


            }
            ob.close();


        }else{
            bill();
        }


    }

}



















