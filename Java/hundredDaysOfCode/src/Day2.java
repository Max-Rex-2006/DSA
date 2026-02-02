public class Day2 {
    public int thirdMax(int[] nums) {
        int max = 0, smax = 0, tmax = 0;
        boolean hasMax = false, hasSMax = false, hasTMax = false;

        for (int n : nums) {
            if ((hasMax && n == max) || (hasSMax && n == smax) || (hasTMax && n == tmax))
                continue;

            if (!hasMax || n > max) {
                tmax = smax; hasTMax = hasSMax;
                smax = max; hasSMax = hasMax;
                max = n; hasMax = true;
            }
            else if (!hasSMax || n > smax) {
                tmax = smax; hasTMax = hasSMax;
                smax = n; hasSMax = true;
            }
            else if (!hasTMax || n > tmax) {
                tmax = n; hasTMax = true;
            }
        }

        return hasTMax ? tmax : max;
    }
    public static void main(String[] args) {
        Day2 day2 = new Day2();
        int[] nums = {3, 2, 1};
        int thirdMax = day2.thirdMax(nums);
        System.out.println("Third maximum number is: " + thirdMax);
    }
}
