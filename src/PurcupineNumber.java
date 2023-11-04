class PurcupineNumber {
    public static void main(String[] args){
        System.out.println(new PurcupineNumber().findPurcupineNumber(100000));
    }

    public int findPurcupineNumber(int n){
        Boolean lastPrimeHadNine = false;
        int currentStoredPrime = 0;
        for(int i = n+1; ; i++){
            if(checkIfPrime(i)){
                System.out.println(i + " is prime");
                if(checkIfLastDigitIsNine(i)){
                    System.out.println("Last Prime had 9 "+ lastPrimeHadNine);

                    if(lastPrimeHadNine){
                        System.out.println(i + " STOPPED!!!");

                        return currentStoredPrime;
                    }else{
                        lastPrimeHadNine = true;
                        System.out.println(i + " has last 9 and value is "+ lastPrimeHadNine);

                        currentStoredPrime = i;
                    }    
                }else{
                    System.out.println(" RESETTT ");

                    lastPrimeHadNine = false;
                    currentStoredPrime = 0;
                }
            }
        }


    }

    Boolean checkIfLastDigitIsNine(int value){
        if(value % 10 == 9){
            return true;
        }else{
            return false;
        }
    }


    Boolean checkIfPrime(int value){
        int s = 0;
        for(int i = 1; i<= value; i++){
            if(value % i == 0){
                s++;
            }
        }
        if(s==2){
            return true;
        }else{
            return false;
        }
    }
}