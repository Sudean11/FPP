// Write a function which takes an integer and returns the maximum repeated digit else return -1
// maxCount(int n)
// 4735464 ⇒ 4
// 346936 ⇒ -1
// 12345 ⇒ -1
import java.util.*; 
class MaximumRepeatedDigits {

    public static void main(String[] args){
        new MaximumRepeatedDigits().maxCount(12353455);
    }

    void maxCount(int n){
        int[] count = new int[10];
        
        while(n != 0){
            int tempvalue = n % 10;
            count[tempvalue-1] = count[tempvalue-1]+1;
            n = n/10;
        }
        int high = 0;
        for(int i=0; i<10; i++){
            if(count[i] > count[high]){
                high = i;
            }
        }


        int totalHigh = 0;
        for(int i=0; i<10; i++){
            if(count[i] == count[high]){
                totalHigh ++;
            }
        }
        if(totalHigh > 1){
            System.out.println("-1");
        }else{
            System.out.println(high+1);
        }

    }

}