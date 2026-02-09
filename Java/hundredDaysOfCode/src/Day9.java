public class Day9 {
    public void reverseString(char[] s) {
        int left=0;
        for(int right=s.length-1; right>=left; right--){
            char temp=s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
        }
    }
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i+1; j < matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left+1, right+1};
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[2];
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left=0, right=s.length()-1;
        while(right>left){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Day9 d = new Day9();
        char[] s = {'h','e','l','l','o'};
        d.reverseString(s);
        for(char c : s){
            System.out.print(c + " ");
        }
        System.out.println();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        d.rotate(matrix);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] result = d.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]);
        String str = "A man, a plan, a canal: Panama";
        System.out.println(d.isPalindrome(str));
    }
}
