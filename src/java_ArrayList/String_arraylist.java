package java_ArrayList;

import java.util.ArrayList;

public class String_arraylist {

	public static void main(String[] args) {
		// arraylist is resizable and not fixed.
		//ArrayList<datatype> variablename= new ArrayList<datatype>();
		
		ArrayList<String>Bangladesh=new ArrayList<String>();

		//to add elements to the ArrayList, use the add() method:
		
		Bangladesh.add("Dhaka");
		Bangladesh.add("Narayangonj");
		Bangladesh.add("khulna");
		Bangladesh.add("Rajshahi");
		System.out.println(Bangladesh);
		
		//To access an element in the ArrayList, use the get() method and refer to the index number;
		Bangladesh.get(0);
		Bangladesh.get(1);
		Bangladesh.get(2);
		Bangladesh.get(3);
		System.out.println(Bangladesh.get(0));
		System.out.println(Bangladesh.get(1));
		
		//To modify or change an element, use the set() method and refer to the index number:
         Bangladesh.set(0, "Savar");
		//Bangladesh.set(1, "Sunargouh");
		System.out.println(Bangladesh);
		System.out.println(Bangladesh.get(0));
       //System.out.println(Bangladesh.set(1, "Sunargouh"));
		
		//To remove an element, use the remove() method and refer to the index number
		Bangladesh.remove(1);
		Bangladesh.remove(2);
		System.out.println(Bangladesh);
		
		//To find out how many elements an ArrayList have, use the size method:
		Bangladesh.size();
		System.out.println(Bangladesh.size());
	
		System.out.println(Bangladesh.size()-1);// to find out how many index number have

		
		
	}

}
