public class Day14 {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;

        char[] arr = word.toCharArray();

        int left = 0, right = idx;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Day14 d = new Day14();
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(d.reversePrefix(word, ch));
    }
}
