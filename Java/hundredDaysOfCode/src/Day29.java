public class Day29 {
    public String intToRoman(int num) {
        String[] romanCode = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] decVal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();
        for(int i=0; i<romanCode.length; i++){
            while(num >= decVal[i]){
                num -= decVal[i];
                roman.append(romanCode[i]);
            }
        }
        return roman.toString();
    }
    public static void main(String[] args) {
        Day29 d = new Day29();
        int num = 1994;
        System.out.println(d.intToRoman(num));
    }
}
