package Companies;
import java.util.*;

public class Donut_deshaw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int donut=sc.nextInt();
        
        String s=sc.next();

        int[] one=new int[donut+1];
        int[] two=new int[donut+1];

        one[0]=1;
        two[0]=1;
        one[1]=0;
        two[1]=0;

        for(int i=2;i<donut+1;i++){
            if(one[i-1]==0&&two[i-1]==0){
                one[i]=1;
            }

            if(one[i-2]==0 && two[i-2]==0){
                two[i]=1;
            }
        }

        if(one[donut]==1 ||two[donut]==1){
            System.out.println(s+" "+ "wins");
        }
        else{
            System.out.println(s+" "+ "lost");
        }
    }


}
