public class class446 {
    static final int[] field4701 = new int[2048];
    static final int[] field4702 = new int[2048];

    static {
        double var0 = 0.0030679615757712823;

        for (int var2 = 0; var2 < 2048; ++var2) {
            field4701[var2] = (int) (65536.0 * Math.sin(var0 * (double) var2));
            field4702[var2] = (int) (65536.0 * Math.cos(var0 * (double) var2));
        }

    }

    class446() throws Throwable {
    }
}
