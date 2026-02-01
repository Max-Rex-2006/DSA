import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        System.out.println("Hi "  + name);
        scn.close();
    }
}