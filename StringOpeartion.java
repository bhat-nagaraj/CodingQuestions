// Input string =abcaba, output is abcaabbaaa, here multiplied the character in terms of occurence

public class Main
{
	public static void main(String[] args) {
	    String s="abcaba";
	    String res="";
	    
	    res=res+s.charAt(0);
	    for(int i=1;i<s.length();i++)
	    {
	        int count=1;
	        for(int j=0;j<i;j++)
	        {
	            if(s.charAt(i)==s.charAt(j))
	            {
	                count++;
	            }
	            
	        }
	        for(int k=0;k<count;k++)
	        {
	                res+=s.charAt(i);
	        }
	        
	    }
	    System.out.println(res);
		
	}
}
