class SubArray{
    public static void main(String[] args){
        new SubArray().subArray(new int[]{99, 45,6, 3,2});
    }

    void subArray(int[] arr){

        for(int i=0; i<arr.length; i++){

            if(i == arr.length -1 ){
                System.out.println("yayy ");

                break;
            }
            int j = i+1;
            int sum = 0;
            while(j<arr.length){
                sum+=arr[j];
                j++;
            }

            if(sum > arr[i]){
                System.out.println("nah ");
                return;
            }


        }
    }
}