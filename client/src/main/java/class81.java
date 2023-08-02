public class class81 extends class476 {
    static class290 field708 = new class290(128);
    static int field718;
    static String field719;
    class469[] field717;
    int field711;
    int field714;
    int field715;
    int field716;
    int[] field712;
    int[] field713;
    String field709;
    String[] field710;

    class81() {
    }

    static class81 method1382(int var0) {
        class81 var2 = (class81) field708.method5643(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class130.field1226.method6381(var0, 0);
            if (null == var3) {
                return null;
            } else {
                var2 = class34.method520(var3);
                field708.method5640(var2, var0);
                return var2;
            }
        }
    }

    static class81 method652(int var0, int var1, int var2) {
        int var4 = class351.method2180(var1, var0);
        class81 var5 = method499(var4, var0);
        if (var5 != null) {
            return var5;
        } else {
            var4 = class351.method2583(var2, var0);
            var5 = method499(var4, var0);
            if (var5 != null) {
                return var5;
            } else {
                int var6 = var0 + -512;
                var5 = method499(var6, var0);
                return var5;
            }
        }
    }

    static class81 method499(int var0, int var1) {
        class81 var3 = (class81) field708.method5643((long) var0 << 16);
        if (null != var3) {
            return var3;
        } else {
            String var4 = String.valueOf(var0);
            int var5 = class130.field1226.method6395(var4);
            if (var5 == -1) {
                return null;
            } else {
                byte[] var6 = class130.field1226.method6388(var5);
                if (var6 != null) {
                    if (var6.length <= 1) {
                        return null;
                    }

                    var3 = class34.method520(var6);
                    if (null != var3) {
                        field708.method5640(var3, (long) var0 << 16);
                        return var3;
                    }
                }

                return null;
            }
        }
    }

    class469[] method1743(int var1) {
        return new class469[var1];
    }
}
