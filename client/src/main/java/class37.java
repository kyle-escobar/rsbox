public class class37 {
    public static int field198;
    static int field183;
    static int field195;
    public int field188;
    public int field202;
    public int[] field187;
    boolean field192 = true;
    class51 field184;
    class51[] field180 = new class51[8];
    class51[] field196 = new class51[8];
    int field185 = 32;
    int field189;
    int field191 = 0;
    int field193 = 0;
    int field197 = 0;
    int field201 = 0;
    long field186 = class302.method2194();
    long field190 = 0L;
    long field194 = 0L;

    public static final void method3900(class36 var0) {
        class293.field3132 = var0;
    }

    public static final void method4636(int var0, boolean var1, int var2) {
        if (var0 >= 8000 && var0 <= 48000) {
            field198 = var0;
            class373.field4355 = var1;
            class204.field2196 = var2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    static final void method6577(class51 var0) {
        var0.field373 = false;
        if (var0.field371 != null) {
            var0.field371.field511 = 0;
        }

        for (class51 var2 = var0.method1040(); null != var2; var2 = var0.method1043()) {
            method6577(var2);
        }

    }

    public final synchronized void method530(class51 var1) {
        this.field184 = var1;
    }

    public final synchronized void method531() {
        if (null != this.field187) {
            long var2 = class302.method2194();

            try {
                if (this.field190 != 0L) {
                    if (var2 < this.field190) {
                        return;
                    }

                    this.method535(this.field202);
                    this.field190 = 0L;
                    this.field192 = true;
                }

                int var4 = this.method540();
                if (this.field193 - var4 > this.field191) {
                    this.field191 = this.field193 - var4;
                }

                int var5 = this.field189 + this.field188;
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }

                if (var5 + 256 > this.field202) {
                    this.field202 += 1024;
                    if (this.field202 > 16384) {
                        this.field202 = 16384;
                    }

                    this.method542();
                    this.method535(this.field202);
                    var4 = 0;
                    this.field192 = true;
                    if (var5 + 256 > this.field202) {
                        var5 = this.field202 - 256;
                        this.field189 = var5 - this.field188;
                    }
                }

                while (var4 < var5) {
                    this.method536(this.field187, 256);
                    this.method585();
                    var4 += 256;
                }

                if (var2 > this.field194) {
                    if (!this.field192) {
                        if (this.field191 == 0 && 0 == this.field201) {
                            this.method542();
                            this.field190 = var2 + 2000L;
                            return;
                        }

                        this.field189 = Math.min(this.field201, this.field191);
                        this.field201 = this.field191;
                    } else {
                        this.field192 = false;
                    }

                    this.field191 = 0;
                    this.field194 = var2 + 2000L;
                }

                this.field193 = var4;
            } catch (Exception var7) {
                this.method542();
                this.field190 = var2 + 2000L;
            }

            try {
                if (var2 > 500000L + this.field186) {
                    var2 = this.field186;
                }

                while (var2 > 5000L + this.field186) {
                    this.method562(256);
                    this.field186 += 256000 / field198;
                }
            } catch (Exception var6) {
                this.field186 = var2;
            }

        }
    }

    public final void method532() {
        this.field192 = true;
    }

    public final synchronized void method584() {
        this.field192 = true;

        try {
            this.method543();
        } catch (Exception var3) {
            this.method542();
            this.field190 = class302.method2194() + 2000L;
        }

    }

    public final synchronized void method547() {
        if (class265.field2956 != null) {
            boolean var2 = true;

            for (int var3 = 0; var3 < 2; ++var3) {
                if (this == class265.field2956.field365[var3]) {
                    class265.field2956.field365[var3] = null;
                }

                if (class265.field2956.field365[var3] != null) {
                    var2 = false;
                }
            }

            if (var2) {
                class277.field3029.shutdownNow();
                class277.field3029 = null;
                class265.field2956 = null;
            }
        }

        this.method542();
        this.field187 = null;
    }

    final void method562(int var1) {
        this.field197 -= var1;
        if (this.field197 < 0) {
            this.field197 = 0;
        }

        if (null != this.field184) {
            this.field184.method1045(var1);
        }

    }

    final void method536(int[] var1, int var2) {
        int var3 = var2;
        if (class373.field4355) {
            var3 = var2 << 1;
        }

        class415.method7436(var1, 0, var3);
        this.field197 -= var2;
        if (null != this.field184 && this.field197 <= 0) {
            this.field197 += field198 >> 4;
            method6577(this.field184);
            this.method537(this.field184, this.field184.method1039());
            int var4 = 0;
            int var5 = 255;

            int var6;
            class51 var10;
            label103:
            for (var6 = 7; var5 != 0; --var6) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }

                for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
                    if ((var9 & 1) != 0) {
                        var5 &= ~(1 << var7);
                        var10 = null;
                        class51 var11 = this.field180[var7];

                        label97:
                        while (true) {
                            while (true) {
                                if (null == var11) {
                                    break label97;
                                }

                                class65 var12 = var11.field371;
                                if (var12 != null && var12.field511 > var8) {
                                    var5 |= 1 << var7;
                                    var10 = var11;
                                    var11 = var11.field372;
                                } else {
                                    var11.field373 = true;
                                    int var13 = var11.method1042();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field511 += var13;
                                    }

                                    if (var4 >= this.field185) {
                                        break label103;
                                    }

                                    class51 var14 = var11.method1040();
                                    if (var14 != null) {
                                        for (int var15 = var11.field370; var14 != null; var14 = var11.method1043()) {
                                            this.method537(var14, var15 * var14.method1039() >> 8);
                                        }
                                    }

                                    class51 var18 = var11.field372;
                                    var11.field372 = null;
                                    if (var10 == null) {
                                        this.field180[var7] = var18;
                                    } else {
                                        var10.field372 = var18;
                                    }

                                    if (null == var18) {
                                        this.field196[var7] = var10;
                                    }

                                    var11 = var18;
                                }
                            }
                        }
                    }

                    var7 += 4;
                    ++var8;
                }
            }

            for (var6 = 0; var6 < 8; ++var6) {
                class51 var16 = this.field180[var6];
                class51[] var17 = this.field180;
                this.field196[var6] = null;

                for (var17[var6] = null; var16 != null; var16 = var10) {
                    var10 = var16.field372;
                    var16.field372 = null;
                }
            }
        }

        if (this.field197 < 0) {
            this.field197 = 0;
        }

        if (null != this.field184) {
            this.field184.method1044(var1, 0, var2);
        }

        this.field186 = class302.method2194();
    }

    final void method537(class51 var1, int var2) {
        int var4 = var2 >> 5;
        class51 var5 = this.field196[var4];
        if (null == var5) {
            this.field180[var4] = var1;
        } else {
            var5.field372 = var1;
        }

        this.field196[var4] = var1;
        var1.field370 = var2;
    }

    public void method538() throws Exception {
    }

    public void method535(int var1) throws Exception {
    }

    protected int method540() throws Exception {
        return this.field202;
    }

    protected void method585() throws Exception {
    }

    protected void method542() {
    }

    protected void method543() throws Exception {
    }
}
