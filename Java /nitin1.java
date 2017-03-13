interface animal{
	public void eat();
	public void travel();

}

 public class nitin1 implements animal{
	public void eat(){
		System.out.println("nitin eats:");
	}
	public void travel(){
		System.out.println(" nitin travels:");
	}
	public static void main(String[] args){
		nitin1 n = new nitin1();
		n.eat();
		n.travel();
	}
}