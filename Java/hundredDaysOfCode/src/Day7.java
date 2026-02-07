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
    public int[] buildArray(int[] nums) {
        int[] out = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            out[i] = nums[nums[i]];
        }
        return out;
    }
    public static void main(String[] args) {
        Day7 d = new Day7();
        int[] nums = {2,0,2,1,1,0};
        d.sortColors(nums);
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] nums2 = {0,2,1,5,3,4};
        int[] out = d.buildArray(nums2);
        for(int i:out){
            System.out.print(i+" ");
        }
    }
}
