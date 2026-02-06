public class Day6 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int max = Math.min(height[left], height[right]) * (right - left);
        while(left<right){
            int area = Math.min(height[left], height[right]) * (right - left);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
            max = (area>max)?area:max;
        }
        return max;
    }
    public static void main(String[] args) {
        Day6 d = new Day6();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(d.maxArea(height));
    }
}
