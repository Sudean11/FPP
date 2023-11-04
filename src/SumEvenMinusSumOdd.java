class SumEvenMinusSumOdd { 

    public static void main(String[] args){
        new SumEvenMinusSumOdd().theFunction(new int[]{4, 1, 2, 3});
    }

    void theFunction(int[] arr){
        int evenSum = 0;
        int oddSum = 0;
        for(int value: arr){
            if(checkEven(value)){
                evenSum+=value;
            }else{
                oddSum+=value;
            }
        }
        System.out.println(-(evenSum-oddSum));
    }

    Boolean checkEven(int value){
        if(value % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

}