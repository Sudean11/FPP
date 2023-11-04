
// Write an array that returns true if an array is hollow. 
// An array is said to be hollow if it has 3 or more 0's in the middle 
// followed by the same number of elements in the beginning and the end.
// [1,2,3,0,0,0,6,7,8] = true


class ThreeZeros {

    public static void main(String[] args){
        new ThreeZeros().hollow(new int[]{1,2,3,0,0,0,0,4,7,8});
    }

    void hollow(int[] arr){
        Boolean isEven;
        if(arr.length % 2 == 0){
            isEven = true;
        }else{
            isEven = false;
        }

        int midPoint = arr.length/2;
        
        int leftMidPoint;
        int rightMidPoint;

        if(!isEven){
            if(arr[midPoint] != 0){
                return;
            }
        }

        int numberOfZeros = 0;
        if(isEven){
            // 1,2,3,4,5,6
            leftMidPoint = arr.length/2-1;
            rightMidPoint = arr.length/2;
        }else{
            // 1,2,3,4,5
            leftMidPoint = arr.length/2-1;
            rightMidPoint = arr.length/2+1;    
            numberOfZeros++;
        }

        Boolean stopLeftMidPoint = false;
        Boolean stopRightMidPoint = false;
        int leftExtraDigits = 0;
        int rightExtraDigits = 0;
        while(leftMidPoint >= 0){
            if(arr[leftMidPoint] == 0){
                if(!stopLeftMidPoint){
                    numberOfZeros++;
                }else{
                    leftExtraDigits++;
                }
            }else{
                stopLeftMidPoint = true;
                leftExtraDigits++;
            }

            if(arr[rightMidPoint] == 0){
                if(!stopRightMidPoint){
                    numberOfZeros++;
                }else{
                    rightExtraDigits++;
                }
            }else{
                stopRightMidPoint = true;
                rightExtraDigits++;
            }
            leftMidPoint--;
            rightMidPoint++;
        }

        if(numberOfZeros >=3 && leftExtraDigits == rightExtraDigits){
            System.out.println("right answer");
        }else{
            System.out.println("wrong answer");
        }

    }

}