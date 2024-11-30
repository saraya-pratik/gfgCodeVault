//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String a, String b) {

        int alpha [] = new int [26];
        for(int i=0; i<a.length(); i++){
            alpha[a.charAt(i) - 'a']++; 
        }
        for(int i=0; i<b.length(); i++){
            alpha[b.charAt(i) - 'a']--; 
        }
        for(int i=0; i<26; i++){
            if(alpha[i] != 0){
                return false;
            }
        }
        return true;
    }
}