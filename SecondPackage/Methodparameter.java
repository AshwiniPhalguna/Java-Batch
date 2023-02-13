package SecondPackage;

public class Methodparameter {
	
	public void login(String username,String password) {
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("Enterlogin");
	}
		
	
	
	

	public static void main(String[] args) {

		
		Methodparameter obj = new Methodparameter();
		
	obj.login("Ashwini", "Test124");
	obj.login("Achala", "3333");
	obj.login("Saksham", "2323");
	obj.login("phalguna", "4444");	
	
	}

}
