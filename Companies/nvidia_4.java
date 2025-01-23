package Companies;
import java.util.*;
public class nvidia_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(check(arr[i])){
                count++;
            }
        }
        System.out.println(count);

    }
    public static boolean check(int x){
        int count=0;
        for(int i=0;i<8;i++){
            int mask= (1 << i);
            if((x & mask)!=0){
                count++;
            }
        }
        if(count==4)
        return true;

        return false;
    }
}
