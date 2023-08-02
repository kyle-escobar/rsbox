import java.security.SecureRandom;
import java.util.concurrent.Callable;

public class class103 implements Callable {
    static class31 field1019;
    static int field1020;

    class103() {
    }

    static SecureRandom method5165() {
        SecureRandom var1 = new SecureRandom();
        var1.nextInt();
        return var1;
    }

    public Object call() {
        return method5165();
    }
}
