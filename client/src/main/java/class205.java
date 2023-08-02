public class class205 extends class476 {
    public static class342 field2212;
    static class290 field2205 = new class290(64);
    static class290 field2207 = new class290(30);
    public int field2204 = -1;
    int field2206 = 128;
    int field2208;
    int field2214 = 128;
    int field2216 = 0;
    int field2217 = 0;
    int field2218;
    int field2220 = 0;
    short[] field2210;
    short[] field2211;
    short[] field2213;
    short[] field2215;

    class205() {
    }

    public static class205 method3634(int var0) {
        class205 var2 = (class205) field2205.method5643(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field2212.method6381(13, var0);
            var2 = new class205();
            var2.field2218 = var0;
            if (var3 != null) {
                var2.method3855(new class519(var3));
            }

            field2205.method5640(var2, var0);
            return var2;
        }
    }

    public static void method3613() {
        field2205.method5637();
        field2207.method5637();
    }

    void method3855(class519 var1) {
        while (true) {
            int var3 = var1.method8748();
            if (var3 == 0) {
                return;
            }

            this.method3856(var1, var3);
        }
    }

    void method3856(class519 var1, int var2) {
        if (var2 == 1) {
            this.field2208 = var1.method8750();
        } else if (var2 == 2) {
            this.field2204 = var1.method8750();
        } else if (var2 == 4) {
            this.field2214 = var1.method8750();
        } else if (var2 == 5) {
            this.field2206 = var1.method8750();
        } else if (var2 == 6) {
            this.field2216 = var1.method8750();
        } else if (var2 == 7) {
            this.field2217 = var1.method8748();
        } else if (var2 == 8) {
            this.field2220 = var1.method8748();
        } else {
            int var4;
            int var5;
            if (var2 == 40) {
                var4 = var1.method8748();
                this.field2210 = new short[var4];
                this.field2211 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2210[var5] = (short) var1.method8750();
                    this.field2211[var5] = (short) var1.method8750();
                }
            } else if (var2 == 41) {
                var4 = var1.method8748();
                this.field2215 = new short[var4];
                this.field2213 = new short[var4];

                for (var5 = 0; var5 < var4; ++var5) {
                    this.field2215[var5] = (short) var1.method8750();
                    this.field2213[var5] = (short) var1.method8750();
                }
            }
        }

    }

    public final class249 method3857(int var1) {
        class249 var3 = this.method3858();
        class249 var4;
        if (-1 != this.field2204 && var1 != -1) {
            var4 = class215.method2582(this.field2204).method4054(var3, var1);
        } else {
            var4 = var3.method4760(true);
        }

        if (this.field2214 != 128 || this.field2206 != 128) {
            var4.method4779(this.field2214, this.field2206, this.field2214);
        }

        if (this.field2216 != 0) {
            if (90 == this.field2216) {
                var4.method4774();
            }

            if (this.field2216 == 180) {
                var4.method4774();
                var4.method4774();
            }

            if (this.field2216 == 270) {
                var4.method4774();
                var4.method4774();
                var4.method4774();
            }
        }

        return var4;
    }

    public final class249 method3858() {
        class249 var2 = (class249) field2207.method5643(this.field2218);
        if (null == var2) {
            class213 var3 = class213.method3952(class58.field413, this.field2208, 0);
            if (null == var3) {
                return null;
            }

            int var4;
            if (null != this.field2210) {
                for (var4 = 0; var4 < this.field2210.length; ++var4) {
                    var3.method3968(this.field2210[var4], this.field2211[var4]);
                }
            }

            if (null != this.field2215) {
                for (var4 = 0; var4 < this.field2215.length; ++var4) {
                    var3.method3969(this.field2215[var4], this.field2213[var4]);
                }
            }

            var2 = var3.method3976(64 + this.field2217, 850 + this.field2220, -30, -50, -30);
            field2207.method5640(var2, this.field2218);
        }

        return var2;
    }
}
