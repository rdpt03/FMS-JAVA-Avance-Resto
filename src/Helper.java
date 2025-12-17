import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import entities.MenuItem;

public class Helper {
	public static void showCard(Map<Integer, ? extends MenuItem> cardList) {
		for(Map.Entry<Integer, ? extends MenuItem> card : cardList.entrySet()) {
			
			System.out.println("---Item : "+card.getKey()+"---");
			System.out.println(card.getValue().toString());
			System.out.println();
		}
		System.out.println();
	}
	
	public static int askMenuItem(Map<Integer, ? extends MenuItem> restaurantPartCard, Scanner scanner, String question) {
		while(true) {
			System.out.print(question+" : ");
			try {
				//get the number
				int chosenEntreeI = scanner.nextInt();
				System.out.println();
				
				//check if is in this list
				if (chosenEntreeI > 0 && chosenEntreeI <= restaurantPartCard.size()) {
					//add menu to the list
					return chosenEntreeI;
				}
				else {
					throw new IllegalArgumentException("L'entrée n'est pas dans la liste");
				}
			}
			
			//catch errors
			//not a number
			catch(InputMismatchException e) {
				System.out.println("[Erreur] Numero non valide");
				//spend the scanner token
				scanner.next();
			}
			//unknown error
			catch(Exception e) {
				System.out.println("[Erreur] "+e.getMessage());
			}
			
		}
	}
}
