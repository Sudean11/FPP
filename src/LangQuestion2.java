// write a function which takes an array and satisfies the condition:
// 1. even numbers of items should be present
// 2. the sum of corresponding item from the center of the array should be in increasing order

// else return 0

// example:
// {1,2,3,6,8,10} ⇒ 3+6 < 2+8 < 1+10


class LangQuestion2 { 
    public static void main(String [] args){
        System.out.println(new LangQuestion2().satisfyCondition(new int[]{1,2,2,6,8,10}));
    }

    int satisfyCondition(int[] arr){

        //check if its even length array
        if(arr.length % 2 != 0){
            System.out.println("length mismatch");
            return -1;
        }

        int rightMidPoint = arr.length/2;
        int leftMidPoint = rightMidPoint -1;
        int OldSum = 0;

        while(leftMidPoint >= 0){
            int newSum = arr[rightMidPoint] + arr[leftMidPoint];
            if(newSum <= OldSum){
                return -1;
            }
            OldSum = newSum;
            leftMidPoint--;
            rightMidPoint++;
        }
        return 1;

    }
}