package iterator;
import java.util.*;
public class IteratorMethods {
	public static void main(String[] args) {
	
		ArrayList l = new ArrayList();
		for(int i=0;i<=10;i++) {
			l.add(i);
		}
		System.out.println(l);   //print all the elements 0-10
		Iterator itr = l.iterator();   // l - Collection Object 
		while (itr.hasNext()) {
			Integer n  = (Integer)itr.next();
			if(n%2==0) {
				System.out.println(n);
			}
			else {
				itr.remove();    // remove element if not required 
			}
		}
		System.out.println(l);
	}

}
