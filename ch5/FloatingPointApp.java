package gr.aueb.cl.ch5;

public class FloatingPointApp {

    public static void main(String[] args) {
        float floatNum = 4.5F;
        double doubleNum = 20d;
        int num = 23;
        double result = 0.0; //0.0 ή 0

        result = floatNum + doubleNum + num;

        System.out.printf("%.2f + %.2f + %d = %e",
                floatNum, doubleNum, num, result);
    }
}
