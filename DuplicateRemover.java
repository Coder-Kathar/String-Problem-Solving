import java.io.*;
import java.util.*;
public class DuplicateRemover
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String rev = DupRemover(a.toLowerCase());
		System.out.println(rev);		
	}
	public static String DupRemover(String a)
	{
		boolean[] seen = new boolean[256]; 
		String result = "";
		for(int i=0; i<a.length(); i++)
		{
			char c = a.charAt(i);
			if(!seen[c])
			{
				result += c;
				seen[c]	= true;	
			}
		}
		return result;	
	}
}