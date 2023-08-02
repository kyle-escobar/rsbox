public class class247 extends class476 {
    static class342 field2714;
    static class523 field2715;
    class221[] field2716;

    class247(class342 var1, class342 var2, int var3, boolean var4) {
        class368 var5 = new class368();
        int var6 = var1.method6393(var3);
        this.field2716 = new class221[var6];
        int[] var7 = var1.method6392(var3);

        for (int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.method6381(var3, var7[var8]);
            class219 var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for (class219 var12 = (class219) var5.method6706(); null != var12; var12 = (class219) var5.method6687()) {
                if (var12.field2402 == var11) {
                    var10 = var12;
                    break;
                }
            }

            if (var10 == null) {
                byte[] var13;
                if (var4) {
                    var13 = var2.method6389(0, var11);
                } else {
                    var13 = var2.method6389(var11, 0);
                }

                var10 = new class219(var11, var13);
                var5.method6680(var10);
            }

            this.field2716[var7[var8]] = new class221(var9, var10);
        }

    }

    public static class247 method2455(class342 var0, class342 var1, int var2, boolean var3) {
        boolean var5 = true;
        int[] var6 = var0.method6392(var2);

        for (int var7 = 0; var7 < var6.length; ++var7) {
            byte[] var8 = var0.method6389(var2, var6[var7]);
            if (null == var8) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 255) << 8 | var8[1] & 255;
                byte[] var10;
                if (var3) {
                    var10 = var1.method6389(0, var9);
                } else {
                    var10 = var1.method6389(var9, 0);
                }

                if (var10 == null) {
                    var5 = false;
                }
            }
        }

        if (!var5) {
            return null;
        } else {
            try {
                return new class247(var0, var1, var2, var3);
            } catch (Exception var11) {
                return null;
            }
        }
    }

    public boolean method4738(int var1) {
        return this.field2716[var1].field2443;
    }
}
