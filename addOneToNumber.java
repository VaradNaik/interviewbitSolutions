public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        ArrayList<Integer> carry = new ArrayList<Integer>();
        int n = A.size();
        for (int i=0;i< n;i++){
            carry.add(0);
        }
        carry.set(n-1,1);
        for(int i = n - 1; i > -1 ;i --){
            int digit;
            if(A.get(i)==9 && carry.get(i)==1 && i!=0){
                carry.set(i-1,1);
                digit =0;
                output.add(digit);
            }
            else if(A.get(i) == 9  && carry.get(i) == 1 && i==0){
                digit=0;
                output.add(digit);
                output.add(1);
                Collections.reverse(output);
                return removeLeadingZeroes(output);
            }
            else {
                digit = A.get(i) + carry.get(i);
                output.add(digit);
            }
        }
        Collections.reverse(output);
        return removeLeadingZeroes(output);
    }
    //utility function to remove Leading Zeroes
    public ArrayList<Integer> removeLeadingZeroes(ArrayList<Integer> input){
        ArrayList<Integer> answer = new ArrayList<>();
        boolean flag = true;
        for(int i=0;i<input.size();i++){
            if(flag == false){
                answer.add(input.get(i));
            }
            else if(flag == true && input.get(i)!=0){
                flag= false;
                answer.add(input.get(i));
            }
        }
        return answer;
    }
}
