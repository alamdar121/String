
public class Main
{
    public static boolean val(String str)
    {
         char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(!(ch[i]>=65 && ch[i]<=90) && !(ch[i]>=97 && ch[i]<=122)&& !(ch[i]>=48 && ch[i]<=57))
            {
               return false;
            }
            
            
        }
        return true;
    }
	public static void main(String[] args) {  
        String str = "HE!@LLO";  
       if(val(str))
       {
           System.out.print("validate");
       }
       else
       {
           System.out.print("not validate");
       }
       
        
            
        
	}
}
