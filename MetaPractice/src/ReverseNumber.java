public class ReverseNumber {
    public static void main(String[] args) {
        reverse(1234);
    }

    private static void reverse(int num) {
        int reverse = 0, reminder = 0;
                
        while (num > 0) {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num /10;

        }
        System.out.println("The reverse is: "+ reverse);
    }
    
}
