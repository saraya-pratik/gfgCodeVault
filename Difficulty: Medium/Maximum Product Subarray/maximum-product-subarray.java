//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to find maximum product subarray
     long maxProduct(int[] arr) {
        // code here
        int n = arr.length;
        long sum=1;
        long max=arr[0];
        for(int i=0;i<n;i++){
            sum*=arr[i];
            max=Math.max(sum,max);
            if(arr[i]==0)sum=1;
        }
        sum=1;
        for(int i=n-1;i>=0;i--){
            sum*=arr[i];
            max=Math.max(sum,max);
            if(arr[i]==0)sum=1;
        }
        return max;
    }
}