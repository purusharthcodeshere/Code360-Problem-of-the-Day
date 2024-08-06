import java.util.* ;
import java.io.*; 

public class Solution {

    public static String reArrangeString(String s) {
        // Write your code here.
        //Step 1: Count frequency of each character
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        //Step 2: Check if the rearrangement is possible or not
        int maxCount = 0;

        for (int i : charCount) {
            maxCount = Math.max(maxCount, i);
        }

        if (maxCount > (s.length() + 1) / 2) {
            return "not possible";
        }

        //Step 3: Use a max-heap to get 
        //the most frequent character first 
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (charCount[i] > 0) {
                maxHeap.offer(new int[]{i, charCount[i]});
            }
        }

        //Step 4: Reconstruct the string
        StringBuilder result = new StringBuilder();
        int[] prev = new int[]{-1, 0}; 
        //store previous character and its count

        while (!maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            result.append((char) (current[0] + 'a'));
            current[1]--;

            if (prev[1] > 0) {
                maxHeap.offer(prev);
            }

            prev = current;
        }

        return result.toString();
    }
}
