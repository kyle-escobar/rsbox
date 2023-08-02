public final class class88 {
    static final int[] field802 = new int[]{1, 2, 4, 8};
    static final int[] field803 = new int[]{16, 32, 64, 128};
    static final int[] field806 = new int[]{1, -1, -1, 1};
    static final int[] field807 = new int[]{-1, -1, 1, 1};
    static final int[] field809 = new int[]{0, -1, 0, 1};
    static final int[] field812 = new int[]{1, 0, -1, 0};
    static byte[][][] field804 = new byte[4][104][104];
    static int field798 = 99;
    static int field808 = (int) (Math.random() * 33.0) - 16;
    static int field811 = (int) (Math.random() * 17.0) - 8;
    static int[] field801;
    static int[][][] field797 = new int[4][105][105];
    static short[][][] field799;
    static short[][][] field800;

    class88() throws Throwable {
    }

    static void method6368() {
        field798 = 99;
        field799 = new short[4][104][104];
        field800 = new short[4][104][104];
        class15.field75 = new byte[4][104][104];
        class108.field1062 = new byte[4][104][104];
        class433.field4647 = new int[4][105][105];
        class190.field2039 = new byte[4][105][105];
        class153.field1394 = new int[105][105];
        class168.field1803 = new int[104];
        class347.field3857 = new int[104];
        field801 = new int[104];
        class384.field4409 = new int[104];
        class163.field1769 = new int[104];
    }

    static void method3293() {
        field799 = null;
        field800 = null;
        class15.field75 = null;
        class108.field1062 = null;
        class433.field4647 = null;
        class190.field2039 = null;
        class153.field1394 = null;
        class168.field1803 = null;
        class347.field3857 = null;
        field801 = null;
        class384.field4409 = null;
        class163.field1769 = null;
    }

    static void method3850(int var0, int var1, int var2, int var3) {
        for (int var5 = var1; var5 <= var3 + var1; ++var5) {
            for (int var6 = var0; var6 <= var0 + var2; ++var6) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class190.field2039[0][var6][var5] = 127;
                    if (var0 == var6 && var6 > 0) {
                        field797[0][var6][var5] = field797[0][var6 - 1][var5];
                    }

                    if (var0 + var2 == var6 && var6 < 103) {
                        field797[0][var6][var5] = field797[0][var6 + 1][var5];
                    }

                    if (var1 == var5 && var5 > 0) {
                        field797[0][var6][var5] = field797[0][var6][var5 - 1];
                    }

                    if (var5 == var3 + var1 && var5 < 103) {
                        field797[0][var6][var5] = field797[0][var6][var5 + 1];
                    }
                }
            }
        }

    }

    static void method1485(byte[] var0, int var1, int var2, int var3, int var4, class218[] var5) {
        int var8;
        int var9;
        for (int var7 = 0; var7 < 4; ++var7) {
            for (var8 = 0; var8 < 64; ++var8) {
                for (var9 = 0; var9 < 64; ++var9) {
                    if (var8 + var1 > 0 && var1 + var8 < 103 && var2 + var9 > 0 && var2 + var9 < 103) {
                        int[] var10000 = var5[var7].field2393[var1 + var8];
                        var10000[var9 + var2] &= -16777217;
                    }
                }
            }
        }

        class519 var13 = new class519(var0);

        for (var8 = 0; var8 < 4; ++var8) {
            for (var9 = 0; var9 < 64; ++var9) {
                for (int var10 = 0; var10 < 64; ++var10) {
                    int var11 = var1 + var9;
                    int var12 = var2 + var10;
                    method1892(var13, var8, var11, var12, var3 + var11, var4 + var12, 0);
                }
            }
        }

    }

    static void method3289(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class218[] var10) {
        int var13;
        for (int var12 = 0; var12 < 8; ++var12) {
            for (var13 = 0; var13 < 8; ++var13) {
                if (var12 + var2 > 0 && var12 + var2 < 103 && var13 + var3 > 0 && var3 + var13 < 103) {
                    int[] var10000 = var10[var1].field2393[var2 + var12];
                    var10000[var3 + var13] &= -16777217;
                }
            }
        }

        class519 var30 = new class519(var0);

        for (var13 = 0; var13 < 4; ++var13) {
            for (int var14 = 0; var14 < 64; ++var14) {
                for (int var15 = 0; var15 < 64; ++var15) {
                    if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                        int var18 = var14 & 7;
                        int var19 = var15 & 7;
                        int var20 = var7 & 3;
                        int var17;
                        if (var20 == 0) {
                            var17 = var18;
                        } else if (var20 == 1) {
                            var17 = var19;
                        } else if (var20 == 2) {
                            var17 = 7 - var18;
                        } else {
                            var17 = 7 - var19;
                        }

                        int var21 = var17 + var2;
                        int var24 = var14 & 7;
                        int var25 = var15 & 7;
                        int var26 = var7 & 3;
                        int var23;
                        if (var26 == 0) {
                            var23 = var25;
                        } else if (var26 == 1) {
                            var23 = 7 - var24;
                        } else if (var26 == 2) {
                            var23 = 7 - var25;
                        } else {
                            var23 = var24;
                        }

                        int var27 = var3 + var23;
                        int var28 = var2 + var8 + (var14 & 7);
                        int var29 = var9 + var3 + (var15 & 7);
                        method1892(var30, var1, var21, var27, var28, var29, var7);
                    } else {
                        method1892(var30, 0, -1, -1, 0, 0, 0);
                    }
                }
            }
        }

    }

    static void method1192(int var0, int var1, int var2) {
        int var4;
        for (var4 = 0; var4 < 8; ++var4) {
            for (int var5 = 0; var5 < 8; ++var5) {
                field797[var0][var1 + var4][var2 + var5] = 0;
            }
        }

        if (var1 > 0) {
            for (var4 = 1; var4 < 8; ++var4) {
                field797[var0][var1][var2 + var4] = field797[var0][var1 - 1][var2 + var4];
            }
        }

        if (var2 > 0) {
            for (var4 = 1; var4 < 8; ++var4) {
                field797[var0][var4 + var1][var2] = field797[var0][var1 + var4][var2 - 1];
            }
        }

        if (var1 > 0 && field797[var0][var1 - 1][var2] != 0) {
            field797[var0][var1][var2] = field797[var0][var1 - 1][var2];
        } else if (var2 > 0 && field797[var0][var1][var2 - 1] != 0) {
            field797[var0][var1][var2] = field797[var0][var1][var2 - 1];
        } else if (var1 > 0 && var2 > 0 && field797[var0][var1 - 1][var2 - 1] != 0) {
            field797[var0][var1][var2] = field797[var0][var1 - 1][var2 - 1];
        }

    }

    static void method1892(class519 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
        int var9;
        if (var8) {
            field804[var1][var2][var3] = 0;

            while (true) {
                var9 = var0.method8750();
                if (var9 == 0) {
                    if (var1 == 0) {
                        field797[0][var2][var3] = -method2160(var4 + 932731, var5 + 556238) * 8;
                    } else {
                        field797[var1][var2][var3] = field797[var1 - 1][var2][var3] - 240;
                    }
                    break;
                }

                if (var9 == 1) {
                    int var10 = var0.method8748();
                    if (var10 == 1) {
                        var10 = 0;
                    }

                    if (var1 == 0) {
                        field797[0][var2][var3] = 8 * -var10;
                    } else {
                        field797[var1][var2][var3] = field797[var1 - 1][var2][var3] - var10 * 8;
                    }
                    break;
                }

                if (var9 <= 49) {
                    field800[var1][var2][var3] = (short) var0.method9001();
                    class15.field75[var1][var2][var3] = (byte) ((var9 - 2) / 4);
                    class108.field1062[var1][var2][var3] = (byte) (var6 + (var9 - 2) & 3);
                } else if (var9 <= 81) {
                    field804[var1][var2][var3] = (byte) (var9 - 49);
                } else {
                    field799[var1][var2][var3] = (short) (var9 - 81);
                }
            }
        } else {
            while (true) {
                var9 = var0.method8750();
                if (var9 == 0) {
                    break;
                }

                if (var9 == 1) {
                    var0.method8748();
                    break;
                }

                if (var9 <= 49) {
                    var0.method9001();
                }
            }
        }

    }

    static void method266(byte[] var0, int var1, int var2, class234 var3, class218[] var4) {
        class519 var6 = new class519(var0);
        int var7 = -1;

        while (true) {
            int var8 = var6.method8766();
            if (var8 == 0) {
                return;
            }

            var7 += var8;
            int var9 = 0;

            while (true) {
                int var10 = var6.method8764();
                if (var10 == 0) {
                    break;
                }

                var9 += var10 - 1;
                int var11 = var9 & 63;
                int var12 = var9 >> 6 & 63;
                int var13 = var9 >> 12;
                int var14 = var6.method8748();
                int var15 = var14 >> 2;
                int var16 = var14 & 3;
                int var17 = var12 + var1;
                int var18 = var11 + var2;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    int var19 = var13;
                    if (2 == (field804[1][var17][var18] & 2)) {
                        var19 = var13 - 1;
                    }

                    class218 var20 = null;
                    if (var19 >= 0) {
                        var20 = var4[var19];
                    }

                    method2118(var13, var17, var18, var7, var16, var15, var3, var20);
                }
            }
        }
    }

    static void method1906(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class234 var8, class218[] var9) {
        class519 var10 = new class519(var0);
        int var11 = -1;

        while (true) {
            int var12 = var10.method8766();
            if (var12 == 0) {
                return;
            }

            var11 += var12;
            int var13 = 0;

            while (true) {
                int var14 = var10.method8764();
                if (var14 == 0) {
                    break;
                }

                var13 += var14 - 1;
                int var15 = var13 & 63;
                int var16 = var13 >> 6 & 63;
                int var17 = var13 >> 12;
                int var18 = var10.method8748();
                int var19 = var18 >> 2;
                int var20 = var18 & 3;
                if (var4 == var17 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                    class184 var21 = class98.method2042(var11);
                    int var22 = var2 + class331.method4612(var16 & 7, var15 & 7, var7, var21.field1940, var21.field1944, var20);
                    int var23 = var3 + class331.method1484(var16 & 7, var15 & 7, var7, var21.field1940, var21.field1944, var20);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = var1;
                        if (2 == (field804[1][var22][var23] & 2)) {
                            var24 = var1 - 1;
                        }

                        class218 var25 = null;
                        if (var24 >= 0) {
                            var25 = var9[var24];
                        }

                        method2118(var1, var22, var23, var11, var20 + var7 & 3, var19, var8, var25);
                    }
                }
            }
        }
    }

    static void method2118(int var0, int var1, int var2, int var3, int var4, int var5, class234 var6, class218 var7) {
        if (!Client.field1549 || 0 != (field804[0][var1][var2] & 2) || (field804[var0][var1][var2] & 16) == 0) {
            if (var0 < field798) {
                field798 = var0;
            }

            class184 var9 = class98.method2042(var3);
            int var10;
            int var11;
            if (var4 != 1 && var4 != 3) {
                var10 = var9.field1940;
                var11 = var9.field1944;
            } else {
                var10 = var9.field1944;
                var11 = var9.field1940;
            }

            int var12;
            int var13;
            if (var1 + var10 <= 104) {
                var12 = (var10 >> 1) + var1;
                var13 = (var10 + 1 >> 1) + var1;
            } else {
                var12 = var1;
                var13 = var1 + 1;
            }

            int var14;
            int var15;
            if (var2 + var11 <= 104) {
                var14 = (var11 >> 1) + var2;
                var15 = var2 + (var11 + 1 >> 1);
            } else {
                var14 = var2;
                var15 = var2 + 1;
            }

            int[][] var16 = field797[var0];
            int var17 = var16[var12][var15] + var16[var12][var14] + var16[var13][var14] + var16[var13][var15] >> 2;
            int var18 = (var1 << 7) + (var10 << 6);
            int var19 = (var11 << 6) + (var2 << 7);
            long var20 = class252.method7702(var1, var2, 2, var9.field1924 == 0, var3);
            int var22 = var5 + (var4 << 6);
            if (var9.field1945 == 1) {
                var22 += 256;
            }

            if (var9.method3459()) {
                class77.method1507(var0, var1, var2, var9, var4);
            }

            Object var23;
            if (var5 == 22) {
                if (!Client.field1549 || 0 != var9.field1924 || 1 == var9.field1922 || var9.field1943) {
                    if (-1 == var9.field1930 && var9.field1946 == null) {
                        var23 = var9.method3465(22, var4, var16, var18, var17, var19);
                    } else {
                        var23 = new class95(var3, 22, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                    }

                    var6.method4411(var0, var1, var2, var17, (class228) var23, var20, var22);
                    if (1 == var9.field1922 && null != var7) {
                        var7.method4190(var1, var2);
                    }

                }
            } else {
                int var24;
                if (var5 != 10 && var5 != 11) {
                    int[] var10000;
                    if (var5 >= 12) {
                        if (var9.field1930 == -1 && var9.field1946 == null) {
                            var23 = var9.method3465(var5, var4, var16, var18, var17, var19);
                        } else {
                            var23 = new class95(var3, var5, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                        }

                        var6.method4415(var0, var1, var2, var17, 1, 1, (class228) var23, 0, var20, var22);
                        if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
                            var10000 = class433.field4647[var0][var1];
                            var10000[var2] |= 2340;
                        }

                        if (0 != var9.field1922 && null != var7) {
                            var7.method4166(var1, var2, var10, var11, var9.field1905);
                        }

                    } else if (var5 == 0) {
                        if (-1 == var9.field1930 && var9.field1946 == null) {
                            var23 = var9.method3465(0, var4, var16, var18, var17, var19);
                        } else {
                            var23 = new class95(var3, 0, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                        }

                        var6.method4413(var0, var1, var2, var17, (class228) var23, null, field802[var4], 0, var20, var22);
                        if (var4 == 0) {
                            if (var9.field1936) {
                                class190.field2039[var0][var1][var2] = 50;
                                class190.field2039[var0][var1][var2 + 1] = 50;
                            }

                            if (var9.field1918) {
                                var10000 = class433.field4647[var0][var1];
                                var10000[var2] |= 585;
                            }
                        } else if (var4 == 1) {
                            if (var9.field1936) {
                                class190.field2039[var0][var1][var2 + 1] = 50;
                                class190.field2039[var0][var1 + 1][var2 + 1] = 50;
                            }

                            if (var9.field1918) {
                                var10000 = class433.field4647[var0][var1];
                                var10000[var2 + 1] |= 1170;
                            }
                        } else if (var4 == 2) {
                            if (var9.field1936) {
                                class190.field2039[var0][var1 + 1][var2] = 50;
                                class190.field2039[var0][var1 + 1][var2 + 1] = 50;
                            }

                            if (var9.field1918) {
                                var10000 = class433.field4647[var0][var1 + 1];
                                var10000[var2] |= 585;
                            }
                        } else if (var4 == 3) {
                            if (var9.field1936) {
                                class190.field2039[var0][var1][var2] = 50;
                                class190.field2039[var0][var1 + 1][var2] = 50;
                            }

                            if (var9.field1918) {
                                var10000 = class433.field4647[var0][var1];
                                var10000[var2] |= 1170;
                            }
                        }

                        if (0 != var9.field1922 && null != var7) {
                            var7.method4170(var1, var2, var5, var4, var9.field1905);
                        }

                        if (16 != var9.field1929) {
                            var6.method4421(var0, var1, var2, var9.field1929);
                        }

                    } else if (var5 == 1) {
                        if (-1 == var9.field1930 && var9.field1946 == null) {
                            var23 = var9.method3465(1, var4, var16, var18, var17, var19);
                        } else {
                            var23 = new class95(var3, 1, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                        }

                        var6.method4413(var0, var1, var2, var17, (class228) var23, null, field803[var4], 0, var20, var22);
                        if (var9.field1936) {
                            if (var4 == 0) {
                                class190.field2039[var0][var1][var2 + 1] = 50;
                            } else if (var4 == 1) {
                                class190.field2039[var0][var1 + 1][var2 + 1] = 50;
                            } else if (var4 == 2) {
                                class190.field2039[var0][var1 + 1][var2] = 50;
                            } else if (var4 == 3) {
                                class190.field2039[var0][var1][var2] = 50;
                            }
                        }

                        if (0 != var9.field1922 && var7 != null) {
                            var7.method4170(var1, var2, var5, var4, var9.field1905);
                        }

                    } else {
                        int var29;
                        if (var5 == 2) {
                            var29 = var4 + 1 & 3;
                            Object var31;
                            Object var32;
                            if (var9.field1930 == -1 && var9.field1946 == null) {
                                var32 = var9.method3465(2, var4 + 4, var16, var18, var17, var19);
                                var31 = var9.method3465(2, var29, var16, var18, var17, var19);
                            } else {
                                var32 = new class95(var3, 2, var4 + 4, var0, var1, var2, var9.field1930, var9.field1954, null);
                                var31 = new class95(var3, 2, var29, var0, var1, var2, var9.field1930, var9.field1954, null);
                            }

                            var6.method4413(var0, var1, var2, var17, (class228) var32, (class228) var31, field802[var4], field802[var29], var20, var22);
                            if (var9.field1918) {
                                if (var4 == 0) {
                                    var10000 = class433.field4647[var0][var1];
                                    var10000[var2] |= 585;
                                    var10000 = class433.field4647[var0][var1];
                                    var10000[var2 + 1] |= 1170;
                                } else if (var4 == 1) {
                                    var10000 = class433.field4647[var0][var1];
                                    var10000[var2 + 1] |= 1170;
                                    var10000 = class433.field4647[var0][var1 + 1];
                                    var10000[var2] |= 585;
                                } else if (var4 == 2) {
                                    var10000 = class433.field4647[var0][var1 + 1];
                                    var10000[var2] |= 585;
                                    var10000 = class433.field4647[var0][var1];
                                    var10000[var2] |= 1170;
                                } else if (var4 == 3) {
                                    var10000 = class433.field4647[var0][var1];
                                    var10000[var2] |= 1170;
                                    var10000 = class433.field4647[var0][var1];
                                    var10000[var2] |= 585;
                                }
                            }

                            if (0 != var9.field1922 && var7 != null) {
                                var7.method4170(var1, var2, var5, var4, var9.field1905);
                            }

                            if (16 != var9.field1929) {
                                var6.method4421(var0, var1, var2, var9.field1929);
                            }

                        } else if (var5 == 3) {
                            if (var9.field1930 == -1 && null == var9.field1946) {
                                var23 = var9.method3465(3, var4, var16, var18, var17, var19);
                            } else {
                                var23 = new class95(var3, 3, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                            }

                            var6.method4413(var0, var1, var2, var17, (class228) var23, null, field803[var4], 0, var20, var22);
                            if (var9.field1936) {
                                if (var4 == 0) {
                                    class190.field2039[var0][var1][var2 + 1] = 50;
                                } else if (var4 == 1) {
                                    class190.field2039[var0][var1 + 1][var2 + 1] = 50;
                                } else if (var4 == 2) {
                                    class190.field2039[var0][var1 + 1][var2] = 50;
                                } else if (var4 == 3) {
                                    class190.field2039[var0][var1][var2] = 50;
                                }
                            }

                            if (0 != var9.field1922 && null != var7) {
                                var7.method4170(var1, var2, var5, var4, var9.field1905);
                            }

                        } else if (var5 == 9) {
                            if (var9.field1930 == -1 && var9.field1946 == null) {
                                var23 = var9.method3465(var5, var4, var16, var18, var17, var19);
                            } else {
                                var23 = new class95(var3, var5, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                            }

                            var6.method4415(var0, var1, var2, var17, 1, 1, (class228) var23, 0, var20, var22);
                            if (0 != var9.field1922 && null != var7) {
                                var7.method4166(var1, var2, var10, var11, var9.field1905);
                            }

                            if (16 != var9.field1929) {
                                var6.method4421(var0, var1, var2, var9.field1929);
                            }

                        } else if (var5 == 4) {
                            if (-1 == var9.field1930 && null == var9.field1946) {
                                var23 = var9.method3465(4, var4, var16, var18, var17, var19);
                            } else {
                                var23 = new class95(var3, 4, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                            }

                            var6.method4414(var0, var1, var2, var17, (class228) var23, null, field802[var4], 0, 0, 0, var20, var22);
                        } else {
                            long var30;
                            Object var33;
                            if (var5 == 5) {
                                var29 = 16;
                                var30 = var6.method4431(var0, var1, var2);
                                if (0L != var30) {
                                    var29 = class98.method2042(class252.method7841(var30)).field1929;
                                }

                                if (-1 == var9.field1930 && var9.field1946 == null) {
                                    var33 = var9.method3465(4, var4, var16, var18, var17, var19);
                                } else {
                                    var33 = new class95(var3, 4, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                                }

                                var6.method4414(var0, var1, var2, var17, (class228) var33, null, field802[var4], 0, var29 * field812[var4], field809[var4] * var29, var20, var22);
                            } else if (var5 == 6) {
                                var29 = 8;
                                var30 = var6.method4431(var0, var1, var2);
                                if (var30 != 0L) {
                                    var29 = class98.method2042(class252.method7841(var30)).field1929 / 2;
                                }

                                if (var9.field1930 == -1 && var9.field1946 == null) {
                                    var33 = var9.method3465(4, var4 + 4, var16, var18, var17, var19);
                                } else {
                                    var33 = new class95(var3, 4, var4 + 4, var0, var1, var2, var9.field1930, var9.field1954, null);
                                }

                                var6.method4414(var0, var1, var2, var17, (class228) var33, null, 256, var4, var29 * field806[var4], var29 * field807[var4], var20, var22);
                            } else if (var5 == 7) {
                                var24 = var4 + 2 & 3;
                                if (-1 == var9.field1930 && null == var9.field1946) {
                                    var23 = var9.method3465(4, var24 + 4, var16, var18, var17, var19);
                                } else {
                                    var23 = new class95(var3, 4, var24 + 4, var0, var1, var2, var9.field1930, var9.field1954, null);
                                }

                                var6.method4414(var0, var1, var2, var17, (class228) var23, null, 256, var24, 0, 0, var20, var22);
                            } else if (var5 == 8) {
                                var29 = 8;
                                var30 = var6.method4431(var0, var1, var2);
                                if (0L != var30) {
                                    var29 = class98.method2042(class252.method7841(var30)).field1929 / 2;
                                }

                                int var28 = var4 + 2 & 3;
                                Object var27;
                                if (-1 == var9.field1930 && null == var9.field1946) {
                                    var33 = var9.method3465(4, var4 + 4, var16, var18, var17, var19);
                                    var27 = var9.method3465(4, var28 + 4, var16, var18, var17, var19);
                                } else {
                                    var33 = new class95(var3, 4, var4 + 4, var0, var1, var2, var9.field1930, var9.field1954, null);
                                    var27 = new class95(var3, 4, var28 + 4, var0, var1, var2, var9.field1930, var9.field1954, null);
                                }

                                var6.method4414(var0, var1, var2, var17, (class228) var33, (class228) var27, 256, var4, field806[var4] * var29, var29 * field807[var4], var20, var22);
                            }
                        }
                    }
                } else {
                    if (var9.field1930 == -1 && null == var9.field1946) {
                        var23 = var9.method3465(10, var4, var16, var18, var17, var19);
                    } else {
                        var23 = new class95(var3, 10, var4, var0, var1, var2, var9.field1930, var9.field1954, null);
                    }

                    if (var23 != null && var6.method4415(var0, var1, var2, var17, var10, var11, (class228) var23, var5 == 11 ? 256 : 0, var20, var22) && var9.field1936) {
                        var24 = 15;
                        if (var23 instanceof class249) {
                            var24 = ((class249) var23).method4765() / 4;
                            if (var24 > 30) {
                                var24 = 30;
                            }
                        }

                        for (int var25 = 0; var25 <= var10; ++var25) {
                            for (int var26 = 0; var26 <= var11; ++var26) {
                                if (var24 > class190.field2039[var0][var25 + var1][var2 + var26]) {
                                    class190.field2039[var0][var25 + var1][var2 + var26] = (byte) var24;
                                }
                            }
                        }
                    }

                    if (0 != var9.field1922 && var7 != null) {
                        var7.method4166(var1, var2, var10, var11, var9.field1905);
                    }

                }
            }
        }
    }

    static void method7825(class234 var0, class218[] var1) {
        int var3;
        int var4;
        int var5;
        int var6;
        for (var3 = 0; var3 < 4; ++var3) {
            for (var4 = 0; var4 < 104; ++var4) {
                for (var5 = 0; var5 < 104; ++var5) {
                    if (1 == (field804[var3][var4][var5] & 1)) {
                        var6 = var3;
                        if ((field804[1][var4][var5] & 2) == 2) {
                            var6 = var3 - 1;
                        }

                        if (var6 >= 0) {
                            var1[var6].method4167(var4, var5);
                        }
                    }
                }
            }
        }

        field811 += (int) (Math.random() * 5.0) - 2;
        if (field811 < -8) {
            field811 = -8;
        }

        if (field811 > 8) {
            field811 = 8;
        }

        field808 += (int) (Math.random() * 5.0) - 2;
        if (field808 < -16) {
            field808 = -16;
        }

        if (field808 > 16) {
            field808 = 16;
        }

        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var10000;
        int var17;
        int var18;
        int var19;
        for (var3 = 0; var3 < 4; ++var3) {
            byte[][] var46 = class190.field2039[var3];
            boolean var47 = true;
            boolean var48 = true;
            boolean var7 = true;
            boolean var8 = true;
            boolean var9 = true;
            var10 = (int) Math.sqrt(5100.0);
            var11 = var10 * 768 >> 8;

            int var20;
            int var21;
            for (var12 = 1; var12 < 103; ++var12) {
                for (var13 = 1; var13 < 103; ++var13) {
                    var14 = field797[var3][var13 + 1][var12] - field797[var3][var13 - 1][var12];
                    var15 = field797[var3][var13][var12 + 1] - field797[var3][var13][var12 - 1];
                    var16 = (int) Math.sqrt(var15 * var15 + var14 * var14 + 65536);
                    var17 = (var14 << 8) / var16;
                    var18 = 65536 / var16;
                    var19 = (var15 << 8) / var16;
                    var20 = 96 + (var18 * -10 + var17 * -50 + var19 * -50) / var11;
                    var21 = (var46[var13][var12 - 1] >> 2) + (var46[var13 + 1][var12] >> 3) + (var46[var13 - 1][var12] >> 2) + (var46[var13][var12 + 1] >> 3) + (var46[var13][var12] >> 1);
                    class153.field1394[var13][var12] = var20 - var21;
                }
            }

            for (var12 = 0; var12 < 104; ++var12) {
                class168.field1803[var12] = 0;
                class347.field3857[var12] = 0;
                field801[var12] = 0;
                class384.field4409[var12] = 0;
                class163.field1769[var12] = 0;
            }

            for (var12 = -5; var12 < 109; ++var12) {
                for (var13 = 0; var13 < 104; ++var13) {
                    var14 = var12 + 5;
                    int var10002;
                    if (var14 >= 0 && var14 < 104) {
                        var15 = (int) class311.method3213(15);
                        var16 = field799[var3][var14][var13] & var15;
                        if (var16 > 0) {
                            var18 = var16 - 1;
                            class192 var55 = (class192) class192.field2090.method5643(var18);
                            class192 var52;
                            if (null != var55) {
                                var52 = var55;
                            } else {
                                byte[] var56 = class192.field2092.method6381(1, var18);
                                var55 = new class192();
                                if (null != var56) {
                                    var55.method3690(new class519(var56), var18);
                                }

                                var55.method3675();
                                class192.field2090.method5640(var55, var18);
                                var52 = var55;
                            }

                            var10000 = class168.field1803;
                            var10000[var13] += var52.field2093;
                            var10000 = class347.field3857;
                            var10000[var13] += var52.field2094;
                            var10000 = field801;
                            var10000[var13] += var52.field2095;
                            var10000 = class384.field4409;
                            var10000[var13] += var52.field2096;
                            var10002 = class163.field1769[var13]++;
                        }
                    }

                    var15 = var12 - 5;
                    if (var15 >= 0 && var15 < 104) {
                        var16 = (int) class311.method3213(15);
                        var17 = field799[var3][var15][var13] & var16;
                        if (var17 > 0) {
                            var19 = var17 - 1;
                            class192 var57 = (class192) class192.field2090.method5643(var19);
                            class192 var54;
                            if (null != var57) {
                                var54 = var57;
                            } else {
                                byte[] var58 = class192.field2092.method6381(1, var19);
                                var57 = new class192();
                                if (null != var58) {
                                    var57.method3690(new class519(var58), var19);
                                }

                                var57.method3675();
                                class192.field2090.method5640(var57, var19);
                                var54 = var57;
                            }

                            var10000 = class168.field1803;
                            var10000[var13] -= var54.field2093;
                            var10000 = class347.field3857;
                            var10000[var13] -= var54.field2094;
                            var10000 = field801;
                            var10000[var13] -= var54.field2095;
                            var10000 = class384.field4409;
                            var10000[var13] -= var54.field2096;
                            var10002 = class163.field1769[var13]--;
                        }
                    }
                }

                if (var12 >= 1 && var12 < 103) {
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 0;
                    var17 = 0;

                    for (var18 = -5; var18 < 109; ++var18) {
                        var19 = var18 + 5;
                        if (var19 >= 0 && var19 < 104) {
                            var13 += class168.field1803[var19];
                            var14 += class347.field3857[var19];
                            var15 += field801[var19];
                            var16 += class384.field4409[var19];
                            var17 += class163.field1769[var19];
                        }

                        var20 = var18 - 5;
                        if (var20 >= 0 && var20 < 104) {
                            var13 -= class168.field1803[var20];
                            var14 -= class347.field3857[var20];
                            var15 -= field801[var20];
                            var16 -= class384.field4409[var20];
                            var17 -= class163.field1769[var20];
                        }

                        if (var18 >= 1 && var18 < 103 && (!Client.field1549 || (field804[0][var12][var18] & 2) != 0 || (field804[var3][var12][var18] & 16) == 0)) {
                            if (var3 < field798) {
                                field798 = var3;
                            }

                            var21 = (int) class311.method3213(15);
                            int var22 = field799[var3][var12][var18] & var21;
                            int var23 = field800[var3][var12][var18] & var21;
                            if (var22 > 0 || var23 > 0) {
                                int var24 = field797[var3][var12][var18];
                                int var25 = field797[var3][var12 + 1][var18];
                                int var26 = field797[var3][var12 + 1][var18 + 1];
                                int var27 = field797[var3][var12][var18 + 1];
                                int var28 = class153.field1394[var12][var18];
                                int var29 = class153.field1394[var12 + 1][var18];
                                int var30 = class153.field1394[var12 + 1][var18 + 1];
                                int var31 = class153.field1394[var12][var18 + 1];
                                int var32 = -1;
                                int var33 = -1;
                                int var34;
                                int var35;
                                if (var22 > 0) {
                                    var34 = var13 * 256 / var16;
                                    var35 = var14 / var17;
                                    int var36 = var15 / var17;
                                    var32 = method833(var34, var35, var36);
                                    var34 = var34 + field811 & 255;
                                    var36 += field808;
                                    if (var36 < 0) {
                                        var36 = 0;
                                    } else if (var36 > 255) {
                                        var36 = 255;
                                    }

                                    var33 = method833(var34, var35, var36);
                                }

                                if (var3 > 0) {
                                    boolean var59 = var22 != 0 || class15.field75[var3][var12][var18] == 0;

                                    if (var23 > 0 && !class209.method2449(var23 - 1).field2256) {
                                        var59 = false;
                                    }

                                    if (var59 && var24 == var25 && var24 == var26 && var24 == var27) {
                                        var10000 = class433.field4647[var3][var12];
                                        var10000[var18] |= 2340;
                                    }
                                }

                                var34 = 0;
                                if (var33 != -1) {
                                    var34 = class229.field2514[method7539(var33, 96)];
                                }

                                if (var23 == 0) {
                                    var0.method4410(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, method7539(var32, var28), method7539(var32, var29), method7539(var32, var30), method7539(var32, var31), 0, 0, 0, 0, var34, 0);
                                } else {
                                    var35 = class15.field75[var3][var12][var18] + 1;
                                    byte var60 = class108.field1062[var3][var12][var18];
                                    int var38 = var23 - 1;
                                    class209 var39 = (class209) class209.field2251.method5643(var38);
                                    class209 var37;
                                    if (null != var39) {
                                        var37 = var39;
                                    } else {
                                        byte[] var40 = class209.field2253.method6381(4, var38);
                                        var39 = new class209();
                                        if (null != var40) {
                                            var39.method3908(new class519(var40), var38);
                                        }

                                        var39.method3912();
                                        class209.field2251.method5640(var39, var38);
                                        var37 = var39;
                                    }

                                    int var61 = var37.field2248;
                                    int var41;
                                    int var42;
                                    int var43;
                                    int var44;
                                    if (var61 >= 0) {
                                        var42 = class229.field2513.field2815.method5167(var61);
                                        var41 = -1;
                                    } else if (16711935 == var37.field2247) {
                                        var41 = -2;
                                        var61 = -1;
                                        var42 = -2;
                                    } else {
                                        var41 = method833(var37.field2249, var37.field2245, var37.field2254);
                                        var43 = field811 + var37.field2249 & 255;
                                        var44 = var37.field2254 + field808;
                                        if (var44 < 0) {
                                            var44 = 0;
                                        } else if (var44 > 255) {
                                            var44 = 255;
                                        }

                                        var42 = method833(var43, var37.field2245, var44);
                                    }

                                    var43 = 0;
                                    if (var42 != -2) {
                                        var43 = class229.field2514[method5411(var42, 96)];
                                    }

                                    if (-1 != var37.field2250) {
                                        var44 = var37.field2258 + field811 & 255;
                                        int var45 = field808 + var37.field2252;
                                        if (var45 < 0) {
                                            var45 = 0;
                                        } else if (var45 > 255) {
                                            var45 = 255;
                                        }

                                        var42 = method833(var44, var37.field2255, var45);
                                        var43 = class229.field2514[method5411(var42, 96)];
                                    }

                                    var0.method4410(var3, var12, var18, var35, var60, var61, var24, var25, var26, var27, method7539(var32, var28), method7539(var32, var29), method7539(var32, var30), method7539(var32, var31), method5411(var41, var28), method5411(var41, var29), method5411(var41, var30), method5411(var41, var31), var34, var43);
                                }
                            }
                        }
                    }
                }
            }

            for (var12 = 1; var12 < 103; ++var12) {
                for (var13 = 1; var13 < 103; ++var13) {
                    var0.method4409(var3, var13, var12, method7129(var3, var13, var12));
                }
            }

            field799[var3] = null;
            field800[var3] = null;
            class15.field75[var3] = null;
            class108.field1062[var3] = null;
            class190.field2039[var3] = null;
        }

        var0.method4436(-50, -10, -50);

        for (var3 = 0; var3 < 104; ++var3) {
            for (var4 = 0; var4 < 104; ++var4) {
                if (2 == (field804[1][var3][var4] & 2)) {
                    var0.method4407(var3, var4);
                }
            }
        }

        var3 = 1;
        var4 = 2;
        var5 = 4;

        for (var6 = 0; var6 < 4; ++var6) {
            if (var6 > 0) {
                var3 <<= 3;
                var4 <<= 3;
                var5 <<= 3;
            }

            for (int var49 = 0; var49 <= var6; ++var49) {
                for (int var50 = 0; var50 <= 104; ++var50) {
                    for (int var51 = 0; var51 <= 104; ++var51) {
                        short var53;
                        if ((class433.field4647[var49][var51][var50] & var3) != 0) {
                            var10 = var50;
                            var11 = var50;
                            var12 = var49;

                            for (var13 = var49; var10 > 0 && 0 != (class433.field4647[var49][var51][var10 - 1] & var3); --var10) {
                            }

                            while (var11 < 104 && 0 != (class433.field4647[var49][var51][var11 + 1] & var3)) {
                                ++var11;
                            }

                            label357:
                            while (var12 > 0) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class433.field4647[var12 - 1][var51][var14] & var3) == 0) {
                                        break label357;
                                    }
                                }

                                --var12;
                            }

                            label346:
                            while (var13 < var6) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class433.field4647[var13 + 1][var51][var14] & var3) == 0) {
                                        break label346;
                                    }
                                }

                                ++var13;
                            }

                            var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                            if (var14 >= 8) {
                                var53 = 240;
                                var16 = field797[var13][var51][var10] - var53;
                                var17 = field797[var12][var51][var10];
                                class234.method4408(var6, 1, var51 * 128, var51 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                                for (var18 = var12; var18 <= var13; ++var18) {
                                    for (var19 = var10; var19 <= var11; ++var19) {
                                        var10000 = class433.field4647[var18][var51];
                                        var10000[var19] &= ~var3;
                                    }
                                }
                            }
                        }

                        if (0 != (class433.field4647[var49][var51][var50] & var4)) {
                            var10 = var51;
                            var11 = var51;
                            var12 = var49;

                            for (var13 = var49; var10 > 0 && (class433.field4647[var49][var10 - 1][var50] & var4) != 0; --var10) {
                            }

                            while (var11 < 104 && (class433.field4647[var49][var11 + 1][var50] & var4) != 0) {
                                ++var11;
                            }

                            label410:
                            while (var12 > 0) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if ((class433.field4647[var12 - 1][var14][var50] & var4) == 0) {
                                        break label410;
                                    }
                                }

                                --var12;
                            }

                            label399:
                            while (var13 < var6) {
                                for (var14 = var10; var14 <= var11; ++var14) {
                                    if (0 == (class433.field4647[var13 + 1][var14][var50] & var4)) {
                                        break label399;
                                    }
                                }

                                ++var13;
                            }

                            var14 = (var11 - var10 + 1) * (var13 + 1 - var12);
                            if (var14 >= 8) {
                                var53 = 240;
                                var16 = field797[var13][var10][var50] - var53;
                                var17 = field797[var12][var10][var50];
                                class234.method4408(var6, 2, var10 * 128, 128 + var11 * 128, var50 * 128, var50 * 128, var16, var17);

                                for (var18 = var12; var18 <= var13; ++var18) {
                                    for (var19 = var10; var19 <= var11; ++var19) {
                                        var10000 = class433.field4647[var18][var19];
                                        var10000[var50] &= ~var4;
                                    }
                                }
                            }
                        }

                        if ((class433.field4647[var49][var51][var50] & var5) != 0) {
                            var10 = var51;
                            var11 = var51;
                            var12 = var50;

                            for (var13 = var50; var12 > 0 && 0 != (class433.field4647[var49][var51][var12 - 1] & var5); --var12) {
                            }

                            while (var13 < 104 && 0 != (class433.field4647[var49][var51][var13 + 1] & var5)) {
                                ++var13;
                            }

                            label463:
                            while (var10 > 0) {
                                for (var14 = var12; var14 <= var13; ++var14) {
                                    if ((class433.field4647[var49][var10 - 1][var14] & var5) == 0) {
                                        break label463;
                                    }
                                }

                                --var10;
                            }

                            label452:
                            while (var11 < 104) {
                                for (var14 = var12; var14 <= var13; ++var14) {
                                    if ((class433.field4647[var49][var11 + 1][var14] & var5) == 0) {
                                        break label452;
                                    }
                                }

                                ++var11;
                            }

                            if ((var11 - var10 + 1) * (var13 - var12 + 1) >= 4) {
                                var14 = field797[var49][var10][var12];
                                class234.method4408(var6, 4, var10 * 128, 128 + var11 * 128, var12 * 128, var13 * 128 + 128, var14, var14);

                                for (var15 = var10; var15 <= var11; ++var15) {
                                    for (var16 = var12; var16 <= var13; ++var16) {
                                        var10000 = class433.field4647[var49][var15];
                                        var10000[var16] &= ~var5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    static int method7129(int var0, int var1, int var2) {
        if (0 != (field804[var0][var1][var2] & 8)) {
            return 0;
        } else {
            return var0 > 0 && (field804[1][var1][var2] & 2) != 0 ? var0 - 1 : var0;
        }
    }

    static int method2160(int var0, int var1) {
        int var3 = method7528(var0 + '\ub135', var1 + 91923, 4) - 128 + (method7528(var0 + 10294, var1 + '\u93bd', 2) - 128 >> 1) + (method7528(var0, var1, 1) - 128 >> 2);
        var3 = 35 + (int) (0.3 * (double) var3);
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }

        return var3;
    }

    static int method7528(int var0, int var1, int var2) {
        int var4 = var0 / var2;
        int var5 = var0 & var2 - 1;
        int var6 = var1 / var2;
        int var7 = var1 & var2 - 1;
        int var8 = method5409(var4, var6);
        int var9 = method5409(var4 + 1, var6);
        int var10 = method5409(var4, var6 + 1);
        int var11 = method5409(var4 + 1, var6 + 1);
        int var12 = method2351(var8, var9, var5, var2);
        int var13 = method2351(var10, var11, var5, var2);
        return method2351(var12, var13, var7, var2);
    }

    static int method2351(int var0, int var1, int var2, int var3) {
        int var5 = 65536 - class229.field2512[var2 * 1024 / var3] >> 1;
        return ((65536 - var5) * var0 >> 16) + (var5 * var1 >> 16);
    }

    static int method5409(int var0, int var1) {
        int var3 = method101(var0 - 1, var1 - 1) + method101(var0 + 1, var1 - 1) + method101(var0 - 1, var1 + 1) + method101(var0 + 1, var1 + 1);
        int var4 = method101(var0 - 1, var1) + method101(var0 + 1, var1) + method101(var0, var1 - 1) + method101(var0, var1 + 1);
        int var5 = method101(var0, var1);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    static int method101(int var0, int var1) {
        int var3 = var1 * 57 + var0;
        var3 ^= var3 << 13;
        int var4 = var3 * (15731 * var3 * var3 + 789221) + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 255;
    }

    static int method7539(int var0, int var1) {
        if (var0 == -1) {
            return 12345678;
        } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1 + (var0 & '\uff80');
        }
    }

    static int method5411(int var0, int var1) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1;
        } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return var1 + (var0 & '\uff80');
        }
    }

    static int method833(int var0, int var1, int var2) {
        if (var2 > 179) {
            var1 /= 2;
        }

        if (var2 > 192) {
            var1 /= 2;
        }

        if (var2 > 217) {
            var1 /= 2;
        }

        if (var2 > 243) {
            var1 /= 2;
        }

        int var4 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
        return var4;
    }

    static boolean method259(int var0, int var1) {
        class184 var3 = class98.method2042(var0);
        if (var1 == 11) {
            var1 = 10;
        }

        if (var1 >= 5 && var1 <= 8) {
            var1 = 4;
        }

        return var3.method3479(var1);
    }
}
