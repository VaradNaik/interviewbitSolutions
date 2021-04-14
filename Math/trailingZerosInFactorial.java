public class Solution {
    public int trailingZeroes(int A) {
		/*
			first of all calculate the least i such that 5^i > A
		*/
        int i=1;
        while( Math.pow(5,i) <= A){
            i++;
        }
		/*
		now all you need to realise is that the number of zeroes in the answer 
		depends on the number of factors of 5 in the factorial expression, since the number of 
		2s will always be greater than the number of 5s. 
		Now,lets take examples-
		5- number of 5s =1
		10 - number of 5s= 2 (because 10 = 5 x 2)
		15- 3, 20- 4
		25- this will contain 6 zeroes because 25= 5x5 so it has an extra 5
		30 - 7
		35-8,40-9,45-10,
		50 - number of 5s in this will be (50/5) + (50/25) = 12
		so it you get the pattern, it is (A/5) + (A/25) + (A/125).....and so on
		every power of 5
		*/
       int answer = 0;
       while(i > 1){
           answer += A/(Math.pow(5,i-1));
           i--;
       }
       return answer;
    }
}
