public class class229 {
    static final class217 field2508;
    static final class217 field2515;
    public static class251 field2513;
    public static int[] field2511 = new int[2048];
    public static int[] field2512 = new int[2048];
    public static int[] field2514 = new int[65536];
    static class217 field2516;
    static int[] field2509 = new int[2048];
    static int[] field2510 = new int[512];

    static {
        int var0;
        for (var0 = 1; var0 < 512; ++var0) {
            field2510[var0] = '\u8000' / var0;
        }

        for (var0 = 1; var0 < 2048; ++var0) {
            field2509[var0] = 65536 / var0;
        }

        for (var0 = 0; var0 < 2048; ++var0) {
            field2511[var0] = (int) (65536.0 * Math.sin((double) var0 * 0.0030679615));
            field2512[var0] = (int) (65536.0 * Math.cos((double) var0 * 0.0030679615));
        }

        field2513 = new class251();
        field2515 = new class257(field2513);
        field2508 = new class243(field2513);
        field2516 = field2515;
    }

    class229() throws Throwable {
    }

    public static void method4277(boolean var0) {
        if (var0 && class535.field5204 != null) {
            field2516 = field2508;
        } else {
            field2516 = field2515;
        }

    }

    public static void method4278(class259 var0) {
        field2513.field2815 = var0;
    }

    public static void method4279(double var0) {
        method4342(var0, 0, 512);
    }

    static void method4342(double var0, int var2, int var3) {
        int var4 = var2 * 128;

        for (int var5 = var2; var5 < var3; ++var5) {
            double var6 = (double) (var5 >> 3) / 64.0 + 0.0078125;
            double var8 = (double) (var5 & 7) / 8.0 + 0.0625;

            for (int var10 = 0; var10 < 128; ++var10) {
                double var11 = (double) var10 / 128.0;
                double var13 = var11;
                double var15 = var11;
                double var17 = var11;
                if (var8 != 0.0) {
                    double var19;
                    if (var11 < 0.5) {
                        var19 = var11 * (var8 + 1.0);
                    } else {
                        var19 = var11 + var8 - var11 * var8;
                    }

                    double var21 = var11 * 2.0 - var19;
                    double var23 = var6 + 0.3333333333333333;
                    if (var23 > 1.0) {
                        --var23;
                    }

                    double var27 = var6 - 0.3333333333333333;
                    if (var27 < 0.0) {
                        ++var27;
                    }

                    if (var23 * 6.0 < 1.0) {
                        var13 = var21 + (var19 - var21) * 6.0 * var23;
                    } else if (var23 * 2.0 < 1.0) {
                        var13 = var19;
                    } else if (var23 * 3.0 < 2.0) {
                        var13 = var21 + (var19 - var21) * (0.6666666666666666 - var23) * 6.0;
                    } else {
                        var13 = var21;
                    }

                    if (var6 * 6.0 < 1.0) {
                        var15 = var21 + (var19 - var21) * 6.0 * var6;
                    } else if (var6 * 2.0 < 1.0) {
                        var15 = var19;
                    } else if (var6 * 3.0 < 2.0) {
                        var15 = var21 + (var19 - var21) * (0.6666666666666666 - var6) * 6.0;
                    } else {
                        var15 = var21;
                    }

                    if (var27 * 6.0 < 1.0) {
                        var17 = var21 + (var19 - var21) * 6.0 * var27;
                    } else if (var27 * 2.0 < 1.0) {
                        var17 = var19;
                    } else if (var27 * 3.0 < 2.0) {
                        var17 = var21 + (var19 - var21) * (0.6666666666666666 - var27) * 6.0;
                    } else {
                        var17 = var21;
                    }
                }

                int var30 = (int) (var13 * 256.0);
                int var20 = (int) (var15 * 256.0);
                int var29 = (int) (var17 * 256.0);
                int var22 = (var30 << 16) + (var20 << 8) + var29;
                var22 = method4292(var22, var0);
                if (var22 == 0) {
                    var22 = 1;
                }

                field2514[var4++] = var22;
            }
        }

    }

    static int method4292(int var0, double var1) {
        double var3 = (double) (var0 >> 16) / 256.0;
        double var5 = (double) (var0 >> 8 & 255) / 256.0;
        double var7 = (double) (var0 & 255) / 256.0;
        var3 = Math.pow(var3, var1);
        var5 = Math.pow(var5, var1);
        var7 = Math.pow(var7, var1);
        int var9 = (int) (var3 * 256.0);
        int var10 = (int) (var5 * 256.0);
        int var11 = (int) (var7 * 256.0);
        return (var9 << 16) + (var10 << 8) + var11;
    }

    static int method4282() {
        return field2513.field2833;
    }

    static int method4283() {
        return field2513.field2827;
    }

    static int method4364() {
        return field2513.field2830;
    }

    static int method4285() {
        return field2513.field2819;
    }

    static int method4280() {
        return field2513.field2831;
    }

    static int method4287() {
        return field2513.field2832;
    }

    public static int method4288() {
        return field2513.field2814;
    }

    static int method4284() {
        return field2513.field2828;
    }

    public static void method4290(int[] var0, int var1, int var2, float[] var3) {
        if (var3 == null && field2516 == field2508) {
            field2516 = field2515;
        }

        field2516.method4132(var0, var1, var2, var3);
    }

    public static void method4291() {
        method4303(class535.field5208, class535.field5206, class535.field5209, class535.field5207);
    }

    static void method4303(int var0, int var1, int var2, int var3) {
        field2513.field2828 = var2 - var0;
        field2513.field2829 = var3 - var1;
        method4293();
        if (field2513.field2834.length < field2513.field2829) {
            field2513.field2834 = new int[class311.method2196(field2513.field2829)];
        }

        int var4 = var1 * class535.field5202 + var0;

        for (int var5 = 0; var5 < field2513.field2829; ++var5) {
            field2513.field2834[var5] = var4;
            var4 += class535.field5202;
        }

    }

    public static void method4293() {
        field2513.method4889();
    }

    public static void method4294(int var0, int var1) {
        int var2 = field2513.field2834[0];
        int var3 = var2 / class535.field5202;
        int var4 = var2 - var3 * class535.field5202;
        field2513.method4886(var0, var4, var1, var3);
    }

    public static void method4318(int var0, int var1, int var2) {
        field2513.method4887(var0, var1, var2);
    }

    static void method4296(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11) {
        field2516.method4137(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
    }

    public static void method4331(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9) {
        field2516.method4138(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    static void method4298(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
        field2516.method4139(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
    }

    static void method4299(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
        field2516.method4152(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
    }

    static void method4300(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, byte var12, byte var13, byte var14, byte var15) {
        field2516.method4135(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
    }

    static void method4301(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, byte var10, byte var11, byte var12, byte var13) {
        field2516.method4140(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13);
    }
}
