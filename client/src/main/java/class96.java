public class class96 {
    public static class332[][] field884;
    public static class342 field885;
    static class347 field883;
    final class363 field880;
    final int field879;
    int field881 = 0;

    class96(class363 var1, String var2) {
        this.field880 = var1;
        this.field879 = var1.method6394();
    }

    boolean method1998() {
        this.field881 = 0;

        for (int var2 = 0; var2 < this.field879; ++var2) {
            if (!this.field880.method6628(var2) || this.field880.method6611(var2)) {
                ++this.field881;
            }
        }

        return this.field881 >= this.field879;
    }
}
