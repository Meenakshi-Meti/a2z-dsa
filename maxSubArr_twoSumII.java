Question : Maximum subarray
Brute Force : 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            int sum =0;

            for(int j =i;j<nums.length;j++){
                sum+=nums[j];
                maxSum =Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}


Optimal : 
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            int sum =0;

            for(int j =i;j<nums.length;j++){
                sum+=nums[j];
                maxSum =Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}

Question 2 : Two Sum II - Input Array is Sorted 

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            int sum =0;

            for(int j =i;j<nums.length;j++){
                sum+=nums[j];
                maxSum =Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
}


