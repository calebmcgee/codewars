package equalSidesOfArray;
/*
You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N.

If there is no index that would make this happen, return -1.

For example:
Let's say you are given the array {1,2,3,4,3,2,1}:
Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1}) both equal 6.

Let's look at another one.
You are given the array {1,100,50,-51,1,1}:
Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.

Last one:
You are given the array {20,10,-80,10,10,15,35}
At index 0 the left side is {}
The right side is {10,-80,10,10,15,35}
They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
Index 0 is the place where the left side and right side are equal.
 */
public class Main {
    public static void main(String[] args){
    int[] arr = {1,2,3,4,3,2,1};
        for(int currentIndex = 0; currentIndex < arr.length; currentIndex++){  
            int left = 0, right = 0;
            // find sum for left and right      
            for (int i = 0; i < currentIndex; i++){
                left += arr[i];
            }
            for (int i = currentIndex + 1; i < arr.length; i++){
                right += arr[i];
            }
            // check
            if (right == left){
                System.out.println("found middle at " + currentIndex);
                break;
            }
            if (currentIndex  == arr.length){
                System.out.println("Index where sum of left and right are equal does not exist.");
            }

        }
        
    }
}