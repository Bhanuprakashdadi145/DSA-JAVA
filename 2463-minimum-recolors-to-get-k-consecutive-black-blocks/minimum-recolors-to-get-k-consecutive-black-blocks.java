class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mini=k;
        int recolor=0;
        int left=0;
        for(int r=0;r<blocks.length();r++){
            if(blocks.charAt(r)=='W') {
                recolor++;
            }
            if(r-left+1 == k){
                 mini=Math.min(mini, recolor);
                 if(blocks.charAt(left)=='W'){
                    recolor--;

                 }
                 left++;
            }
        }
        return mini;
    }
}