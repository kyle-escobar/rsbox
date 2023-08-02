import java.awt.*;

public class class50 implements Runnable {
    static int field362;
    static Font field364;
    public volatile class37[] field365 = new class37[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; ++var1) {
                class37 var2 = this.field365[var1];
                if (var2 != null) {
                    var2.method531();
                }
            }
        } catch (Exception var3) {
            class524.method5856(null, var3);
        }

    }
}
