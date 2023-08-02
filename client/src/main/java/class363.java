import java.util.zip.CRC32;

public class class363 extends class342 {
    static CRC32 field4009 = new CRC32();
    boolean field4011 = false;
    boolean field4017 = false;
    class355 field4018;
    class449 field4007;
    class449 field4008;
    int field4006 = -1;
    int field4014;
    int field4015;
    int field4019;
    volatile boolean[] field4012;
    volatile int field4010 = 0;

    public class363(class449 var1, class449 var2, class355 var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8) {
        super(var5, var6);
        this.field4007 = var1;
        this.field4008 = var2;
        this.field4019 = var4;
        this.field4011 = var7;
        this.field4017 = var8;
        this.field4018 = var3;
        this.field4018.method6561(this, this.field4019);
    }

    public boolean method6614() {
        return this.field4010 == 1;
    }

    public int method6598() {
        if (1 == this.field4010 || this.field4017 && this.field4010 == 2) {
            return 100;
        } else if (super.field3830 != null) {
            return 99;
        } else {
            int var2 = this.field4018.method6538(255, this.field4019);
            if (var2 >= 100) {
                var2 = 99;
            }

            return var2;
        }
    }

    void method6435(int var1) {
        this.field4018.method6537(this.field4019, var1);
    }

    void method6391(int var1) {
        if (this.field4007 != null && null != this.field4012 && this.field4012[var1]) {
            class449 var3 = this.field4007;
            byte[] var5 = null;
            synchronized (class350.field3868) {
                for (class352 var7 = (class352) class350.field3868.method6706(); var7 != null; var7 = (class352) class350.field3868.method6687()) {
                    if (var7.field4816 == (long) var1 && var7.field3886 == var3 && 0 == var7.field3890) {
                        var5 = var7.field3885;
                        break;
                    }
                }
            }

            if (null != var5) {
                this.method6602(var3, var1, var5, true);
            } else {
                byte[] var6 = var3.method7860(var1);
                this.method6602(var3, var1, var6, true);
            }
        } else {
            this.field4018.method6536(this, this.field4019, var1, super.field3824[var1], (byte) 2, true);
        }

    }

    void method6599() {
        this.field4010 = 2;
        super.field3834 = new int[0];
        super.field3824 = new int[0];
        super.field3825 = new int[0];
        super.field3826 = new int[0];
        super.field3827 = new int[0][];
        super.field3830 = new Object[0];
        super.field3820 = new Object[0][];
    }

    void method6600(int var1, int var2) {
        this.field4014 = var1;
        this.field4015 = var2;
        if (this.field4008 != null) {
            int var4 = this.field4019;
            class449 var5 = this.field4008;
            byte[] var7 = null;
            synchronized (class350.field3868) {
                for (class352 var9 = (class352) class350.field3868.method6706(); var9 != null; var9 = (class352) class350.field3868.method6687()) {
                    if ((long) var4 == var9.field4816 && var5 == var9.field3886 && 0 == var9.field3890) {
                        var7 = var9.field3885;
                        break;
                    }
                }
            }

            if (null != var7) {
                this.method6602(var5, var4, var7, true);
            } else {
                byte[] var8 = var5.method7860(var4);
                this.method6602(var5, var4, var8, true);
            }
        } else {
            this.field4018.method6536(this, 255, this.field4019, this.field4014, (byte) 0, true);
        }

    }

    void method6613(int var1, byte[] var2, boolean var3, boolean var4) {
        if (var3) {
            if (this.field4010 == 1) {
                throw new RuntimeException();
            }

            if (this.field4008 != null) {
                int var6 = this.field4019;
                class449 var7 = this.field4008;
                class352 var8 = new class352();
                var8.field3890 = 0;
                var8.field4816 = var6;
                var8.field3885 = var2;
                var8.field3886 = var7;
                synchronized (class350.field3868) {
                    class350.field3868.method6680(var8);
                }

                class350.method5742();
            }

            this.method6379(var2);
            this.method6617();
        } else {
            var2[var2.length - 2] = (byte) (super.field3825[var1] >> 8);
            var2[var2.length - 1] = (byte) super.field3825[var1];
            if (null != this.field4007) {
                class449 var14 = this.field4007;
                class352 var16 = new class352();
                var16.field3890 = 0;
                var16.field4816 = var1;
                var16.field3885 = var2;
                var16.field3886 = var14;
                synchronized (class350.field3868) {
                    class350.field3868.method6680(var16);
                }

                class350.method5742();
                this.field4012[var1] = true;
            }

            if (var4) {
                Object[] var15 = super.field3830;
                Object var17;
                if (null == var2) {
                    var17 = null;
                } else if (var2.length > 136) {
                    class354 var9 = new class354();
                    var9.method5839(var2);
                    var17 = var9;
                } else {
                    var17 = var2;
                }

                var15[var1] = var17;
            }
        }

    }

    void method6602(class449 var1, int var2, byte[] var3, boolean var4) {
        int var6;
        if (var1 == this.field4008) {
            if (this.field4010 == 1) {
                throw new RuntimeException();
            } else if (null == var3) {
                this.field4018.method6536(this, 255, this.field4019, this.field4014, (byte) 0, true);
            } else {
                field4009.reset();
                field4009.update(var3, 0, var3.length);
                var6 = (int) field4009.getValue();
                if (var6 != this.field4014) {
                    this.field4018.method6536(this, 255, this.field4019, this.field4014, (byte) 0, true);
                } else {
                    class519 var12 = new class519(class342.method5782(var3));
                    int var13 = var12.method8748();
                    if (var13 != 5 && var13 != 6) {
                        throw new RuntimeException(var13 + "," + this.field4019 + "," + var2);
                    } else {
                        int var9 = 0;
                        if (var13 >= 6) {
                            var9 = var12.method9000();
                        }

                        if (var9 != this.field4015) {
                            this.field4018.method6536(this, 255, this.field4019, this.field4014, (byte) 0, true);
                        } else {
                            this.method6379(var3);
                            this.method6617();
                        }
                    }
                }
            }
        } else {
            if (!var4 && this.field4006 == var2) {
                this.field4010 = 1;
            }

            if (var3 != null && var3.length > 2) {
                field4009.reset();
                field4009.update(var3, 0, var3.length - 2);
                var6 = (int) field4009.getValue();
                int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
                if (var6 == super.field3824[var2] && var7 == super.field3825[var2]) {
                    this.field4012[var2] = true;
                    if (var4) {
                        Object[] var8 = super.field3830;
                        Object var10;
                        if (null == var3) {
                            var10 = null;
                        } else if (var3.length > 136) {
                            class354 var11 = new class354();
                            var11.method5839(var3);
                            var10 = var11;
                        } else {
                            var10 = var3;
                        }

                        var8[var2] = var10;
                    }

                } else {
                    this.field4012[var2] = false;
                    if (this.field4011 || var4) {
                        this.field4018.method6536(this, this.field4019, var2, super.field3824[var2], (byte) 2, var4);
                    }

                }
            } else {
                this.field4012[var2] = false;
                if (this.field4011 || var4) {
                    this.field4018.method6536(this, this.field4019, var2, super.field3824[var2], (byte) 2, var4);
                }

            }
        }
    }

    void method6617() {
        this.field4012 = new boolean[super.field3830.length];

        int var2;
        for (var2 = 0; var2 < this.field4012.length; ++var2) {
            this.field4012[var2] = false;
        }

        if (null == this.field4007) {
            this.field4010 = 1;
        } else {
            this.field4006 = -1;

            for (var2 = 0; var2 < this.field4012.length; ++var2) {
                if (super.field3826[var2] > 0) {
                    class350.method2547(var2, this.field4007, this);
                    this.field4006 = var2;
                }
            }

            if (-1 == this.field4006) {
                this.field4010 = 1;
            }

        }
    }

    int method6387(int var1) {
        if (null != super.field3830[var1]) {
            return 100;
        } else {
            return this.field4012[var1] ? 100 : this.field4018.method6538(this.field4019, var1);
        }
    }

    public boolean method6611(int var1) {
        return this.field4012[var1];
    }

    public boolean method6628(int var1) {
        return this.method6392(var1) != null;
    }

    public int method6607() {
        int var2 = 0;
        int var3 = 0;

        int var4;
        for (var4 = 0; var4 < super.field3830.length; ++var4) {
            if (super.field3826[var4] > 0) {
                var2 += 100;
                var3 += this.method6387(var4);
            }
        }

        if (var2 == 0) {
            return 100;
        } else {
            var4 = var3 * 100 / var2;
            return var4;
        }
    }
}
