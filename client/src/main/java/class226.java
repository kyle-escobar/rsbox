import java.util.Arrays;

public class class226 {
    public static final class226 field2477 = new class226(1, 32, 32);
    static final class226 field2478 = new class226(4, 16, 16);
    static final class226 field2479 = new class226(3, 128, 128);
    static final class226 field2480 = new class226(0, 48, 48);
    static final class226 field2481 = new class226(6, 64, 64);
    static final class226 field2482 = new class226(5, 96, 96);
    static final class226 field2483 = new class226(2, 8, 8);
    static final class226[] field2487 = method2422();

    static {
        Arrays.sort(field2487, new class212());
    }

    public final int field2485;
    public final int field2486;
    final int field2484;

    class226(int var1, int var2, int var3) {
        this.field2484 = var1;
        this.field2485 = var2;
        this.field2486 = var3;
    }

    static class226[] method2422() {
        return new class226[]{field2480, field2477, field2483, field2479, field2478, field2482, field2481};
    }

    int method4267() {
        return this.field2485 * this.field2486;
    }
}
