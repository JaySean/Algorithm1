package exampleClassTwo;

public class HashFunction {
	
	//Mid Square Method
	public final static int midSquare(String nric, int tableSize) {
		long index, icNumber;
			
		icNumber = Integer.parseInt(nric.substring(1,8)); // Removes first and last letter 
		index = ((((icNumber * icNumber) / 10000) % 10000000) % tableSize);
		
		return (int) index;
	}
	
	// Mod Size Table Method
	public final static int modTabSize(String nric, int tableSize) {
		int index, icNumber;
			
		icNumber = Integer.parseInt(nric.substring(1,8)); // Removes first and last letter 
		index = icNumber % tableSize; 
		
		return index;
	}
	
	
	
}

