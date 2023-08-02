public class class192 extends class476 {
    public static class290 field2090 = new class290(64);
    public static class342 field2092;
    static class188 field2097;
    public int field2093;
    public int field2094;
    public int field2095;
    public int field2096;
    int field2091 = 0;

    public static void method6501() {
        field2090.method5637();
    }

    public void method3675() {
        this.method3678(this.field2091);
    }

    public void method3690(class519 var1, int var2) {
        while (true) {
            int var4 = var1.method8748();
            if (var4 == 0) {
                return;
            }

            this.method3674(var1, var4, var2);
        }
    }

    void method3674(class519 var1, int var2, int var3) {
        if (var2 == 1) {
            this.field2091 = var1.method8752();
        }

    }

    void method3678(int var1) {
        double var3 = (double) (var1 >> 16 & 255) / 256.0;
        double var5 = (double) (var1 >> 8 & 255) / 256.0;
        double var7 = (double) (var1 & 255) / 256.0;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }

        if (var7 < var9) {
            var9 = var7;
        }

        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }

        if (var7 > var11) {
            var11 = var7;
        }

        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = (var9 + var11) / 2.0;
        if (var11 != var9) {
            if (var17 < 0.5) {
                var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5) {
                var15 = (var11 - var9) / (2.0 - var11 - var9);
            }

            if (var11 == var3) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var11 == var5) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0;
            } else if (var11 == var7) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0;
            }
        }

        var13 /= 6.0;
        this.field2094 = (int) (var15 * 256.0);
        this.field2095 = (int) (var17 * 256.0);
        if (this.field2094 < 0) {
            this.field2094 = 0;
        } else if (this.field2094 > 255) {
            this.field2094 = 255;
        }

        if (this.field2095 < 0) {
            this.field2095 = 0;
        } else if (this.field2095 > 255) {
            this.field2095 = 255;
        }

        if (var17 > 0.5) {
            this.field2096 = (int) (512.0 * (1.0 - var17) * var15);
        } else {
            this.field2096 = (int) (var15 * var17 * 512.0);
        }

        if (this.field2096 < 1) {
            this.field2096 = 1;
        }

        this.field2093 = (int) ((double) this.field2096 * var13);
    }
}
