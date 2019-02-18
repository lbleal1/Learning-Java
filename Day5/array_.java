public class array_{
	public static void main(String[] args){
		//first way 
		//appropriate usage: if the elements are not predetermined
		String[] greet = new String[3]; //specify allocated memory using type

		//you put in the memory
		greet[0] = "Hi!"; 
		greet[1] = "Hello!";
		greet[2] = "Kamusta?";

		//second way
			
		String[] fruits = { "banana", "apple", "mango" }; //specify allocated memory but predetermined
	
		for(String for_print: fruits){
			System.out.println(for_print);
		}	
	} 
}

/*
String is not a primitive type unlike int. 
It's a class.
int: int number;	 
str: String[] numbers = new String[3];
soo String[] numbers is actually ambiguous because since it's a class, the computer doesn't know how much memory you want to allocate for it. So, you need to specify the memory allocations. 
On the other hand, int is a primitive so the computer already knows how much memory it needed to allocate
*/
