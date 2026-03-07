public class Day35 {
    public int trap(int[] height) {
        if(height.length==0)
            return 0;
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max=0;
        for (int i=0; i<height.length; i++){
            max = Math.max(max,height[i]);
            left[i]=max;
        }
        max = 0;
        for (int i=height.length-1; i>=0; i--){
            max = Math.max(max,height[i]);
            right[i]=max;
        }
        max = 0;
        for(int i=0; i<height.length; i++){
            max += Math.min(left[i], right[i])-height[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Day35 day35 = new Day35();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(day35.trap(height));
    }
}
