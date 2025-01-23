package Companies;
import java.util.*;
public class Salesforce_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(helper(s));
    }
    public static long helper(String s){

            // ensure the input constraints are satisfied
            assert 5 <= s.length() && s.length() <= Math.pow(10, 5);
            for (char x : s.toCharArray()) {
                assert x == '0' || x == '1';
            }
    
            // initialize variables
            int n = s.length();
            int[] pre_cnt = new int[4];
            int[] suf_cnt = new int[4];
            int[] cnt = new int[2];
            int[] cnt_so_far = new int[2];
            int mod = (int) (1e9 + 7);
            long ans = 0;
    
            int[] transformed = new int[n];
            for (int j = 0; j < n; j++) {
                transformed[j] = s.charAt(j) == '0' ? 0 : 1;
            }
    
            for (int j = 0; j < n; j++) {
                suf_cnt[transformed[j]] += cnt[0];
                suf_cnt[2 + transformed[j]] += cnt[1];
                cnt[transformed[j]]++;
            }
    
            for (int j = 0; j < n; j++) {
                cnt[transformed[j]]--;
                suf_cnt[2 * transformed[j]] -= cnt[0];
                suf_cnt[2 * transformed[j] + 1] -= cnt[1];
    
                ans += (long) pre_cnt[0] * suf_cnt[0]; // "00" and "00"
                ans += (long) pre_cnt[1] * suf_cnt[2]; // "01" and "10"
                ans += (long) pre_cnt[2] * suf_cnt[1]; // "10" and "01"
                ans += (long) pre_cnt[3] * suf_cnt[3]; // "11" and "11"
                ans %= mod;
    
                pre_cnt[transformed[j]] += cnt_so_far[0];
                pre_cnt[2 + transformed[j]] += cnt_so_far[1];
                cnt_so_far[transformed[j]]++;
            }
    
            return ans;
        }
}
