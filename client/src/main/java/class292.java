public class class292 {
    static class177 field3129;

    class292() throws Throwable {
    }

    public static final void method354(long var0) {
        if (var0 > 0L) {
            if (var0 % 10L == 0L) {
                long var2 = var0 - 1L;

                try {
                    Thread.sleep(var2);
                } catch (InterruptedException var7) {
                }

                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var6) {
                }
            } else {
                try {
                    Thread.sleep(var0);
                } catch (InterruptedException var5) {
                }
            }

        }
    }

    static final boolean method5655(byte[] var0, int var1, int var2) {
        boolean var4 = true;
        class519 var5 = new class519(var0);
        int var6 = -1;

        label57:
        while (true) {
            int var7 = var5.method8766();
            if (var7 == 0) {
                return var4;
            }

            var6 += var7;
            int var8 = 0;
            boolean var9 = false;

            while (true) {
                int var10;
                while (!var9) {
                    var10 = var5.method8764();
                    if (var10 == 0) {
                        continue label57;
                    }

                    var8 += var10 - 1;
                    int var11 = var8 & 63;
                    int var12 = var8 >> 6 & 63;
                    int var13 = var5.method8748() >> 2;
                    int var14 = var12 + var1;
                    int var15 = var2 + var11;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class184 var16 = class98.method2042(var6);
                        if (var13 != 22 || !Client.field1549 || 0 != var16.field1924 || var16.field1922 == 1 || var16.field1943) {
                            if (!var16.method3458()) {
                                ++Client.field1595;
                                var4 = false;
                            }

                            var9 = true;
                        }
                    }
                }

                var10 = var5.method8764();
                if (var10 == 0) {
                    break;
                }

                var5.method8748();
            }
        }
    }
}
