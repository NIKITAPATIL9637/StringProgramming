import java.util.*;
public class MaximumChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String s1 = scan.nextLine();
		
        int n = s1.length();
		
		for(int i=0; i<s1.length()-1; i++)
		{
			for(int j=i+1; j<s1.length(); j++)
			{
				if(s1.charAt(i) == s1.charAt(j))
				{
					System.out.println("Maximum number of charater in the string are " + s1.charAt(j) + " at index: " + i + j);
					break;
				}
			}
		}  
	}

}
