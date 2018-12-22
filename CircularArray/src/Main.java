public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = 10;
		CircularArray<String> array = new CircularArray<String>(size);
		System.out.println("\n array created of size 10 with values...");
		for (int i = 0; i < size; i++) {
			array.set(i, String.valueOf(i));
		}
		for (int i = 0; i < size; i++) {
			System.out.print(" "+array.get(i));
		}
		System.out.println("\n Rotate 3 ...");
		array.rotate(3);
		for (int i = 0; i < size; i++) {
			System.out.print(" "+array.get(i));
		}
		
		System.out.println("\n Rotate -2");
		
		array.rotate(-2);
		for (String s : array) {
			System.out.print(" "+s);
		}
	}

}
