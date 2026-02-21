public class Day21 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else
                return nums1[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Day21 day21 = new Day21();
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10};
        System.out.println(day21.getCommon(nums1, nums2));
    }
}
