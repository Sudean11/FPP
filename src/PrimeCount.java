class PrimeCount {

    public static void main(String[] args){
        System.out.println(new PrimeCount().primeCount(-10,6));
    }


    int primeCount(int start, int end){
        int primeCountVariable = 0;
        for(int i = start; i<= end; i++){
            primeCountVariable = primeCountVariable + checkIfPrime(i);
        }
        return primeCountVariable;
    }

    int checkIfPrime(int value){
        int sum = 0;
        for(int i = 1; i<value; i++){

            if (value%i == 0){
                sum++;
            }
        }
        System.out.println("sum for "+value+" = "+sum);
        if(sum == 1){
            return 1;
        }else{
            return 0;
        }
    }

}