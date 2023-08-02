public final class class504 {
    static class496 field5064 = new class496();

    class504() throws Throwable {
    }

    public static int method8546(byte[] var0, int var1, byte[] var2, int var3, int var4) {
        synchronized (field5064) {
            field5064.field5007 = var2;
            field5064.field5002 = var4;
            field5064.field5010 = var0;
            field5064.field5011 = 0;
            field5064.field5012 = var1;
            field5064.field5017 = 0;
            field5064.field5016 = 0;
            field5064.field5009 = 0;
            field5064.field5013 = 0;
            method8548(field5064);
            var1 -= field5064.field5012;
            field5064.field5007 = null;
            field5064.field5010 = null;
            return var1;
        }
    }

    static void method8547(class496 var0) {
        byte var2 = var0.field5023;
        int var3 = var0.field5008;
        int var4 = var0.field5014;
        int var5 = var0.field5021;
        int[] var6 = class501.field5053;
        int var7 = var0.field5020;
        byte[] var8 = var0.field5010;
        int var9 = var0.field5011;
        int var10 = var0.field5012;
        int var12 = var0.field5026 + 1;

        label61:
        while (true) {
            if (var3 > 0) {
                while (true) {
                    if (var10 == 0) {
                        break label61;
                    }

                    if (var3 == 1) {
                        if (var10 == 0) {
                            var3 = 1;
                            break label61;
                        }

                        var8[var9] = var2;
                        ++var9;
                        --var10;
                        break;
                    }

                    var8[var9] = var2;
                    --var3;
                    ++var9;
                    --var10;
                }
            }

            while (var4 != var12) {
                var2 = (byte) var5;
                var7 = var6[var7];
                byte var1 = (byte) var7;
                var7 >>= 8;
                ++var4;
                if (var1 != var5) {
                    var5 = var1;
                    if (var10 == 0) {
                        var3 = 1;
                        break label61;
                    }

                    var8[var9] = var2;
                    ++var9;
                    --var10;
                } else {
                    if (var4 != var12) {
                        var3 = 2;
                        var7 = var6[var7];
                        var1 = (byte) var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                            if (var1 != var5) {
                                var5 = var1;
                            } else {
                                var3 = 3;
                                var7 = var6[var7];
                                var1 = (byte) var7;
                                var7 >>= 8;
                                ++var4;
                                if (var4 != var12) {
                                    if (var1 != var5) {
                                        var5 = var1;
                                    } else {
                                        var7 = var6[var7];
                                        var1 = (byte) var7;
                                        var7 >>= 8;
                                        ++var4;
                                        var3 = (var1 & 255) + 4;
                                        var7 = var6[var7];
                                        var5 = (byte) var7;
                                        var7 >>= 8;
                                        ++var4;
                                    }
                                }
                            }
                        }
                        continue label61;
                    }

                    if (var10 == 0) {
                        var3 = 1;
                        break label61;
                    }

                    var8[var9] = var2;
                    ++var9;
                    --var10;
                }
            }

            var3 = 0;
            break;
        }

        int var13 = var0.field5013;
        var0.field5013 += 0;
        if (var0.field5013 < var13) {
        }

        var0.field5023 = var2;
        var0.field5008 = var3;
        var0.field5014 = var4;
        var0.field5021 = var5;
        class501.field5053 = var6;
        var0.field5020 = var7;
        var0.field5010 = var8;
        var0.field5011 = var9;
        var0.field5012 = var10;
    }

    static void method8548(class496 var0) {
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        boolean var11 = false;
        boolean var12 = false;
        boolean var13 = false;
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        var0.field5018 = -331702915;
        if (class501.field5053 == null) {
            class501.field5053 = new int[var0.field5018 * -911678688];
        }

        boolean var26 = true;

        while (true) {
            while (var26) {
                byte var1 = method8567(var0);
                if (var1 == 23) {
                    return;
                }

                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8567(var0);
                var1 = method8550(var0);
                if (var1 != 0) {
                }

                var0.field5019 = 0;
                var1 = method8567(var0);
                var0.field5019 = var0.field5019 << 8 | var1 & 255;
                var1 = method8567(var0);
                var0.field5019 = var0.field5019 << 8 | var1 & 255;
                var1 = method8567(var0);
                var0.field5019 = var0.field5019 << 8 | var1 & 255;

                int var35;
                for (var35 = 0; var35 < 16; ++var35) {
                    var1 = method8550(var0);
                    var0.field5027[var35] = var1 == 1;
                }

                for (var35 = 0; var35 < 256; ++var35) {
                    var0.field5004[var35] = false;
                }

                int var36;
                for (var35 = 0; var35 < 16; ++var35) {
                    if (var0.field5027[var35]) {
                        for (var36 = 0; var36 < 16; ++var36) {
                            var1 = method8550(var0);
                            if (var1 == 1) {
                                var0.field5004[var35 * 16 + var36] = true;
                            }
                        }
                    }
                }

                method8549(var0);
                int var38 = var0.field5025 + 2;
                int var39 = method8559(3, var0);
                int var40 = method8559(15, var0);

                for (var35 = 0; var35 < var40; ++var35) {
                    var36 = 0;

                    while (true) {
                        var1 = method8550(var0);
                        if (var1 == 0) {
                            var0.field5032[var35] = (byte) var36;
                            break;
                        }

                        ++var36;
                    }
                }

                byte[] var27 = new byte[6];

                int var29;
                for (var29 = 0; var29 < var39; var29 = (byte) (var29 + 1)) {
                    var27[var29] = (byte) var29;
                }

                int var28;
                for (var35 = 0; var35 < var40; ++var35) {
                    var29 = var0.field5032[var35];

                    for (var28 = var27[var29]; var29 > 0; var29 = (byte) (var29 - 1)) {
                        var27[var29] = var27[var29 - 1];
                    }

                    var27[0] = (byte) var28;
                    var0.field5031[var35] = (byte) var28;
                }

                int var37;
                for (var37 = 0; var37 < var39; ++var37) {
                    int var48 = method8559(5, var0);

                    for (var35 = 0; var35 < var38; ++var35) {
                        while (true) {
                            var1 = method8550(var0);
                            if (var1 == 0) {
                                var0.field5036[var37][var35] = (byte) var48;
                                break;
                            }

                            var1 = method8550(var0);
                            if (var1 == 0) {
                                ++var48;
                            } else {
                                --var48;
                            }
                        }
                    }
                }

                for (var37 = 0; var37 < var39; ++var37) {
                    byte var2 = 32;
                    byte var3 = 0;

                    for (var35 = 0; var35 < var38; ++var35) {
                        if (var0.field5036[var37][var35] > var3) {
                            var3 = var0.field5036[var37][var35];
                        }

                        if (var0.field5036[var37][var35] < var2) {
                            var2 = var0.field5036[var37][var35];
                        }
                    }

                    method8553(var0.field5015[var37], var0.field5035[var37], var0.field5001[var37], var0.field5036[var37], var2, var3, var38);
                    var0.field5037[var37] = var2;
                }

                int var41 = var0.field5025 + 1;
                int var42 = -1;
                int var43 = 0;

                for (var35 = 0; var35 <= 255; ++var35) {
                    var0.field5022[var35] = 0;
                }

                var29 = 4095;

                int var53;
                for (var53 = 15; var53 >= 0; --var53) {
                    for (var28 = 15; var28 >= 0; --var28) {
                        var0.field5029[var29] = (byte) (var53 * 16 + var28);
                        --var29;
                    }

                    var0.field5030[var53] = var29 + 1;
                }

                int var45 = 0;
                byte var52;
                if (var43 == 0) {
                    ++var42;
                    var43 = 50;
                    var52 = var0.field5031[var42];
                    var22 = var0.field5037[var52];
                    var23 = var0.field5015[var52];
                    var25 = var0.field5001[var52];
                    var24 = var0.field5035[var52];
                }

                --var43;
                int var49 = var22;

                int var50;
                byte var51;
                for (var50 = method8559(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                    ++var49;
                    var51 = method8550(var0);
                }

                int var44 = var25[var50 - var24[var49]];

                while (true) {
                    int[] var10000;
                    int var10002;
                    while (var44 != var41) {
                        if (var44 != 0 && var44 != 1) {
                            int var33 = var44 - 1;
                            int var30;
                            if (var33 < 16) {
                                var30 = var0.field5030[0];

                                for (var1 = var0.field5029[var30 + var33]; var33 > 3; var33 -= 4) {
                                    int var34 = var30 + var33;
                                    var0.field5029[var34] = var0.field5029[var34 - 1];
                                    var0.field5029[var34 - 1] = var0.field5029[var34 - 2];
                                    var0.field5029[var34 - 2] = var0.field5029[var34 - 3];
                                    var0.field5029[var34 - 3] = var0.field5029[var34 - 4];
                                }

                                while (var33 > 0) {
                                    var0.field5029[var30 + var33] = var0.field5029[var30 + var33 - 1];
                                    --var33;
                                }

                                var0.field5029[var30] = var1;
                            } else {
                                int var31 = var33 / 16;
                                int var32 = var33 % 16;
                                var30 = var0.field5030[var31] + var32;

                                for (var1 = var0.field5029[var30]; var30 > var0.field5030[var31]; --var30) {
                                    var0.field5029[var30] = var0.field5029[var30 - 1];
                                }

                                for (var10002 = var0.field5030[var31]++; var31 > 0; --var31) {
                                    var10002 = var0.field5030[var31]--;
                                    var0.field5029[var0.field5030[var31]] = var0.field5029[var0.field5030[var31 - 1] + 16 - 1];
                                }

                                var10002 = var0.field5030[0]--;
                                var0.field5029[var0.field5030[0]] = var1;
                                if (var0.field5030[0] == 0) {
                                    var29 = 4095;

                                    for (var53 = 15; var53 >= 0; --var53) {
                                        for (var28 = 15; var28 >= 0; --var28) {
                                            var0.field5029[var29] = var0.field5029[var0.field5030[var53] + var28];
                                            --var29;
                                        }

                                        var0.field5030[var53] = var29 + 1;
                                    }
                                }
                            }

                            var10002 = var0.field5022[var0.field5028[var1 & 255] & 255]++;
                            class501.field5053[var45] = var0.field5028[var1 & 255] & 255;
                            ++var45;
                            if (var43 == 0) {
                                ++var42;
                                var43 = 50;
                                var52 = var0.field5031[var42];
                                var22 = var0.field5037[var52];
                                var23 = var0.field5015[var52];
                                var25 = var0.field5001[var52];
                                var24 = var0.field5035[var52];
                            }

                            --var43;
                            var49 = var22;

                            for (var50 = method8559(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                                ++var49;
                                var51 = method8550(var0);
                            }

                            var44 = var25[var50 - var24[var49]];
                        } else {
                            int var46 = -1;
                            int var47 = 1;

                            do {
                                if (var44 == 0) {
                                    var46 += var47;
                                } else if (var44 == 1) {
                                    var46 += var47 * 2;
                                }

                                var47 *= 2;
                                if (var43 == 0) {
                                    ++var42;
                                    var43 = 50;
                                    var52 = var0.field5031[var42];
                                    var22 = var0.field5037[var52];
                                    var23 = var0.field5015[var52];
                                    var25 = var0.field5001[var52];
                                    var24 = var0.field5035[var52];
                                }

                                --var43;
                                var49 = var22;

                                for (var50 = method8559(var22, var0); var50 > var23[var49]; var50 = var50 << 1 | var51) {
                                    ++var49;
                                    var51 = method8550(var0);
                                }

                                var44 = var25[var50 - var24[var49]];
                            } while (var44 == 0 || var44 == 1);

                            ++var46;
                            var1 = var0.field5028[var0.field5029[var0.field5030[0]] & 255];
                            var10000 = var0.field5022;

                            for (var10000[var1 & 255] += var46; var46 > 0; --var46) {
                                class501.field5053[var45] = var1 & 255;
                                ++var45;
                            }
                        }
                    }

                    var0.field5008 = 0;
                    var0.field5023 = 0;
                    var0.field5024[0] = 0;

                    for (var35 = 1; var35 <= 256; ++var35) {
                        var0.field5024[var35] = var0.field5022[var35 - 1];
                    }

                    for (var35 = 1; var35 <= 256; ++var35) {
                        var10000 = var0.field5024;
                        var10000[var35] += var0.field5024[var35 - 1];
                    }

                    for (var35 = 0; var35 < var45; ++var35) {
                        var1 = (byte) (class501.field5053[var35] & 255);
                        var10000 = class501.field5053;
                        int var10001 = var0.field5024[var1 & 255];
                        var10000[var10001] |= var35 << 8;
                        var10002 = var0.field5024[var1 & 255]++;
                    }

                    var0.field5020 = class501.field5053[var0.field5019] >> 8;
                    var0.field5014 = 0;
                    var0.field5020 = class501.field5053[var0.field5020];
                    var0.field5021 = (byte) (var0.field5020 & 255);
                    var0.field5020 >>= 8;
                    ++var0.field5014;
                    var0.field5026 = var45;
                    method8547(var0);
                    if (var0.field5014 == var0.field5026 + 1 && var0.field5008 == 0) {
                        var26 = true;
                        break;
                    }

                    var26 = false;
                    break;
                }
            }

            return;
        }
    }

    static byte method8567(class496 var0) {
        return (byte) method8559(8, var0);
    }

    static byte method8550(class496 var0) {
        return (byte) method8559(1, var0);
    }

    static int method8559(int var0, class496 var1) {
        while (var1.field5017 < var0) {
            var1.field5016 = var1.field5016 << 8 | var1.field5007[var1.field5002] & 255;
            var1.field5017 += 8;
            ++var1.field5002;
            ++var1.field5009;
            if (var1.field5009 == 0) {
            }
        }

        int var2 = var1.field5016 >> var1.field5017 - var0 & (1 << var0) - 1;
        var1.field5017 -= var0;
        return var2;
    }

    static void method8549(class496 var0) {
        var0.field5025 = 0;

        for (int var1 = 0; var1 < 256; ++var1) {
            if (var0.field5004[var1]) {
                var0.field5028[var0.field5025] = (byte) var1;
                ++var0.field5025;
            }
        }

    }

    static void method8553(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
        int var7 = 0;

        int var8;
        for (var8 = var4; var8 <= var5; ++var8) {
            for (int var9 = 0; var9 < var6; ++var9) {
                if (var3[var9] == var8) {
                    var2[var7] = var9;
                    ++var7;
                }
            }
        }

        for (var8 = 0; var8 < 23; ++var8) {
            var1[var8] = 0;
        }

        for (var8 = 0; var8 < var6; ++var8) {
            ++var1[var3[var8] + 1];
        }

        for (var8 = 1; var8 < 23; ++var8) {
            var1[var8] += var1[var8 - 1];
        }

        for (var8 = 0; var8 < 23; ++var8) {
            var0[var8] = 0;
        }

        int var10 = 0;

        for (var8 = var4; var8 <= var5; ++var8) {
            var10 += var1[var8 + 1] - var1[var8];
            var0[var8] = var10 - 1;
            var10 <<= 1;
        }

        for (var8 = var4 + 1; var8 <= var5; ++var8) {
            var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
        }

    }
}
