package enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationMethod {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();

		for (int i = 0; i <= 10; i++)

			v.addElement(i);

		System.out.println(v);   // this execute 0 - 10 {11 elements}

		
		// if you don't want all  elements at a time you need one by one  then
		
		Enumeration<Integer> e = v.elements();   // v- Vector Object
		while (e.hasMoreElements()) {      //if more elements it  provide next elements  
			Integer I = (Integer) e.nextElement();    //type casting (for object)
			if (I % 2 == 0)
				System.out.println(I);   //gives only even objects 
		}
		System.out.println(v);   //print all elements 

	} 

}
