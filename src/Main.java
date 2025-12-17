import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Dessert;
import entities.Drink;
import entities.MainDish;
import entities.MenuItem;
import entities.SideDish;
import entities.Starter;

public class Main {
	public static Map<Integer, Starter> entreeList;
	public static Map<Integer, MainDish> platsList;
	public static Map<Integer, SideDish> accompagnements;
	public static Map<Integer, Dessert> dessert;
	public static Map<Integer, Drink> boisson;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entreeList = new HashMap<>();
		platsList = new HashMap<>();
		accompagnements = new HashMap<>();
		dessert = new HashMap<>();
		boisson = new HashMap<>();
		
		//ajouter entrees
		entreeList.put(1, new Starter("Salade", 3, "Une bonne salade fraiche et locale")); // nom, prix, description
		entreeList.put(2, new Starter("Soupe", 2, "Soupe du jour"));
		entreeList.put(3, new Starter("Quiche", 3, "Quiche maison"));
		entreeList.put(4, new Starter("Aucune", 0, "Pas d'entrée"));;
		
		//ajouter plat
		platsList.put(1, new MainDish("Poulet", 7, "Poulet local élevé à l'air libre", 2));
		platsList.put(2, new MainDish("Boeuf", 8, "Boeuf grillé", 2));
		platsList.put(3, new MainDish("Poisson", 7, "Poisson frais du jour", 2));
		platsList.put(4, new MainDish("Végétarien", 6, "Plat végétarien", 1));
		platsList.put(5, new MainDish("Vegan", 6, "Plat vegan", 1));
		platsList.put(6, new MainDish("Aucun", 0, "Pas de plat", 0));
		
		//ajouter accompagnements
		accompagnements.put(1, new SideDish("Riz", 1, "Riz blanc", 1));
		accompagnements.put(2, new SideDish("Pâtes", 1, "Pâtes nature", 1));
		accompagnements.put(3, new SideDish("Frites", 2, "Frites maison", 1));
		accompagnements.put(4, new SideDish("Légumes", 2, "Légumes frais et locaux", 2));
		accompagnements.put(5, new SideDish("Aucun", 0, "Pas d'accompagnement", 0));
		
		//ajouter boisson
		boisson.put(1, new Drink("Eau plate", 1, "", false, 50));
		boisson.put(2, new Drink("Eau gazeuse", 1, "", false, 50));
		boisson.put(3, new Drink("Pepsi Zero", 2, "", false, 33));
		boisson.put(4, new Drink("Vin", 2, "Vin de Libourne", true, 25));
		boisson.put(5, new Drink("Aucune", 0, "Pas de boisson", false, 0));
				
		//ajouter dessert
		dessert.put(1, new Dessert("Tarte maison", 2, "Recette de la maison"));
		dessert.put(2, new Dessert("Mousse au chocolat", 2, "Mousse onctueuse"));
		dessert.put(3, new Dessert("Tiramisu", 3, "Tiramisu italien"));
		dessert.put(4, new Dessert("Aucun", 0, "Pas de dessert"));
		
		
		Scanner scanner = new Scanner(System.in);
		
		//ask number of menus
		int nOfMenus = Helper.askInt(scanner,"Bonjour, combien de menus souhaitez vous?");
		//execute the restaurant logic
		executeRestaurant(nOfMenus, scanner);
		
	}
	public static void executeRestaurant(int nOfMenus, Scanner scanner) {
		//vars
		int nOrder = 1;
		//list of menus (menu is a list of different plates
		ArrayList<ArrayList<? extends String>> menusList = new ArrayList<>();
		
		for(int i = 0; i < nOfMenus; i++) {
			System.out.println("Commande numéro "+(i+1));
			//var zone
			ArrayList<String> menu = new ArrayList<>();
			int chosenI;
			
			
			//---------------entrees---------------
			//print area
			System.out.println("----------Choix Entreé----------");
			Helper.showCard(entreeList);
			
			//get the desired number
			chosenI = Helper.askMenuItem(entreeList, scanner,"Que souhaitez vous comme entrée?");
			//put into menu list
			menu.add("["+chosenI+" - "+entreeList.get(chosenI)+"]");
			//end the entrees asking
				
			
			//---------------plat---------------
			//print area
			System.out.println("----------Choix plat----------");
			Helper.showCard(platsList);
			
			//get the desired number
			chosenI = Helper.askMenuItem(platsList, scanner,"Que souhaitez vous comme plat?");
			
			//put into menu list
			menu.add("["+chosenI+" - "+platsList.get(chosenI)+"]");
			//end the entrees asking
			
			
			//---------------accompagnement---------------
			//print area
			System.out.println("Choix accompagnement:");
			Helper.showCard(accompagnements);
			
			//get the desired number
			chosenI = Helper.askMenuItem(accompagnements, scanner,"Que souhaitez vous comme accompagnement?");
			//put into menu list
			menu.add("["+chosenI+" - "+accompagnements.get(chosenI)+"]");

			
			
			//---------------boisson---------------
			//print area
			System.out.println("Choix boisson:");
			Helper.showCard(boisson);
			
			//get the desired number
			chosenI = Helper.askMenuItem(boisson, scanner, "Que souhaitez vous comme boisson");
			//put into menu list
			menu.add("["+chosenI+" - "+boisson.get(chosenI)+"]");

			
			//---------------dessert---------------
			System.out.println("Choix dessert:");
			Helper.showCard(dessert);
			
			//get the desired number
			chosenI = Helper.askMenuItem(dessert, scanner, "Que souhaitez vous comme dessert");
			//put into menu list
			menu.add("["+chosenI+" - "+dessert.get(chosenI)+"]");
			
			
			//---------------add menu to list---------------
			menusList.add(menu);
			nOrder++;
			
			
			//show order
			System.out.println("La commande : \n"+menusList);
			
		}
	}
}
