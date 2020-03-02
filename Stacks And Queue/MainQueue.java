import java.util.ArrayList;

class MainQueue{
	public static void  main(String[] args) {
	 /*   	Queue obj = new Queue();
			obj.insert(5);
			obj.insert(10);
			obj.insert(7);
			int deleteno = obj.delete();

			System.out.println("size of queue is:"+ obj.size());
			System.out.println("deleted element is:"+ deleteno);
	*/
			ArrayQueue obj = new ArrayQueue();
			obj.insert(3);
			obj.insert(4);
			obj.insert(5);
			obj.insert(6);
			int noremoved = obj.delete();
			System.out.println("size of queue is:"+ obj.size());
			System.out.println("deleted element is:"+ noremoved);
	
	}
}
class Queue{
	ArrayList<Integer> list ;
	int head; 
	int tail ;
	public Queue(){
		list = new ArrayList<Integer>();
	}
	public void insert(int a){
		list.add(a);
	}
	public int delete(){
		int head = -1 ;
		if(!list.isEmpty()){
			head = list.get(0);
			list.remove(0);
		}
		else{
			System.out.println("underflow");
		}
		return head;
	}
	public int size(){
		int size1 = list.size();
		return size1 ;
	}

}

class ArrayQueue{
	int head = -1;
	int tail ;
	int[] arr ;
	unsigned int capacity ;

	public void ArrayQueue(int c){
		capacity = c;
		arr = new int[];
	}
	void insert(int a){
		if(tail < capacity -1){
			tail ++ ;
			arr[tail] = a;
		}
	}
	int delete(){
		if(tail >= head){
			int val = -1 ;
			int val = arr[head] ;
			head --;	
		}
		else{
			System.out.println("thers no elemnt in the queue");
		}
		return val ;	
	}

	public int size(){
		int count = 0;
		for(int i=0;i<=tail;i++){
			count ++ ;
		}
	}
}

