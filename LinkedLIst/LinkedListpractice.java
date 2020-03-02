class LinkedListpractice{
	public static void main(String[] args) {

	Node head = new Node(1);
	Node tail = head;
	int i;
	for(i=2;i<7;i++){
		Node newnode =new Node(i);
		tail.next= newnode;
		tail = newnode;
	}
	Node ptr = head;
	while(ptr != null){
		System.out.println(ptr.data);
		ptr= ptr.next ;
	}
	}
}

class Node{
	public int data ;
	public Node next ;
	public Node(int a){
		data =a;
		next =null; 
	}
}
/*
class LinkList{
	private Node head;
	private Node tail;

	public LinkList(){
		length =0;
		head =null;
		tail =null;
	}
	void add(Node newnode){
		tail.next =newnode;
		tail =newnode;
	}

	void delete(int b){

		Node A =new Node();
		Node A = head;
		for(i=1;i<b;i++){
			if(B.next ==null){
				return fasle;
			}
			else{
				B =B.getnext();
			}	
		}
		Node B = new Node();
		Node B =A.next;
		A.next =B.next;
		B.next =null;
	}
}*/