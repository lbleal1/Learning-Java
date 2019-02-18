/*
first_array is an int array
we want to iterate 3 integers stored in an array
*/

public class first_array {
	public static void main(String[] args){
		/*ways of declaring an array
		*/

		int[] nums = new int[3]; 
		/*	first one:
			we want an int array so: int[] 
			we want a way to access the array, we give it a name: nums
			<what's "new"> 
			new int[3] allocates to memory 3 ints in the form of array [96 bits]	 			
		*/

		int[] numbers = {5,6,7};
		
		//note there are no such things as int[2] because 
		// it speaks of a data type! specifically--int array!!!

		/*accessing element for assigning to each element/ updating an element in the int array*/
		nums[0] = 43;
		nums[1] = 65;
		nums[2] = 87; 
		//nums[3] = 109; <--would give an exception: out of bounds
								//"this doesn't exist!"
								// abstractly, but hardware it does
								//but that's dangerous! you might 
								//access other data that shouldn't be

		/*accessing element for computations of display*/
		//for display/printing
		for(int i=0; i<3; i++){
			System.out.println(nums[i]);
		}
		
	}
}



/*accessing can further be specified into:
	1. assigning value to an element
	2. updating the value of an element
	3. using it for computations
	4. using it for display
*/
