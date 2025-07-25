package multiplesOf3and5;
/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Additionally, if the number is negative, return 0.

Note: If the number is a multiple of both 3 and 5, only count it once.
 */



public class Main {
    static int findMultiples(int num){
        int sum = 0;
        if (num > 0){ 
            for (int i = 0; i < num; i++){
                if ((i % 3) == 0) {
                    sum += i;
                } else if ((i % 5) == 0){
                    sum += i;
                }
            }
            return sum;
        } else {
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(findMultiples(5));

    }
}
