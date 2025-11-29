public class Recurssive1 {

    public static void main(String[] args) {
        int result = recurForward(5);

        System.out.println("The result is: " + result);
    }

    private static int recurForward(int num) {
        if (num < 1) {
            return 1;
        }        
        return num * recurForward(num - 1);
    }
}