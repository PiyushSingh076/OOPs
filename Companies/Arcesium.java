package Companies;
import java.util.*;

public class Arcesium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int H=sc.nextInt();

        int high=L-1;
        int low=1;
        int max=0;
        while(low<=high){
            int mid=low+ (high-low)/2;
            if(possible(L,mid,H)){
                low=mid+1;
                max=Math.max(mid,max);
            }else{
                high=mid-1;
            }
        }
        System.out.println(max);
    }
    public static boolean possible(int L,int diff,int H){
        int currl=1;
        int counthouse=1;
        for(int i=2;i<=L;i++){
            if(i-currl>=diff){
                counthouse++;
                currl=i;
                if(counthouse==H){
                    return true;
                }
            }
        }
        return false;
    }
}
