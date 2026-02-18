public class Day18 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i=1; i<(num/2)+1; i++){
            if(num%i==0)
                sum+=i;
        }
        if(num==sum)
            return true;
        return false;
    }
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
    public int fib(int n) {
        if (n == 0) 
            return 0;
        if (n == 1) 
            return 1;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < word1.length() && i < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }

        while (i < word1.length()) 
            sb.append(word1.charAt(i++));
        while (i < word2.length()) 
            sb.append(word2.charAt(i++));

        return sb.toString();
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
