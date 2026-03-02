public class Day27 {
    public boolean isPowerOfFour(int n) {
        while(n>9){
            if(n%4!=0)
                return false;
            n/=4;
        }
        if(n==1||n==4)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Day27 d = new Day27();
        int n = 16;
        System.out.println(d.isPowerOfFour(n));
    }
}
