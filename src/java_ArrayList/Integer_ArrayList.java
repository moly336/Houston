package java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Integer_ArrayList {

	public static void main(String[] args) {
		// arraylist is resizable and not fixed.
				//ArrayList<datatype> variablename= new ArrayList<datatype>();
		
		ArrayList<Integer>number=new ArrayList<Integer>();//this is generic arraylist.you need to 
		//write specific data type like string or integer.
		//to add elements to the ArrayList, use the add() method:
		number.add(35);
		number.add(80);
		number.add(60);
		number.add(40);
		System.out.println(number);
		
		//To access an element in the ArrayList, use the get() method and refer to the index number;
		number.get(0);
		number.get(2);
		number.get(3);
		System.out.println(number.get(0));
		System.out.println(number.get(2));
		System.out.println(number.get(3));
		
		//To modify or change an element, use the set() method and refer to the index number:
		
		number.set(0, 20);
		number.set(2, 15);
		System.out.println(number);
		
		//To remove an element, use the remove() method and refer to the index number
		
		number.remove(1);
		System.out.println(number);
		
		//To find out how many elements an ArrayList have, use the size method:
		
		number.size();
		System.out.println(number.size());
		
		//to find the how many index number in arraylist.
		System.out.println(number.size()-1);
		
		System.out.println("For Loop");  //For Loop
		
	for (int num=0; num <number.size(); num++) {
		
		System.out.println(number.get(num));
	}
		
		System.out.println("Advanced For Loop");   //Advanced for Loop
		
		for (Integer moly:number) { //moly is the new object
			
			System.out.println(moly);
		}
		
		System.out.println("While Loop");   //while Loop for iterating arraylist
		
		int count=0;
		while (number.size()> count){
			System.out.println(number.get(count));
			count++;
		}
		
		System.out.println("Iterator");
		Iterator iter =number.iterator();
		while(iter.hasNext()) {
			
			System.out.println(iter.next() );
		}
		
		
		
		
	}

}
