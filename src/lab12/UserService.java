package lab12;

import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	private FileIO<List<User>> io;
	
	public UserService() {
		this.io = new FileIO<List<User>>("users.txt");
	}
	
	public String registerUser(String username, String password) {
		List<User> uList = io.readObject();
		if(uList == null) {
			uList = new ArrayList<>();
		}
		
		User newUser = new User(uList.size() + 1, username, password);
		uList.add(newUser);
		return "User added";
	}
	
	public User loginUser(String username, String password) {
		List<User> uList = io.readObject();
		if(uList == null) {
			uList = new ArrayList<>();
			return null;
		} 
		
		for(User u : uList) {
			if(u.getUsername() == username && u.getPassword() == password) {
				return u;
			} else {
				return null;
			}
		}
		
		return null;
	}
	

}
