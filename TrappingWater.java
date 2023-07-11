//Given an array of N non-negative integers arr[] representing an elevation map where the width of each bar is 1, 
compute how much water it is able to trap after raining.



import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        int res=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            int lm=arr[i];
            for(int j=0;j<i;j++)
            {
                lm=Math.max(lm,arr[j]);
            }
            int rm=arr[i];
            for(int j=i+1;j<n;j++)
            {
                rm=Math.max(rm,arr[j]);
            }
            res+=(Math.abs(Math.min(lm,rm)-arr[i]));
        }
     System.out.println(res);   
    }
}