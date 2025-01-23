package Companies;
import java.util.*;
public class Chitti {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();

        int str=sc.nextInt();
        int stc=sc.nextInt();
        str=str-1;
        stc=stc-1;

        int chittir=sc.nextInt();
        int chittic=sc.nextInt();

        chittir-=1;
        chittic-=1;

        int[][] visited=new int[R][C];
        visited[str][stc]=1;

        while(true){
            if(str==chittir&&stc==chittic){
                if(stc+1<C&&visited[str][stc+1]==0){
                    System.out.println("Right");
                    break;
                }else if(stc-1>=0 && visited[str][stc-1]==0){
                    System.out.println("Left");
                    break;
                }else if(str-1>=0 && visited[str-1][stc]==0){
                    System.out.println("Front");
                    break;
                }else if(str+1<R && visited[str+1][stc]==0){
                    System.out.println("Back");
                    break;
                }else{
                    System.out.println("Over");
                    break;
                }
            }
            if(stc+1<C&&visited[str][stc+1]==0){
                stc=stc+1;
                
            }else if(stc-1>=0 && visited[str][stc-1]==0){
                stc=stc-1;
            }else if(str-1>=0 && visited[str-1][stc]==0){
                str=str-1;
            }else if(str+1<R && visited[str+1][stc]==0){
                str=str+1;
            }
            visited[str][stc]=1;
        }
    }
}
