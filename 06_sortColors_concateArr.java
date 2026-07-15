Question 1 : Sort Colors
Brute Force : 
class Solution {
    public void sortColors(int[] nums) {
        int zero =0;
        int one =0;
        int two =0;

        for(int num :nums){
            if(num==0)
                zero++;
            
            else if(num==1)
                one++;
            
            else
                two++;
            
        }
            int i =0;
            while(zero-->0)
                nums[i++]=0;
            
            while(one-->0)
                nums[i++]=1;
            
            while(two-->0)
                nums[i++]=2;

    }
}

Optimal Approach : Dutch National Flag Algorithm 
class Solution {
    public void sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high =nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
            swap(nums , low , mid);
               
            
            mid++;
            low++;
            }

            else if(nums[mid]==1){
            mid++;
            }

            else{
            swap(nums , mid, high);
            high--;
            }
        }
    }
            public void swap(int[] nums , int i , int j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }


Question 2 : Concatenation of Array
Approach 1 : Using Extra Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
        int[] ans = new int[2*n];

        for(int i =0;i<nums.length;i++){
            ans[i] =nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}


Approach 2 : Using Modulus(%)

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
        int[] ans = new int[2*n];

        for(int i=0;i<2*n;i++){
            ans[i] =nums[i%n];
           
        }
        return ans;
    }
}



                
            

            
   
           
        

    



