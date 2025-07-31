class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=nums.length+1;
        int left=0, right=0;
        int sum=0;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=target && left<=right){
                mini=Math.min(mini, right-left+1);
                sum-=nums[left];
                left++;
            } 
            right++;
        }
        return mini != nums.length+1 ? mini : 0;
    }
}