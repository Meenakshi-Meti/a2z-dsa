Question 1 :Sqrt(x)
class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return 0;
        }
      int left =0;
      int right = x/2;
      int ans =0;

      while(left<=right){
        int mid = left +(right-left)/2;

        if((long)mid*mid==x){
            return mid;
        }
        else if((long)mid*mid<x){
            ans =mid;
            left=mid+1;
        }
        else {
            right =mid-1;
        }
      }
       return ans ;
    }
}

Question 2 : Search In Rotated Search Array II
class Solution {
  static boolean search(int[]nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }

            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                start ++;
                end --;
                continue;
            }
            if(nums[mid] >= nums[start]){
                if(nums[mid] > target && nums[start] <= target){
                    end = mid-1;
                }else start = mid+1;
            } else{
                if(nums[mid] < target && nums[end] >= target){
                    start = mid+1;
                }else end = mid-1;
            }
        }
        return false;
        }
    }
