package Companies;
import java.util.*;
public class stable_segments {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=helper(arr);
        System.out.println(ans);
    }
    public static int helper(int[] arr){
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] pfxsum=new int[n];
        pfxsum[0]=arr[0];
        map.put(pfxsum[0],0);
        int count=0;
        for(int i=1;i<n;i++){
            pfxsum[i]=pfxsum[i-1]+arr[i];
            map.put(pfxsum[i],i);
            if(map.containsKey(pfxsum[i]-arr[i]-arr[i])){
                if(arr[map.get(pfxsum[i]-arr[i]-arr[i])]==arr[i]){
                    count++;
                }
            }
        }
        return count;    

    }
}
