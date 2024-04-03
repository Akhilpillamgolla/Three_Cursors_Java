package listIterator;
import  java.util.*;
public class ListIteraorMethod {

	public static void main(String[] args) {
    LinkedList l = new LinkedList();
     l.add("Akhil");
     l.add("Amala");
     l.add("Amu");
     l.add("Amma");
     System.out.println(l);  // print all the names in 1 go
     
     ListIterator ltr  = l.listIterator();
     while (ltr.hasNext()) {
    	 String s = (String) ltr.next();
    	 if(s.equals("Amuu")) {
    		 ltr.remove();
    	 }
    	 else if (s.equals("ma")) {
    		 ltr.add("Lakshmi");
    	 }
    	 else if (s.equals("Amma")) {
    		 ltr.set("Naga Maha ");   // set method for replace
    	 }
     }
	 System.out.println(l);

     
	}

}
