public class Solution {
    public ArrayList<Integer> getRow(int A) {
        
        //Brute force solution to the problem
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int i=0;
        while(i < A+1){
            matrix.add(new ArrayList<Integer>());
            matrix.get(i).add(0,1);
            if(i==0){
                i++;
                continue;
            }
            if(i==1){
                matrix.get(i).add(1,1);
                i++;
                continue;
            }
            int j=1;
            while(j<i){
                matrix.get(i).add(j,matrix.get(i-1).get(j) + matrix.get(i-1).get(j-1));
                j++;
            }
            matrix.get(i).add(j,1);
            i++;
        }
        answer = matrix.get(i-1);
        return answer;
    }
}
