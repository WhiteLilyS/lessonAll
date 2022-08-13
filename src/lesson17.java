public class lesson17 {
    public static void main(String[] args) {
        int n = 5;
    }
    public int getMaxComboStairs(int n){
        int k = 0;
        if(n == 1 || n == 2 || n == 3){
            return n;
        } else if (n < 0) {
            return 0;
        }
        return n;
    }
}
