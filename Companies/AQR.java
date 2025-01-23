package Companies;
import java.util.*;
public class AQR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        int[][] query=new int[q][2];
        for(int i=0;i<q;i++){
            query[i][0]=sc.nextInt();
            query[i][1]=sc.nextInt(); 
        }

        for(int i=0;i<q;i++){
            int ans=solution(i,query,arr);
            System.out.println(ans);
        }  
    }
    public static int solution(int idx,int[][] query,int[] arr){
        int l=query[idx][1]-query[idx][0]+1;
        int[] maxarr=new int[l];
        int[] minarr=new int[l];

        int max=0;
        
        for(int i=query[idx][0];i<=query[idx][1];i++){
            maxarr[i-query[idx][0]]=Math.max(arr[i],max);
            max=Math.max(arr[i],max);
        }

        int min=Integer.MAX_VALUE;
        for(int i=query[idx][1];i>=query[idx][0];i--){
            minarr[i-query[idx][0]]=Math.min(arr[i],min);
            min=Math.min(arr[i],min);
        }

        int ans=0;
        for(int i=0;i<l;i++){
            ans=Math.max(ans,maxarr[i]-minarr[i]);
        }
        return ans;
    }
}
