class Poe{
    public static void main(String[] args){
        int[] arr = {1,5,3,1,1,1,1,1,1};
        System.out.println(new Poe().checkPoeCount(arr));
    }

    int checkPoeCount(int[] arr){

        for(int i = 1; i< arr.length; i++){
            int rightSum = 0;
            int leftSum = 0;

            for(int l = 0; l<i; l++){
                leftSum+= arr[l] ;
            }

            for(int j = i+1; j<arr.length; j++){
                rightSum = rightSum + arr[j];
            }
            
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}