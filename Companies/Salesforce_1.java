package Companies;
import java.util.*;
public class Salesforce_1 {
    static int max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
        }
        
        solve(words,"",new int[n]);
        System.out.println(max);

    }

    public static void solve(String[] words,String temp,int[] visited){
        if(isPalindrome(temp)){
            max=Math.max(temp.length(),max);
        }

        for(int i=0;i<words.length;i++){
            if(visited[i]==1){
                continue;
            }
            temp+=words[i];
            visited[i]=1;
            solve(words,temp,visited);
            temp=temp.substring(0,temp.length()-words[i].length());
            visited[i]=0;
        }
    }
    public static boolean isPalindrome(String s){

        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
