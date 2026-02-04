public class Day4 {
    public void moveZeroes(int[] nums) {
        for(int left=0, right=0; right<nums.length; right++){
            if(nums[right]!=0){
                int temp = nums[left];
                nums [left] = nums[right];
                nums [right] = temp;
                left++;
            }
        }
    }
    public int removeElement(int[] nums, int val) {
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]!=val){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Day4 obj = new Day4();
        int[] arr = {0,1,0,3,12};
        obj.moveZeroes(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr2 = {3,2,2,3};
        int val = 3;
        int k = obj.removeElement(arr2, val);
        System.out.println("New length after removing " + val + " is: " + k);
        for(int i=0; i<k; i++){
            System.out.print(arr2[i] + " ");
        }   
        System.out.println();
    }
}
