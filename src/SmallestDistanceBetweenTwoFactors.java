// Function named minDistance that returns the smallest distance between two factors of a number. 

// If the number is 8 it's factor are 1 2 4 8, 2-1 =1 is the smallest distance so it should return 1


class SmallestDistanceBetweenTwoFactors {
    public  static void main(String[] args){
        new SmallestDistanceBetweenTwoFactors().minDistance(7);
    }

    void minDistanceWithoutArray(int n){
        int minDistance = n;
        int lastFactor=0; 

        for(int i =n ; i>=1; i--){
            if(n % i == 0){
                if(lastFactor == 0){
                    lastFactor = i;
                }else{
                    if((lastFactor - i) < minDistance){
                        minDistance = lastFactor -i;
                    }
                }
                lastFactor = i;
            }
        }

        System.out.println("the min distance is "+minDistance );
    }


    void minDistance(int n){
        int[] arr = new int[n];
        int count = 0;
        
        for(int i =n ; i>=1; i--){
            if(n % i == 0){
                arr[count] = i;
                count++;
            }
        }
        int smallestDistance = n;
        for(int i = 0; i<count; i++){
            for(int j = i; j<count; j++){
                if(arr[i] != arr[j]){
                    if((arr[i] - arr[j]) < smallestDistance){
                        // System.out.println("count is "+ arr[i]+ " and "+ arr[j]);

                        smallestDistance = arr[i] - arr[j];
                    }
                }
            }
        }
        System.out.println("smallest dstance is "+ smallestDistance);
    }
}