

public class User {
	private int userId;
	private String details;
	private AccountType accountType;
	
	public void renewMembership() {  }

	public User(int id, String details) {
		userId = id;
		this.details = details;
		this.accountType = AccountType.silver;
	}
	
	/* getters and setters */
	public int getID() { return userId; }
	public void setID(int id) { userId = id; }
	public String getDetails() { return details; }
	public void setDetails(String details) { this.details = details; }
	public AccountType getAccountType() { return accountType; }
	public void setAccountType(AccountType accountType) { 
		this.accountType = accountType;
	}
}

