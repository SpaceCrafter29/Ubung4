package h2;

public class H2_main {
    public static void main(String[] args) {
        int input = 10;
        boolean x = input == 10 || input == 11;
        boolean y = input == 1 || input == 11;
        boolean E1 = x == true;
        boolean E2 = y == true;
        boolean E3 = x != y;
        boolean a = E1 && E2;
        boolean b = E1 || E3;
        boolean c = y == false;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}
