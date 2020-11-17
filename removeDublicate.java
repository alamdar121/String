
public class Main
{
	public static void main(String[] args) {  
        String str = "Programming";  
        char ch[]=str.toCharArray();
        StringBuilder str2= new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            boolean rep=false;
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    rep=true;
                    break;
                }
            }
            if(!rep)
            {
                str2.append(ch[i]);
            }
        }
        System.out.print(str2);
	}
}
