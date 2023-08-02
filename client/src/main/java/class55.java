import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class55 {
    static int field397;
    ExecutorService field398 = Executors.newSingleThreadExecutor();
    Future field396;

    class55() {
        this.field396 = this.field398.submit(new class103());
    }

    void method1079() {
        this.field398.shutdown();
        this.field398 = null;
    }

    boolean method1080() {
        return this.field396.isDone();
    }

    SecureRandom method1081() {
        try {
            return (SecureRandom) this.field396.get();
        } catch (Exception var3) {
            return class103.method5165();
        }
    }
}
