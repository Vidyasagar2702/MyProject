package Practice.practice;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        
    	
    	String str1 = "madam";
		String []str = str1.split(str1);
    	StringBuilder str2=null;
    	int count =str.length;
    	for(int i=count-1;i>=0;i--)
    	{
    		System.out.println(str[i]);
    	}
    	//System.out.println(str2);
        if (str1.equals(str2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palidrome");
        }
     

        
    }
}
