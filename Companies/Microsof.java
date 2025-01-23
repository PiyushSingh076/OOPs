package Companies;
import java.util.*;
public class Microsof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        char[] row1=s1.toCharArray();
        char[] row2=s2.toCharArray();
         
        int ans=helper(row1,row2);
        System.out.println(ans);
    }
    public static int helper(char[] row1,char[] row2){
        int qsmark1=0;
        int qsmark2=0;
        int w1=0;
        int w2=0;
        int r1=0;
        int r2=0;
        for(int i=0;i<row1.length;i++){
            if(row1[i]=='W'){
                w1++;
            }else if(row1[i]=='R'){
                r1++;
            }else{
                qsmark1++;
            }
        }
        for(int i=0;i<row1.length;i++){
            if(row2[i]=='W'){
                w2++;
            }else if(row2[i]=='R'){
                r2++;
            }else{
                qsmark2++;
            }
        }

        int maxw=Math.max(w1,w2);
        int maxr=Math.max(r1,r2);

        int max=Math.max(maxw,maxr);
        int req1=max-w1+max-r1;
        int req2=max-w2+max-r2;
        if(qsmark1>=req1&&qsmark2>=req2){
            return req1+req2;
        }
        return -1;
    }
}
