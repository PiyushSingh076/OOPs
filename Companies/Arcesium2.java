package Companies;
import java.util.*;

public class Arcesium2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int n=s.length();//6
        int m=t.length(); //4
        if(n<m){
            System.out.println("False");
        }
        int[][] dp=new int[m+1][n+1];
        dp[0][0]=1;
        dp[0][2]=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char ch1=s.charAt(j-1);
                char ch2=t.charAt(i-1);

                if(j>=i){
                    if(ch1==ch2){
                        dp[i][j]=dp[i-1][j-1];
                    }
                    else{
                        if(j-2>=0){
                            dp[i][j]=dp[i][j-2];
                        }
                    }
                }
            }

        }
        
        System.out.println(dp[m][n]);
    }
}
