import java.util.Arrays;

public class class314 {
    static final int[] field3482;
    public static class290 field3493;
    static class428 field3494;
    static int field3485;

    static {
        field3482 = new int[]{class227.field2498.field2496, class227.field2501.field2496, class227.field2494.field2496, class227.field2505.field2496, class227.field2504.field2496, class227.field2497.field2496, class227.field2500.field2496};
        field3493 = new class290(260);
        field3494 = new class428(16, class437.field4668);
        field3485 = 0;
    }

    public int field3486 = 0;
    public int field3487 = -1;
    public int field3495;
    boolean field3491 = false;
    class204[] field3490;
    int[] field3483;
    int[] field3484;
    int[] field3489;
    long field3488;
    long field3492;

    public class314() {
    }

    class314(class314 var1) {
        int[] var2 = Arrays.copyOf(var1.field3483, var1.field3483.length);
        int[] var3 = Arrays.copyOf(var1.field3489, var1.field3489.length);
        class204[] var4 = null != var1.field3490 ? Arrays.copyOf(var1.field3490, var1.field3490.length) : null;
        int[] var5 = Arrays.copyOf(var1.field3484, var1.field3484.length);
        this.method5794(var3, var2, var4, false, var5, var1.field3486, var1.field3495, var1.field3487);
    }

    static void method5805(boolean var0) {
        if (!class124.field1180.method2695() && !class124.field1180.method3185() && !class124.field1180.method2884()) {
            class61.field454 = class364.field4230;
            class61.field435 = class364.field4025;
            class61.field443 = class364.field4232;
            class61.method6370(2);
            if (var0) {
                class61.field445 = "";
            }

            if (class61.field441 == null || class61.field441.length() <= 0) {
                if (class141.field1307.method1631() != null) {
                    class61.field441 = class141.field1307.method1631();
                    Client.field1483 = true;
                } else {
                    Client.field1483 = false;
                }
            }

            class61.method7296();
        } else {
            class61.method6370(10);
        }
    }

    public void method5794(int[] var1, int[] var2, class204[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
        this.field3490 = var3;
        this.field3491 = var4;
        this.field3487 = var8;
        this.method5795(var1, var2, var5, var6, var7);
    }

    public void method5795(int[] var1, int[] var2, int[] var3, int var4, int var5) {
        if (null == var1) {
            var1 = this.method5796(var4);
        }

        if (var2 == null) {
            var2 = this.method5796(var4);
        }

        this.field3489 = var1;
        this.field3483 = var2;
        this.field3484 = var3;
        this.field3486 = var4;
        this.field3495 = var5;
        this.method5800();
    }

    int[] method5796(int var1) {
        int[] var3 = new int[12];

        for (int var4 = 0; var4 < 7; ++var4) {
            for (int var5 = 0; var5 < class206.field2222; ++var5) {
                class206 var6 = class206.method2493(var5);
                if (var6 != null && !var6.field2234 && var6.field2224 == var4 + (var1 == 1 ? 7 : 0)) {
                    var3[field3482[var4]] = var5 + 256;
                    break;
                }
            }
        }

        return var3;
    }

    public void method5833(int var1, boolean var2) {
        int var4 = this.field3483[field3482[var1]];
        if (var4 != 0) {
            var4 -= 256;

            class206 var5;
            do {
                if (!var2) {
                    --var4;
                    if (var4 < 0) {
                        var4 = class206.field2222 - 1;
                    }
                } else {
                    ++var4;
                    if (var4 >= class206.field2222) {
                        var4 = 0;
                    }
                }

                var5 = class206.method2493(var4);
            } while (null == var5 || var5.field2234 || var1 + (this.field3486 == 1 ? 7 : 0) != var5.field2224);

            this.field3483[field3482[var1]] = var4 + 256;
            this.method5800();
        }
    }

    public void method5819(int var1, boolean var2) {
        int var4 = this.field3484[var1];
        boolean var5;
        if (!var2) {
            do {
                --var4;
                if (var4 < 0) {
                    var4 = class164.field1774[var1].length - 1;
                }

                var5 = var1 != 4 || var4 < 8;
            } while (!var5);
        } else {
            do {
                ++var4;
                if (var4 >= class164.field1774[var1].length) {
                    var4 = 0;
                }

                var5 = var1 != 4 || var4 < 8;
            } while (!var5);
        }

        this.field3484[var1] = var4;
        this.method5800();
    }

    public void method5798(int var1) {
        if (this.field3486 != var1) {
            this.method5795(null, null, this.field3484, var1, -1);
        }
    }

    public void method5799(class519 var1) {
        var1.method8731(this.field3486);

        int var3;
        for (var3 = 0; var3 < 7; ++var3) {
            int var4 = this.field3483[field3482[var3]];
            if (var4 == 0) {
                var1.method8731(-1);
            } else {
                var1.method8731(var4 - 256);
            }
        }

        for (var3 = 0; var3 < 5; ++var3) {
            var1.method8731(this.field3484[var3]);
        }

    }

    void method5800() {
        long var2 = this.field3488;
        int var4 = this.field3483[5];
        int var5 = this.field3483[9];
        this.field3483[5] = var5;
        this.field3483[9] = var4;
        this.field3488 = 0L;

        int var6;
        for (var6 = 0; var6 < 12; ++var6) {
            this.field3488 <<= 4;
            if (this.field3483[var6] >= 256) {
                this.field3488 += this.field3483[var6] - 256;
            }
        }

        if (this.field3483[0] >= 256) {
            this.field3488 += this.field3483[0] - 256 >> 4;
        }

        if (this.field3483[1] >= 256) {
            this.field3488 += this.field3483[1] - 256 >> 8;
        }

        for (var6 = 0; var6 < 5; ++var6) {
            this.field3488 <<= 3;
            this.field3488 += this.field3484[var6];
        }

        this.field3488 <<= 1;
        this.field3488 += this.field3486;
        this.field3483[5] = var4;
        this.field3483[9] = var5;
        if (0L != var2 && var2 != this.field3488 || this.field3491) {
            field3493.method5639(var2);
        }

    }

    public class249 method5801(class215 var1, int var2, class215 var3, int var4) {
        if (-1 != this.field3495) {
            return class191.method4208(this.field3495).method3614(var1, var2, var3, var4, null);
        } else {
            long var6 = this.field3488;
            int[] var8 = this.field3483;
            if (null != var1 && (var1.field2345 >= 0 || var1.field2352 >= 0)) {
                var8 = new int[12];

                System.arraycopy(this.field3483, 0, var8, 0, 12);

                if (var1.field2345 >= 0) {
                    var6 += (long) var1.field2345 - this.field3483[5] << 40;
                    var8[5] = var1.field2345;
                }

                if (var1.field2352 >= 0) {
                    var6 += (long) var1.field2352 - this.field3483[3] << 48;
                    var8[3] = var1.field2352;
                }
            }

            class249 var19 = (class249) field3493.method5643(var6);
            if (null == var19) {
                boolean var10 = false;

                int var12;
                for (int var11 = 0; var11 < 12; ++var11) {
                    var12 = var8[var11];
                    if (var12 >= 256 && var12 < 512 && !class206.method2493(var12 - 256).method3874()) {
                        var10 = true;
                    }

                    if (var12 >= 512 && !class185.method2355(var12 - 512).method3569(this.field3486)) {
                        var10 = true;
                    }
                }

                if (var10) {
                    if (-1L != this.field3492) {
                        var19 = (class249) field3493.method5643(this.field3492);
                    }

                    if (null == var19) {
                        return null;
                    }
                }

                if (var19 == null) {
                    class213[] var21 = new class213[12];
                    var12 = 0;

                    int var14;
                    for (int var13 = 0; var13 < 12; ++var13) {
                        var14 = var8[var13];
                        if (var14 >= 256 && var14 < 512) {
                            class213 var15 = class206.method2493(var14 - 256).method3882();
                            if (null != var15) {
                                var21[var12++] = var15;
                            }
                        }

                        if (var14 >= 512) {
                            class185 var23 = class185.method2355(var14 - 512);
                            class213 var16 = var23.method3504(this.field3486);
                            if (null != var16) {
                                if (null != this.field3490) {
                                    class204 var17 = this.field3490[var13];
                                    if (var17 != null) {
                                        int var18;
                                        if (null != var17.field2198 && null != var23.field1961 && var23.field1966.length == var17.field2198.length) {
                                            for (var18 = 0; var18 < var23.field1961.length; ++var18) {
                                                var16.method3968(var23.field1966[var18], var17.field2198[var18]);
                                            }
                                        }

                                        if (null != var17.field2201 && null != var23.field1967 && var17.field2201.length == var23.field1968.length) {
                                            for (var18 = 0; var18 < var23.field1967.length; ++var18) {
                                                var16.method3969(var23.field1968[var18], var17.field2201[var18]);
                                            }
                                        }
                                    }
                                }

                                var21[var12++] = var16;
                            }
                        }
                    }

                    class213 var22 = new class213(var21, var12);

                    for (var14 = 0; var14 < 5; ++var14) {
                        if (this.field3484[var14] < class164.field1774[var14].length) {
                            var22.method3968(class48.field350[var14], class164.field1774[var14][this.field3484[var14]]);
                        }

                        if (this.field3484[var14] < class265.field2961[var14].length) {
                            var22.method3968(class252.field2847[var14], class265.field2961[var14][this.field3484[var14]]);
                        }
                    }

                    var19 = var22.method3976(64, 850, -30, -50, -30);
                    field3493.method5640(var19, var6);
                    this.field3492 = var6;
                }
            }

            class249 var20;
            if (null == var1 && var3 == null) {
                var20 = var19.method4759(true);
            } else if (var1 != null && var3 != null) {
                var20 = var1.method4055(var19, var2, var3, var4);
            } else if (null != var1) {
                var20 = var1.method4052(var19, var2);
            } else {
                var20 = var3.method4052(var19, var4);
            }

            return var20;
        }
    }

    class213 method5802() {
        if (-1 != this.field3495) {
            return class191.method4208(this.field3495).method3619(null);
        } else {
            boolean var2 = false;

            int var4;
            for (int var3 = 0; var3 < 12; ++var3) {
                var4 = this.field3483[var3];
                if (var4 >= 256 && var4 < 512 && !class206.method2493(var4 - 256).method3876()) {
                    var2 = true;
                }

                if (var4 >= 512 && !class185.method2355(var4 - 512).method3505(this.field3486)) {
                    var2 = true;
                }
            }

            if (var2) {
                return null;
            } else {
                class213[] var8 = new class213[12];
                var4 = 0;

                int var6;
                for (int var5 = 0; var5 < 12; ++var5) {
                    var6 = this.field3483[var5];
                    class213 var7;
                    if (var6 >= 256 && var6 < 512) {
                        var7 = class206.method2493(var6 - 256).method3878();
                        if (var7 != null) {
                            var8[var4++] = var7;
                        }
                    }

                    if (var6 >= 512) {
                        var7 = class185.method2355(var6 - 512).method3556(this.field3486);
                        if (null != var7) {
                            var8[var4++] = var7;
                        }
                    }
                }

                class213 var9 = new class213(var8, var4);

                for (var6 = 0; var6 < 5; ++var6) {
                    if (this.field3484[var6] < class164.field1774[var6].length) {
                        var9.method3968(class48.field350[var6], class164.field1774[var6][this.field3484[var6]]);
                    }

                    if (this.field3484[var6] < class265.field2961[var6].length) {
                        var9.method3968(class252.field2847[var6], class265.field2961[var6][this.field3484[var6]]);
                    }
                }

                return var9;
            }
        }
    }

    public int method5803() {
        long var2 = this.field3488;
        if (-1 != this.field3495) {
            var2 = -65536L | (long) this.field3495;
        }

        Integer var4 = (Integer) field3494.method7645(var2);
        if (null == var4) {
            var4 = ++field3485 - 1;
            field3494.method7646(var2, var4);
            field3485 %= 65535;
        }

        return var4;
    }

    void method5804() {
        this.method5795(this.field3489, this.field3483, this.field3484, this.field3486, this.field3495);
    }
}
