class RepsEqual{
    public static void main(String[] args){
        new RepsEqual().repsEqual(new int[]{0,3,2,0,5,3,4},320534);
    }

    void repsEqual(int[] n, int len){
        
        for(int i=n.length-1;i>=0;i--){
            if(n[i] != (len%10)){
                System.out.println("breakkkk");
                return;
            }
            len = len/10;
        }
        System.out.println("Correct");
    }
}