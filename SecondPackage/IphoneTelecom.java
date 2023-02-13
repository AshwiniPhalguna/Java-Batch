package SecondPackage;

public class IphoneTelecom implements Interface {

	private static final char[] scroll = null;

	public static void main(String[] args) {
    IphoneTelecom obj = new IphoneTelecom();
    
    obj.Incomingcall();
    obj.outgoingcall();
    obj.Message();
    obj.Endcall();
    
	}

	@Override
	public void Incomingcall() {
    System.out.println("scrollup");		
	}

	@Override
	public void outgoingcall() {
System.out.println("scroll down");		
	}

	@Override
	public void Message() {
		System.out.println("IphoneMessage ");		
		
	}

	@Override
	public void Endcall() {
		System.out.println("Iphonecallend ");		
		
	}

}
