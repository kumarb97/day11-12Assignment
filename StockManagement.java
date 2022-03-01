/* Stock Account Management
 * Get i/p from user about stock name ,price per stock
 * & no of stocks and store the information and display
 * as per user choice.
 */
package stockaccountmanagement;

import java.util.ArrayList;
import java.util.Scanner;
public class StockManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StockPortfolio obj = new StockPortfolio();// constructor
		while (true) {
			System.out.println("1-Enter new stock \n2-Display Stock Report \n3-Exit");// display options
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				obj.addStocks();
			}
				break;
			case 2: {
				obj.stockReport();
			}
				break;
			case 3: {
				System.out.println("Exited the Program !! ");
				System.exit(0);
			}
			default:
				System.out.println("Invalid Input");
				sc.close();
			}
		}

	}

}
