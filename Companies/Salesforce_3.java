package Companies;
import java.util.*;

public class Salesforce_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(helper(s));
    }
    public static int helper(String s){


        Map<Character,Integer> map=new HashMap<>();
        char[] arr=s.toCharArray();
        map.put('A',1);
        map.put('B',10);
        map.put('C',100);
        map.put('D',1000);
        map.put('E',10000);

        char max='A';
        int maxidx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                maxidx=i;
            }
        }
        char max2='A';
        int idx2=0;
        for(int i=0;i<=maxidx-1;i++){
            if(arr[i]>max2){
                max2=arr[i];
                idx2=i;
            }
        }

        arr[idx2]='E';
        char maxlast='A';
        int ans=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=maxlast){
                ans+=map.get(arr[i]);
                maxlast=arr[i];
            }else{
                ans-=map.get(arr[i]);
            }
        }
        return ans;
    }
}
