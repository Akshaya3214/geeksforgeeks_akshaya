//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            List<Integer> result = new Solution().leaders(arr);

            // Printing the result in the required format
            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (int i = 0; i < result.size(); i++) {
                    if (i != 0) System.out.print(" ");
                    System.out.print(result.get(i));
                }
                System.out.println();    // Ensure new line after each test case output
                System.out.println("~"); // Ensure new line after each test case output
            }
        }
    }
}

// } Driver Code Ends


class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int max_right=0;
        ArrayList<Integer> leaders = new ArrayList<>();

        if (n == 0) return leaders;
        
        max_right = arr[n-1];
        leaders.add(max_right);
        
        for(int i=n-2; i>=0; i--){
            if(arr[i] >= max_right){
                max_right=arr[i];
                leaders.add(max_right);
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=leaders.size()-1; i>=0; i--){
            result.add(leaders.get(i));
        }
        return result;
        
        
    }
}
