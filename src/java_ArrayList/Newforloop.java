package java_ArrayList;

import java.util.ArrayList;

public class Newforloop {

	public static void main(String[] args) {
	

		
		ArrayList<String>country=new ArrayList<String>();
		country.add("USA");
		country.add("Japan");
		country.add("India");
		System.out.println(country);
		
		System.out.println("For loop");
		for (int num=0; num <country.size(); num++) {
			
			System.out.println(country.get(num));
		}
		
		for(String name:country) {
			System.out.println(name); 
		}
		
		
		
		
		
	}

}
