public class Solution {
    public int titleToNumber(String A) {
        int output =0;
        int n=A.length();
        /*
        "value" of a character is as follows:A->1, B->2.......Z->26 
        
        if the length of the string is n,
        the required output is (26^(n-1))*(value of 1st char) + (26^(n-2))*(value of 
        2nd char) +..... (26^0)*(value of last char)
        */
        for(int i=0;i<n;i++){
            int valueOfChar = ((int) A.charAt(i)) - 64;
            output += Math.pow(26,n-1-i) * valueOfChar;
        }
        return output;
    }
}