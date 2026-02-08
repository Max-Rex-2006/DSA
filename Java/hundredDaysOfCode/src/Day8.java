public class Day8 {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    public static void main(String[] args) {
        Day8 d = new Day8();
        String haystack = "hello", needle = "ll";
        System.out.println(d.strStr(haystack, needle));
    }
}
