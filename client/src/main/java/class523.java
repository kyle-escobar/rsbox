public final class class523 extends class535 {
    public int field5142;
    public int field5144;
    public int field5145;
    public int field5148;
    public int field5153;
    public int[] field5147;
    int field5146;

    class523() {
    }

    public class523(int var1, int var2) {
        this(new int[var1 * var2], var1, var2);
    }

    public class523(int[] var1, int var2, int var3) {
        this.field5147 = var1;
        this.field5148 = this.field5144 = var2;
        this.field5153 = this.field5142 = var3;
        this.field5146 = 0;
        this.field5145 = 0;
    }

    static void method9035(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        for (int var8 = -var5; var8 < 0; ++var8) {
            int var9;
            for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
                var0[var3++] = var1[var2++];
                var0[var3++] = var1[var2++];
                var0[var3++] = var1[var2++];
            }

            for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
            }

            var3 += var6;
            var2 += var7;
        }

    }

    static void method9037(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method9142(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        int var12 = var3;

        for (int var13 = -var8; var13 < 0; ++var13) {
            int var14 = (var4 >> 16) * var11;

            for (int var15 = -var7; var15 < 0; ++var15) {
                var2 = var1[(var3 >> 16) + var14];
                if (var2 != 0) {
                    var0[var5++] = var2;
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var12;
            var5 += var6;
        }

    }

    static void method9075(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        int var11 = 256 - var9;
        int var12 = (var10 & 16711935) * var11 & -16711936;
        int var13 = (var10 & '\uff00') * var11 & 16711680;
        var10 = (var12 | var13) >>> 8;

        for (int var14 = -var6; var14 < 0; ++var14) {
            for (int var15 = -var5; var15 < 0; ++var15) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    var12 = (var2 & 16711935) * var9 & -16711936;
                    var13 = (var2 & '\uff00') * var9 & 16711680;
                    var0[var4++] = ((var12 | var13) >>> 8) + var10;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method9024(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        int var10 = 256 - var9;

        for (int var11 = -var6; var11 < 0; ++var11) {
            for (int var12 = -var5; var12 < 0; ++var12) {
                var2 = var1[var3++];
                if (var2 != 0) {
                    int var13 = var0[var4];
                    var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & '\uff00') * var9 + (var13 & '\uff00') * var10 & 16711680) >> 8;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method9044(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        int var13 = 256 - var12;
        int var14 = var3;

        for (int var15 = -var8; var15 < 0; ++var15) {
            int var16 = (var4 >> 16) * var11;

            for (int var17 = -var7; var17 < 0; ++var17) {
                var2 = var1[(var3 >> 16) + var16];
                if (var2 != 0) {
                    int var18 = var0[var5];
                    var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & '\uff00') * var12 + (var18 & '\uff00') * var13 & 16711680) >> 8;
                } else {
                    ++var5;
                }

                var3 += var9;
            }

            var4 += var10;
            var3 = var14;
            var5 += var6;
        }

    }

    static void method9046(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
        for (var8 = -var10; var8 < 0; ++var8) {
            for (var6 = -var9; var6 < 0; ++var6) {
                var0 = var4[var5++];
                if (var0 != 0) {
                    var1 = var3[var7];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var7;
                }
            }

            var7 += var11;
            var5 += var12;
        }

    }

    static void method9047(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        for (var8 = -var10; var8 < 0; ++var8) {
            for (var6 = -var9; var6 < 0; ++var6) {
                var0 = var4[var5++];
                if (var0 != 0) {
                    var1 = (var0 & 16711935) * var13;
                    var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
                    var1 = var3[var7];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var7;
                }
            }

            var7 += var11;
            var5 += var12;
        }

    }

    static void method9049(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
        for (int var16 = var3; var8 < 0; ++var8) {
            var7 = (var9 >> 16) * var15;

            for (var6 = -var12; var6 < 0; ++var6) {
                var0 = var4[(var3 >> 16) + var7];
                if (var0 != 0) {
                    var1 = var5[var10];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var10;
                }

                var3 += var13;
            }

            var9 += var14;
            var3 = var16;
            var10 += var11;
        }

    }

    static void method9050(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
        for (int var17 = var3; var8 < 0; ++var8) {
            var7 = (var9 >> 16) * var15;

            for (var6 = -var12; var6 < 0; ++var6) {
                var0 = var4[(var3 >> 16) + var7];
                if (var0 != 0) {
                    var1 = (var0 & 16711935) * var16;
                    var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
                    var1 = var5[var10];
                    var2 = var0 + var1;
                    var0 = (var0 & 16711935) + (var1 & 16711935);
                    var1 = (var0 & 16777472) + (var2 - var0 & 65536);
                    var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
                } else {
                    ++var10;
                }

                var3 += var13;
            }

            var9 += var14;
            var3 = var17;
            var10 += var11;
        }

    }

    public class523 method9120() {
        class523 var1 = new class523(this.field5148, this.field5153);
        var1.field5144 = this.field5144;
        var1.field5142 = this.field5142;
        var1.field5145 = this.field5144 - this.field5148 - this.field5145;
        var1.field5146 = this.field5146;

        for (int var2 = 0; var2 < this.field5153; ++var2) {
            for (int var3 = 0; var3 < this.field5148; ++var3) {
                var1.field5147[var2 * this.field5148 + var3] = this.field5147[var2 * this.field5148 + this.field5148 - 1 - var3];
            }
        }

        return var1;
    }

    public class523 method9025() {
        class523 var1 = new class523(this.field5148, this.field5153);
        var1.field5144 = this.field5144;
        var1.field5142 = this.field5142;
        var1.field5145 = this.field5145;
        var1.field5146 = this.field5146;
        int var2 = this.field5147.length;

        System.arraycopy(this.field5147, 0, var1.field5147, 0, var2);

        return var1;
    }

    public class523 method9026() {
        class523 var1 = new class523(this.field5144, this.field5142);

        for (int var2 = 0; var2 < this.field5153; ++var2) {
            for (int var3 = 0; var3 < this.field5148; ++var3) {
                var1.field5147[(var2 + this.field5146) * this.field5144 + var3 + this.field5145] = this.field5147[var2 * this.field5148 + var3];
            }
        }

        return var1;
    }

    public void method9027() {
        method9241(this.field5147, this.field5148, this.field5153, null);
    }

    public void method9028() {
        if (this.field5148 != this.field5144 || this.field5153 != this.field5142) {
            int[] var1 = new int[this.field5144 * this.field5142];

            for (int var2 = 0; var2 < this.field5153; ++var2) {
                for (int var3 = 0; var3 < this.field5148; ++var3) {
                    var1[(var2 + this.field5146) * this.field5144 + var3 + this.field5145] = this.field5147[var2 * this.field5148 + var3];
                }
            }

            this.field5147 = var1;
            this.field5148 = this.field5144;
            this.field5153 = this.field5142;
            this.field5145 = 0;
            this.field5146 = 0;
        }
    }

    public void method9029(int var1) {
        if (this.field5148 != this.field5144 || this.field5153 != this.field5142) {
            int var2 = var1;
            if (var1 > this.field5145) {
                var2 = this.field5145;
            }

            int var3 = var1;
            if (var1 + this.field5145 + this.field5148 > this.field5144) {
                var3 = this.field5144 - this.field5145 - this.field5148;
            }

            int var4 = var1;
            if (var1 > this.field5146) {
                var4 = this.field5146;
            }

            int var5 = var1;
            if (var1 + this.field5146 + this.field5153 > this.field5142) {
                var5 = this.field5142 - this.field5146 - this.field5153;
            }

            int var6 = this.field5148 + var2 + var3;
            int var7 = this.field5153 + var4 + var5;
            int[] var8 = new int[var6 * var7];

            for (int var9 = 0; var9 < this.field5153; ++var9) {
                for (int var10 = 0; var10 < this.field5148; ++var10) {
                    var8[(var9 + var4) * var6 + var10 + var2] = this.field5147[var9 * this.field5148 + var10];
                }
            }

            this.field5147 = var8;
            this.field5148 = var6;
            this.field5153 = var7;
            this.field5145 -= var2;
            this.field5146 -= var4;
        }
    }

    public void method9103() {
        int[] var1 = new int[this.field5148 * this.field5153];
        int var2 = 0;

        for (int var3 = 0; var3 < this.field5153; ++var3) {
            for (int var4 = this.field5148 - 1; var4 >= 0; --var4) {
                var1[var2++] = this.field5147[var4 + var3 * this.field5148];
            }
        }

        this.field5147 = var1;
        this.field5145 = this.field5144 - this.field5148 - this.field5145;
    }

    public void method9031() {
        int[] var1 = new int[this.field5148 * this.field5153];
        int var2 = 0;

        for (int var3 = this.field5153 - 1; var3 >= 0; --var3) {
            for (int var4 = 0; var4 < this.field5148; ++var4) {
                var1[var2++] = this.field5147[var4 + var3 * this.field5148];
            }
        }

        this.field5147 = var1;
        this.field5146 = this.field5142 - this.field5153 - this.field5146;
    }

    public void method9032(int var1) {
        int[] var2 = new int[this.field5148 * this.field5153];
        int var3 = 0;

        for (int var4 = 0; var4 < this.field5153; ++var4) {
            for (int var5 = 0; var5 < this.field5148; ++var5) {
                int var6 = this.field5147[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field5147[var3 - 1] != 0) {
                        var6 = var1;
                    } else if (var4 > 0 && this.field5147[var3 - this.field5148] != 0) {
                        var6 = var1;
                    } else if (var5 < this.field5148 - 1 && this.field5147[var3 + 1] != 0) {
                        var6 = var1;
                    } else if (var4 < this.field5153 - 1 && this.field5147[var3 + this.field5148] != 0) {
                        var6 = var1;
                    }
                }

                var2[var3++] = var6;
            }
        }

        this.field5147 = var2;
    }

    public void method9033(int var1) {
        for (int var2 = this.field5153 - 1; var2 > 0; --var2) {
            int var3 = var2 * this.field5148;

            for (int var4 = this.field5148 - 1; var4 > 0; --var4) {
                if (this.field5147[var4 + var3] == 0 && this.field5147[var4 + var3 - 1 - this.field5148] != 0) {
                    this.field5147[var4 + var3] = var1;
                }
            }
        }

    }

    public void method9034(int var1, int var2) {
        var1 += this.field5145;
        var2 += this.field5146;
        int var3 = var1 + var2 * class535.field5202;
        int var4 = 0;
        int var5 = this.field5153;
        int var6 = this.field5148;
        int var7 = class535.field5202 - var6;
        int var8 = 0;
        int var9;
        if (var2 < class535.field5206) {
            var9 = class535.field5206 - var2;
            var5 -= var9;
            var2 = class535.field5206;
            var4 += var9 * var6;
            var3 += var9 * class535.field5202;
        }

        if (var2 + var5 > class535.field5207) {
            var5 -= var2 + var5 - class535.field5207;
        }

        if (var1 < class535.field5208) {
            var9 = class535.field5208 - var1;
            var6 -= var9;
            var1 = class535.field5208;
            var4 += var9;
            var3 += var9;
            var8 += var9;
            var7 += var9;
        }

        if (var1 + var6 > class535.field5209) {
            var9 = var1 + var6 - class535.field5209;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method9035(class535.field5201, this.field5147, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method9139(int var1, int var2) {
        var1 += this.field5145;
        var2 += this.field5146;
        int var3 = var1 + var2 * class535.field5202;
        int var4 = 0;
        int var5 = this.field5153;
        int var6 = this.field5148;
        int var7 = class535.field5202 - var6;
        int var8 = 0;
        int var9;
        if (var2 < class535.field5206) {
            var9 = class535.field5206 - var2;
            var5 -= var9;
            var2 = class535.field5206;
            var4 += var9 * var6;
            var3 += var9 * class535.field5202;
        }

        if (var2 + var5 > class535.field5207) {
            var5 -= var2 + var5 - class535.field5207;
        }

        if (var1 < class535.field5208) {
            var9 = class535.field5208 - var1;
            var6 -= var9;
            var1 = class535.field5208;
            var4 += var9;
            var3 += var9;
            var8 += var9;
            var7 += var9;
        }

        if (var1 + var6 > class535.field5209) {
            var9 = var1 + var6 - class535.field5209;
            var6 -= var9;
            var8 += var9;
            var7 += var9;
        }

        if (var6 > 0 && var5 > 0) {
            method9037(class535.field5201, this.field5147, 0, var4, var3, var6, var5, var7, var8);
        }
    }

    public void method9038(int var1, int var2, int var3, int var4) {
        if (var3 > 0 && var4 > 0) {
            int var5 = this.field5148;
            int var6 = this.field5153;
            int var7 = 0;
            int var8 = 0;
            int var9 = this.field5144;
            int var10 = this.field5142;
            int var11 = (var9 << 16) / var3;
            int var12 = (var10 << 16) / var4;
            int var13;
            if (this.field5145 > 0) {
                var13 = ((this.field5145 << 16) + var11 - 1) / var11;
                var1 += var13;
                var7 += var13 * var11 - (this.field5145 << 16);
            }

            if (this.field5146 > 0) {
                var13 = ((this.field5146 << 16) + var12 - 1) / var12;
                var2 += var13;
                var8 += var13 * var12 - (this.field5146 << 16);
            }

            if (var5 < var9) {
                var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
            }

            if (var6 < var10) {
                var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            var13 = var1 + var2 * class535.field5202;
            int var14 = class535.field5202 - var3;
            if (var2 + var4 > class535.field5207) {
                var4 -= var2 + var4 - class535.field5207;
            }

            int var15;
            if (var2 < class535.field5206) {
                var15 = class535.field5206 - var2;
                var4 -= var15;
                var13 += var15 * class535.field5202;
                var8 += var12 * var15;
            }

            if (var1 + var3 > class535.field5209) {
                var15 = var1 + var3 - class535.field5209;
                var3 -= var15;
                var14 += var15;
            }

            if (var1 < class535.field5208) {
                var15 = class535.field5208 - var1;
                var3 -= var15;
                var13 += var15;
                var7 += var11 * var15;
                var14 += var15;
            }

            method9142(class535.field5201, this.field5147, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
        }
    }

    public void method9040(int var1, int var2, int var3, int var4) {
        if (var3 == 256) {
            this.method9139(var1, var2);
        } else {
            var1 += this.field5145;
            var2 += this.field5146;
            int var5 = var1 + var2 * class535.field5202;
            int var6 = 0;
            int var7 = this.field5153;
            int var8 = this.field5148;
            int var9 = class535.field5202 - var8;
            int var10 = 0;
            int var11;
            if (var2 < class535.field5206) {
                var11 = class535.field5206 - var2;
                var7 -= var11;
                var2 = class535.field5206;
                var6 += var11 * var8;
                var5 += var11 * class535.field5202;
            }

            if (var2 + var7 > class535.field5207) {
                var7 -= var2 + var7 - class535.field5207;
            }

            if (var1 < class535.field5208) {
                var11 = class535.field5208 - var1;
                var8 -= var11;
                var1 = class535.field5208;
                var6 += var11;
                var5 += var11;
                var10 += var11;
                var9 += var11;
            }

            if (var1 + var8 > class535.field5209) {
                var11 = var1 + var8 - class535.field5209;
                var8 -= var11;
                var10 += var11;
                var9 += var11;
            }

            if (var8 > 0 && var7 > 0) {
                method9075(class535.field5201, this.field5147, 0, var6, var5, var8, var7, var9, var10, var3, var4);
            }
        }
    }

    public void method9041(int var1, int var2, int var3) {
        var1 += this.field5145;
        var2 += this.field5146;
        int var4 = var1 + var2 * class535.field5202;
        int var5 = 0;
        int var6 = this.field5153;
        int var7 = this.field5148;
        int var8 = class535.field5202 - var7;
        int var9 = 0;
        int var10;
        if (var2 < class535.field5206) {
            var10 = class535.field5206 - var2;
            var6 -= var10;
            var2 = class535.field5206;
            var5 += var10 * var7;
            var4 += var10 * class535.field5202;
        }

        if (var2 + var6 > class535.field5207) {
            var6 -= var2 + var6 - class535.field5207;
        }

        if (var1 < class535.field5208) {
            var10 = class535.field5208 - var1;
            var7 -= var10;
            var1 = class535.field5208;
            var5 += var10;
            var4 += var10;
            var9 += var10;
            var8 += var10;
        }

        if (var1 + var7 > class535.field5209) {
            var10 = var1 + var7 - class535.field5209;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }

        if (var7 > 0 && var6 > 0) {
            method9024(class535.field5201, this.field5147, 0, var5, var4, var7, var6, var8, var9, var3);
        }
    }

    public void method9043(int var1, int var2, int var3, int var4, int var5) {
        if (var3 > 0 && var4 > 0) {
            int var6 = this.field5148;
            int var7 = this.field5153;
            int var8 = 0;
            int var9 = 0;
            int var10 = this.field5144;
            int var11 = this.field5142;
            int var12 = (var10 << 16) / var3;
            int var13 = (var11 << 16) / var4;
            int var14;
            if (this.field5145 > 0) {
                var14 = ((this.field5145 << 16) + var12 - 1) / var12;
                var1 += var14;
                var8 += var14 * var12 - (this.field5145 << 16);
            }

            if (this.field5146 > 0) {
                var14 = ((this.field5146 << 16) + var13 - 1) / var13;
                var2 += var14;
                var9 += var14 * var13 - (this.field5146 << 16);
            }

            if (var6 < var10) {
                var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            if (var7 < var11) {
                var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }

            var14 = var1 + var2 * class535.field5202;
            int var15 = class535.field5202 - var3;
            if (var2 + var4 > class535.field5207) {
                var4 -= var2 + var4 - class535.field5207;
            }

            int var16;
            if (var2 < class535.field5206) {
                var16 = class535.field5206 - var2;
                var4 -= var16;
                var14 += var16 * class535.field5202;
                var9 += var13 * var16;
            }

            if (var1 + var3 > class535.field5209) {
                var16 = var1 + var3 - class535.field5209;
                var3 -= var16;
                var15 += var16;
            }

            if (var1 < class535.field5208) {
                var16 = class535.field5208 - var1;
                var3 -= var16;
                var14 += var16;
                var8 += var12 * var16;
                var15 += var16;
            }

            method9044(class535.field5201, this.field5147, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
        }
    }

    public void method9021(int var1, int var2, int var3) {
        var1 += this.field5145;
        var2 += this.field5146;
        int var4 = var1 + var2 * class535.field5202;
        int var5 = 0;
        int var6 = this.field5153;
        int var7 = this.field5148;
        int var8 = class535.field5202 - var7;
        int var9 = 0;
        int var10;
        if (var2 < class535.field5206) {
            var10 = class535.field5206 - var2;
            var6 -= var10;
            var2 = class535.field5206;
            var5 += var10 * var7;
            var4 += var10 * class535.field5202;
        }

        if (var2 + var6 > class535.field5207) {
            var6 -= var2 + var6 - class535.field5207;
        }

        if (var1 < class535.field5208) {
            var10 = class535.field5208 - var1;
            var7 -= var10;
            var1 = class535.field5208;
            var5 += var10;
            var4 += var10;
            var9 += var10;
            var8 += var10;
        }

        if (var1 + var7 > class535.field5209) {
            var10 = var1 + var7 - class535.field5209;
            var7 -= var10;
            var9 += var10;
            var8 += var10;
        }

        if (var7 > 0 && var6 > 0) {
            if (var3 == 256) {
                method9046(0, 0, 0, class535.field5201, this.field5147, var5, 0, var4, 0, var7, var6, var8, var9);
            } else {
                method9047(0, 0, 0, class535.field5201, this.field5147, var5, 0, var4, 0, var7, var6, var8, var9, var3);
            }

        }
    }

    public void method9140(int var1, int var2, int var3, int var4, int var5) {
        if (var3 > 0 && var4 > 0) {
            int var6 = this.field5148;
            int var7 = this.field5153;
            int var8 = 0;
            int var9 = 0;
            int var10 = this.field5144;
            int var11 = this.field5142;
            int var12 = (var10 << 16) / var3;
            int var13 = (var11 << 16) / var4;
            int var14;
            if (this.field5145 > 0) {
                var14 = ((this.field5145 << 16) + var12 - 1) / var12;
                var1 += var14;
                var8 += var14 * var12 - (this.field5145 << 16);
            }

            if (this.field5146 > 0) {
                var14 = ((this.field5146 << 16) + var13 - 1) / var13;
                var2 += var14;
                var9 += var14 * var13 - (this.field5146 << 16);
            }

            if (var6 < var10) {
                var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
            }

            if (var7 < var11) {
                var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
            }

            var14 = var1 + var2 * class535.field5202;
            int var15 = class535.field5202 - var3;
            if (var2 + var4 > class535.field5207) {
                var4 -= var2 + var4 - class535.field5207;
            }

            int var16;
            if (var2 < class535.field5206) {
                var16 = class535.field5206 - var2;
                var4 -= var16;
                var14 += var16 * class535.field5202;
                var9 += var13 * var16;
            }

            if (var1 + var3 > class535.field5209) {
                var16 = var1 + var3 - class535.field5209;
                var3 -= var16;
                var15 += var16;
            }

            if (var1 < class535.field5208) {
                var16 = class535.field5208 - var1;
                var3 -= var16;
                var14 += var16;
                var8 += var12 * var16;
                var15 += var16;
            }

            if (var5 == 256) {
                method9049(0, 0, 0, var8, this.field5147, class535.field5201, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
            } else {
                method9050(0, 0, 0, var8, this.field5147, class535.field5201, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
            }

        }
    }

    public void method9051(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
        int var9 = var2 < 0 ? -var2 : 0;
        int var10 = var2 + this.field5153 <= var6 ? this.field5153 : var6 - var2;
        int var11 = var1 < 0 ? -var1 : 0;
        int var10000;
        if (var1 + this.field5148 <= var5) {
            var10000 = this.field5148;
        } else {
            var10000 = var5 - var1;
        }

        int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * class535.field5202;
        int var14 = var2 + var9;

        for (int var15 = var9; var15 < var10; ++var15) {
            int var16 = var7[var14];
            int var17 = var8[var14++];
            int var18 = var13;
            int var19;
            if (var1 < var16) {
                var19 = var16 - var1;
                var18 = var13 + (var19 - var11);
            } else {
                var19 = var11;
            }

            int var12;
            if (var1 + this.field5148 <= var16 + var17) {
                var12 = this.field5148;
            } else {
                var12 = var16 + var17 - var1;
            }

            for (int var20 = var19; var20 < var12; ++var20) {
                int var21 = this.field5147[var20 + var15 * this.field5148];
                if (var21 != 0) {
                    class535.field5201[var18++] = var21;
                } else {
                    ++var18;
                }
            }

            var13 += class535.field5202;
        }

    }

    public void method9052(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
        try {
            int var11 = -var3 / 2;
            int var12 = -var4 / 2;
            int var13 = (int) (Math.sin((double) var7 / 326.11) * 65536.0);
            int var14 = (int) (Math.cos((double) var7 / 326.11) * 65536.0);
            var13 = var13 * var8 >> 8;
            var14 = var14 * var8 >> 8;
            int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
            int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
            int var17 = var1 + var2 * class535.field5202;

            for (var2 = 0; var2 < var4; ++var2) {
                int var18 = var9[var2];
                int var19 = var17 + var18;
                int var20 = var15 + var14 * var18;
                int var21 = var16 - var13 * var18;

                for (var1 = -var10[var2]; var1 < 0; ++var1) {
                    class535.field5201[var19++] = this.field5147[(var20 >> 16) + (var21 >> 16) * this.field5148];
                    var20 += var14;
                    var21 -= var13;
                }

                var15 += var13;
                var16 += var14;
                var17 += class535.field5202;
            }
        } catch (Exception var22) {
        }

    }

    public void method9124(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
        try {
            int var10 = -var3 / 2;
            int var11 = -var4 / 2;
            int var12 = (int) (Math.sin(var7) * 65536.0);
            int var13 = (int) (Math.cos(var7) * 65536.0);
            var12 = var12 * var9 >> 8;
            var13 = var13 * var9 >> 8;
            int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
            int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
            int var16 = var1 + var2 * class535.field5202;

            for (var2 = 0; var2 < var4; ++var2) {
                int var17 = var16;
                int var18 = var14;
                int var19 = var15;

                for (var1 = -var3; var1 < 0; ++var1) {
                    int var20 = this.field5147[(var18 >> 16) + (var19 >> 16) * this.field5148];
                    if (var20 != 0) {
                        class535.field5201[var17++] = var20;
                    } else {
                        ++var17;
                    }

                    var18 += var13;
                    var19 -= var12;
                }

                var14 += var12;
                var15 += var13;
                var16 += class535.field5202;
            }
        } catch (Exception var21) {
        }

    }

    public void method9105(int var1, int var2, int var3, int var4) {
        this.method9055(this.field5144 << 3, this.field5142 << 3, var1 << 4, var2 << 4, var3, var4);
    }

    void method9055(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (var6 != 0) {
            var1 -= this.field5145 << 4;
            var2 -= this.field5146 << 4;
            double var7 = (double) (var5 & '\uffff') * 9.587379924285257E-5;
            int var9 = (int) Math.floor(Math.sin(var7) * (double) var6 + 0.5);
            int var10 = (int) Math.floor(Math.cos(var7) * (double) var6 + 0.5);
            int var11 = -var1 * var10 + -var2 * var9;
            int var12 = -(-var1) * var9 + -var2 * var10;
            int var13 = ((this.field5148 << 4) - var1) * var10 + -var2 * var9;
            int var14 = -((this.field5148 << 4) - var1) * var9 + -var2 * var10;
            int var15 = -var1 * var10 + ((this.field5153 << 4) - var2) * var9;
            int var16 = -(-var1) * var9 + ((this.field5153 << 4) - var2) * var10;
            int var17 = ((this.field5148 << 4) - var1) * var10 + ((this.field5153 << 4) - var2) * var9;
            int var18 = -((this.field5148 << 4) - var1) * var9 + ((this.field5153 << 4) - var2) * var10;
            int var19;
            int var20;
            if (var11 < var13) {
                var19 = var11;
                var20 = var13;
            } else {
                var19 = var13;
                var20 = var11;
            }

            if (var15 < var19) {
                var19 = var15;
            }

            if (var17 < var19) {
                var19 = var17;
            }

            if (var15 > var20) {
                var20 = var15;
            }

            if (var17 > var20) {
                var20 = var17;
            }

            int var21;
            int var22;
            if (var12 < var14) {
                var21 = var12;
                var22 = var14;
            } else {
                var21 = var14;
                var22 = var12;
            }

            if (var16 < var21) {
                var21 = var16;
            }

            if (var18 < var21) {
                var21 = var18;
            }

            if (var16 > var22) {
                var22 = var16;
            }

            if (var18 > var22) {
                var22 = var18;
            }

            var19 >>= 12;
            var20 = var20 + 4095 >> 12;
            var21 >>= 12;
            var22 = var22 + 4095 >> 12;
            var19 += var3;
            var20 += var3;
            var21 += var4;
            var22 += var4;
            var19 >>= 4;
            var20 = var20 + 15 >> 4;
            var21 >>= 4;
            var22 = var22 + 15 >> 4;
            if (var19 < class535.field5208) {
                var19 = class535.field5208;
            }

            if (var20 > class535.field5209) {
                var20 = class535.field5209;
            }

            if (var21 < class535.field5206) {
                var21 = class535.field5206;
            }

            if (var22 > class535.field5207) {
                var22 = class535.field5207;
            }

            var20 = var19 - var20;
            if (var20 < 0) {
                var22 = var21 - var22;
                if (var22 < 0) {
                    int var23 = var21 * class535.field5202 + var19;
                    double var24 = 1.6777216E7 / (double) var6;
                    int var26 = (int) Math.floor(Math.sin(var7) * var24 + 0.5);
                    int var27 = (int) Math.floor(Math.cos(var7) * var24 + 0.5);
                    int var28 = (var19 << 4) + 8 - var3;
                    int var29 = (var21 << 4) + 8 - var4;
                    int var30 = (var1 << 8) - (var29 * var26 >> 4);
                    int var31 = (var2 << 8) + (var29 * var27 >> 4);
                    int var32;
                    int var33;
                    int var34;
                    int var36;
                    int var37;
                    int var38;
                    if (var27 == 0) {
                        if (var26 == 0) {
                            for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                var34 = var23;
                                var37 = var20;
                                if (var30 >= 0 && var31 >= 0 && var30 - (this.field5148 << 12) < 0 && var31 - (this.field5153 << 12) < 0) {
                                    for (; var37 < 0; ++var37) {
                                        var38 = this.field5147[(var31 >> 12) * this.field5148 + (var30 >> 12)];
                                        if (var38 != 0) {
                                            class535.field5201[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }
                                    }
                                }

                                ++var33;
                            }
                        } else if (var26 < 0) {
                            for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                var34 = var23;
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if (var30 >= 0 && var30 - (this.field5148 << 12) < 0) {
                                    if ((var32 = var36 - (this.field5153 << 12)) >= 0) {
                                        var32 = (var26 - var32) / var26;
                                        var37 = var20 + var32;
                                        var36 += var26 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var36 - var26) / var26) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field5147[(var36 >> 12) * this.field5148 + (var30 >> 12)];
                                        if (var38 != 0) {
                                            class535.field5201[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var36 += var26;
                                        ++var37;
                                    }
                                }

                                ++var33;
                                var30 -= var26;
                            }
                        } else {
                            for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                var34 = var23;
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if (var30 >= 0 && var30 - (this.field5148 << 12) < 0) {
                                    if (var36 < 0) {
                                        var32 = (var26 - 1 - var36) / var26;
                                        var37 = var20 + var32;
                                        var36 += var26 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var36 + 1 - (this.field5153 << 12) - var26) / var26) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field5147[(var36 >> 12) * this.field5148 + (var30 >> 12)];
                                        if (var38 != 0) {
                                            class535.field5201[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var36 += var26;
                                        ++var37;
                                    }
                                }

                                ++var33;
                                var30 -= var26;
                            }
                        }
                    } else {
                        int var35;
                        if (var27 < 0) {
                            if (var26 == 0) {
                                for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                    var34 = var23;
                                    var35 = var30 + (var28 * var27 >> 4);
                                    var37 = var20;
                                    if (var31 >= 0 && var31 - (this.field5153 << 12) < 0) {
                                        if ((var32 = var35 - (this.field5148 << 12)) >= 0) {
                                            var32 = (var27 - var32) / var27;
                                            var37 = var20 + var32;
                                            var35 += var27 * var32;
                                            var34 = var23 + var32;
                                        }

                                        if ((var32 = (var35 - var27) / var27) > var37) {
                                            var37 = var32;
                                        }

                                        while (var37 < 0) {
                                            var38 = this.field5147[(var31 >> 12) * this.field5148 + (var35 >> 12)];
                                            if (var38 != 0) {
                                                class535.field5201[var34++] = var38;
                                            } else {
                                                ++var34;
                                            }

                                            var35 += var27;
                                            ++var37;
                                        }
                                    }

                                    ++var33;
                                    var31 += var27;
                                }
                            } else if (var26 < 0) {
                                for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                    var34 = var23;
                                    var35 = var30 + (var28 * var27 >> 4);
                                    var36 = var31 + (var28 * var26 >> 4);
                                    var37 = var20;
                                    if ((var32 = var35 - (this.field5148 << 12)) >= 0) {
                                        var32 = (var27 - var32) / var27;
                                        var37 = var20 + var32;
                                        var35 += var27 * var32;
                                        var36 += var26 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var35 - var27) / var27) > var37) {
                                        var37 = var32;
                                    }

                                    if ((var32 = var36 - (this.field5153 << 12)) >= 0) {
                                        var32 = (var26 - var32) / var26;
                                        var37 += var32;
                                        var35 += var27 * var32;
                                        var36 += var26 * var32;
                                        var34 += var32;
                                    }

                                    if ((var32 = (var36 - var26) / var26) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field5147[(var36 >> 12) * this.field5148 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class535.field5201[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var35 += var27;
                                        var36 += var26;
                                        ++var37;
                                    }

                                    ++var33;
                                    var30 -= var26;
                                    var31 += var27;
                                }
                            } else {
                                for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                    var34 = var23;
                                    var35 = var30 + (var28 * var27 >> 4);
                                    var36 = var31 + (var28 * var26 >> 4);
                                    var37 = var20;
                                    if ((var32 = var35 - (this.field5148 << 12)) >= 0) {
                                        var32 = (var27 - var32) / var27;
                                        var37 = var20 + var32;
                                        var35 += var27 * var32;
                                        var36 += var26 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var35 - var27) / var27) > var37) {
                                        var37 = var32;
                                    }

                                    if (var36 < 0) {
                                        var32 = (var26 - 1 - var36) / var26;
                                        var37 += var32;
                                        var35 += var27 * var32;
                                        var36 += var26 * var32;
                                        var34 += var32;
                                    }

                                    if ((var32 = (var36 + 1 - (this.field5153 << 12) - var26) / var26) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field5147[(var36 >> 12) * this.field5148 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class535.field5201[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var35 += var27;
                                        var36 += var26;
                                        ++var37;
                                    }

                                    ++var33;
                                    var30 -= var26;
                                    var31 += var27;
                                }
                            }
                        } else if (var26 == 0) {
                            for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                var34 = var23;
                                var35 = var30 + (var28 * var27 >> 4);
                                var37 = var20;
                                if (var31 >= 0 && var31 - (this.field5153 << 12) < 0) {
                                    if (var35 < 0) {
                                        var32 = (var27 - 1 - var35) / var27;
                                        var37 = var20 + var32;
                                        var35 += var27 * var32;
                                        var34 = var23 + var32;
                                    }

                                    if ((var32 = (var35 + 1 - (this.field5148 << 12) - var27) / var27) > var37) {
                                        var37 = var32;
                                    }

                                    while (var37 < 0) {
                                        var38 = this.field5147[(var31 >> 12) * this.field5148 + (var35 >> 12)];
                                        if (var38 != 0) {
                                            class535.field5201[var34++] = var38;
                                        } else {
                                            ++var34;
                                        }

                                        var35 += var27;
                                        ++var37;
                                    }
                                }

                                ++var33;
                                var31 += var27;
                            }
                        } else if (var26 < 0) {
                            for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                var34 = var23;
                                var35 = var30 + (var28 * var27 >> 4);
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if (var35 < 0) {
                                    var32 = (var27 - 1 - var35) / var27;
                                    var37 = var20 + var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 = var23 + var32;
                                }

                                if ((var32 = (var35 + 1 - (this.field5148 << 12) - var27) / var27) > var37) {
                                    var37 = var32;
                                }

                                if ((var32 = var36 - (this.field5153 << 12)) >= 0) {
                                    var32 = (var26 - var32) / var26;
                                    var37 += var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 += var32;
                                }

                                if ((var32 = (var36 - var26) / var26) > var37) {
                                    var37 = var32;
                                }

                                while (var37 < 0) {
                                    var38 = this.field5147[(var36 >> 12) * this.field5148 + (var35 >> 12)];
                                    if (var38 != 0) {
                                        class535.field5201[var34++] = var38;
                                    } else {
                                        ++var34;
                                    }

                                    var35 += var27;
                                    var36 += var26;
                                    ++var37;
                                }

                                ++var33;
                                var30 -= var26;
                                var31 += var27;
                            }
                        } else {
                            for (var33 = var22; var33 < 0; var23 += class535.field5202) {
                                var34 = var23;
                                var35 = var30 + (var28 * var27 >> 4);
                                var36 = var31 + (var28 * var26 >> 4);
                                var37 = var20;
                                if (var35 < 0) {
                                    var32 = (var27 - 1 - var35) / var27;
                                    var37 = var20 + var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 = var23 + var32;
                                }

                                if ((var32 = (var35 + 1 - (this.field5148 << 12) - var27) / var27) > var37) {
                                    var37 = var32;
                                }

                                if (var36 < 0) {
                                    var32 = (var26 - 1 - var36) / var26;
                                    var37 += var32;
                                    var35 += var27 * var32;
                                    var36 += var26 * var32;
                                    var34 += var32;
                                }

                                if ((var32 = (var36 + 1 - (this.field5153 << 12) - var26) / var26) > var37) {
                                    var37 = var32;
                                }

                                while (var37 < 0) {
                                    var38 = this.field5147[(var36 >> 12) * this.field5148 + (var35 >> 12)];
                                    if (var38 != 0) {
                                        class535.field5201[var34++] = var38;
                                    } else {
                                        ++var34;
                                    }

                                    var35 += var27;
                                    var36 += var26;
                                    ++var37;
                                }

                                ++var33;
                                var30 -= var26;
                                var31 += var27;
                            }
                        }
                    }

                }
            }
        }
    }

    public void method9056(int var1, int var2, int var3, int var4) {
        if (var3 <= this.field5144 && var4 <= this.field5142) {
            int var5 = var1 + this.field5145 * var3 / this.field5144;
            int var6 = var1 + ((this.field5145 + this.field5148) * var3 + this.field5144 - 1) / this.field5144;
            int var7 = var2 + this.field5146 * var4 / this.field5142;
            int var8 = var2 + ((this.field5146 + this.field5153) * var4 + this.field5142 - 1) / this.field5142;
            if (var5 < class535.field5208) {
                var5 = class535.field5208;
            }

            if (var6 > class535.field5209) {
                var6 = class535.field5209;
            }

            if (var7 < class535.field5206) {
                var7 = class535.field5206;
            }

            if (var8 > class535.field5207) {
                var8 = class535.field5207;
            }

            if (var5 < var6 && var7 < var8) {
                int var9 = var7 * class535.field5202 + var5;
                int var10 = class535.field5202 - (var6 - var5);
                if (var9 < class535.field5201.length) {
                    for (int var11 = var7; var11 < var8; ++var11) {
                        for (int var12 = var5; var12 < var6; ++var12) {
                            int var13 = var12 - var1 << 4;
                            int var14 = var11 - var2 << 4;
                            int var15 = var13 * this.field5144 / var3 - (this.field5145 << 4);
                            int var16 = (var13 + 16) * this.field5144 / var3 - (this.field5145 << 4);
                            int var17 = var14 * this.field5142 / var4 - (this.field5146 << 4);
                            int var18 = (var14 + 16) * this.field5142 / var4 - (this.field5146 << 4);
                            int var19 = (var16 - var15) * (var18 - var17) >> 1;
                            if (var19 != 0) {
                                if (var15 < 0) {
                                    var15 = 0;
                                }

                                if (var16 >= this.field5148 << 4) {
                                    var16 = this.field5148 << 4;
                                }

                                if (var17 < 0) {
                                    var17 = 0;
                                }

                                if (var18 >= this.field5153 << 4) {
                                    var18 = this.field5153 << 4;
                                }

                                --var16;
                                --var18;
                                int var20 = 16 - (var15 & 15);
                                int var21 = (var16 & 15) + 1;
                                int var22 = 16 - (var17 & 15);
                                int var23 = (var18 & 15) + 1;
                                var15 >>= 4;
                                var16 >>= 4;
                                var17 >>= 4;
                                var18 >>= 4;
                                int var24 = 0;
                                int var25 = 0;
                                int var26 = 0;
                                int var27 = 0;

                                int var28;
                                for (var28 = var17; var28 <= var18; ++var28) {
                                    int var29 = 16;
                                    if (var28 == var17) {
                                        var29 = var22;
                                    }

                                    if (var28 == var18) {
                                        var29 = var23;
                                    }

                                    for (int var30 = var15; var30 <= var16; ++var30) {
                                        int var31 = this.field5147[var28 * this.field5148 + var30];
                                        if (var31 != 0) {
                                            int var32;
                                            if (var30 == var15) {
                                                var32 = var29 * var20;
                                            } else if (var30 == var16) {
                                                var32 = var29 * var21;
                                            } else {
                                                var32 = var29 << 4;
                                            }

                                            var27 += var32;
                                            var24 += (var31 >> 16 & 255) * var32;
                                            var25 += (var31 >> 8 & 255) * var32;
                                            var26 += (var31 & 255) * var32;
                                        }
                                    }
                                }

                                if (var27 >= var19) {
                                    var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
                                    if (var28 == 0) {
                                        var28 = 1;
                                    }

                                    class535.field5201[var9] = var28;
                                }

                                ++var9;
                            }
                        }

                        var9 += var10;
                    }

                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
