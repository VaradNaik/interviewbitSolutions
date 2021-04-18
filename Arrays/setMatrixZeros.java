public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		/*
		 if a(x,y) in the matrix is 0, make a(0,y) and a(x,0) ==0. Then we will know which elements in the matrix were 0.
		 But also we need to first check if there was a 0 in the first row or column originally.
		 Let's say a(0,5)==1 and you made it 0 during the algorithm , you will not know if it was 0 originally
		 or because iof the algorithm. So first check if there is a 0 in the first row and column, then proceed.
		*/
        int M = a.size();
        int N = a.get(0).size();
        boolean first_row_has_zero = false;
        boolean first_col_has_zero = false;
        //check if first row has 0
        for(int i=0;i<N;i++){
            if(a.get(0).get(i)==0){
                first_row_has_zero = true;
            }
        }
        //check if first column has 0
        for(int j=0;j<M;j++){
            if(a.get(j).get(0)==0){
                first_col_has_zero = true;
            }
        }
        //main logic-- make a(x,0) =0 and a(0,y)=0 if a(x,y)==0.
        for(int i=1;i<M;i++){
            for(int j=1;j<N;j++){
                if(a.get(i).get(j)==0){
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }
        //now if there is a zero at the start of the row or column, the entire row or column has to be 0
        //So iterate through the matrix and set elements to 0.(be careful to start from 1,1)
        for(int i=1;i<N;i++){
            for(int j=1;j<M;j++){
                if(a.get(j).get(0) ==0 || a.get(0).get(i) == 0){
                    a.get(j).set(i,0);
                }
            }
        }
        //if first row has 0, the entire row needs to be 0
        if(first_row_has_zero){
            for(int i=0;i<N;i++){
                a.get(0).set(i,0);
            }
        }
        //if first column is 0, entire column needs to be 0
        if(first_col_has_zero){
            for(int j=0;j<M;j++){
                a.get(j).set(0,0);
            }
        }

    }
}