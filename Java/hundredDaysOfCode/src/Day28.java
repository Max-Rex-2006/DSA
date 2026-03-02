public class Day28 {
    public int majorityElement(int[] nums) {
        int c = 0, major = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (c==0) {
                c=1;
                major = nums[i];
            }
            else if(nums[i]==major)
                c++;
            else
                c--;
        }
        return major;
    }
    public static void main(String[] args) {
        Day28 d = new Day28();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(d.majorityElement(nums));
    }
}
