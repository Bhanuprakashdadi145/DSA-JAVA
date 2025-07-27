class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Set<List<Integer>> curr=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            Set<Integer>st=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int val=-(nums[i]+nums[j]);
                if(st.contains(val)){
                    ArrayList<Integer> list=new ArrayList<>(List.of(nums[i],nums[j], val));
                    Collections.sort(list);
                    curr.add(list);
                }
                st.add(nums[j]);
            }
        }
        for(List<Integer> val: curr){
            res.add(val);
        }
        return res;
    }
}