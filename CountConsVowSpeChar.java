import java.util.*;
public class CountConsVowSpeChar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String s1 = scan.nextLine();

	    
	    String vowels = "aeiouAEIOU";
	    int vowelCount = 0;
	    int consCount = 0;
	    int specialChar = 0;

	      for(int i = 0; i < s1.length(); i += 1){
	        char currentChar = s1.charAt(i);
	        
	        for(int index = 0; index < vowels.length(); index += 1){
	        	
	        	if(vowels.charAt(index) == (currentChar))
	        	{
	        		vowelCount++;
	            }
	        	else if(Character.isLetter(currentChar) && (vowels.charAt(index) == (currentChar)))
	        	{
	        		consCount++;
	            }
	        	else 
	        	{
	        		specialChar++;
	            }
	        	
	        }
	     }
	     System.out.println("Total number of Consonant present in the string are: " + consCount);
	     System.out.println("Total number of Vowels present in the string are: " + vowelCount);
	     System.out.println("Total number of Special Character present in the string are: " + specialChar);
	}
}
