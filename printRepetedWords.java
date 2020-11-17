/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
	public static void main(String[] args) {  
        String str = "i am i am am";  
        int count;
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++)
        {
            count=1;
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    
                }
            }
            if(count>1 && words[i]!="0")
            {
                System.out.print(words[i] +" , ");
            }
        }
       
       
        
            
        
	}
}
