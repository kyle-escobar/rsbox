public class class211 extends class470 {
    static int[] field2275;
    boolean field2262;
    boolean field2271 = false;
    int field2265;
    int field2266;
    int field2272;
    int[] field2267;
    int[] field2268;
    int[] field2269;
    int[] field2270;
    int[] field2273;

    class211(class519 var1) {
        this.field2266 = var1.method8750();
        this.field2262 = var1.method8748() == 1;
        int var2 = var1.method8748();
        if (var2 >= 1 && var2 > 4) {
        }

        this.field2267 = new int[var2];

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            this.field2267[var3] = var1.method8750();
        }

        if (var2 > 1) {
            this.field2268 = new int[var2 - 1];

            for (var3 = 0; var3 < var2 - 1; ++var3) {
                this.field2268[var3] = var1.method8748();
            }
        }

        if (var2 > 1) {
            this.field2269 = new int[var2 - 1];

            for (var3 = 0; var3 < var2 - 1; ++var3) {
                this.field2269[var3] = var1.method8748();
            }
        }

        this.field2270 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            this.field2270[var3] = var1.method9000();
        }

        this.field2265 = var1.method8748();
        this.field2272 = var1.method8748();
        this.field2273 = null;
    }

    boolean method3942(double var1, int var3, class342 var4) {
        int var5;
        for (var5 = 0; var5 < this.field2267.length; ++var5) {
            if (var4.method6390(this.field2267[var5]) == null) {
                return false;
            }
        }

        var5 = var3 * var3;
        this.field2273 = new int[var5];

        for (int var6 = 0; var6 < this.field2267.length; ++var6) {
            class537 var7 = class538.method8472(var4, this.field2267[var6]);
            var7.method9314();
            byte[] var8 = var7.field5220;
            int[] var9 = var7.field5215;
            int var10 = this.field2270[var6];
            if ((var10 & -16777216) == 16777216) {
            }

            if ((var10 & -16777216) == 33554432) {
            }

            int var11;
            int var12;
            int var13;
            int var14;
            if ((var10 & -16777216) == 50331648) {
                var11 = var10 & 16711935;
                var12 = var10 >> 8 & 255;

                for (var13 = 0; var13 < var9.length; ++var13) {
                    var14 = var9[var13];
                    if ((var14 & '\uffff') == var14 >> 8) {
                        var14 &= 255;
                        var9[var13] = var11 * var14 >> 8 & 16711935 | var12 * var14 & '\uff00';
                    }
                }
            }

            for (var11 = 0; var11 < var9.length; ++var11) {
                var9[var11] = class229.method4292(var9[var11], var1);
            }

            if (var6 == 0) {
                var11 = 0;
            } else {
                var11 = this.field2268[var6 - 1];
            }

            if (var11 == 0) {
                if (var7.field5216 == var3) {
                    for (var12 = 0; var12 < var5; ++var12) {
                        this.field2273[var12] = var9[var8[var12] & 255];
                    }
                } else if (var7.field5216 == 64 && var3 == 128) {
                    var12 = 0;

                    for (var13 = 0; var13 < var3; ++var13) {
                        for (var14 = 0; var14 < var3; ++var14) {
                            this.field2273[var12++] = var9[var8[(var14 >> 1) + (var13 >> 1 << 6)] & 255];
                        }
                    }
                } else {
                    if (var7.field5216 != 128 || var3 != 64) {
                        throw new RuntimeException();
                    }

                    var12 = 0;

                    for (var13 = 0; var13 < var3; ++var13) {
                        for (var14 = 0; var14 < var3; ++var14) {
                            this.field2273[var12++] = var9[var8[(var14 << 1) + (var13 << 1 << 7)] & 255];
                        }
                    }
                }
            }

            if (var11 == 1) {
            }

            if (var11 == 2) {
            }

            if (var11 == 3) {
            }
        }

        return true;
    }

    void method3937() {
        this.field2273 = null;
    }

    void method3938(int var1) {
        if (this.field2273 != null) {
            short var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            int[] var10;
            if (this.field2265 == 1 || this.field2265 == 3) {
                if (field2275 == null || field2275.length < this.field2273.length) {
                    field2275 = new int[this.field2273.length];
                }

                if (this.field2273.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.field2273.length;
                var4 = var2 * var1 * this.field2272;
                var5 = var3 - 1;
                if (this.field2265 == 1) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; ++var6) {
                    var7 = var6 + var4 & var5;
                    field2275[var6] = this.field2273[var7];
                }

                var10 = this.field2273;
                this.field2273 = field2275;
                field2275 = var10;
            }

            if (this.field2265 == 2 || this.field2265 == 4) {
                if (field2275 == null || field2275.length < this.field2273.length) {
                    field2275 = new int[this.field2273.length];
                }

                if (this.field2273.length == 4096) {
                    var2 = 64;
                } else {
                    var2 = 128;
                }

                var3 = this.field2273.length;
                var4 = var1 * this.field2272;
                var5 = var2 - 1;
                if (this.field2265 == 2) {
                    var4 = -var4;
                }

                for (var6 = 0; var6 < var3; var6 += var2) {
                    for (var7 = 0; var7 < var2; ++var7) {
                        int var8 = var6 + var7;
                        int var9 = var6 + (var7 + var4 & var5);
                        field2275[var8] = this.field2273[var9];
                    }
                }

                var10 = this.field2273;
                this.field2273 = field2275;
                field2275 = var10;
            }

        }
    }
}
