public class class72 {
    float[][] field584;
    int field581;
    int field582;
    int[] field583;
    int[] field585;
    int[] field586;

    class72() {
        class57 var1 = class78.field674;
        var1.method1163(24);
        this.field581 = var1.method1163(16);
        this.field582 = var1.method1163(24);
        this.field583 = new int[this.field582];
        boolean var2 = var1.method1164() != 0;
        int var3;
        int var4;
        int var6;
        if (var2) {
            var3 = 0;

            for (var4 = var1.method1163(5) + 1; var3 < this.field582; ++var4) {
                int var5 = var1.method1163(class311.method5127(this.field582 - var3));

                for (var6 = 0; var6 < var5; ++var6) {
                    this.field583[var3++] = var4;
                }
            }
        } else {
            boolean var15 = var1.method1164() != 0;

            for (var4 = 0; var4 < this.field582; ++var4) {
                if (var15 && var1.method1164() == 0) {
                    this.field583[var4] = 0;
                } else {
                    this.field583[var4] = var1.method1163(5) + 1;
                }
            }
        }

        this.method1493();
        var3 = var1.method1163(4);
        if (var3 > 0) {
            float var16 = class78.method1589(var1.method1163(32));
            float var17 = class78.method1589(var1.method1163(32));
            var6 = var1.method1163(4) + 1;
            boolean var7 = var1.method1164() != 0;
            int var8;
            if (var3 == 1) {
                var8 = method1502(this.field582, this.field581);
            } else {
                var8 = this.field582 * this.field581;
            }

            this.field585 = new int[var8];

            int var9;
            for (var9 = 0; var9 < var8; ++var9) {
                this.field585[var9] = var1.method1163(var6);
            }

            this.field584 = new float[this.field582][this.field581];
            float var10;
            int var11;
            int var12;
            if (var3 == 1) {
                for (var9 = 0; var9 < this.field582; ++var9) {
                    var10 = 0.0F;
                    var11 = 1;

                    for (var12 = 0; var12 < this.field581; ++var12) {
                        int var13 = var9 / var11 % var8;
                        float var14 = (float) this.field585[var13] * var17 + var16 + var10;
                        this.field584[var9][var12] = var14;
                        if (var7) {
                            var10 = var14;
                        }

                        var11 *= var8;
                    }
                }
            } else {
                for (var9 = 0; var9 < this.field582; ++var9) {
                    var10 = 0.0F;
                    var11 = var9 * this.field581;

                    for (var12 = 0; var12 < this.field581; ++var12) {
                        float var18 = (float) this.field585[var11] * var17 + var16 + var10;
                        this.field584[var9][var12] = var18;
                        if (var7) {
                            var10 = var18;
                        }

                        ++var11;
                    }
                }
            }
        }

    }

    static int method1502(int var0, int var1) {
        int var2;
        for (var2 = (int) Math.pow(var0, 1.0 / (double) var1) + 1; class311.method4195(var2, var1) > var0; --var2) {
        }

        return var2;
    }

    void method1493() {
        int[] var1 = new int[this.field582];
        int[] var2 = new int[33];

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        for (var3 = 0; var3 < this.field582; ++var3) {
            var4 = this.field583[var3];
            if (var4 != 0) {
                var5 = 1 << 32 - var4;
                var6 = var2[var4];
                var1[var3] = var6;
                int var9;
                if ((var6 & var5) != 0) {
                    var7 = var2[var4 - 1];
                } else {
                    var7 = var6 | var5;

                    for (var8 = var4 - 1; var8 >= 1; --var8) {
                        var9 = var2[var8];
                        if (var9 != var6) {
                            break;
                        }

                        var10 = 1 << 32 - var8;
                        if ((var9 & var10) != 0) {
                            var2[var8] = var2[var8 - 1];
                            break;
                        }

                        var2[var8] = var9 | var10;
                    }
                }

                var2[var4] = var7;

                for (var8 = var4 + 1; var8 <= 32; ++var8) {
                    var9 = var2[var8];
                    if (var9 == var6) {
                        var2[var8] = var7;
                    }
                }
            }
        }

        this.field586 = new int[8];
        int var11 = 0;

        for (var3 = 0; var3 < this.field582; ++var3) {
            var4 = this.field583[var3];
            if (var4 != 0) {
                var5 = var1[var3];
                var6 = 0;

                for (var7 = 0; var7 < var4; ++var7) {
                    var8 = Integer.MIN_VALUE >>> var7;
                    if ((var5 & var8) != 0) {
                        if (this.field586[var6] == 0) {
                            this.field586[var6] = var11;
                        }

                        var6 = this.field586[var6];
                    } else {
                        ++var6;
                    }

                    if (var6 >= this.field586.length) {
                        int[] var12 = new int[this.field586.length * 2];

                        for (var10 = 0; var10 < this.field586.length; ++var10) {
                            var12[var10] = this.field586[var10];
                        }

                        this.field586 = var12;
                    }

                    var8 >>>= 1;
                }

                this.field586[var6] = ~var3;
                if (var6 >= var11) {
                    var11 = var6 + 1;
                }
            }
        }

    }

    int method1498(class57 var1) {
        int var2;
        for (var2 = 0; this.field586[var2] >= 0; var2 = var1.method1164() != 0 ? this.field586[var2] : var2 + 1) {
        }

        return ~this.field586[var2];
    }

    float[] method1496(class57 var1) {
        return this.field584[this.method1498(var1)];
    }
}
