public class Day11 {
    public String reversePrefix(String s, int k){
        StringBuilder t = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (i < k) {
                t.append(s.charAt(k - 1 - i));
            } else {
                t.append(s.charAt(i));
            }
        }
        return t.toString();
    }
    public int lengthOfLastWord(String s) {
        s = s.strip();
        if(s.length()==1)
            return 1;
        int i=0, c = 0;
        for(i = s.length()-1; s.charAt(i)!=' '&&i>0; i--){
            c++;
        }
        if(i==0)
            return c+1;
        return c;
    }
    public static void main(String[] args) {
        Day11 d = new Day11();
        System.out.println(d.reversePrefix("abcdefd", 4));
        System.out.println(d.lengthOfLastWord("Hello World"));
        
    }
}
