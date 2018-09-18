package exampleClassTwo;

import java.util.*; 

public class HashApp {
	
	public static final int DATA_SIZE = 300;
	
	public static void main(String[] args) {
		
		// Create an Array of linked list
		LinkedList<String> hashTable25[] = new LinkedList[DATA_SIZE*4]; 
		LinkedList<String> hashTable50[] = new LinkedList[DATA_SIZE*2]; 	
		LinkedList<String> hashTable75[] = new LinkedList[DATA_SIZE/3*4]; 
		
		// Store 
		// Measures difference between start and stop time to find out the time elapsed 
			
		// Folding method
		
		String[] arr = new String[DATA_SIZE];
		arr = generateRandomNumberArray(DATA_SIZE);
		
		String nric1 = arr[0]; // For searching usage (successful)
		String nric2 = "S8000000A"; // For searching usage (unsuccessful)
		
		System.out.println("1. Mid Square Method");
		System.out.println("A) Load Factor: 0.25");
		ClosedAddressHashing.store(hashTable25, arr, 1);
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable25, nric1, 1);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable25, nric2, 1);
		
		//
		
		System.out.println("\nB) Load Factor: 0.50");
		ClosedAddressHashing.store(hashTable50, arr, 1);
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable50, nric1, 1);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable50, nric2, 1);
	
		//
		
		System.out.println("\nC) Load Factor: 0.75");
		ClosedAddressHashing.store(hashTable75, arr, 1);
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable75, nric1, 1);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable75, nric2, 1);
		
		//// Mod Size Table
		
		System.out.println("\n2. Mod Size Table Method");
		System.out.println("A) Load Factor: 0.25");
		ClosedAddressHashing.store(hashTable25, arr, 2);
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable25, nric1, 2);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable25, nric2, 2);
		
		//
		
		System.out.println("\nB) Load Factor: 0.50");
		ClosedAddressHashing.store(hashTable50, arr, 2);
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable50, nric1, 2);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable50, nric2, 2);
	
		//
		
		System.out.println("\nC) Load Factor: 0.75");
		ClosedAddressHashing.store(hashTable75, arr, 2);
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable75, nric1, 2);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable75, nric2, 2);
	}
	
	
	public static String[] generateRandomNumberArray(int size) {
		  Random RNG = new Random();
		  String[] arr = new String[size];
		  for(int i = 0; i < size; i++) {
			  arr[i] = "S" + Integer.toString(9000000 + RNG.nextInt(9999999-9000000)) + Character.toString((char) (RNG.nextInt(26) + 'A'));
		}
		  return arr;
	}

}
		
	

	
	
	
	
	/*
	// mod table size method
	long startTime3 = System.nanoTime();
	ClosedAddressHashing.store(hashTable, students25, 2);
	long stopTime3 = System.nanoTime();
	long timeElapsed3 = stopTime3 - startTime3;
	System.out.println("\nTime to store using mod table size method is "+ timeElapsed3);
		 
		
		
	// Searching
		
	
		
		
	
	// mod size table method
	long startTime4 = System.nanoTime();
	boolean check4 = ClosedAddressHashing.search(hashTable, nric1, 2); 
	long stopTime4 = System.nanoTime();
	long timeElapsed4 = stopTime4 - startTime4;
	System.out.println("\nTime to search using mod table size method is "+ timeElapsed4);
	
	if (check4) {
		System.out.println("NRIC in Memory");
	}
	
	else {
		System.out.println("NRIC not in Memory");
	}
	
}
}
*/