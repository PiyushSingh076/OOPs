package Companies;
import java.util.*;
public class nvidia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans=solution(arr);
        System.out.println(ans);
    }
    public static int solution(int[] arr){
        List<Integer> list=new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }
        int sum=0;

        while(list.size()!=0){
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0;i<list.size();i++){
                if(list.get(i)<min){
                    min=list.get(i);
                    idx=i;
                }
            }
            sum+=min;
            if(idx+1<list.size()){
                list.remove(idx+1);
            }
            list.remove(idx);
            if(idx-1>=0){
                list.remove(idx-1);
            }
        }
        return sum;
    }
}
