class Solution {
    public int minimumRecolors(String blocks, int k) {
      int mini=Integer.MAX_VALUE;
      int left=0;
      int right=k;
      int w=0;
      for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            w++;
        }
      } 
      System.out.println(w);
      mini=w;
      while(right<blocks.length()){
          if(blocks.charAt(left)=='W'){
            w--; 
          }
          if(blocks.charAt(right)=='W') w++;
          mini=Math.min(mini, w);
          left++;
          right++;
      }
      return mini;
    }
}