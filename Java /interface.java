interface animal{
	public void eat();
	public void travel();

}

 public class nitin implements animal{
	public void eat(){
		System.out.println("nitin eats:");
	}
	public void travel(){
		System.out.println(" nitin travels:");
	}
	public static void main(String[] args){
		nitin n = new nitin();
		n.eat();
		n.travel();
	}
}