package gr.aueb.cl.ch5;

public class OverloadingApp {

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, long b, int c) {
        return a + (int)b + c;

    }
}
