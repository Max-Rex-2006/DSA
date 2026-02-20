public class Day20 {
    public int maxScore(String s) {
        int max = 0;
        for(int i=1; i<s.length(); i++){
            int val = 0;
            for(int j=0; j<i; j++){
                if(s.charAt(j)=='0') val++;
            }
            for(int j=i; j<s.length(); j++){
                if(s.charAt(j)=='1') val++;
            }
            if(val>max) max = val;
        }
        return max;
    }
    public static void main(String[] args) {
        Day20 day20 = new Day20();
        String s = "011101";
        System.out.println(day20.maxScore(s));
    }
}
