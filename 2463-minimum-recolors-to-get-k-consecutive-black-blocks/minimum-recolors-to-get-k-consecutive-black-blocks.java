class Solution {
    public int minimumRecolors(String blocks, int k) {
        int mini=Integer.MAX_VALUE;
        int n=blocks.length();
        int i=0;
        while(i<=n-k){
             String str=blocks.substring(i,k+i);
             System.out.println(str);
             int count=0;
             for(char ch:str.toCharArray()){
                if(ch=='W') count++;
             }
             mini=Math.min(mini, count);
             i++;
        }
        return mini;
    }
}