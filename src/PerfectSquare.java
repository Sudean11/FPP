class PerfectSquare {

    public static void main(String args[]){
        checkNextPerfectSquare(44);
    }
    
    public static void checkNextPerfectSquare(int value) {
        int ans = 0;
        for(int i = 1; ; i++){
            ans = i*i;
            if(ans > value){
                System.out.println(ans);
                break;
            }else{
                
            }
        }
    }

}