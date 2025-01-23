package Companies;
import java.util.*;

public class google {
    public static class Pair{
        int length;
        List<Integer> list;
        Pair(int length,List<Integer> list){
            this.length=length;
            this.list=list;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        TreeMap<Integer,Integer> map =new TreeMap<>();
        
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int x=sc.nextInt();
          
            for(int j=l;j<=r;j++){
                map.put(j,map.getOrDefault(j,0)+x);
            }
        }
        int i=0;
        int[] nums=new int[map.keySet().size()];
        for(int key:map.keySet()){
            nums[i]=map.get(key);
            i++;
        }

        Pair[] dp=new Pair[nums.length];
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        dp[0]=new Pair(1, list);

        int maxlen=0;
        List<Integer> ans=new ArrayList<>();

        for(int a=1;a<nums.length;a++){
            dp[a]=new Pair(1,new ArrayList<>());
            for(int j=a-1;j>=0;j--){
                int length=dp[j].length;
                int last=dp[j].list.get(dp[j].list.size()-1);
                List<Integer> newlist=new ArrayList<>();
                if(nums[a]-last==length*k &&length>=dp[a].length){
                    dp[a].length+=length;
                    dp[a].list=dp[j].list;
                    
                }
                
            }
            dp[a].list.add(nums[a]);
            if(dp[a].length>maxlen){
                maxlen=dp[a].length;
                ans=dp[a].list;
            }else if(dp[a].length==maxlen){
                if(dp[a].list.get(0)<ans.get(0)){
                    ans=dp[a].list;
                }
            }
        }
        System.out.print(maxlen+" ");
        for(int v:list){
            System.out.print(v+" ");
        }
    }  

    public void helper(int[] arr,int target){

        int[][] dp=new int[arr.length+1][target+1]; // the matrix so formed
        for(int i=0;i<arr.length+1;i++){
            dp[i][0]=1; 
        }
        int count=0;
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<target+1;j++){
                if(dp[i-1][j]==1|| dp[i-1][arr[i-1]-j]==1){
                    //dp[i-1][j]==1 means if target can be formed without selecting 
                    //current element second condition means if u select then 
                    //target - selected value must also be achievable
                    //see matrix
                    dp[i][j]=1;
                    count++;
                }
            }
        }
    }
}
