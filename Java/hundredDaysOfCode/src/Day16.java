public class Day16 {
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(1 + 8l * n) - 1) / 2);
    }
    public String toHex(int num) {
        return Integer.toHexString(num);
    }
    public static void main(String[] args) {
        Day16 day16 = new Day16();
        System.out.println(day16.reverseBits(43261596)); // Output: 964176192
        System.out.println(day16.arrangeCoins(5)); // Output: 2
        System.out.println(day16.toHex(-1)); // Output: "ffffffff"
    }
}
