import java.util.concurrent.ScheduledExecutorService;

public class class277 {
    public static ScheduledExecutorService field3029;

    class277() throws Throwable {
    }

    static int method8160(int var0, int var1) {
        class209 var3 = class209.method2449(var0);
        if (var3 == null) {
            return var1;
        } else {
            int var5;
            int var6;
            int var7;
            int var8;
            int var9;
            if (var3.field2250 >= 0) {
                var5 = var3.field2258;
                var6 = var3.field2255;
                var7 = var3.field2252;
                if (var7 > 179) {
                    var6 /= 2;
                }

                if (var7 > 192) {
                    var6 /= 2;
                }

                if (var7 > 217) {
                    var6 /= 2;
                }

                if (var7 > 243) {
                    var6 /= 2;
                }

                var8 = (var5 / 4 << 10) + (var6 / 32 << 7) + var7 / 2;
                var9 = method2578(var8, 96);
                return class229.field2514[var9] | -16777216;
            } else if (var3.field2248 >= 0) {
                int var4 = method2578(class229.field2513.field2815.method5167(var3.field2248), 96);
                return class229.field2514[var4] | -16777216;
            } else if (16711935 == var3.field2247) {
                return var1;
            } else {
                var5 = var3.field2249;
                var6 = var3.field2245;
                var7 = var3.field2254;
                if (var7 > 179) {
                    var6 /= 2;
                }

                if (var7 > 192) {
                    var6 /= 2;
                }

                if (var7 > 217) {
                    var6 /= 2;
                }

                if (var7 > 243) {
                    var6 /= 2;
                }

                var8 = var7 / 2 + (var5 / 4 << 10) + (var6 / 32 << 7);
                var9 = method2578(var8, 96);
                return class229.field2514[var9] | -16777216;
            }
        }
    }

    static int method2578(int var0, int var1) {
        if (var0 == -2) {
            return 12345678;
        } else if (var0 == -1) {
            if (var1 < 0) {
                var1 = 0;
            } else if (var1 > 127) {
                var1 = 127;
            }

            var1 = 127 - var1;
            return var1;
        } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
                var1 = 2;
            } else if (var1 > 126) {
                var1 = 126;
            }

            return (var0 & '\uff80') + var1;
        }
    }
}
