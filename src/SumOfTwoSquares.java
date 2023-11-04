import java.lang.*;

class SumOfTwoSquares{
    public static void main(String[] args){
        System.out.println(new SumOfTwoSquares().answerOne(50));
    }

    int answerOne(int n){
        int sum =0 ;
        for(int i = 1; i< n; i++){
            for(int j = i; j<n ; j++){
                if((i*i + j*j)== n){
                    System.out.println(i+","+j);
                    sum++;
                }
            }
        }
        
        return sum;
    }

}