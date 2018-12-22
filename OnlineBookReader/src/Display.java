public class Display {
	private Book activeBook;
	private User activeUser;
	private int pageNumber = 0;
	
	public void displayUser(User user) {
		activeUser = user;
		refreshUsername();
	}
	
	public void displayBook(Book book) {
		pageNumber = 0;
		activeBook = book;
		
		refreshTitle();
		refreshPage();
		
	}
	
	public void refreshUsername() {
		System.out.println("User: "+activeUser.getDetails());
	}
	
	public void refreshTitle() {
		System.out.println("Book Title: "+activeBook.getDetails());
	}
	
	public void refreshDetails() {
		refreshUsername();
		refreshTitle();
		refreshPage();
	}
	
	public void refreshPage() {
		System.out.println("Page "+pageNumber+" details will get printed.. ");
	}
	
	public void turnPageForward() {
		pageNumber++;
		refreshPage();
	}
	
	public void turnPageBackward() {
		pageNumber--;
		refreshPage();
	}	
}
