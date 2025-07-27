class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        Map<Integer, Integer> mp=new HashMap<>();
        for(int val:nums){
             mp.put(val, mp.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: mp.entrySet()){
            if(entry.getValue()>n/3){
                res.add(entry.getKey());
            }
        }
        return res;
        
    }
}