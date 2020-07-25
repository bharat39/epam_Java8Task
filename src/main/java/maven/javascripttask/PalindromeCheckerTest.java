package maven.javascripttask;
import java.util.*;
import java.util.function.Function;
import java.io.*;

public class PalindromeCheckerTest {
	public static void main(String args[]) throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	     List<String> palindromes=new ArrayList<String>();
		System.out.println("Enter size of list : ");
        int size2 = Integer.parseInt(reader.readLine());
        System.out.println("Enter elements : ");
        for(int i=0;i<size2;i++)
        {
        	palindromes.add(reader.readLine());
        }
        
	
	Function<List,String> p=Palin::palinCheck;
	System.out.println(p.apply(palindromes));
	}
}	
 
class Palin
{
	
	static String palinCheck(List<String> palindromes)
	{
		int count;
		String s="";
		for(String i:palindromes)
		{
			count=0;
			for(int j=0;j<i.length()/2;j++)
			{
				if(i.charAt(j)==i.charAt(i.length()-1-j))count++;
			}
			if(count==i.length()/2)s=s+i+" ";
		}
		return s;
	}
}


