package top100gfg;

import java.util.HashMap;

public class Fibonacci {
//        private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int val = fib(50);
        System.out.println(val);
        
    }

    private static int fib(int n) {
    HashMap<Integer, Integer> memo= new HashMap<>();    
    if (n <= 1) return n;
        if (memo != null) {
            memo = new HashMap<>(); 
        }        
        // Check if value is already computed
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        // Compute and store in memo
        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;

    }


}
