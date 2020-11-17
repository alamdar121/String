/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
	public static void main(String[] args) {  
        
        int n=5432;
        int rem,rev=0;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.print(rev);
       
       
        
            
        
	}
}
