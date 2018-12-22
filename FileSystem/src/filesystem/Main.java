package filesystem;
public class Main {

	public static void main(String[] args) {
		Directory root = new Directory("Food", null);
		File taco = new File("Taco.txt", root, 4);
		File hamburger = new File("Hamburger.txt", root, 9);
		root.addEntry(taco);
		root.addEntry(hamburger);
		
			Directory healthy = new Directory("Healthy", root);
		
				Directory fruits = new Directory("Fruits", healthy);
					File apple = new File("Apple.txt", fruits, 5);
					File banana = new File("Banana.txt", fruits, 6);
				fruits.addEntry(apple);
				fruits.addEntry(banana);
				
			healthy.addEntry(fruits);
				
				Directory veggies = new Directory("Veggies", healthy);
					File carrot = new File("Carrot.txt", veggies, 6);
					File lettuce = new File("Lettuce.txt", veggies, 7);
					File peas = new File("Peas.txt", veggies, 4);
				veggies.addEntry(carrot);
				veggies.addEntry(lettuce);
				veggies.addEntry(peas);
			
			healthy.addEntry(veggies);
			
		root.addEntry(healthy);
		root.printDirectory(0);
		System.out.println("\n Total no of Entry: "+root.numberOfFiles());
		System.out.println("Path for Veggies: "+veggies.getFullPath());
	}

}
