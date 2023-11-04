class GreaterMidElement {
    public static void main(String[] args){
        new GreaterMidElement().checkStrictNess(new int[]{1});
    }

    void checkStrictNess(int[] arr){

        //check if array is odd or even
        if(arr.length % 2 == 0){
            System.out.println("Nahhh longer length");
            return;
        }

        int midElement = arr[arr.length/2];

        System.out.println(midElement);

        for(int i = 0; i<arr.length; i++){

            if(i != arr.length/2){
                if( midElement >= arr[i] ){
                    System.out.println("Other value specifically "+arr[i]+" greater");
                    return;
                }
            }

        }

        System.out.println(" Yo done");

    }
}