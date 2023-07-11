//Given a grid of size m * n, let us assume you are starting at (1, 1) and your goal is to reach (m, n). At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).
Now consider if some obstacles are added to the grids. How many unique paths would there be?
An obstacle and empty space are marked as 1 and 0 respectively in the grid.


import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }
        int ans[][]=new int[m][n];
        ans[0][0]=0;
        for(int i=1;i<m;i++){
            if(arr[i-1][0]!=1)
            ans[i][0]=1;
            else
            ans[i][0]=Integer.MAX_VALUE;
        }
        for(int j=1;j<n;j++){
            if(arr[0][j-1]!=1)
            ans[0][j]=1;
            else
            ans[0][j]=Integer.MAX_VALUE;
        }
        
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[i-1][j]!=1 && arr[i][j-1]!=1)
                ans[i][j]=ans[i-1][j]+ans[i][j-1];
                else if(arr[i-1][j]!=1 && arr[i][j-1]==1)
                ans[i][j]=ans[i-1][j];
                else if(arr[i-1][j]==1 && arr[i][j-1]!=1)
                ans[i][j]=ans[i][j-1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
       
    }
}