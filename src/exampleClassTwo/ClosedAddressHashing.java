package exampleClassTwo;
import java.util.*;

class ClosedAddressHashing {
	
	// Method to store each element of the input array into the hashtable 
	// HashFunction: 
	// 1 refers to folding method 
	// 2 refers to modSizeTable Method	
	
	// Storing 
	// Hashfunction must be specified
	
	public final static void store(LinkedList<String>[] hashTable, String[] arr, int hashFunction) {
		
		
		long start = 0, timeElapsed = 0;
		
		System.out.println("Storing:");
		
		for (int j =-10000; j<10000; j++) {
			if (j == 0) {
				start = System.nanoTime();
			}
			
			int i, index; 
			// uses mid square
			if(hashFunction == 1) {
				for (i = 0; i < arr.length; i++) {
					index = HashFunction.midSquare(arr[i], hashTable.length);
					if (hashTable[index] == null)
					{
						hashTable[index] = new LinkedList<String>();
					}
					hashTable[index].add(arr[i]); 
					// Add the nric to the linked list accordingly
				}
			}
			
			// Uses modsizetab
			else if(hashFunction == 2) {
				for (i = 0; i< arr.length; i++) {
					index = HashFunction.modTabSize(arr[i], hashTable.length);
					if (hashTable[index] == null)
					{
						hashTable[index] = new LinkedList<String>();
					}
					hashTable[index].add(arr[i]); 
					// Add the nric to the linked list accordingly
				}
			}
			
			
		}
		timeElapsed = System.nanoTime() - start;
		System.out.println("Time = " + (timeElapsed/10000));
		
		// Create index according to the choice of the Hash Function
	}
	
	
	// Searching
	// Hashfunction that was used to store must be specified
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

			if (hashTable[index] != null) {
				check = hashTable[index].contains(nric);
			}
			else {
				check = false;
			}
		}
		timeElapsed = System.nanoTime() - start;
		System.out.println("Time = " + (timeElapsed/10000));
		System.out.println("Found = " + check);
	}	
}

