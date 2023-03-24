package comments;

// Basic Program with main with frequently used Comment tags or Documentation comments.

/**
 * <h1> Program to find average of three numbers!</h1>
 * 
 * @author author name
 *
 */

public class FindAvg {
	
	/**
	 * This method is used to find the average of three numbers.
	 * @param numX This is the first parameter
	 * @param numY This is the second parameter
	 * @param numZ This is the third parameter
	 * @return int This returns the average of numX, numY, numZ.
	 */
	
	public int findAvg(int numX, int numY, int numZ) {
		return (numX + numY + numZ)/3;
	}
	
	/**
	 * This is the main method which makes use of findAvg method
	 * @param args Unused.
	 * @return Nothing.
	 */
 
	public static void main(String[] args) {
		FindAvg obj = new FindAvg();
		int avg = obj.findAvg(30, 60, 90);
		
		System.out.println("Average of 30, 60, and 90 is : " + avg);

	}

}
