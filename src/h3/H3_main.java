package h3;

public class H3_main {
    public static void main(String[] args) {
        float celsiusFloat = 14.2F;
        float fahrenheitFloat = 0F;
        double celsiusDouble = 14.2;
        double fahrenheitDouble = 0;
        fahrenheitDouble = celsiusDouble * 9 / 5 + 32;
        fahrenheitFloat = celsiusFloat * 9 / 5 + 32;
        System.out.println(fahrenheitDouble);
        System.out.println(fahrenheitFloat);
    }
}
