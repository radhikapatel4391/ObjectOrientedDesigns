

import java.util.HashMap;

public class UserManager {
	private HashMap<Integer, User> users;
	
	public UserManager() {
		users = new HashMap<Integer, User>();
	}
	
	public User addUser(int id, String details) {
		if (users.containsKey(id)) {
			return null;
		}
		User user = new User(id, details);
		users.put(id, user);
		return user;
	}
	
	public boolean remove(User u) {
		return remove(u.getID());
	}
	
	public boolean remove(int id) {
		if (!users.containsKey(id)) {
			return false;
		}
		users.remove(id);
		return true;
	}
	
	public User find(int id){
		return users.get(id);
	}
}
