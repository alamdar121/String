
public class Main
{
	public static void main(String[] args) {
	    String str="Today is h lhk     ddd Mondoay";
	    int sum=1;
	    int i=0;
	    for(char arr: str.toCharArray())
	    {
	        if(str.charAt(i)==' ' && str.charAt(i-1)!=' ')
	        {
	            sum++;
	        }
	        i++;
	    }
	    System.out.print(sum);
	    
	    
	}
}
