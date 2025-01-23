package Companies;

import java.util.*;
public class subsequences_sor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int count=1;
            int prev=arr[0];
            for(int i=1;i<n;i++){
                if(arr[i]-prev>=mid){
                    count++;
                    prev=arr[i];
                }
                if(count==k){
                    break;
                }
                
            }
            if(count==k){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        System.out.println(ans);

    }
}
