

public class Main
{
	public static void main(String[] args) {  
        String str = "heiiiooooooo";  
        char ch[]=str.toCharArray();
        String dub="";
        for(int i=0;i<str.length();i++)
        {
            boolean rep=false;
            for(int j=i+1;j<str.length();j++)
            {
                if(ch[i]==ch[j])
                {
                    dub=dub+ch[i];
                    break;
                }
            }
            
        }
        System.out.print(dub);
	}
}
