import java.util.*;
public class CheckPangram {
	
	static int size = 26;  
	
	static boolean isLetter(char ch)  
	{  
		if (!Character.isLetter(ch))  
			
			return false;  
	
	    return true;  
	}  
	
	static boolean containsAllLetters(String s1, int len)  
	{
		s1 = s1.toLowerCase();  
		
		boolean[] present = new boolean[size];  
		
		for (int i = 0; i < len; i++)   
	    {  
			if (isLetter(s1.charAt(i)))   
	        {  
				int letter = s1.charAt(i) - 'a';  
				present[letter] = true;  
	        }  
	    }  
		
		for (int i = 0; i < size; i++)  
		{  
			if (!present[i])  
				
				return false;  
	    }  
		return true;  
	}  
	
	public static void main(String args[])  
	{  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		
		int len = s1.length();  
	 
	    if (containsAllLetters(s1, len))
	    {
	    	System.out.println("The given string is a pangram string.");  
	    }
	    
	    else  
	    {	
	    	System.out.println("The given string is not a pangram string.");  
	    }
	} 

}
