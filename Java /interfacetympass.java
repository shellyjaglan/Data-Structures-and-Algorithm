interface egg{
	public void sleep();
	public void eat();
}
public class interfacetympass implements egg{
	public void sleep(){
		System.out.println("sleeps");
	}
	public void eat(){
		System.out.println("eats");
	}
	public static void main(String[] args) {
		interfacetympass it = new interfacetympass();
		it.sleep();
		it.eat();
	}
}