package Companies;
import java.util.*;
public class nvidia2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int n=s.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<n;i++){
            sb.replace(arr[i]-1,arr[i],"*");
            String temp=sb.toString();
            if(!temp.contains(t)){
                System.out.println(i+1);
                break;
                
            }
        }
        System.out.println(0);
    }
}
