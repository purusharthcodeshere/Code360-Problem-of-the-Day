# Maximum Subarray Sum
## Moderate Problem Statement  

Given an array of numbers, find the maximum sum of any contiguous subarray of the array.  
For example, given the array `[34, -50, 42, 14, -5, 86]`, the maximum sum would be `137`, since we would take elements `42, 14, -5, and 86`.

Given the array `[-5, -1, -8, -9]`, the maximum sum would be `-1.`

**Follow up:** Do this in `O(N)` time.

### Detailed explanation ( Input/output format, Notes, Images )
#### Constraints:  
- 1 <= N <= 10^6  
- 1 <= K <= N
- **Time limit:** 1 sec
 
#### Sample Input 1:
4 1  
1 2 3 4  
#### Sample Output 1:
4
#### Sample Input 2:
6 2  
2 7 3 6 7 7 
#### Sample Output 2:
14  
#### Explanation for Sample Output 2:  
There are 5 subarrays of size 2 in this array. They are `{2, 7}, {7, 3}, {3, 6}, {6, 7}, {7, 7}`.  
Since the subarray `{7, 7}` has the maximum sum among all the subarrays, the output will be `7 + 7 = 14`
