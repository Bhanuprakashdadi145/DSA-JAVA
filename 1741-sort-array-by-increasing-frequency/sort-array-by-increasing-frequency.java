class Solution {
    public int[] frequencySort(int[] nums) {
        int[] res=new int[nums.length];
        int n=nums.length;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int val:nums){
            mp.put(val , mp.getOrDefault(val,0)+1);
        }
        List<Map.Entry<Integer, Integer>>list=new ArrayList<>(mp.entrySet());
    
        list.sort((a,b)->{
            if(a.getValue()==b.getValue()){
                return b.getKey()-a.getKey();
            }
            return a.getValue()-b.getValue();
        });
            // System.out.println(list);
        int ind=0;
        for(var val:list){
            // System.out.println(val+"->" + mp.get(val));
            int c=val.getValue();
            while(c-->0){
                res[ind++]=val.getKey();
            }
        }
        return res;
    }
}