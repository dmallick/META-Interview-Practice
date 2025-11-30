public class PrintStarts {
    static int row=0, col = 0;
    public static void main(String[] args) {
        printStar(4,0);
    }


    static void printStar(int row, int col){
        if (row < 0 ) {
            return;
        }
        if(col < row){
            System.out.print("*");
            printStar(row, col+1);
        }else{
            System.out.println();
            printStar(row-1, 0);
        }
    }
}
