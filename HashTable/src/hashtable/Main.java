package hashtable;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dummy bob = new Dummy("Bob", 20);
		Dummy jim = new Dummy("Jim", 25);
		Dummy alex = new Dummy("Alex", 30);
		Dummy tim = new Dummy("Tim", 35);
		Dummy maxwell = new Dummy("Maxwell", 40);
		Dummy john = new Dummy("John", 45);
		Dummy julie = new Dummy("Julie", 50);
		Dummy christy = new Dummy("Christy", 55);
		Dummy tim2 = new Dummy("Tim", 100); // This should replace the first "tim"
		
		Dummy[] dummies = {bob, jim, alex, tim, maxwell, john, julie, christy};
		
		/* Test: Insert Elements. */
		Hasher<String, Dummy> hash = new Hasher<String, Dummy>(3);
		for (Dummy d : dummies) {
			hash.put(d.getName(), d);
		}
		System.out.println("created hash table.....");
		hash.printTable();	
		System.out.println(" ");
		System.out.println("change tim age 35 to 100...........");
		hash.put(tim2.getName(), tim2);
		hash.printTable();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Remove entry one by one..........");
		/* Test: Recall */
		for (Dummy d : dummies) {
			String name = d.getName();
			Dummy dummy = hash.get(name);
			if (dummy == null) {
				System.out.println("Dummy named " + name + ": null");
			} else {
				System.out.println("Dummy named " + name + ": " + dummy.toString());
			}
			Dummy d2 = hash.remove(name);
			if (d2 == null) {
				System.out.println("Dummy removed named " + name + ": " + "null");
			} else {
				System.out.println("Dummy removed named " + name + ": " + d2.toString());
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("after remove hash table.....");
		hash.printTable();	
	}

}
