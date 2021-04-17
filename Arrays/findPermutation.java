public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        /*
            simple - whenever it says D you gotta print the highest 
            number that can be printed(becasue maximum scope for decrease)
            and when it says I you gotta print the lowest possible number 
            that can be printed. So just maintain 2 pointers and whenever it
            says D print the higest possible number and decrease it by 1,
            similiarly for the lowest possible number
        */
        ArrayList<Integer> output = new ArrayList<>();
        int d_pointer = B;
        int i_pointer = 1;
        for(int i=0;i<B-1;i++){
            if(A.charAt(i)=='D'){
                output.add(d_pointer);
                d_pointer--;
            }
            else {
                output.add(i_pointer);
                i_pointer++;
            }
        }
        output.add(d_pointer);
        return output;
    }
}