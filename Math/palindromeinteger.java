public class Solution {
    public int isPalindrome(int A) {
        //negative numbers are not palindromes according to the problem statement
        if(A<0){
            return 0;
        }
        int a = A;
        int reversed=0;
        while(a!=0){
            /*
             0 * 10 is 0 and you need this line before adding
             the remainder because otherwise we will get the reversed number 10
             times more than what we expect
            */
            reversed *= 10;
            reversed += (a%10);
            a=a/10;
        }
        if(reversed == A){
            return 1;
        }
        return 0;
    }
}
