package Inheritence;

public class InheritenceSuBConstructorParam extends InheritenceSuperConstructorParam {

	InheritenceSuBConstructorParam(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		InheritenceSuBConstructorParam subcon = new InheritenceSuBConstructorParam("Balram Cheryala");
		subcon.getName();
	}
}
