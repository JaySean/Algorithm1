package exampleClassTwo;

import java.util.*; 

public class HashApp {
	
	public static final int DATA_SIZE = 600;
	
	public static void main(String[] args) {
		
		int j;
		long start = 0, timeElapsed = 0;
		
		//	Create an array of linked lists
		//	3 hash tables corresponding to 3 load factors
		LinkedList<String> hashTable25[] = new LinkedList[DATA_SIZE*4]; 
		LinkedList<String> hashTable50[] = new LinkedList[DATA_SIZE*2]; 	
		LinkedList<String> hashTable75[] = new LinkedList[DATA_SIZE/3*4]; 
		
		//	Generate a set of random NRICs
		String[] arr = new String[DATA_SIZE];
		arr = generateBiasedNumberArray(DATA_SIZE);
		
		//	2 NRICs to search for
		String nric1 = arr[DATA_SIZE - 1];			// Successful
		String nric2 = "S8000000A";					// Unsuccessful
		
		// Mid Square Method
		System.out.println("1. Mid Square Method");

		System.out.println("A) Load Factor: 0.25");			//	Load Factor
		ClosedAddressHashing.store(hashTable25, arr, 1);	//	Store function
		System.out.println("Storing:");
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			ClosedAddressHashing.store(hashTable25, arr, 1);
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
	
					
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable25, nric1, 1);	// Successful search
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable25, nric2, 1);	//	Unsuccessful search
		
		//
		
		System.out.println("\nB) Load Factor: 0.50");
		ClosedAddressHashing.store(hashTable50, arr, 1);
		System.out.println("Storing:");
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			ClosedAddressHashing.store(hashTable50, arr, 1);
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
		
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable50, nric1, 1);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable50, nric2, 1);
	
		//
		
		System.out.println("\nC) Load Factor: 0.75");
		ClosedAddressHashing.store(hashTable75, arr, 1);
		System.out.println("Storing:");
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			ClosedAddressHashing.store(hashTable75, arr, 1);
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
		
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable75, nric1, 1);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable75, nric2, 1);
		
		//	Mod Size Table Method
		System.out.println("\n2. Mod Size Table Method");
		System.out.println("A) Load Factor: 0.25");
		ClosedAddressHashing.store(hashTable25, arr, 2);
		System.out.println("Storing:");
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			ClosedAddressHashing.store(hashTable25, arr, 2);
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
		
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable25, nric1, 2);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable25, nric2, 2);
		
		//
		
		System.out.println("\nB) Load Factor: 0.50");
		ClosedAddressHashing.store(hashTable50, arr, 2);
		System.out.println("Storing:");
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			ClosedAddressHashing.store(hashTable50, arr, 2);
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
		
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable50, nric1, 2);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable50, nric2, 2);
	
		//
		
		System.out.println("\nC) Load Factor: 0.75");
		ClosedAddressHashing.store(hashTable75, arr, 2);
		System.out.println("Storing:");
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			ClosedAddressHashing.store(hashTable75, arr, 2);
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
		
		
		System.out.println("Searching:");
		System.out.println("i) Successful:");
		ClosedAddressHashing.search(hashTable75, nric1, 2);
		System.out.println("ii) Unsuccessful:");
		ClosedAddressHashing.search(hashTable75, nric2, 2);
	}
	
	//	Function to generate random NRICs
	public static String[] generateRandomNumberArray(int size) {
		  Random RNG = new Random();
		  String[] arr = new String[size];
		  for(int i = 0; i < size; i++) {
			  arr[i] = "S" + Integer.toString(9000000 + RNG.nextInt(1000000)) + Character.toString((char) (RNG.nextInt(26) + 'A'));
		}
		  return arr;
	}

/*	public static String[] generateBiasedNumberArray(int size) {
		Random RNG = new Random();
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = "S" + Integer.toString(((90 + RNG.nextInt(10)) * 100000) + 54321 + 'A');
		}
		return arr;
	}
*/
	
	public static String[] generateBiasedNumberArray(int size) {
		Random RNG = new Random();
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			arr[i] = "S" + Integer.toString(((9000 + RNG.nextInt(1000)) * 1000) + 321 + 'A');
		}
		return arr;
	}
	
/*	public static String[] generateBiasedNumberArray(int size) {
		  String[] arr = new String[size];
		  for(int i = 0; i < size; i++) {
			  if(i*size < 1000000) {
				  arr[i] = "S" + (9000000 + i*size*12)+ 'A';
			  } else {
				  arr[i] = "S" + (9000000 + i*size*12 - 1000000) + 'A';
			  }
		}
		  return arr;
	}
*/
	
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