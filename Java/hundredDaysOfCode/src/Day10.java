import java.util.ArrayList;
import java.util.List;

public class Day10 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        String bn = Integer.toBinaryString(n);
        for(int i=1;i<bn.length();i++){
            if(bn.charAt(i)!='0')
                return false;
        }
        return true;
    }
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
	    while (area%w!=0) w--;
	    return new int[]{area/w, w};
    }
    public boolean isPowerOfThree(int n) {
        while(n>8){
            if(n%3!=0)
                return false;
            n/=3;
        }
        if(n==1||n==3)
            return true;
        return false;
    }
    public boolean isPowerOfFour(int n) {
        while(n>9){
            if(n%4!=0)
                return false;
            n/=4;
        }
        if(n==1||n==4)
            return true;
        return false;
    }
    public int countNumbersWithUniqueDigits(int n) {
        switch(n)
        {
            case 0: return 1;
            case 1: return 10;
            case 2: return 91;
            case 3: return 739;
            case 4: return 5275;
            case 5: return 32491;
            case 6: return 168571;
            case 7: return 712891;
            case 8: return 2345851;
        }
        return 0;
    }
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int x = 0;
        for(int y = 0; y<t.length()&&x<s.length(); y++){
            if(t.charAt(y)==s.charAt(x)){
                x++;
            }
        }
        if(x==s.length())
            return true;
        else
            return false;
    }
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0&&i%5==0)
                ans.add("FizzBuzz");
            else if(i%3==0)
                ans.add("Fizz");
            else if(i%5==0)
                ans.add("Buzz");
            else
                ans.add(Integer.toString(i));
        }
        return ans;
    }
    public int searchInsert(int[] nums, int target) {
        int left=0, right=nums.length-1;
        int mid = left+(right-left)/2;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Day10 d = new Day10();
        int n = 15;
        System.out.println(d.fizzBuzz(n));
        
    }
}
