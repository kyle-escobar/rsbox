public class class238 {
    int field2641;
    int field2642;
    int field2644;

    class238() {
    }

    public static final class523 method4614(int var0, int var1, int var2, int var3, int var4, boolean var5) {
        if (var1 == -1) {
            var4 = 0;
        } else if (var4 == 2 && var1 != 1) {
            var4 = 1;
        }

        long var7 = ((long) var3 << 42) + ((long) var1 << 16) + (long) var0 + ((long) var2 << 38) + ((long) var4 << 40);
        class523 var9;
        if (!var5) {
            var9 = (class523) class185.field2014.method5643(var7);
            if (null != var9) {
                return var9;
            }
        }

        class185 var10 = class185.method2355(var0);
        if (var1 > 1 && null != var10.field2012) {
            int var11 = -1;

            for (int var12 = 0; var12 < 10; ++var12) {
                if (var1 >= var10.field1965[var12] && 0 != var10.field1965[var12]) {
                    var11 = var10.field2012[var12];
                }
            }

            if (var11 != -1) {
                var10 = class185.method2355(var11);
            }
        }

        class249 var21 = var10.method3501(1);
        if (var21 == null) {
            return null;
        } else {
            class523 var22 = null;
            if (var10.field1999 != -1) {
                var22 = method4614(var10.field1997, 10, 1, 0, 0, true);
                if (var22 == null) {
                    return null;
                }
            } else if (-1 != var10.field2010) {
                var22 = method4614(var10.field1987, var1, var2, var3, 0, false);
                if (var22 == null) {
                    return null;
                }
            } else if (-1 != var10.field1977) {
                var22 = method4614(var10.field2006, var1, 0, 0, 0, false);
                if (var22 == null) {
                    return null;
                }
            }

            int[] var13 = class535.field5201;
            int var14 = class535.field5202;
            int var15 = class535.field5203;
            float[] var16 = class535.field5204;
            int[] var17 = new int[4];
            class535.method9240(var17);
            var9 = new class523(36, 32);
            class229.method4290(var9.field5147, 36, 32, null);
            class535.method9301();
            class229.method4291();
            class229.method4294(16, 16);
            class229.field2513.field2825 = false;
            if (var10.field1977 != -1) {
                var22.method9139(0, 0);
            }

            int var18 = var10.field1969;
            if (var5) {
                var18 = (int) ((double) var18 * 1.5);
            } else if (var2 == 2) {
                var18 = (int) ((double) var18 * 1.04);
            }

            int var19 = class229.field2511[var10.field1970] * var18 >> 16;
            int var20 = var18 * class229.field2512[var10.field1970] >> 16;
            var21.method4763();
            var21.method4780(0, var10.field1960, var10.field1972, var10.field1970, var10.field1973, var21.field2507 / 2 + var19 + var10.field1971, var10.field1971 + var20);
            if (-1 != var10.field2010) {
                var22.method9139(0, 0);
            }

            if (var2 >= 1) {
                var9.method9032(1);
            }

            if (var2 >= 2) {
                var9.method9032(16777215);
            }

            if (var3 != 0) {
                var9.method9033(var3);
            }

            class229.method4290(var9.field5147, 36, 32, null);
            if (var10.field1999 != -1) {
                var22.method9139(0, 0);
            }

            if (var4 == 1 || var4 == 2 && var10.field1975 == 1) {
                class224.field2460.method7163(class185.method3288(var1), 0, 9, 16776960, 1);
            }

            if (!var5) {
                class185.field2014.method5640(var9, var7);
            }

            class229.method4290(var13, var14, var15, var16);
            class535.method9226(var17);
            class229.method4291();
            class229.field2513.field2825 = true;
            return var9;
        }
    }
}
