//Find the Index of the First Occurrence in a String

public class Main{
    public static void main(String[] args){
        String a="sbutsad";
        String b="sad";
        System.out.println(func(a,b));
    }
    public static int func(String haystack, String needle) {
       
        int m=haystack.length();
        int n=needle.length();
        int i=0;
        int j=0;
        int res=0;

process:    while(i<m)
            {
pro:         while(j<n)
             {
                if(haystack.charAt(i)==needle.charAt(j) && j==n-1)
                {
                    res=i;
                    return res-n+1;
                }
                else if(haystack.charAt(i)==needle.charAt(j) && j!=n-1)
                {
                    res=i;
                    i++;
                    j++;
                    continue process;
                }
                else if(haystack.charAt(i)!=needle.charAt(j))
                {
                    
                    i=i-j+1;
                    j=0;
                    continue process;
                }
            }
        }
        return -1;
        
    }
}