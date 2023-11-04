class PerfectNumber {

    public static void main(String args[]){
        perfectNumber();
    }
    
    public static void perfectNumber() {
        int totalNumbers = 0;
        int numbers=1;
        while(totalNumbers < 6){
            int sum = 0;
            for(int i = 1;i<numbers; i++){
                if(numbers % i == 0){
                    sum+= i;
                }
            }

            if(numbers == sum){
                System.out.println(numbers);
                totalNumbers++;
            }
            numbers++;
        }

    }

}