package fundamentals;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {
        // Implicit conversion
        double a = 1;
        System.out.println(a);

        // Explicit conversion (CAST)
        float b = (float) 1.12345;
        System.out.println(b);

        int c = 340;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999999;
        int f = (int) e;
        System.out.println(f);
    }

    
}
