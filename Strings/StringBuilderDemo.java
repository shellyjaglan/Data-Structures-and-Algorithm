import java.lang.*;

public class StringBuilderDemo {

   public static void main(String[] args) {
  
   StringBuilder sb = new StringBuilder("amrood");
   System.out.println("string = " + sb);
    
   // char array
   char[] cArr = new char[]
   {'a','d','m','i','n','i','s','t','r','a','t','o','r'};
	
   /* appends the sbing representation of char array argument to
   this sbingBuilder with offset at index 0 and length as 5 */
  // sb.append(cArr, 0, 1);
  // sb.append();
   sb.insert(0,'z');
   //sb.setCharAt(0,'z');

   //insert(index,char);
   //it inserts an char at specified index val in the sb.
   // print the sbingBuilder after appending
   System.out.println("After append = " + sb);
   //to print sb just sop sb
   //to convert to string do sb.toString();

   }
}  