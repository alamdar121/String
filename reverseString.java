
public class Main
{
	public static void main(String[] args) {
	    String str="mam";
	    String rev="";
	    for(int i=str.length()-1;i>=0;i--)
	    {
	        rev+=str.charAt(i);
	    }
	    System.out.print(rev);    
	}
}
