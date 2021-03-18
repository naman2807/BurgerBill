/*   Created By: IntelliJ Idea
 *    Author: Naman Agarwal (naman2807)
 *    Date: 18-07-2020
 *    Time: 01:52 PM
 */

//this application will help to select the type of burger, some of the additional items to be added to the burger
// and pricing.
//We want to create a base hamburger, but also other type of hamburger.
//
//The basic hambureger class should have following items:
//bread roll type, meat and upto 4 additional items that the customer can select to be added to burger.class
//Each of these items gets charged an additinal price so you need some way to track how many items got added and
// to calculate
//             the final price of burger( bse burger with all additions)
//            This burger has base price and additions are separately priced( upto  4 additions only).
//create a Hambrger class to deal with above. Constructor should only include rolltype, meat and price., can also
// include name of burger.
//
//Now create a subclass HealthyBurger class (on a brwon bread roll type) plus 2 additios item that can be added.
//HealthyBurger can have 6 items(additions ) in total









public class Main {
    public static void main(String[] args) {


//        HealthyBurger healthyBurger=new HealthyBurger("Healthy","sausage","brown",50);
//        healthyBurger.itemizeBurger();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe","Sausage","Normal",50);
        deluxeBurger.itemizeBurger();
    }
}
