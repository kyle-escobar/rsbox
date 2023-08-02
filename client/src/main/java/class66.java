public class class66 {
    static float field519;
    static float[][] field515 = new float[2][8];
    static int field520;
    static int[][] field517 = new int[2][8];
    int[] field513 = new int[2];
    int[] field516 = new int[2];
    int[][][] field512 = new int[2][2][4];
    int[][][] field514 = new int[2][2][4];

    class66() {
    }

    static float method1392(float var0) {
        float var1 = 32.703197F * (float) Math.pow(2.0, var0);
        return var1 * 3.1415927F / 11025.0F;
    }

    float method1391(int var1, int var2, float var3) {
        float var4 = (float) this.field512[var1][0][var2] + var3 * (float) (this.field512[var1][1][var2] - this.field512[var1][0][var2]);
        var4 *= 0.0015258789F;
        return 1.0F - (float) Math.pow(10.0, -var4 / 20.0F);
    }

    float method1393(int var1, int var2, float var3) {
        float var4 = (float) this.field514[var1][0][var2] + var3 * (float) (this.field514[var1][1][var2] - this.field514[var1][0][var2]);
        var4 *= 1.2207031E-4F;
        return method1392(var4);
    }

    int method1394(int var1, float var2) {
        float var3;
        if (var1 == 0) {
            var3 = (float) this.field513[0] + (float) (this.field513[1] - this.field513[0]) * var2;
            var3 *= 0.0030517578F;
            field519 = (float) Math.pow(0.1, var3 / 20.0F);
            field520 = (int) (field519 * 65536.0F);
        }

        if (this.field516[var1] == 0) {
            return 0;
        } else {
            var3 = this.method1391(var1, 0, var2);
            field515[var1][0] = var3 * -2.0F * (float) Math.cos(this.method1393(var1, 0, var2));
            field515[var1][1] = var3 * var3;

            float[] var10000;
            int var4;
            for (var4 = 1; var4 < this.field516[var1]; ++var4) {
                var3 = this.method1391(var1, var4, var2);
                float var5 = var3 * -2.0F * (float) Math.cos(this.method1393(var1, var4, var2));
                float var6 = var3 * var3;
                field515[var1][var4 * 2 + 1] = field515[var1][var4 * 2 - 1] * var6;
                field515[var1][var4 * 2] = field515[var1][var4 * 2 - 1] * var5 + field515[var1][var4 * 2 - 2] * var6;

                for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
                    var10000 = field515[var1];
                    var10000[var7] += field515[var1][var7 - 1] * var5 + field515[var1][var7 - 2] * var6;
                }

                var10000 = field515[var1];
                var10000[1] += field515[var1][0] * var5 + var6;
                var10000 = field515[var1];
                var10000[0] += var5;
            }

            if (var1 == 0) {
                for (var4 = 0; var4 < this.field516[0] * 2; ++var4) {
                    var10000 = field515[0];
                    var10000[var4] *= field519;
                }
            }

            for (var4 = 0; var4 < this.field516[var1] * 2; ++var4) {
                field517[var1][var4] = (int) (field515[var1][var4] * 65536.0F);
            }

            return this.field516[var1] * 2;
        }
    }

    final void method1403(class519 var1, class52 var2) {
        int var3 = var1.method8748();
        this.field516[0] = var3 >> 4;
        this.field516[1] = var3 & 15;
        if (var3 != 0) {
            this.field513[0] = var1.method8750();
            this.field513[1] = var1.method8750();
            int var4 = var1.method8748();

            int var5;
            int var6;
            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field516[var5]; ++var6) {
                    this.field514[var5][0][var6] = var1.method8750();
                    this.field512[var5][0][var6] = var1.method8750();
                }
            }

            for (var5 = 0; var5 < 2; ++var5) {
                for (var6 = 0; var6 < this.field516[var5]; ++var6) {
                    if ((var4 & 1 << var5 * 4 << var6) != 0) {
                        this.field514[var5][1][var6] = var1.method8750();
                        this.field512[var5][1][var6] = var1.method8750();
                    } else {
                        this.field514[var5][1][var6] = this.field514[var5][0][var6];
                        this.field512[var5][1][var6] = this.field512[var5][0][var6];
                    }
                }
            }

            if (var4 != 0 || this.field513[1] != this.field513[0]) {
                var2.method1065(var1);
            }
        } else {
            int[] var7 = this.field513;
            this.field513[1] = 0;
            var7[0] = 0;
        }

    }
}
