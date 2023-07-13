// Minimum and maximum occuring character in a string 

import java.lang.Math.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String a="hey hellohhho";
	    int mn=Integer.MAX_VALUE;
	    int mx=Integer.MIN_VALUE;
	    HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
	    for(int i=0;i<a.length();i++)
	    {
	        char c=a.charAt(i);
	        if(hmap.containsKey(c) && c!=' ')
	        {
	            int value=hmap.get(c)+1;
	            hmap.put(c,value);
	        }
	        else
	        {
	            hmap.put(c,1);
	        }
	    }
	    for(Map.Entry<Character,Integer> ele:hmap.entrySet())
	    {
	        if(ele.getValue()<mn)
	        mn=ele.getValue();
	        if(ele.getValue()>mx)
	        mx=ele.getValue();
	    }
	    for(Map.Entry<Character,Integer> len:hmap.entrySet())
	    {
	        if(len.getValue()==mn)
	        {
	            System.out.println("min is"+len.getKey());
	        }
	        if(len.getValue()==mx)
	        {
	            System.out.println("max is"+len.getKey());
	        }
	    }
	    
	}
}
