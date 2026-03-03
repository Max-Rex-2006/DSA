public class Day31 {
    public int maxSubArray(int[] nums) {
        int tempSum=0, maxSum=nums[0];
        for(int i=0; i<nums.length; i++){
            tempSum = nums[i] + Math.max(0,tempSum);
            if(tempSum>maxSum){
                maxSum = tempSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Day31 d = new Day31();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(d.maxSubArray(nums));
    }
}
