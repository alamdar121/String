
public class Main
{
	public static void main(String[] args) {
	    String str="mam";
	    String rev="";
	    for(int i=str.length()-1;i>=0;i--)
	    {
	        rev+=str.charAt(i);
	    }
	    if(str.equals(rev))
	    {
	        System.out.print("Palindrome");
	    }
	    else
	    {
	        System.out.print("Not Palindrome");
	    }
	    
	    
	}
}
