
public class Main {

	public static void main(String[] args) {
		OnlineReaderSystem radhikaLibrary = new OnlineReaderSystem();
		Book geeta = new Book(1,"shreemad bhagvat geeta");
		User radhika = new User(1,"Radhika bahen Patel");
		radhikaLibrary.setActiveBook(geeta);
		radhikaLibrary.setActiveUser(radhika);
//display set let's turn page		
		Display currentDisplay = radhikaLibrary.getDisplay();
		currentDisplay.turnPageForward();
		currentDisplay.turnPageForward();
		currentDisplay.turnPageForward();
		currentDisplay.turnPageBackward();
		

	}

}
