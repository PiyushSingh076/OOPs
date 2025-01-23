package Companies;
import java.util.*;

public class nvidia3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            pq.add(arr[i]);
        }

        while(pq.size()>1){
            int stone1=pq.remove();
            int stone2=pq.remove();
            int diff=Math.abs(stone1-stone2);
            if(diff>0){
                pq.add(diff);
                
            }
        }
        if(pq.isEmpty()){
            System.out.println(0);
        }
        else{
            System.out.println(pq.remove());
        }
    }
}
