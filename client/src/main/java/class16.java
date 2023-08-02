public class class16 implements class383 {
    public static final class16 field78 = new class16(1, "GET", true, false);
    public static final class16 field84 = new class16(0, "POST", true, true);
    static final class16 field77 = new class16(4, "DELETE", false, true);
    static final class16 field80 = new class16(3, "PATCH", false, true);
    static final class16 field81 = new class16(2, "PUT", false, true);
    boolean field79;
    boolean field85;
    int field82;
    String field83;

    class16(int var1, String var2, boolean var3, boolean var4) {
        this.field82 = var1;
        this.field83 = var2;
        this.field85 = var3;
        this.field79 = var4;
    }

    boolean method268() {
        return this.field85;
    }

    public String method272() {
        return this.field83;
    }

    boolean method270() {
        return this.field79;
    }

    public int method6917() {
        return this.field82;
    }
}
