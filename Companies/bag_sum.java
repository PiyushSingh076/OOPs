package Companies;
import java.util.*;

public class bag_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int bags=sc.nextInt();
        boolean ans=solve(arr,bags,new int[bags],0);
        System.out.println(ans);
    }
    public static boolean solve(int[] arr,int bags,int[] ba,int idx){
        if(idx>=arr.length){
            return true;
        }


        for(int i=0;i<bags;i++){
            if(ba[i]+arr[idx]<=10){
                ba[i]+=arr[idx];
                if(solve(arr,bags,ba,idx+1)){
                    return true;
                }
                ba[i]-=arr[idx];
            }  
        }
        return false;
    } 
}
