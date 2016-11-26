package Static;

public class NewClass {

	static {
		System.out.println("Static blacks calling ");
	}
	
	{
		System.out.println("Instance Block Called");
	}
}
