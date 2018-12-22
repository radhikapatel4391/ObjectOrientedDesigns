package callCenter;


public class Caller {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int userId;
	public Caller(int id, String nm) {
		name = nm;
		userId = id;
	}
	
}
