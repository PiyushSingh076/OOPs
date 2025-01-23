package Companies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
    static int ans = Integer.MIN_VALUE;
    static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solve(arr, new int[4], 0, 0);
        System.out.println(ans);
    }
    
    public static void solve(int[] arr, int[] sum, int idx, int sumIdx) {
        if (idx == arr.length) {
            ans = Math.max(sum[0] + sum[2] - sum[1] - sum[3], ans);
            return;
        }

        String key = idx + ":" + sum[0] + "," + sum[1] + "," + sum[2] + "," + sum[3];
        if (memo.containsKey(key)) {
            ans = Math.max(memo.get(key), ans);
            return;
        }

        // First, try adding arr[idx] to sum[sumIdx]
        sum[sumIdx] += arr[idx];
        solve(arr, sum, idx + 1, sumIdx);
        sum[sumIdx] -= arr[idx];

        // Then, if possible, try adding arr[idx] to the next sum index
        if (sumIdx < 3) {
            sum[sumIdx + 1] += arr[idx];
            solve(arr, sum, idx + 1, sumIdx + 1);
            sum[sumIdx + 1] -= arr[idx]; // backtrack
        }

        memo.put(key, ans);
    }
}
