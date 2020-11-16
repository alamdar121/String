import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
    public static boolean anagram(String str1, String str2)
    {
        int n1=str1.length();
        int n2=str2.length();
        char str3[]=str1.toCharArray(); 
        char str4[]=str2.toCharArray(); 
        int temp;
        if(n1!=n2)
        {
            return false;
        }
        Arrays.sort(str3);
        Arrays.sort(str4);
        for(int i=0;i<n1;i++)
        {
            if(str3[i]!=str4[i])
            {
                return false;
            }
        }
        return true;
        
    }
	public static void main(String[] args) {
		String str1="Hellbo";
		String str2="olleH";
		if(anagram(str1,str2))
		    System.out.println("anagram");
		else
		    System.out.println("not anagram");
		   
	}
}
