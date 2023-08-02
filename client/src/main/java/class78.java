public class class78 extends class470 {
    static boolean field670 = false;
    static boolean[] field666;
    static class33[] field667;
    static class39[] field683;
    static class47[] field665;
    static class57 field674 = new class57();
    static class72[] field661;
    static float[] field656;
    static float[] field676;
    static float[] field677;
    static float[] field679;
    static float[] field680;
    static float[] field681;
    static int field662;
    static int field669;
    static int[] field655;
    static int[] field664;
    static int[] field678;
    boolean field660;
    boolean field668;
    byte[] field684;
    byte[][] field659;
    float[] field671;
    float[] field675;
    int field657;
    int field658;
    int field663;
    int field672;
    int field673;
    int field682;
    int field685;
    int field686;

    class78(byte[] var1) {
        this.method1590(var1);
    }

    static float method1589(int var0) {
        int var1 = var0 & 2097151;
        int var2 = var0 & Integer.MIN_VALUE;
        int var3 = (var0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }

        return (float) ((double) var1 * Math.pow(2.0, var3 - 788));
    }

    static void method1591(byte[] var0) {
        class57 var1 = field674;
        var1.method1165(var0, 0);
        field662 = 1 << var1.method1163(4);
        field669 = 1 << var1.method1163(4);

        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        for (var2 = 0; var2 < 2; ++var2) {
            var3 = var2 != 0 ? field669 : field662;
            var4 = var3 >> 1;
            var5 = var3 >> 2;
            var6 = var3 >> 3;
            float[] var7 = new float[var4];

            for (int var8 = 0; var8 < var5; ++var8) {
                var7[var8 * 2] = (float) Math.cos((double) (var8 * 4) * Math.PI / (double) var3);
                var7[var8 * 2 + 1] = -((float) Math.sin((double) (var8 * 4) * Math.PI / (double) var3));
            }

            float[] var14 = new float[var4];

            for (int var9 = 0; var9 < var5; ++var9) {
                var14[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * Math.PI / (double) (var3 * 2));
                var14[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * Math.PI / (double) (var3 * 2));
            }

            float[] var15 = new float[var5];

            for (int var10 = 0; var10 < var6; ++var10) {
                var15[var10 * 2] = (float) Math.cos((double) (var10 * 4 + 2) * Math.PI / (double) var3);
                var15[var10 * 2 + 1] = -((float) Math.sin((double) (var10 * 4 + 2) * Math.PI / (double) var3));
            }

            int[] var16 = new int[var6];
            int var11 = class311.method5127(var6 - 1);

            for (int var12 = 0; var12 < var6; ++var12) {
                var16[var12] = class311.method5298(var12, var11);
            }

            if (var2 != 0) {
                field679 = var7;
                field680 = var14;
                field681 = var15;
                field664 = var16;
            } else {
                field676 = var7;
                field677 = var14;
                field656 = var15;
                field678 = var16;
            }
        }

        var2 = var1.method1163(8) + 1;
        field661 = new class72[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            field661[var3] = new class72();
        }

        var3 = var1.method1163(6) + 1;

        for (var4 = 0; var4 < var3; ++var4) {
            var1.method1163(16);
        }

        var3 = var1.method1163(6) + 1;
        field665 = new class47[var3];

        for (var4 = 0; var4 < var3; ++var4) {
            field665[var4] = new class47();
        }

        var4 = var1.method1163(6) + 1;
        field683 = new class39[var4];

        for (var5 = 0; var5 < var4; ++var5) {
            field683[var5] = new class39();
        }

        var5 = var1.method1163(6) + 1;
        field667 = new class33[var5];

        for (var6 = 0; var6 < var5; ++var6) {
            field667[var6] = new class33();
        }

        var6 = var1.method1163(6) + 1;
        field666 = new boolean[var6];
        field655 = new int[var6];

        for (int var13 = 0; var13 < var6; ++var13) {
            field666[var13] = var1.method1164() != 0;
            var1.method1163(16);
            var1.method1163(16);
            field655[var13] = var1.method1163(8);
        }

    }

    static boolean method1593(class342 var0) {
        if (!field670) {
            byte[] var1 = var0.method6381(0, 0);
            if (var1 == null) {
                return false;
            }

            method1591(var1);
            field670 = true;
        }

        return true;
    }

    static class78 method1594(class342 var0, int var1, int var2) {
        if (!method1593(var0)) {
            var0.method6464(var1, var2);
            return null;
        } else {
            byte[] var3 = var0.method6381(var1, var2);
            return var3 == null ? null : new class78(var3);
        }
    }

    void method1590(byte[] var1) {
        class519 var2 = new class519(var1);
        this.field663 = var2.method9000();
        this.field657 = var2.method9000();
        this.field658 = var2.method9000();
        this.field682 = var2.method9000();
        if (this.field682 < 0) {
            this.field682 = ~this.field682;
            this.field660 = true;
        }

        int var3 = var2.method9000();
        this.field659 = new byte[var3][];

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = 0;

            int var6;
            do {
                var6 = var2.method8748();
                var5 += var6;
            } while (var6 >= 255);

            byte[] var7 = new byte[var5];
            var2.method8896(var7, 0, var5);
            this.field659[var4] = var7;
        }

    }

    float[] method1592(int var1) {
        class57 var2 = new class57();
        var2.method1165(this.field659[var1], 0);
        this.field675 = new float[field669];
        var2.method1164();
        int var3 = var2.method1163(class311.method5127(field655.length - 1));
        boolean var4 = field666[var3];
        int var5 = var4 ? field669 : field662;
        boolean var6 = false;
        boolean var7 = false;
        if (var4) {
            var6 = var2.method1164() != 0;
            var7 = var2.method1164() != 0;
        }

        int var8 = var5 >> 1;
        int var9;
        int var10;
        int var11;
        if (var4 && !var6) {
            var9 = (var5 >> 2) - (field662 >> 2);
            var10 = (var5 >> 2) + (field662 >> 2);
            var11 = field662 >> 1;
        } else {
            var9 = 0;
            var10 = var8;
            var11 = var5 >> 1;
        }

        int var12;
        int var13;
        int var14;
        if (var4 && !var7) {
            var12 = var5 - (var5 >> 2) - (field662 >> 2);
            var13 = var5 - (var5 >> 2) + (field662 >> 2);
            var14 = field662 >> 1;
        } else {
            var12 = var8;
            var13 = var5;
            var14 = var5 >> 1;
        }

        class33 var15 = field667[field655[var3]];
        int var16 = var15.field164;
        int var17 = var15.field163[var16];
        class75 var18 = field665[var17].method1016(var2);
        boolean var19 = !var18.method1532();

        int var20;
        for (var20 = 0; var20 < var15.field166; ++var20) {
            class39 var21 = field683[var15.field165[var20]];
            float[] var22 = this.field675;
            var21.method591(var22, var5 >> 1, var19, var2);
        }

        if (var18.method1532()) {
            var16 = var15.field164;
            int var10000 = var15.field163[var16];
            var18.method1528(this.field675, var5 >> 1);
        }

        int var43;
        int var46;
        if (!var18.method1532()) {
            for (var20 = var5 >> 1; var20 < var5; ++var20) {
                this.field675[var20] = 0.0F;
            }
        } else {
            var20 = var5 >> 1;
            var43 = var5 >> 2;
            var46 = var5 >> 3;
            float[] var23 = this.field675;

            int var24;
            for (var24 = 0; var24 < var20; ++var24) {
                var23[var24] *= 0.5F;
            }

            for (var24 = var20; var24 < var5; ++var24) {
                var23[var24] = -var23[var5 - var24 - 1];
            }

            float[] var48 = var4 ? field679 : field676;
            float[] var25 = var4 ? field680 : field677;
            float[] var26 = var4 ? field681 : field656;
            int[] var27 = var4 ? field664 : field678;

            int var28;
            float var29;
            float var30;
            float var31;
            float var32;
            for (var28 = 0; var28 < var43; ++var28) {
                var29 = var23[var28 * 4] - var23[var5 - var28 * 4 - 1];
                var30 = var23[var28 * 4 + 2] - var23[var5 - var28 * 4 - 3];
                var31 = var48[var28 * 2];
                var32 = var48[var28 * 2 + 1];
                var23[var5 - var28 * 4 - 1] = var29 * var31 - var30 * var32;
                var23[var5 - var28 * 4 - 3] = var29 * var32 + var30 * var31;
            }

            float var33;
            float var34;
            for (var28 = 0; var28 < var46; ++var28) {
                var29 = var23[var20 + 3 + var28 * 4];
                var30 = var23[var20 + 1 + var28 * 4];
                var31 = var23[var28 * 4 + 3];
                var32 = var23[var28 * 4 + 1];
                var23[var20 + 3 + var28 * 4] = var29 + var31;
                var23[var20 + 1 + var28 * 4] = var30 + var32;
                var33 = var48[var20 - 4 - var28 * 4];
                var34 = var48[var20 - 3 - var28 * 4];
                var23[var28 * 4 + 3] = (var29 - var31) * var33 - (var30 - var32) * var34;
                var23[var28 * 4 + 1] = (var30 - var32) * var33 + (var29 - var31) * var34;
            }

            var28 = class311.method5127(var5 - 1);

            int var49;
            int var50;
            int var51;
            int var52;
            for (var49 = 0; var49 < var28 - 3; ++var49) {
                var50 = var5 >> var49 + 2;
                var51 = 8 << var49;

                for (var52 = 0; var52 < 2 << var49; ++var52) {
                    int var53 = var5 - var50 * 2 * var52;
                    int var54 = var5 - var50 * (var52 * 2 + 1);

                    for (int var35 = 0; var35 < var5 >> var49 + 4; ++var35) {
                        int var36 = var35 * 4;
                        float var37 = var23[var53 - 1 - var36];
                        float var38 = var23[var53 - 3 - var36];
                        float var39 = var23[var54 - 1 - var36];
                        float var40 = var23[var54 - 3 - var36];
                        var23[var53 - 1 - var36] = var37 + var39;
                        var23[var53 - 3 - var36] = var38 + var40;
                        float var41 = var48[var35 * var51];
                        float var42 = var48[var35 * var51 + 1];
                        var23[var54 - 1 - var36] = (var37 - var39) * var41 - (var38 - var40) * var42;
                        var23[var54 - 3 - var36] = (var38 - var40) * var41 + (var37 - var39) * var42;
                    }
                }
            }

            for (var49 = 1; var49 < var46 - 1; ++var49) {
                var50 = var27[var49];
                if (var49 < var50) {
                    var51 = var49 * 8;
                    var52 = var50 * 8;
                    var33 = var23[var51 + 1];
                    var23[var51 + 1] = var23[var52 + 1];
                    var23[var52 + 1] = var33;
                    var33 = var23[var51 + 3];
                    var23[var51 + 3] = var23[var52 + 3];
                    var23[var52 + 3] = var33;
                    var33 = var23[var51 + 5];
                    var23[var51 + 5] = var23[var52 + 5];
                    var23[var52 + 5] = var33;
                    var33 = var23[var51 + 7];
                    var23[var51 + 7] = var23[var52 + 7];
                    var23[var52 + 7] = var33;
                }
            }

            for (var49 = 0; var49 < var20; ++var49) {
                var23[var49] = var23[var49 * 2 + 1];
            }

            for (var49 = 0; var49 < var46; ++var49) {
                var23[var5 - 1 - var49 * 2] = var23[var49 * 4];
                var23[var5 - 2 - var49 * 2] = var23[var49 * 4 + 1];
                var23[var5 - var43 - 1 - var49 * 2] = var23[var49 * 4 + 2];
                var23[var5 - var43 - 2 - var49 * 2] = var23[var49 * 4 + 3];
            }

            for (var49 = 0; var49 < var46; ++var49) {
                var30 = var26[var49 * 2];
                var31 = var26[var49 * 2 + 1];
                var32 = var23[var20 + var49 * 2];
                var33 = var23[var20 + var49 * 2 + 1];
                var34 = var23[var5 - 2 - var49 * 2];
                float var55 = var23[var5 - 1 - var49 * 2];
                float var56 = var31 * (var32 - var34) + var30 * (var33 + var55);
                var23[var20 + var49 * 2] = (var32 + var34 + var56) * 0.5F;
                var23[var5 - 2 - var49 * 2] = (var32 + var34 - var56) * 0.5F;
                var56 = var31 * (var33 + var55) - var30 * (var32 - var34);
                var23[var20 + var49 * 2 + 1] = (var33 - var55 + var56) * 0.5F;
                var23[var5 - 1 - var49 * 2] = (-var33 + var55 + var56) * 0.5F;
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var49] = var23[var49 * 2 + var20] * var25[var49 * 2] + var23[var49 * 2 + 1 + var20] * var25[var49 * 2 + 1];
                var23[var20 - 1 - var49] = var23[var49 * 2 + var20] * var25[var49 * 2 + 1] - var23[var49 * 2 + 1 + var20] * var25[var49 * 2];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var5 - var43 + var49] = -var23[var49];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var49] = var23[var43 + var49];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var43 + var49] = -var23[var43 - var49 - 1];
            }

            for (var49 = 0; var49 < var43; ++var49) {
                var23[var20 + var49] = var23[var5 - var49 - 1];
            }

            float[] var57;
            for (var49 = var9; var49 < var10; ++var49) {
                var30 = (float) Math.sin(((double) (var49 - var9) + 0.5) / (double) var11 * 0.5 * Math.PI);
                var57 = this.field675;
                var57[var49] *= (float) Math.sin(1.5707963267948966 * (double) var30 * (double) var30);
            }

            for (var49 = var12; var49 < var13; ++var49) {
                var30 = (float) Math.sin(((double) (var49 - var12) + 0.5) / (double) var14 * 0.5 * Math.PI + 1.5707963267948966);
                var57 = this.field675;
                var57[var49] *= (float) Math.sin(1.5707963267948966 * (double) var30 * (double) var30);
            }
        }

        float[] var44 = null;
        if (this.field672 > 0) {
            var43 = this.field672 + var5 >> 2;
            var44 = new float[var43];
            int var47;
            if (!this.field668) {
                for (var46 = 0; var46 < this.field673; ++var46) {
                    var47 = (this.field672 >> 1) + var46;
                    var44[var46] += this.field671[var47];
                }
            }

            if (var18.method1532()) {
                for (var46 = var9; var46 < var5 >> 1; ++var46) {
                    var47 = var44.length - (var5 >> 1) + var46;
                    var44[var47] += this.field675[var46];
                }
            }
        }

        float[] var45 = this.field671;
        this.field671 = this.field675;
        this.field675 = var45;
        this.field672 = var5;
        this.field673 = var13 - (var5 >> 1);
        this.field668 = !var18.method1532();
        return var44;
    }

    class35 method1602(int[] var1) {
        if (var1 != null && var1[0] <= 0) {
            return null;
        } else {
            if (this.field684 == null) {
                this.field672 = 0;
                this.field671 = new float[field669];
                this.field684 = new byte[this.field657];
                this.field685 = 0;
                this.field686 = 0;
            }

            for (; this.field686 < this.field659.length; ++this.field686) {
                if (var1 != null && var1[0] <= 0) {
                    return null;
                }

                float[] var2 = this.method1592(this.field686);
                if (var2 != null) {
                    int var3 = this.field685;
                    int var4 = var2.length;
                    if (var4 > this.field657 - var3) {
                        var4 = this.field657 - var3;
                    }

                    for (int var5 = 0; var5 < var4; ++var5) {
                        int var6 = (int) (128.0F + var2[var5] * 128.0F);
                        if ((var6 & -256) != 0) {
                            var6 = ~var6 >> 31;
                        }

                        this.field684[var3++] = (byte) (var6 - 128);
                    }

                    if (var1 != null) {
                        var1[0] -= var3 - this.field685;
                    }

                    this.field685 = var3;
                }
            }

            this.field671 = null;
            byte[] var7 = this.field684;
            this.field684 = null;
            return new class35(this.field663, var7, this.field658, this.field682, this.field660);
        }
    }
}
