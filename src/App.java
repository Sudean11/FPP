import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        int[] arrayclass PerfectSquare {

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
        
        } = {1, 2, 3};
        generatePermutations(array, 0);
    }

    public static void generatePermutations(int[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = currentIndex; i < array.length; i++) {
                swap(array, currentIndex, i);
                generatePermutations(array, currentIndex + 1);
                swap(array, currentIndex, i); // Backtrack to restore the original array
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}