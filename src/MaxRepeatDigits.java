
// Write a function which takes an integer and returns the maximum repeated digit else return -1
// maxCount(int n)
// 4735464 ⇒ 4
// 346936 ⇒ -1
// 12345 ⇒ -1


class MaxRepeatDigits { 
    public static void main(String[] args){
        new MaxRepeatDigits().maxCount(473333444);
    }

    void maxCount(int n){


        int tempVariable = n;
        int highestCurrentDigit = tempVariable % 10;
        int highestCurrentCount = 0;
        int singleDigit;
        
        int newCount = 0;
        Boolean twoHighCount = false;


        while(n > 0){
            // 4735464 ⇒ 4
            int newDigit = tempVariable % 10;
            while(tempVariable > 0){
                singleDigit = tempVariable % 10;
                if(newDigit == singleDigit){
                    newCount++;
                }
                tempVariable = tempVariable/10;
            }
    
            if(newCount > highestCurrentCount){
                highestCurrentDigit = newDigit;
                highestCurrentCount = newCount;
                twoHighCount = false;
            }else if(newCount == highestCurrentCount){
                twoHighCount = true;
            }
            newCount = 0;
            n = n/10;
            tempVariable = n;
        }
        if(!twoHighCount){
            System.out.println("variable: "+ highestCurrentDigit+ " and count: "+highestCurrentCount);
        }else{
            System.out.println("-1");
        }
    
    }
}