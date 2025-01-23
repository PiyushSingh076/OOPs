package Companies;
import java.util.*;
public class gcd_qs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=solution(arr);
        System.out.println(ans[0]+" "+ans[1]);

    }
    public static int[] solution(int[] arr){
        int n=arr.length;
        int[] gcd=new int[n];
        int[] len=new int[n];

        gcd[0]=1;
        len[0]=1;

        for(int i=1;i<n;i++){
            int a=arr[i];
            int b=arr[i-1];
            int tempgcd=gcd(a,b);
            if(tempgcd==gcd[i-1]){
                len[i]=len[i-1]+1;
            }else{
                len[i]=2;
            }
            gcd[i]=tempgcd;
        }

        int maxgcd=0;
        for(int i=0;i<n;i++){
            maxgcd=Math.max(maxgcd,gcd[i]);
        }
        int maxlen=0;
        for(int i=0;i<n;i++){
            if(gcd[i]==maxgcd){
                maxlen=Math.max(maxlen,len[i]);
            }
        }

        int[] ans={maxgcd,maxlen};
        return ans;

    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
