class MadhavArray {
    public static void main(String[] args){
        int[] arr = {3,1,2,3,0};
        System.out.println(new MadhavArray().madhavArray(arr));

    }

    int madhavArray(int[] arr){
        int init = 0;
        int maxValue = 1;
        int sum = 0;

        int len = 0;
        Boolean rightLength = false;
        while(len < arr.length){
            if(len*(len+1)/2 == arr.length){
                rightLength = true;
            }
            len++;
        }

        if(!rightLength){
            return 0;
        }


        for(int i = 0; i< arr.length; i++){
            if(init < maxValue){
                sum = sum + arr[i];
                init++;

            }else if (init == maxValue){
                maxValue++;
                init = 1;
                if(sum == arr[0]){
                    sum = arr[i];
                    continue;
                }else{
                    return 0;
                }
            }else{
                continue;
            }
        }
        return 1;
    }
}