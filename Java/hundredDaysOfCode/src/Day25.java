public class Day25 {
    public String firstPalindrome(String[] words) {
        
        for(int i=0; i<words.length; i++){
            for(int j=0,k=words[i].length()-1;k>=j;j++,k--){
                if(words[i].charAt(j)!=words[i].charAt(k))
                    break;
                if(k<=j||k==(j+1))
                    return words[i];
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Day25 d = new Day25();
        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(d.firstPalindrome(words));
    }
}
