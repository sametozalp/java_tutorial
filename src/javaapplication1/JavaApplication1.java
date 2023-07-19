package javaapplication1;

public class JavaApplication1 {

    public static int toplama(int a, int b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        
        toplama(2,3);

        toplama(2,3,5);
        
    }
}
