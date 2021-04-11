public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        if(A.size() <= 1)return A;
        /*
        Logic - notice that in the answer,the first element is always the second smallest
        number and the first element is the smallest number.
        After that, the third elelment is the 4th smallest and fourth element
        is the third smallest. So basically if you sort and then group in pairs 
        of (second,first) upto the end of the array you get the solution.
        Note that since you have sorted, the first element of the next pair would 
        always be greater than the second element of the current pair
        */
        Collections.sort(A);
        ArrayList<Integer> answer = new ArrayList<>();
        int i =1;
        int n= A.size();
        while(i < n){
            answer.add(A.get(i));   //greater element of the pair first
            answer.add(A.get(i-1));
            i += 2;
        }
        if(i==n){                   //to handle the case where number of elements are odd
            answer.add(A.get(i-1));
        }
        return answer;
    }
}
