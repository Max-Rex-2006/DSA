public class Day26 {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) 
                left++;
            if (nums[right] % 2 == 1) 
                right--;
        }
        return nums;
    }
    public static void main(String[] args) {
        Day26 d = new Day26();
        int[] nums = {3,1,2,4};
        int[] ans = d.sortArrayByParity(nums);
        for(int i:ans)
            System.out.print(i+" ");
    }
}
