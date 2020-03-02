interface animal{
	public void eat();
	public void travel();

}
 public class nitinInterface implements animal{
	
	public void eat(){
		System.out.println("nitin eats:");
	}
	public void travel(){
		System.out.println("nitin travels:");
	}
	public static void main(String[] args){
		nitinInterface n = new nitinInterface();
		n.eat();
		n.travel();
	}
}