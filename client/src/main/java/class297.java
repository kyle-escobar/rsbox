public class class297 {
    static class523[] field3148;
    byte[] field3139;
    byte[] field3140;
    int field3141;
    int field3142;
    int field3144;
    int field3145;
    int field3146;
    int field3147;
    int field3150;

    class297() {
    }

    static final void method5686(int var0, int var1, int var2, int var3, int var4) {
        long var6 = class109.field1065.method4431(var0, var1, var2);
        int var8;
        int var9;
        int var10;
        int var11;
        int var15;
        int var24;
        if (0L != var6) {
            var8 = class109.field1065.method4435(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = var3;
            boolean var13 = 0L != var6;
            if (var13) {
                boolean var14 = (int) (var6 >>> 16 & 1L) == 1;
                var13 = !var14;
            }

            if (var13) {
                var11 = var4;
            }

            int[] var23 = class247.field2715.field5147;
            var24 = var1 * 4 + 24624 + (103 - var2) * 2048;
            var15 = class252.method7841(var6);
            class184 var16 = class98.method2042(var15);
            if (-1 != var16.field1934) {
                class537 var17 = class270.field2986[var16.field1934];
                if (var17 != null) {
                    int var18 = (var16.field1940 * 4 - var17.field5216) / 2;
                    int var19 = (var16.field1944 * 4 - var17.field5214) / 2;
                    var17.method9316(48 + var1 * 4 + var18, var19 + 4 * (104 - var2 - var16.field1944) + 48);
                }
            } else {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var23[var24] = var11;
                        var23[var24 + 512] = var11;
                        var23[var24 + 1024] = var11;
                        var23[var24 + 1536] = var11;
                    } else if (var9 == 1) {
                        var23[var24] = var11;
                        var23[var24 + 1] = var11;
                        var23[var24 + 2] = var11;
                        var23[var24 + 3] = var11;
                    } else if (var9 == 2) {
                        var23[var24 + 3] = var11;
                        var23[var24 + 3 + 512] = var11;
                        var23[var24 + 3 + 1024] = var11;
                        var23[1536 + var24 + 3] = var11;
                    } else if (var9 == 3) {
                        var23[var24 + 1536] = var11;
                        var23[1 + var24 + 1536] = var11;
                        var23[2 + var24 + 1536] = var11;
                        var23[var24 + 1536 + 3] = var11;
                    }
                }

                if (var10 == 3) {
                    if (var9 == 0) {
                        var23[var24] = var11;
                    } else if (var9 == 1) {
                        var23[var24 + 3] = var11;
                    } else if (var9 == 2) {
                        var23[var24 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var23[var24 + 1536] = var11;
                    }
                }

                if (var10 == 2) {
                    if (var9 == 3) {
                        var23[var24] = var11;
                        var23[var24 + 512] = var11;
                        var23[var24 + 1024] = var11;
                        var23[var24 + 1536] = var11;
                    } else if (var9 == 0) {
                        var23[var24] = var11;
                        var23[var24 + 1] = var11;
                        var23[var24 + 2] = var11;
                        var23[var24 + 3] = var11;
                    } else if (var9 == 1) {
                        var23[var24 + 3] = var11;
                        var23[512 + var24 + 3] = var11;
                        var23[var24 + 3 + 1024] = var11;
                        var23[1536 + var24 + 3] = var11;
                    } else if (var9 == 2) {
                        var23[var24 + 1536] = var11;
                        var23[1 + var24 + 1536] = var11;
                        var23[2 + var24 + 1536] = var11;
                        var23[var24 + 1536 + 3] = var11;
                    }
                }
            }
        }

        var6 = class109.field1065.method4574(var0, var1, var2);
        if (0L != var6) {
            var8 = class109.field1065.method4435(var0, var1, var2, var6);
            var9 = var8 >> 6 & 3;
            var10 = var8 & 31;
            var11 = class252.method7841(var6);
            class184 var12 = class98.method2042(var11);
            if (-1 != var12.field1934) {
                class537 var25 = class270.field2986[var12.field1934];
                if (null != var25) {
                    var24 = (var12.field1940 * 4 - var25.field5216) / 2;
                    var15 = (var12.field1944 * 4 - var25.field5214) / 2;
                    var25.method9316(var24 + 48 + var1 * 4, var15 + 48 + (104 - var2 - var12.field1944) * 4);
                }
            } else if (var10 == 9) {
                int var26 = 15658734;
                boolean var27 = var6 != 0L;
                if (var27) {
                    boolean var28 = (int) (var6 >>> 16 & 1L) == 1;
                    var27 = !var28;
                }

                if (var27) {
                    var26 = 15597568;
                }

                int[] var29 = class247.field2715.field5147;
                int var30 = (103 - var2) * 2048 + var1 * 4 + 24624;
                if (var9 != 0 && var9 != 2) {
                    var29[var30] = var26;
                    var29[1 + var30 + 512] = var26;
                    var29[var30 + 1024 + 2] = var26;
                    var29[var30 + 1536 + 3] = var26;
                } else {
                    var29[var30 + 1536] = var26;
                    var29[var30 + 1024 + 1] = var26;
                    var29[2 + var30 + 512] = var26;
                    var29[var30 + 3] = var26;
                }
            }
        }

        var6 = class109.field1065.method4434(var0, var1, var2);
        if (var6 != 0L) {
            var8 = class252.method7841(var6);
            class184 var20 = class98.method2042(var8);
            if (var20.field1934 != -1) {
                class537 var21 = class270.field2986[var20.field1934];
                if (null != var21) {
                    var11 = (var20.field1940 * 4 - var21.field5216) / 2;
                    int var22 = (var20.field1944 * 4 - var21.field5214) / 2;
                    var21.method9316(48 + var1 * 4 + var11, var22 + (104 - var2 - var20.field1944) * 4 + 48);
                }
            }
        }

    }
}
