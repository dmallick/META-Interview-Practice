public class HappyNumber {
    
     public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquares(slow);                 // moves 1 step
            fast = sumOfSquares(sumOfSquares(fast));   // moves 2 steps
        } while (slow != fast);

        return slow == 1; // If both meet at 1 → happy
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19)); 
    }
}    


/*
19

*/