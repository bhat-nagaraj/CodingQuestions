//Given an array arr[] where each element represents the max number of steps that can be made forward from that 
index. The task is to find the minimum number of jumps to reach the end of the array starting from index 0. 
If the end isn’t reachable, return -1.


import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans[]=new int[n];
        
        ans[0]=0;
        for(int i=1;i<n;i++)
        {
            ans[i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i<=arr[j]+j)
                {
                    ans[i]=Math.min(ans[i],ans[j]+1);
                }
            }
        }
        System.out.println(ans[n-1]);
       
    }
}