public class Day7 {
    public void sortColors(int[] nums) {
        int low=0, mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Day7 d = new Day7();
        int[] nums = {2,0,2,1,1,0};
        d.sortColors(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
