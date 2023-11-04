class AddTwoSortedArrays{

    public static void main(String[] args){
        new AddTwoSortedArrays().oneArray(new int[]{1,2,3}, new int[]{2,4,5,6});
    }

    void oneArray(int[] a, int[] b){
        int[] newarr = new int[a.length + b.length];

        for(int i = 0; i< a.length; i++){
            newarr[i] = a[i];
        }
        for(int i = 0; i<b.length; i++){
            newarr[i+a.length] = b[i];
        }

        
        for(int i = 0; i<newarr.length; i++){
            for(int j = i; j<newarr.length; j++){
                if(newarr[i] > newarr[j]){
                    int temp = newarr[i];
                    newarr[i] = newarr[j];
                    newarr[j] = temp;
                }
            }
        }

        for(int singledigit: newarr){
            System.out.println(singledigit);
        }



    }
}