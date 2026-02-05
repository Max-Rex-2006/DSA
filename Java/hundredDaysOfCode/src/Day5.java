public class Day5 {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char s: letters){
            if(s>target)
                return s;
        }
        return letters[0];
    }
    public static void main(String[] args) {
        Day5 obj = new Day5();
        char[] letters = {'c','f','j'};
        char target = 'a';
        System.out.println(obj.nextGreatestLetter(letters, target));
    }

}
