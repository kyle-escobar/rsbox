import java.math.BigInteger;

public class class519 extends class470 {
    static int[] field5128 = new int[256];
    static long[] field5130;

    static {
        int var2;
        for (int var1 = 0; var1 < 256; ++var1) {
            int var0 = var1;

            for (var2 = 0; var2 < 8; ++var2) {
                if (1 == (var0 & 1)) {
                    var0 = var0 >>> 1 ^ -306674912;
                } else {
                    var0 >>>= 1;
                }
            }

            field5128[var1] = var0;
        }

        field5130 = new long[256];

        for (var2 = 0; var2 < 256; ++var2) {
            long var4 = var2;

            for (int var3 = 0; var3 < 8; ++var3) {
                if ((var4 & 1L) == 1L) {
                    var4 = var4 >>> 1 ^ -3932672073523589310L;
                } else {
                    var4 >>>= 1;
                }
            }

            field5130[var2] = var4;
        }

    }

    public byte[] field5127;
    public int field5129;

    public class519(int var1) {
        this.field5127 = class321.method5869(var1);
        this.field5129 = 0;
    }

    public class519(int var1, boolean var2) {
        this.field5127 = class401.method7062(var1, var2);
    }

    public class519(byte[] var1) {
        this.field5127 = var1;
        this.field5129 = 0;
    }

    static int method6596(byte[] var0, int var1, int var2) {
        int var4 = -1;

        for (int var5 = var1; var5 < var2; ++var5) {
            var4 = var4 >>> 8 ^ field5128[(var4 ^ var0[var5]) & 255];
        }

        var4 = ~var4;
        return var4;
    }

    public static int method8713(String var0) {
        return var0.length() + 1;
    }

    public static int method6819(String var0) {
        return var0.length() + 2;
    }

    public void method8730() {
        if (this.field5127 != null) {
            class401.method6948(this.field5127);
        }

        this.field5127 = null;
    }

    public void method8731(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) var1;
    }

    public void method8732(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) var1;
    }

    public void method8733(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 16);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) var1;
    }

    public void method8734(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 24);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 16);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) var1;
    }

    public void method8735(long var1) {
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 40));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 32));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 24));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 16));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 8));
        this.field5127[++this.field5129 - 1] = (byte) ((int) var1);
    }

    public void method8736(long var1) {
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 56));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 48));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 40));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 32));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 24));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 16));
        this.field5127[++this.field5129 - 1] = (byte) ((int) (var1 >> 8));
        this.field5127[++this.field5129 - 1] = (byte) ((int) var1);
    }

    public void method8737(boolean var1) {
        this.method8731(var1 ? 1 : 0);
    }

    public void method8738(String var1) {
        int var3 = var1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.field5129 += class389.method2459(var1, 0, var1.length(), this.field5127, this.field5129);
            this.field5127[++this.field5129 - 1] = 0;
        }
    }

    public void method8739(String var1) {
        int var3 = var1.indexOf(0);
        if (var3 >= 0) {
            throw new IllegalArgumentException("");
        } else {
            this.field5127[++this.field5129 - 1] = 0;
            this.field5129 += class389.method2459(var1, 0, var1.length(), this.field5127, this.field5129);
            this.field5127[++this.field5129 - 1] = 0;
        }
    }

    public void method8740(CharSequence var1) {
        int var4 = var1.length();
        int var5 = 0;

        int var6;
        for (var6 = 0; var6 < var4; ++var6) {
            char var7 = var1.charAt(var6);
            if (var7 <= 127) {
                ++var5;
            } else if (var7 <= 2047) {
                var5 += 2;
            } else {
                var5 += 3;
            }
        }

        this.field5127[++this.field5129 - 1] = 0;
        this.method8747(var5);
        var5 = this.field5129 * 646629181;
        byte[] var13 = this.field5127;
        int var8 = this.field5129;
        int var9 = var1.length();
        int var10 = var8;

        for (int var11 = 0; var11 < var9; ++var11) {
            char var12 = var1.charAt(var11);
            if (var12 <= 127) {
                var13[var10++] = (byte) var12;
            } else if (var12 <= 2047) {
                var13[var10++] = (byte) (192 | var12 >> 6);
                var13[var10++] = (byte) (128 | var12 & 63);
            } else {
                var13[var10++] = (byte) (224 | var12 >> 12);
                var13[var10++] = (byte) (128 | var12 >> 6 & 63);
                var13[var10++] = (byte) (128 | var12 & 63);
            }
        }

        var6 = var10 - var8;
        this.field5129 = (var5 + var6 * 646629181) * -164706283;
    }

    public void method8741(byte[] var1, int var2, int var3) {
        for (int var5 = var2; var5 < var3 + var2; ++var5) {
            this.field5127[++this.field5129 - 1] = var1[var5];
        }

    }

    public void method8742(class519 var1) {
        this.method8741(var1.field5127, 0, var1.field5129);
    }

    public void method8743(int var1) {
        if (var1 < 0) {
            throw new IllegalArgumentException();
        } else {
            this.field5127[this.field5129 - var1 - 4] = (byte) (var1 >> 24);
            this.field5127[this.field5129 - var1 - 3] = (byte) (var1 >> 16);
            this.field5127[this.field5129 - var1 - 2] = (byte) (var1 >> 8);
            this.field5127[this.field5129 - var1 - 1] = (byte) var1;
        }
    }

    public void method8744(int var1) {
        if (var1 >= 0 && var1 <= 65535) {
            this.field5127[this.field5129 - var1 - 2] = (byte) (var1 >> 8);
            this.field5127[this.field5129 - var1 - 1] = (byte) var1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method8745(int var1) {
        if (var1 >= 0 && var1 <= 255) {
            this.field5127[this.field5129 - var1 - 1] = (byte) var1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method8746(int var1) {
        if (var1 >= 0 && var1 < 128) {
            this.method8731(var1);
        } else if (var1 >= 0 && var1 < 32768) {
            this.method8732(var1 + '\u8000');
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void method8747(int var1) {
        if ((var1 & -128) != 0) {
            if (0 != (var1 & -16384)) {
                if ((var1 & -2097152) != 0) {
                    if ((var1 & -268435456) != 0) {
                        this.method8731(var1 >>> 28 | 128);
                    }

                    this.method8731(var1 >>> 21 | 128);
                }

                this.method8731(var1 >>> 14 | 128);
            }

            this.method8731(var1 >>> 7 | 128);
        }

        this.method8731(var1 & 127);
    }

    public int method8748() {
        return this.field5127[++this.field5129 - 1] & 255;
    }

    public byte method8768() {
        return this.field5127[++this.field5129 - 1];
    }

    public int method8750() {
        this.field5129 += 2;
        return ((this.field5127[this.field5129 - 2] & 255) << 8) + (this.field5127[this.field5129 - 1] & 255);
    }

    public int method9001() {
        this.field5129 += 2;
        int var2 = (this.field5127[this.field5129 - 1] & 255) + ((this.field5127[this.field5129 - 2] & 255) << 8);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public int method8752() {
        this.field5129 += 3;
        return ((this.field5127[this.field5129 - 3] & 255) << 16) + ((this.field5127[this.field5129 - 2] & 255) << 8) + (this.field5127[this.field5129 - 1] & 255);
    }

    public int method8832() {
        this.field5129 += 3;
        int var2 = (this.field5127[this.field5129 - 1] & 255) + ((this.field5127[this.field5129 - 2] & 255) << 8) + ((this.field5127[this.field5129 - 3] & 255) << 16);
        if (var2 > 8388607) {
            var2 -= 16777216;
        }

        return var2;
    }

    public int method9000() {
        this.field5129 += 4;
        return ((this.field5127[this.field5129 - 3] & 255) << 16) + ((this.field5127[this.field5129 - 4] & 255) << 24) + ((this.field5127[this.field5129 - 2] & 255) << 8) + (this.field5127[this.field5129 - 1] & 255);
    }

    public long method8755() {
        long var2 = (long) this.method9000() & 4294967295L;
        long var4 = (long) this.method9000() & 4294967295L;
        return (var2 << 32) + var4;
    }

    public float method8756() {
        return Float.intBitsToFloat(this.method9000());
    }

    public boolean method8757() {
        return (this.method8748() & 1) == 1;
    }

    public String method8758() {
        if (this.field5127[this.field5129] == 0) {
            ++this.field5129;
            return null;
        } else {
            return this.method8873();
        }
    }

    public String method8873() {
        int var2 = this.field5129;

        while (this.field5127[++this.field5129 - 1] != 0) {
        }

        int var3 = this.field5129 - var2 - 1;
        return var3 == 0 ? "" : class389.method8163(this.field5127, var2, var3);
    }

    public String method8760() {
        byte var2 = this.field5127[++this.field5129 - 1];
        if (var2 != 0) {
            throw new IllegalStateException("");
        } else {
            int var3 = this.field5129;

            while (this.field5127[++this.field5129 - 1] != 0) {
            }

            int var4 = this.field5129 - var3 - 1;
            return var4 == 0 ? "" : class389.method8163(this.field5127, var3, var4);
        }
    }

    public String method8761() {
        byte var2 = this.field5127[++this.field5129 - 1];
        if (var2 != 0) {
            throw new IllegalStateException("");
        } else {
            int var3 = this.method8769();
            if (var3 + this.field5129 > this.field5127.length) {
                throw new IllegalStateException("");
            } else {
                String var4 = class501.method7095(this.field5127, this.field5129, var3);
                this.field5129 += var3;
                return var4;
            }
        }
    }

    public void method8896(byte[] var1, int var2, int var3) {
        for (int var5 = var2; var5 < var3 + var2; ++var5) {
            var1[var5] = this.field5127[++this.field5129 - 1];
        }

    }

    public int method8763() {
        int var2 = this.field5127[this.field5129] & 255;
        return var2 < 128 ? this.method8748() - 64 : this.method8750() - '\uc000';
    }

    public int method8764() {
        int var2 = this.field5127[this.field5129] & 255;
        return var2 < 128 ? this.method8748() : this.method8750() - '\u8000';
    }

    public int method8923() {
        int var2 = this.field5127[this.field5129] & 255;
        return var2 < 128 ? this.method8748() - 1 : this.method8750() - '\u8001';
    }

    public int method8766() {
        int var2 = 0;

        int var3;
        for (var3 = this.method8764(); var3 == 32767; var3 = this.method8764()) {
            var2 += 32767;
        }

        var2 += var3;
        return var2;
    }

    public int method8767() {
        return this.field5127[this.field5129] < 0 ? this.method9000() & Integer.MAX_VALUE : this.method8750();
    }

    public int method8814() {
        if (this.field5127[this.field5129] < 0) {
            return this.method9000() & Integer.MAX_VALUE;
        } else {
            int var2 = this.method8750();
            return var2 == 32767 ? -1 : var2;
        }
    }

    public int method8769() {
        byte var2 = this.field5127[++this.field5129 - 1];

        int var3;
        for (var3 = 0; var2 < 0; var2 = this.field5127[++this.field5129 - 1]) {
            var3 = (var3 | var2 & 127) << 7;
        }

        return var3 | var2;
    }

    public int method8993() {
        int var3 = 0;
        int var4 = 0;

        int var2;
        do {
            var2 = this.method8748();
            var3 |= (var2 & 127) << var4;
            var4 += 7;
        } while (var2 > 127);

        return var3;
    }

    public void method8771(int[] var1) {
        int var3 = this.field5129 / 8;
        this.field5129 = 0;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.method9000();
            int var6 = this.method9000();
            int var7 = 0;
            int var8 = -1640531527;

            for (int var9 = 32; var9-- > 0; var6 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3]) {
                var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7;
                var7 += var8;
            }

            this.field5129 -= 8;
            this.method8734(var5);
            this.method8734(var6);
        }

    }

    public void method8834(int[] var1) {
        int var3 = this.field5129 / 8;
        this.field5129 = 0;

        for (int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.method9000();
            int var6 = this.method9000();
            int var7 = -957401312;
            int var8 = -1640531527;

            for (int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
                var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
                var7 -= var8;
            }

            this.field5129 -= 8;
            this.method8734(var5);
            this.method8734(var6);
        }

    }

    public void method8773(int[] var1, int var2, int var3) {
        int var5 = this.field5129;
        this.field5129 = var2;
        int var6 = (var3 - var2) / 8;

        for (int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.method9000();
            int var9 = this.method9000();
            int var10 = 0;
            int var11 = -1640531527;

            for (int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3]) {
                var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
                var10 += var11;
            }

            this.field5129 -= 8;
            this.method8734(var8);
            this.method8734(var9);
        }

        this.field5129 = var5;
    }

    public void method8774(int[] var1, int var2, int var3) {
        int var5 = this.field5129;
        this.field5129 = var2;
        int var6 = (var3 - var2) / 8;

        for (int var7 = 0; var7 < var6; ++var7) {
            int var8 = this.method9000();
            int var9 = this.method9000();
            int var10 = -957401312;
            int var11 = -1640531527;

            for (int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3]) {
                var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
                var10 -= var11;
            }

            this.field5129 -= 8;
            this.method8734(var8);
            this.method8734(var9);
        }

        this.field5129 = var5;
    }

    public void method8830(BigInteger var1, BigInteger var2) {
        int var4 = this.field5129;
        this.field5129 = 0;
        byte[] var5 = new byte[var4];
        this.method8896(var5, 0, var4);
        BigInteger var6 = new BigInteger(var5);
        BigInteger var7 = var6.modPow(var1, var2);
        byte[] var8 = var7.toByteArray();
        this.field5129 = 0;
        this.method8732(var8.length);
        this.method8741(var8, 0, var8.length);
    }

    public int method8791(int var1) {
        int var3 = method6596(this.field5127, var1, this.field5129);
        this.method8734(var3);
        return var3;
    }

    public boolean method8777() {
        this.field5129 -= 4;
        int var2 = method6596(this.field5127, 0, this.field5129);
        int var3 = this.method9000();
        return var3 == var2;
    }

    public void method8850(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 + 128);
    }

    public void method8906(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (-var1);
    }

    public void method8780(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (128 - var1);
    }

    public int method8781() {
        return this.field5127[++this.field5129 - 1] - 128 & 255;
    }

    public int method8782() {
        return -this.field5127[++this.field5129 - 1] & 255;
    }

    public int method8751() {
        return 128 - this.field5127[++this.field5129 - 1] & 255;
    }

    public byte method8784() {
        return (byte) (this.field5127[++this.field5129 - 1] - 128);
    }

    public byte method8785() {
        return (byte) (-this.field5127[++this.field5129 - 1]);
    }

    public byte method8786() {
        return (byte) (128 - this.field5127[++this.field5129 - 1]);
    }

    public void method8805(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) var1;
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
    }

    public void method8788(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) (var1 + 128);
    }

    public void method8934(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 + 128);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
    }

    public int method8749() {
        this.field5129 += 2;
        return (this.field5127[this.field5129 - 2] & 255) + ((this.field5127[this.field5129 - 1] & 255) << 8);
    }

    public int method8778() {
        this.field5129 += 2;
        return (this.field5127[this.field5129 - 1] - 128 & 255) + ((this.field5127[this.field5129 - 2] & 255) << 8);
    }

    public int method8792() {
        this.field5129 += 2;
        return ((this.field5127[this.field5129 - 1] & 255) << 8) + (this.field5127[this.field5129 - 2] - 128 & 255);
    }

    public int method8793() {
        this.field5129 += 2;
        int var2 = ((this.field5127[this.field5129 - 1] & 255) << 8) + (this.field5127[this.field5129 - 2] & 255);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public int method8810() {
        this.field5129 += 2;
        int var2 = ((this.field5127[this.field5129 - 2] & 255) << 8) + (this.field5127[this.field5129 - 1] - 128 & 255);
        if (var2 > 32767) {
            var2 -= 65536;
        }

        return var2;
    }

    public void method8940(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) var1;
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 16);
    }

    public int method8796() {
        this.field5129 += 3;
        return (this.field5127[this.field5129 - 3] & 255) + ((this.field5127[this.field5129 - 2] & 255) << 8) + ((this.field5127[this.field5129 - 1] & 255) << 16);
    }

    public int method8952() {
        this.field5129 += 3;
        return (this.field5127[this.field5129 - 2] & 255) + ((this.field5127[this.field5129 - 1] & 255) << 8) + ((this.field5127[this.field5129 - 3] & 255) << 16);
    }

    public int method8798() {
        this.field5129 += 3;
        int var2 = (this.field5127[this.field5129 - 1] & 255) + ((this.field5127[this.field5129 - 3] & 255) << 8) + ((this.field5127[this.field5129 - 2] & 255) << 16);
        if (var2 > 8388607) {
            var2 -= 16777216;
        }

        return var2;
    }

    public void method8799(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) var1;
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 16);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 24);
    }

    public void method8800(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
        this.field5127[++this.field5129 - 1] = (byte) var1;
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 24);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 16);
    }

    public void method8801(int var1) {
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 16);
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 24);
        this.field5127[++this.field5129 - 1] = (byte) var1;
        this.field5127[++this.field5129 - 1] = (byte) (var1 >> 8);
    }

    public int method8998() {
        this.field5129 += 4;
        return ((this.field5127[this.field5129 - 1] & 255) << 24) + ((this.field5127[this.field5129 - 2] & 255) << 16) + ((this.field5127[this.field5129 - 3] & 255) << 8) + (this.field5127[this.field5129 - 4] & 255);
    }

    public int method8862() {
        this.field5129 += 4;
        return (this.field5127[this.field5129 - 3] & 255) + ((this.field5127[this.field5129 - 4] & 255) << 8) + ((this.field5127[this.field5129 - 1] & 255) << 16) + ((this.field5127[this.field5129 - 2] & 255) << 24);
    }

    public int method8804() {
        this.field5129 += 4;
        return ((this.field5127[this.field5129 - 3] & 255) << 24) + ((this.field5127[this.field5129 - 4] & 255) << 16) + ((this.field5127[this.field5129 - 1] & 255) << 8) + (this.field5127[this.field5129 - 2] & 255);
    }

    public void method8997(byte[] var1, int var2, int var3) {
        for (int var5 = var2 + var3 - 1; var5 >= var2; --var5) {
            var1[var5] = this.field5127[++this.field5129 - 1];
        }

    }

    public void method8806(byte[] var1, int var2, int var3) {
        for (int var5 = var2 + var3 - 1; var5 >= var2; --var5) {
            var1[var5] = (byte) (this.field5127[++this.field5129 - 1] - 128);
        }

    }
}
