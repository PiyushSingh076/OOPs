import java.util.*;
public class BNY {
    static int max=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] from=new int[n-1];
        int[] to=new int[n-1];
        for(int i=0;i<n-1;i++){
            from[i]=sc.nextInt();
            to[i]=sc.nextInt();
        }

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++){
            adj.get(from[i]).add(to[i]);
            adj.get(to[i]).add(from[i]);
        }

        for(int i=1;i<=n;i++){
            int[] visited=new int[n+1];
            visited[i]=1;
            dfs(adj,visited,i,0);
        }
        System.out.println(max);

    }
    
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int[] visited,int idx,int length){

        max=Math.max(length,max);
        for(int i=0;i<adj.get(idx).size();i++){
            if(visited[adj.get(idx).get(i)]==0){
                visited[adj.get(idx).get(i)]=1;
                dfs(adj,visited,adj.get(idx).get(i),length+1);
            }
        }
    }
}
