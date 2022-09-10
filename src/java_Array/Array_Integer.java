package java_Array;

import java.util.Arrays;

public class Array_Integer {

	public static void main(String[] args) {
		// //Array syntax
		//Datatype[]variauble={data1,data2,datan};
     int[]nam = {35,45,55,65,75};
		nam[0]= 25;//change the value in Array by index number.
		System.out.println(nam[0]);
		System.out.println(nam[2]);
		System.out.println(nam[3]);
		System.out.println(nam[4]);
		//to find out what data in array have use Arrays.toString 
		System.out.println(Arrays.toString(nam));
		
		////To find out how many elements an Array have, use the length method:
		System.out.println(nam.length);
		
		//how many index in array have use this method.
		System.out.println(nam.length-1);
		
		
		for( int i=0;i<nam.length;i++) {
			
			System.out.println(nam[i] );
		}
		
		//or i can prove this way 
		for(int name:nam) {
			System.out.println(name);
		}
		
		
		
		
	}

}
