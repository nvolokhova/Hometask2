package Hometask;

public class HomeworkMethods {

	public static void main(String[] args) {
	//Declaring an Array
	String [] HelloGuest = {"John","Mary"};
	
	// Calling Print Array method and passing an Array as a parameter
		Print_Array(HelloGuest);
			 
			 }
			 
	//This accept Array as an argument of type String 
		public static void Print_Array(String []array){
			 
		for(int i = 0;i<=array.length-1;i++){
		System.out.println("Hello, " + array[i] +"!");


		}

	}
}

