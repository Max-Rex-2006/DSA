public class Day41 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] out = new int[digits.length + 1];
        out[0] = 1;
        return out;
    }
    public static void main(String[] args) {
        Day41 day41 = new Day41();
        int[] digits = {9, 9, 9};
        int[] result = day41.plusOne(digits);
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
