package java_Array;

import java.util.Arrays;

public class Array_String {

	public static void main(String[] args) {
		// //Array syntax
		//Datatype[]variauble={data1,data2,datan}

	//Array is a fixed the boundaries you cannot add anything but you can change or modify.
		//the variable cannot be duplicate
		//In array we store values in index. Index start with 0.
		//change the value in Array by index number.
		
		String[]Fruits= {"mango","banana","apple","orange","kiwi"};
		Fruits[0]="grape";
		System.out.println(Fruits[0]);
		System.out.println(Fruits[1]);
		System.out.println(Fruits[2]);
		System.out.println(Fruits[3]);
		
		System.out.println(Arrays.toString(Fruits));//what datas are an array have.
		try {
			
			String[]fruits= {"mango","banana","apple","orange","kiwi"};
			fruits[0]="mango";
			System.out.println(fruits[44]);
			
		}
		
		catch (Exception e) {
			System.out.println("array out of bound exception");
		}
		
		
		
		
		
		///To find out how many elements an Array have, use the length method:
		System.out.println(Fruits.length);
		System.out.println(Fruits.length-1);//how many index number an array have.
		
		String[]cars= {"nissan","toyeta","kea","camry",};
		//change the value in Array by index number.
		
		cars[0]="ford";
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(Arrays.toString(cars));
		
		
		///To find out how many elements an Array have, use the length method:
		System.out.println(cars.length);
		System.out.println(cars.length-1);// find out the index number.
		
		
		
	}

}
