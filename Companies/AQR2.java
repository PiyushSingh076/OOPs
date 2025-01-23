package Companies;
import java.util.*;
public class AQR2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i=n-1;i>=0;i--){
            if(map.containsKey(arr[i])){
                
                ans+=arr[i]*map.get(arr[i]);
                map.remove(arr[i]);
                if(map.containsKey(arr[i]-1)){
                    map.remove(arr[i]-1);
                }
                if(map.containsKey(arr[i]+1)){
                    map.remove(arr[i]+1);
                }
            }
        }
        System.out.println(ans);;
        
    }
}
