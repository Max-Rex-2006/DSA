public class Day17 {
    public boolean isPowerOfThree(int n) {
        while(n>8){
            if(n%3!=0)
                return false;
            n/=3;
        }
        if(n==1||n==3)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Day17 day17 = new Day17();
        System.out.println(day17.isPowerOfThree(27));
    }
}
