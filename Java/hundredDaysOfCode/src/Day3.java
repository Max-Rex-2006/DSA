public class Day3 {
    public boolean isHappy(int n) {
        while(n>=10){
            int sum = 0;
            while (n>0){
                sum += Math.pow(n%10,2);
                n /=10;
            }
            n = sum;
        }
        if (n==7)
            return true;
        if (n<10 && n!=1)
            return false;
        return true;
    }
    public static void main(String[] args) {
        Day3 obj = new Day3();
        System.out.println(obj.isHappy(19));
    }
}
