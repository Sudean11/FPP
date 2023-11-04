class SqrTuple {
    public static void main(String [] args){
        int[] arr = {11,5,4,20};
        System.out.println(new SqrTuple().countSquarePairs(arr));
    }

    int countSquarePairs(int[] arr){
        int totalNumberOfPairs = 0;
        for(int i = 0; i< arr.length; i++){
            if(i < arr.length-1){
                for(int j= i+1; j<arr.length; j++){
                    if(checkIfPerfectSquare(arr[i], arr[j])){
                        System.out.println(arr[i]+ " "+ arr[j]);
                        totalNumberOfPairs++;
                    }  
                }
            }
        }

        return totalNumberOfPairs;
    }

    Boolean checkIfPerfectSquare(int value1, int value2){
        for(int i = 0; i<=  (value1+value2) ; i++){
            if( (i * i) == (value1+value2)){
                return true;
            }
        }
        return false;
    }
}