package p3;

public class P3_main {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = true;
        System.out.println(!(x != y && x == y));
        //immer true
        System.out.println(x || true);
        //immer true
        System.out.println(x && false);
        //immer false
        System.out.println((x && !y) || (!x));
        //unterschiedlich
        x = true;
        y = false;
        System.out.println(!(x != y && x == y));
        System.out.println(x || true);
        System.out.println(x && false);
        System.out.println((x && !y) || (!x));
        x = false;
        y = true;
        System.out.println(!(x != y && x == y));
        System.out.println(x || true);
        System.out.println(x && false);
        System.out.println((x && !y) || (!x));
        x = false;
        y = false;
        System.out.println(!(x != y && x == y));
        System.out.println(x || true);
        System.out.println(x && false);
        System.out.println((x && !y) || (!x));
    }
}
