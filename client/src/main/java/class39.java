public class class39 {
    int field211;
    int field212;
    int field213;
    int field214;
    int field215;
    int field216;
    int[] field217;

    class39() {
        class57 var1 = class78.field674;
        this.field214 = var1.method1163(16);
        this.field215 = var1.method1163(24);
        this.field211 = var1.method1163(24);
        this.field212 = var1.method1163(24) + 1;
        this.field213 = var1.method1163(6) + 1;
        this.field216 = var1.method1163(8);
        int[] var2 = new int[this.field213];

        int var3;
        for (var3 = 0; var3 < this.field213; ++var3) {
            int var4 = 0;
            int var5 = var1.method1163(3);
            boolean var6 = var1.method1164() != 0;
            if (var6) {
                var4 = var1.method1163(5);
            }

            var2[var3] = var4 << 3 | var5;
        }

        this.field217 = new int[this.field213 * 8];

        for (var3 = 0; var3 < this.field213 * 8; ++var3) {
            this.field217[var3] = (var2[var3 >> 3] & 1 << (var3 & 7)) != 0 ? var1.method1163(8) : -1;
        }

    }

    void method591(float[] var1, int var2, boolean var3, class57 var4) {
        int var5;
        for (var5 = 0; var5 < var2; ++var5) {
            var1[var5] = 0.0F;
        }

        if (!var3) {
            var5 = class78.field661[this.field216].field581;
            int var6 = this.field211 - this.field215;
            int var7 = var6 / this.field212;
            int[] var8 = new int[var7];

            for (int var9 = 0; var9 < 8; ++var9) {
                int var10 = 0;

                while (var10 < var7) {
                    int var11;
                    int var12;
                    if (var9 == 0) {
                        var11 = class78.field661[this.field216].method1498(var4);

                        for (var12 = var5 - 1; var12 >= 0; --var12) {
                            if (var10 + var12 < var7) {
                                var8[var10 + var12] = var11 % this.field213;
                            }

                            var11 /= this.field213;
                        }
                    }

                    for (var11 = 0; var11 < var5; ++var11) {
                        var12 = var8[var10];
                        int var13 = this.field217[var12 * 8 + var9];
                        if (var13 >= 0) {
                            int var14 = this.field215 + var10 * this.field212;
                            class72 var15 = class78.field661[var13];
                            int var16;
                            if (this.field214 == 0) {
                                var16 = this.field212 / var15.field581;

                                for (int var20 = 0; var20 < var16; ++var20) {
                                    float[] var21 = var15.method1496(var4);

                                    for (int var19 = 0; var19 < var15.field581; ++var19) {
                                        var1[var14 + var20 + var19 * var16] += var21[var19];
                                    }
                                }
                            } else {
                                var16 = 0;

                                while (var16 < this.field212) {
                                    float[] var17 = var15.method1496(var4);

                                    for (int var18 = 0; var18 < var15.field581; ++var18) {
                                        var1[var14 + var16] += var17[var18];
                                        ++var16;
                                    }
                                }
                            }
                        }

                        ++var10;
                        if (var10 >= var7) {
                            break;
                        }
                    }
                }
            }

        }
    }
}
