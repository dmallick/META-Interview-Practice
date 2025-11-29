public class RecurssiveSum1 {
    public static void main(String[] args) {

        findSum(1234, 0);
    }

    private static int findSum(int dividend, int sum) {
        int reminder; 
        if(dividend == 0){
            return 0;
        } else{
            reminder = dividend % 10;
            sum = sum +  reminder;
            dividend = dividend / 10;
            System.out.println("sum: " + sum);
            findSum(dividend, sum);
        }    

        return sum;
    }
}
