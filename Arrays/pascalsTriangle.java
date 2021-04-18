public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        //very straightforward, just do what the problem says
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        if(A==0)return output;
        output.add(new ArrayList<Integer>());
        output.get(0).add(1);
        if(A==1){
            return output;
        }
        for(int i=1;i<A;i++){
            output.add(new ArrayList<Integer>());
            output.get(i).add(1);
            int num=1;
            int denom = 1;
            for(int j=1;j<i;j++){
                int one = output.get(i-1).get(j-1);
                int two = output.get(i-1).get(j);
                output.get(i).add(j,one + two);
            output.get(i).add(1);
        }
        return output;
    }
}
