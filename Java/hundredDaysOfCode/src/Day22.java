public class Day22 {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left=0, right=ch.length-1;
        while(right>=left){
            if(ch[left]!='A'&&ch[left]!='E'&&ch[left]!='I'&&ch[left]!='O'&&ch[left]!='U'&&ch[left]!='a'&&ch[left]!='e'&&ch[left]!='i'&&ch[left]!='o'&&ch[left]!='u'){
                left++;
                continue;
            }
            if(ch[right]!='A'&&ch[right]!='E'&&ch[right]!='I'&&ch[right]!='O'&&ch[right]!='U'&&ch[right]!='a'&&ch[right]!='e'&&ch[right]!='i'&&ch[right]!='o'&&ch[right]!='u'){
                right--;
                continue;
            }
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Day22 day22 = new Day22();
        String s = "hello";
        System.out.println(day22.reverseVowels(s));
    }
}
