package Companies;
import java.util.*;
class pair{
    int v;
    int wt;
    pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
}
class Edges{
    int dest;
    int wt;
    Edges(int dest,int wt){
        this.dest=dest;
        this.wt=wt;
    }
}
public class Ansafi_island {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int repeat=sc.nextInt();

        int[][] graph=new int[n-1][3];
        for(int i=0;i<n-1;i++){
            graph[i][0]=sc.nextInt();
            graph[i][1]=sc.nextInt();
            graph[i][2]=sc.nextInt();
        }
        ArrayList<ArrayList<Edges>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        } 
        for(int[] a:graph){
            adj.get(a[0]).add(new Edges(a[1],a[2]));
            adj.get(a[1]).add(new Edges(a[0],a[2]));
        }
        int max=0;
        for(int i=1;i<=n;i++){
            max=Math.max(max,bfs(adj,i));
        }
        System.out.println(max*repeat);
    }
    public static int bfs(ArrayList<ArrayList<Edges>> adj,int start){
        int n=adj.size();
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)->y.wt-x.wt);
        int[] visited=new int[n+1];
        int[] dist=new int[n+1];
        Arrays.fill(dist,0);

        int max=0;
        pq.add(new pair(start,0));
        visited[start]=1;

        while(!pq.isEmpty()){
            pair p=pq.remove();
            int wt=p.wt;
            int v=p.v;
            for(Edges e:adj.get(v)){
                int vtc=e.dest;
                int collect=e.wt;
                if(visited[vtc]==0&&dist[v]+collect>dist[vtc]){
                    visited[vtc]=1;
                    dist[vtc]=dist[v]+collect;
                    max=Math.max(dist[vtc],max);
                    pq.add(new pair(vtc,dist[vtc]));
                }
            }
        }
        return max;

    }
}
