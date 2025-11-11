package p2;

public class P2_main {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;
        int intResult;
        intResult = c - a * 3;
        System.out.println(intResult);
        //Frage 1:
        // -3, int
        //Frage 2:
        // Fehlerfrei
        intResult = c / b;
        System.out.println(intResult);
        //Frage 1:
        // 1, int
        //Frage 2:
        // Fehlerfrei
        intResult = a + b / c;
        System.out.println(intResult);
        //Frage 1:
        // 3, int
        //Frage 2:
        // Fehlerfrei

        double x = 1.5, y = 2.3;
        double doubleResult;
        doubleResult = c / b;
        System.out.println(doubleResult);
        //Frage 1:
        // 1.0, double
        //Frage 2:
        // Fehlerfrei
        doubleResult = c + a / b;
        System.out.println(doubleResult);
        //Frage 1:
        // 6.0, double
        //Frage 2:
        // Fehlerfrei
        doubleResult = x + y * b;
        System.out.println(doubleResult);
        //Frage 1:
        // 13.0, double
        //Frage 2:
        // Fehlerfrei
    }
}
