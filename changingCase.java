/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {  
        String str = "HELLO";  
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
                ch[i]+=32;
            }
            else
            if( ch[i]>=97 && ch[i]<=122)
            {
                ch[i]-=32;
            }
        }
        System.out.print(ch);
	}
}
