public final class class254 {
    public static class342 field2871;
    public class228 field2862;
    public class228 field2867;
    public long field2869 = 0L;
    int field2860;
    int field2861;
    int field2863 = 0;
    int field2864;
    int field2865;
    int field2866;
    int field2868;
    int field2870;

    class254() {
    }

    public static int method5005(int var0) {
        class196 var3 = (class196) class196.field2143.method5643(var0);
        class196 var2;
        if (null != var3) {
            var2 = var3;
        } else {
            byte[] var4 = class196.field2144.method6381(14, var0);
            var3 = new class196();
            if (null != var4) {
                var3.method3754(new class519(var4));
            }

            class196.field2143.method5640(var3, var0);
            var2 = var3;
        }

        int var8 = var2.field2142;
        int var5 = var2.field2140;
        int var6 = var2.field2141;
        int var7 = class329.field3579[var6 - var5];
        return class329.field3577[var8] >> var5 & var7;
    }
}
