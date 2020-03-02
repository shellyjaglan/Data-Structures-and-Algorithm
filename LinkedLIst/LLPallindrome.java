/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class LLPallindrome
{
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Stack<Integer> s = new Stack<Integer>();
        Node temp = head;
        while(temp != null){
            s.push(temp.data);
            temp = temp.next;
        }
        
        while(head != null){
            int d = (int)s.pop();
            if(head.data != d){
                return false;
            }
            head = head.next;
        }
        return true;
    }   
}