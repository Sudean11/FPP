class NUpCount {

    public static void main(String args[]){
        int [] arr = {6,3,1};
        nUpCount(arr,5);
    }
    
    public static void nUpCount(int[] arr, int n) {
        int sum = 0;
        Boolean lastSum = false;
        int upCount = 0;
        for(int singleDigit : arr){
            sum += singleDigit;
            
            if(sum > n){
                if(!lastSum){
                    lastSum = true;
                    upCount++;
                }
            }else{
                lastSum = false;
            }
        }
        System.out.println(upCount+"");

    }

}