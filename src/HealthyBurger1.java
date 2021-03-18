/*   Created By: IntelliJ Idea
 *    Author: Naman Agarwal (naman2807)
 *    Date: 18-07-2020
 *    Time: 02:18 PM
 */


import java.util.Scanner;

public class HealthyBurger1 extends HamBurger1 {

    private String healthyAdd1;
    private double healthyAddCost1;
    private String healthyAdd2;
    private double healthyAddCost2;

    public HealthyBurger1(String meat, double price) {
        super("Healthy Burger", meat, "Brown Bread", price);

    }
    private void setHealthyAddition1(String item, double cost) {
      this.healthyAdd1=item;
      this.healthyAddCost1=cost;
      double price= super.returnPrice()+cost;
    }
    private void setHealthyAddition2(String item, double cost) {
        this.healthyAdd2=item;
        this.healthyAddCost2=cost;
        double price= super.returnPrice()+cost;
    }

    @Override
    public void itemizeBurger() {
        super.itemizeBurger();

        System.out.println("Want to add more items ?(yes/no)....");
        Scanner obj = new Scanner(System.in);
        String ans;
        ans = obj.nextLine();
        if (ans.toLowerCase().equals("yes")) {
            for (int i = 0; i < 2; i++) {

                System.out.println("Please enter the item you want to add: ");
                String item = obj.nextLine();
                System.out.println("Please enter the price of item: ");
                double rs = obj.nextDouble();
                obj.nextLine();
                if (i == 0) {
                    setHealthyAddition1(item, rs);


                } else if (i == 1) {
                    setHealthyAddition2(item, rs);


                }
                if (i == 1) {
                    break;
                } else {
                    System.out.println("Want to add more?(yes/no)");
                    String enter = obj.nextLine();
                    if (enter.toLowerCase().equals("no")) {
                        break;
                    }

                }


            }
            obj.close();
            super.bill();


        }else{
            super.bill();
        }


    }


}

