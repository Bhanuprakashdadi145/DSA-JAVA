class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                
                str=str+Character.toLowerCase(ch);
            }
        }
        System.out.println(str);
        return str.equals(new StringBuilder(str).reverse().toString());

    }
}