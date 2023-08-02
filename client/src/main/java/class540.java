public final class class540 {
    int field5231;
    int field5235;
    int field5236;
    int field5237;
    int[] field5230 = new int[256];
    int[] field5233 = new int[256];

    public class540(int[] var1) {
       System.arraycopy(var1, 0, this.field5233, 0, var1.length);

        this.method9372();
    }

    public int method9368() {
        if (this.field5237 == 0) {
            this.method9371();
            this.field5237 = 256;
        }

        return this.field5233[--this.field5237];
    }

    public int method9370() {
        if (0 == this.field5237) {
            this.method9371();
            this.field5237 = 256;
        }

        return this.field5233[this.field5237 - 1];
    }

    void method9371() {
        this.field5236 += ++this.field5231;

        for (int var2 = 0; var2 < 256; ++var2) {
            int var3 = this.field5230[var2];
            if (0 == (var2 & 2)) {
                if ((var2 & 1) == 0) {
                    this.field5235 ^= this.field5235 << 13;
                } else {
                    this.field5235 ^= this.field5235 >>> 6;
                }
            } else if ((var2 & 1) == 0) {
                this.field5235 ^= this.field5235 << 2;
            } else {
                this.field5235 ^= this.field5235 >>> 16;
            }

            this.field5235 += this.field5230[var2 + 128 & 255];
            int var4;
            this.field5230[var2] = var4 = this.field5236 + this.field5230[(var3 & 1020) >> 2] + this.field5235;
            this.field5233[var2] = this.field5236 = this.field5230[(var4 >> 8 & 1020) >> 2] + var3;
        }

    }

    void method9372() {
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var8 = -1640531527;
        int var7 = -1640531527;
        int var6 = -1640531527;
        int var5 = -1640531527;
        int var4 = -1640531527;
        int var3 = -1640531527;

        int var2;
        for (var2 = 0; var2 < 4; ++var2) {
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
        }

        for (var2 = 0; var2 < 256; var2 += 8) {
            var3 += this.field5233[var2];
            var4 += this.field5233[var2 + 1];
            var5 += this.field5233[var2 + 2];
            var6 += this.field5233[var2 + 3];
            var7 += this.field5233[var2 + 4];
            var8 += this.field5233[var2 + 5];
            var9 += this.field5233[var2 + 6];
            var10 += this.field5233[var2 + 7];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.field5230[var2] = var3;
            this.field5230[var2 + 1] = var4;
            this.field5230[var2 + 2] = var5;
            this.field5230[var2 + 3] = var6;
            this.field5230[var2 + 4] = var7;
            this.field5230[var2 + 5] = var8;
            this.field5230[var2 + 6] = var9;
            this.field5230[var2 + 7] = var10;
        }

        for (var2 = 0; var2 < 256; var2 += 8) {
            var3 += this.field5230[var2];
            var4 += this.field5230[var2 + 1];
            var5 += this.field5230[var2 + 2];
            var6 += this.field5230[var2 + 3];
            var7 += this.field5230[var2 + 4];
            var8 += this.field5230[var2 + 5];
            var9 += this.field5230[var2 + 6];
            var10 += this.field5230[var2 + 7];
            var3 ^= var4 << 11;
            var6 += var3;
            var4 += var5;
            var4 ^= var5 >>> 2;
            var7 += var4;
            var5 += var6;
            var5 ^= var6 << 8;
            var8 += var5;
            var6 += var7;
            var6 ^= var7 >>> 16;
            var9 += var6;
            var7 += var8;
            var7 ^= var8 << 10;
            var10 += var7;
            var8 += var9;
            var8 ^= var9 >>> 4;
            var3 += var8;
            var9 += var10;
            var9 ^= var10 << 8;
            var4 += var9;
            var10 += var3;
            var10 ^= var3 >>> 9;
            var5 += var10;
            var3 += var4;
            this.field5230[var2] = var3;
            this.field5230[var2 + 1] = var4;
            this.field5230[var2 + 2] = var5;
            this.field5230[var2 + 3] = var6;
            this.field5230[var2 + 4] = var7;
            this.field5230[var2 + 5] = var8;
            this.field5230[var2 + 6] = var9;
            this.field5230[var2 + 7] = var10;
        }

        this.method9371();
        this.field5237 = 256;
    }
}
