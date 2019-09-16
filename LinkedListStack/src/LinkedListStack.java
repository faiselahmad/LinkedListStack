//As astack referred as Last in first out.
import java.util.*;
public class LinkedListStack {
	public static void main(String args[]) {
		LinkedList s=new LinkedList();
		/*s.addFirst("Henry");
		s.addFirst("Petter");
		s.addFirst("Cherry");
		s.addFirst("Monu");
		s.addFirst("Sonu");
		System.out.println(s);
		s.removeFirst();
		System.out.println(s);*/
		
		//As astack referred as First in first out.
		s.addLast("Henry");
		s.addLast("Petter");
		s.addLast("Cherry");
		s.addLast("Monu");
		s.addLast("Sonu");
		System.out.println(s);
		s.removeFirst();
		System.out.println(s);


			}
}
