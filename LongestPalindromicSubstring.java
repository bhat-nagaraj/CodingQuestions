//Longest palindromic substring

public class Main{
    public static void main(String[] args){
        String a="babad";
       
        System.out.println(func(a));
    }
    public static String func(String s) {
       
         int m=s.length();
        boolean dp[][]=new boolean[m][m];
        int maxLen=0;
        String longest="";
        for(int k=0;k<m;k++){
            for(int i=0;i<m-k;i++){
                int j=i+k;
                if(s.charAt(i)==s.charAt(j) && (j-i<2 || dp[i+1][j-1])){
                    dp[i][j]=true;
                    if((j-i+1)> maxLen){
                        maxLen=j-i+1;
                        longest=s.substring(i,j+1);
                    }
                        
        }
        }
        }
        return longest;
        
    }
}