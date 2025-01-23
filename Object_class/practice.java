package Object_class;
import java.util.*;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=helper(n);
        System.out.println(ans);
    }
    public static int helper(int n){
        if(check(n)){
            return n;
        }
        int right=0;
        int left=0;
        for(int i=n-1;i>=100;i--){
            if(check(i)){
                left=i;
                break;
            }
        }
        for(int i=n+1;i<=100000;i++){
            if(check(i)){
                right=i;
                break;
            }
        }
        if (n - left <= right - n) {
            return left;
        } 
        return right;
    }
    public static boolean check(int n){
        String st=String.valueOf(n);

        int l=st.length();
        String temp="";
        temp=temp+st.charAt(0)+st.charAt(l-1);

        int x=Integer.valueOf(temp);
        if(n%x==0){
            return true;
        }
        return false;
    }
}
