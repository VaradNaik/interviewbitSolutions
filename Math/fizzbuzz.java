public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> output = new ArrayList<>();
        //pretty straightforward, just iterate from 1 to A 
        // and do what the problem says
        for(int i =1;i<A+1;i++){
            if(i%3==0 && i%5 !=0){
                output.add("Fizz");
            }
            else if(i%5==0 && i%3 !=0){
                output.add("Buzz");
            }
            else if(i%5 ==0 && i%3 ==0){
                output.add("FizzBuzz");
            }
            else{
                output.add(Integer.toString(i));
            }
        }
        return output;
    }
}
