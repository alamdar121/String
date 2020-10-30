
public class Main
{
	public static void main(String[] args) {
	    String str="aabbbccccc";
	    str=str.replaceAll("\\s","");
	    int length=0;
	    int arr[]=new int[256];
	    int max=-1;
	    char c=' ';
	    for(char str1:str.toCharArray())
	    {
	        length++;
	    }
	    for(int i=0;i<length-1;i++)
	    {
	        arr[str.charAt(i)]= arr[str.charAt(i)]+1;
	    }
	    for(int i=0;i<length-1;i++)
	    {
	        if(max<arr[str.charAt(i)])
	        {
	            max=arr[str.charAt(i)];
	            c=str.charAt(i);
	        }
	    }
	    System.out.print("Maximum Character: "+c);
	    
	}
}
