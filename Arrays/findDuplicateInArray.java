public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        /*
        since all numbers are between 1 to n, and there are
        n+1 integers, we can use a two pointer method to find the epeating number.
        Note that it is guaranteed that we wont get an indexoutofbounds exception
        because the values in the arraylist do not exceed n.
        */
        //step 1 . get common point of intersection.
        int slow = A.get(0); 
        int fast = A.get(A.get(0));
        while(slow != fast){
            slow= A.get(slow);
            fast= A.get(A.get(fast));
        }
        /*
        Let slow==fast==n
        Note that A.get(fast) is the index.
        here, we have the common point of intersection(n).
        let's say fast took "x" steps to reach n.
        then slow will take "2x" steps to reach n.
        -> slow took x steps to reach n from A.get(0)
        -> slow will take x more steps to go from 0 to A.get(fast)
        -> so if you offset fast to 0, and move both at the same
        speed, we would reach A.get(fast) which is the required answer.
        */
        fast = 0;
        while(slow!=fast){
            slow= A.get(slow);
            fast= A.get(fast);
        }
        return slow;
        /* additional comments
        Why setting fast to 0 initially does not work-> you would reach the same index everytime
    }
}
