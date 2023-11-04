class SumFactorial{
    public static void main(String[] args){
        new SumFactorial().solve10();
    }

    void solve10(){
        for(int i = 0; i< 10; i++){
            for(int j=0; j<10; j++){

                if(i == 3 && j == 7){
                    System.out.println(calculateFactorial(3) + " and "+ calculateFactorial(7)+ " and "+ calculateFactorial(10));
                    
                }

                if((calculateFactorial(i) + calculateFactorial(j)) == calculateFactorial(10)){
                    System.out.println(i + " and "+ j);
                }
            }
        }
    }

    int calculateFactorial(int value){
        int factorial = 1;
        while (value > 1){
            factorial = factorial * value;
            value --;
        }
        return factorial;
    }
}