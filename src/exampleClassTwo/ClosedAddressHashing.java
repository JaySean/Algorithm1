package exampleClassTwo;
import java.util.*;

class ClosedAddressHashing {
	
	//	Method to store each element of the input array into the hash table
	//	Takes in the parameters:
	//	1. Hash table of size corresponding to load factor
	//	2. Array of generated NRICs
	//	3. Hash function used to generate index
	
	public final static void store(LinkedList<String>[] hashTable, String[] arr, int hashFunction) {
		
		
		int i, j, index = 0; 
		long start = 0, timeElapsed = 0;
		
		System.out.println("Storing:");
		
		for (j =-10000; j<10000; j++) {		//	Ignore first 10,000 runs
			
			if (j == 0) {						//	Use the next 10,000 runs to find average
				start = System.nanoTime();		//	Gives a nanosecond-precise time, relative to some arbitrary point
			}
			
			for (i = 0; i < arr.length; i++) {
				
				if (hashFunction == 1) {				//	Mid Square Method
					index = HashFunction.midSquare(arr[i], hashTable.length);
				}
				else if (hashFunction == 2) {				//	Mod Table Size Method
					index = HashFunction.modTabSize(arr[i], hashTable.length);
				}
				
				if (hashTable[index] == null)	//	Only creates a new linked list once for each node
				{
					hashTable[index] = new LinkedList<String>();
				}
				hashTable[index].add(arr[i]);	//	Add the NRIC to the linked list accordingly
			}
			
			
			
		}
		timeElapsed = System.nanoTime() - start;	//	Calculate the difference between start and stop time
		System.out.println("Time = " + (timeElapsed/10000));	//	Take the average time elapsed
	}
	
	
	// Searching
	//	Takes in the parameters:
	//	1. Hash table with stored NRICs
	//	2. NRIC to search for (successful/unsuccessful)
	//	3. Hash function used to generate index
	public final static void search(LinkedList<String>[] hashTable, String nric, int hashFunction) {
		
		int i, index = 0;
		long start = 0, timeElapsed = 0;
		boolean check = true;
		
		for (i = -10000; i < 10000; i++) {
			if (i == 0) {
				start = System.nanoTime();
			}
			
			if (hashFunction == 1) {
				index = HashFunction.midSquare(nric, hashTable.length);
			}
			else if (hashFunction == 2) {
				index = HashFunction.modTabSize(nric, hashTable.length);
			}

			if (hashTable[index] != null) {				//	Only checks if node is not empty
				check = hashTable[index].contains(nric);
			}
			else {
				check = false;
			}
		}
		timeElapsed = System.nanoTime() - start;
		System.out.println("Time = " + (timeElapsed/10000));
		System.out.println("Found = " + check);
		if (hashTable[index] != null) {
			System.out.println(hashTable[index].toArray().length);
		}
	}	
}

