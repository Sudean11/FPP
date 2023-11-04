class Centered15{
    public static void main(String[] args){
        new Centered15().isCentered(new int[]{1,1,15,-1,1});
    }

    void isCentered(int[] n){
       
        int initIndex = 0; 
        int lastIndex = n.length - 1;

        while(initIndex <= n.length/2){
            int sum = 0;
            for(int i = initIndex; i<= lastIndex; i++){
                sum+= n[i];
            }

            if(sum ==15){
                System.out.println("Yo done");
                return;
            }
            initIndex++;
            lastIndex--;
        }
    }
}