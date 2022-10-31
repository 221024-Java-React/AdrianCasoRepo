package lab12;

public class Lab12 {
	
	public static void main(String[] args) {
		User user1 = new User(0, "ChetSteadman", "Cubbies");
		
		UserService uServ = new UserService();
		uServ.registerUser("ChetSteadman", "Cubbies");
	}

}
