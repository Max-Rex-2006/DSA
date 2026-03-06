public class Day34 {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1)
            return Integer.MAX_VALUE;
        return (int)(dividend/divisor);
    }
    public static void main(String[] args) {
        Day34 obj = new Day34();
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(obj.divide(dividend, divisor));
    }
}
