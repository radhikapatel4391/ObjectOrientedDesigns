package callCenter;


public class Call {
	private static long callID=0;
	/* Minimal rank of employee who can handle this call. */
	private Rank rank;
	private long ID;
	public long getID() {
		return ID;
	}

	/* Person who is calling. */
	private Caller caller;

	/* Employee who is handling call. */
	private Employee handler;

	public Employee getHandler() {
		return handler;
	}

	public Call(Caller c) {
		rank = Rank.Responder;
		caller = c;
		this.ID = callID;
				callID++;
	}

	public Caller getCaller() {
		return caller;
	}

	

	/* Set employee who is handling call. */
	public void setHandler(Employee e) {
		handler = e;
		
	}

	/* Play recorded message to the customer. */
	public void reply(String message) {
		System.out.println(message);
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank r) {
		rank = r;
	}

	public Rank incrementRank() {
		if (rank == Rank.Responder) {
			rank = Rank.Manager;
		} else if (rank == Rank.Manager) {
			rank = Rank.Director;
		}
		return rank;
	}

	/* Disconnect call. */
	public void disconnect() {
		reply("");
		}
		
		
	
}
