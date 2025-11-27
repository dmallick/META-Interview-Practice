public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!   " + toBase62(93));  
    }


    public static String toBase62(int deci) {
    String s = "012345689abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String hashStr = "";
    while (deci > 0) {
        hashStr = s.charAt(deci % 62) + hashStr;
        deci /= 62;
    }
    return hashStr;
}
}
