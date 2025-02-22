
package Week4CodingAssignment;
import java.lang.IllegalArgumentException;


public class week4CodingAssignment {
	public static void main(String[] args)
	{
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int[] ages2 = {35, 32, 8, 55, 31, 13, 21, 27, 6};
		
		System.out.println(ninjaTools.firstLastResult(ages));
		System.out.println(ninjaTools.firstLastResult(ages2));
	}
	//I know I want int endElement = array[array.length - 1];
	// and int result = array[0] - endElement;
	// using that I intend to create a method I can reuse with
	//more than one array.
	
	

}
class ninjaTools
{
public static int firstLastResult(int [] array)
	{
		//the following statement is intended to ensure that a non
		//existent element isn't targeted for the calculation
		if(array == null || array.length == 0)
		{
			throw new IllegalArgumentException("Array cannot be empty");
		}
		
		int endElement = array[array.length - 1];
		int result = endElement - array[0];
		
		return result;
	}
}