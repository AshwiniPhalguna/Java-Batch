package SecondPackage;

public class Methodclass {

	public void login ()
	{
		System.out.println("Enter username");
		System.out.println("Enter password");
		System.out.println("Click on login");
		
	}
	
	public static void main(String[] args) {
		
		Methodclass obj = new Methodclass();
		
		obj.login();
		obj.login();
		obj.login();
		
		Method1 S1 = new Method1();
		
		S1.getdata();
		S1.getdata();
	}

}
