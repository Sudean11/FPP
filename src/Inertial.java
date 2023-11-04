class Intertial{
    public static void main(String[] args){
        int[] arr = {2,3,5,7};
        new Intertial().intertial(arr);
    }


    // atleast one odd value
    // maximum is even
    // every odd value is greater than every even value that is not the maximum value

    void intertial (int[] arr){

        int greatestValue = 0;
        Boolean hasOddValue = false;
        Boolean everyOddValueGreater = false;
        Boolean greatestValueEven = false;
        Boolean checkIfMinOneOddValue = false;
        Boolean everyOddValueGreaterThanEvenExceptOne = false;

        greatestValue = returnGreatestValue(arr);
        
        greatestValueEven = checkIfEven(greatestValue);

        checkIfMinOneOddValue = checkIfMinOneOddValue(arr);

        everyOddValueGreaterThanEvenExceptOne = checkeveryOddValueGreaterThanEvenExceptOne(arr, greatestValue);
        
        System.out.println("Greatest Value even " + greatestValueEven + " and the value is "+ greatestValue);
        System.out.println("Has atleast one odd "+ checkIfMinOneOddValue);
        System.out.println("Every Odd value greate than even but one "+ everyOddValueGreaterThanEvenExceptOne);


        System.out.println((greatestValueEven && checkIfMinOneOddValue && everyOddValueGreaterThanEvenExceptOne)? "1" : "0");

        
        
    }

    Boolean checkeveryOddValueGreaterThanEvenExceptOne(int[] arr, int greatestValue){
        for(int everySingleValue : arr){
            if(!checkIfEven(everySingleValue)){
                for(int innerLoopedValue : arr){
                    if(checkIfEven(innerLoopedValue) && innerLoopedValue != greatestValue){
                        if(everySingleValue < innerLoopedValue){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    Boolean checkIfMinOneOddValue(int[] arr){
        for(int everySingleValue : arr){
            if(everySingleValue % 2 != 0){
                return true;
            }
        }
        return false;
    }

    Boolean checkIfEven(int greatestValue){
        if(greatestValue % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    int returnGreatestValue(int[] arr){
        int greatestValue = 0;
        for(int everySingleValue : arr){
            if(greatestValue < everySingleValue){
                greatestValue = everySingleValue;
            }
        }
        return greatestValue;
    }

}