import java.util.concurrent.Future;

public class class4 {
    static int field24;
    static int[][] field26;
    String field23;
    Future field25;

    class4(Future var1) {
        this.field25 = var1;
    }

    class4(String var1) {
        this.method72(var1);
    }

    static int method85(int var0, class81 var1, boolean var2) {
        if (var0 == 7463) {
            boolean var4 = class63.field483[--class63.field479] == 1;
            Client.method299(var4);
            return 1;
        } else {
            return 2;
        }
    }

    void method72(String var1) {
        if (var1 == null) {
            var1 = "";
        }

        this.field23 = var1;
        if (this.field25 != null) {
            this.field25.cancel(true);
            this.field25 = null;
        }

    }

    public final String method73() {
        return this.field23;
    }

    public boolean method74() {
        return null != this.field23 || null == this.field25;
    }

    public final boolean method71() {
        return this.method74() || this.field25.isDone();
    }

    public final class3 method76() {
        if (this.method74()) {
            return new class3(this.field23);
        } else if (!this.method71()) {
            return null;
        } else {
            try {
                return (class3) this.field25.get();
            } catch (Exception var4) {
                String var3 = "Error retrieving REST request reply";
                System.err.println(var3 + "\r\n" + var4);
                this.method72(var3);
                return new class3(var3);
            }
        }
    }
}
