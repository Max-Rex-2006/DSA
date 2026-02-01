public class Day1 {
    public int[] runningSum(int[] nums) {
        int[] out = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            out[i] = sum;
        }
        return out;
    }
    public int[] buildArray(int[] nums) {
        int[] out = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            out[i] = nums[nums[i]];
        }
        return out;
    }
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String s: operations){
            if(s.equals("--X")||s.equals("X--"))
                x-=1;
            else
                x+=1;
        }
        return x;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Day1 day1 = new Day1();
        int[] ans = day1.runningSum(nums);
        for(int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr = day1.buildArray(nums);
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        String[] operations = {"--X", "X++", "++X"};
        int finalValue = day1.finalValueAfterOperations(operations);
        System.out.println("Final value of x: " + finalValue);  
    }
}
