class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int left=0;
        int right=k;
        int sum=0;
        for(int i=0;i<k;i++) {
            sum+=arr[i];
        }
        if(sum/k>=threshold) count++;
        while(right<arr.length){
             sum-=arr[left];
             left++;
             sum+=arr[right];
             if(sum/k>=threshold) count++;
             right++;
        }
        return count;
    }
}