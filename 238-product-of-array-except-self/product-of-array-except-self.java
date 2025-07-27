class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int[] pref=new int[n];
        int[] suff=new int[n];
        int p=1,s=1;
        for(int i=0;i<n;i++){
           p*=nums[i];
           s*=nums[n-i-1];
           pref[i]=p;
           suff[n-i-1]=s;
           
        }
        for(int i=0;i<n;i++){
            if(i==0){
                res[i]=suff[i+1];
            }
            if(i==n-1){
                res[i]=pref[i-1];
            }
            if(i>0 && i<n-1)
             res[i]=pref[i-1]*suff[i+1];
        }
        return res;
    }
}