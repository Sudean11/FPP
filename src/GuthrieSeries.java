class GuthrieSeries{
    public static void main(String [] args){
        int[] arr = {8,17,4,1};
        System.out.println(new GuthrieSeries().checkForGuthrieSeries(arr));
    }

    Boolean checkForGuthrieSeries(int[] arr){
        int value = arr[0];
        
        for(int singleDigit: arr){
            if(singleDigit != value){
                return false;
            }
            if(checkIfEven(singleDigit)){
                value = value/2;
            }else{
                if(value != 1){
                    value = 3*value+1;
                }
            
            }
        }


        System.out.println(value);
        if(value == 1){
            return true;
        }else{
            return false;
        }
    }

    Boolean checkIfEven(int greatestValue){
        if(greatestValue % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

}