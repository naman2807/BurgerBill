/*   Created By: IntelliJ Idea
 *    Author: Naman Agarwal (naman2807)
 *    Date: 19-07-2020
 *    Time: 08:21 AM
 */


import java.util.Scanner;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price,2);
    }


    @Override
    public void itemizeBurger() {
        System.out.println("Since, it is deluxe burger , so you can add only Cold Drink and Chips. Want to add?(yes/no)");
        Scanner result = new Scanner(System.in);
        String ans =result.nextLine();
        if(ans.toLowerCase().equals("yes")) {
            super.itemizeBurger();
        }else{
            super.bill();
        }
    }
}
