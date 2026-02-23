public class Day23 {
    public String convertToBase7(int num) {
        return Integer.toString(num, 7);
    }
    public static void main(String[] args) {
        Day23 day23 = new Day23();
        int num = 100;
        String base7 = day23.convertToBase7(num);
        System.out.println("Base 7 representation of " + num + " is: " + base7);
    }
}
