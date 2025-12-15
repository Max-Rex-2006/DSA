public class Demo{
    public boolean containsDuplicate(int[] nums) {
        boolean res = true;
        for (int i = 0;i!=(nums.length)-1;i++)
        {
            for (int j=i+1; j<(nums.length)-1; j++)
            {
                if (nums[i]>nums[j])
                {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            for (int k=i+1; k<(nums.length)-1; k++)
            {
                if(nums[i]==nums[k])
                res = false;
                break;
            }
        }
        return res;
    }
}