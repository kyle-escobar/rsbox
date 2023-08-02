public class class46 extends class51 {
    boolean field323;
    int field316;
    int field317;
    int field318;
    int field319;
    int field320;
    int field321;
    int field322;
    int field324;
    int field325;
    int field326;
    int field327;
    int field328;
    int field329;
    int field330;

    class46(class35 var1, int var2, int var3) {
        super.field371 = var1;
        this.field316 = var1.field177;
        this.field319 = var1.field179;
        this.field323 = var1.field175;
        this.field325 = var2;
        this.field326 = var3;
        this.field324 = 8192;
        this.field321 = 0;
        this.method850();
    }

    class46(class35 var1, int var2, int var3, int var4) {
        super.field371 = var1;
        this.field316 = var1.field177;
        this.field319 = var1.field179;
        this.field323 = var1.field175;
        this.field325 = var2;
        this.field326 = var3;
        this.field324 = var4;
        this.field321 = 0;
        this.method850();
    }

    static int method1004(int var0, int var1) {
        return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4) + 0.5);
    }

    static int method868(int var0, int var1) {
        return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4) + 0.5);
    }

    public static class46 method848(class35 var0, int var1, int var2) {
        return var0.field178 != null && var0.field178.length != 0 ? new class46(var0, (int) ((long) var0.field176 * 256L * (long) var1 / (long) (class37.field198 * 100L)), var2 << 6) : null;
    }

    public static class46 method849(class35 var0, int var1, int var2, int var3) {
        return var0.field178 != null && var0.field178.length != 0 ? new class46(var0, var1, var2, var3) : null;
    }

    static int method892(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class46 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var7 - var2) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
            var10001 = var3++;
        }

        var8.field321 = var2 << 8;
        return var3;
    }

    static int method866(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class46 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var9 - var3) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field321 = var3 << 8;
        return var4 >> 1;
    }

    static int method1010(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class46 var8) {
        var2 >>= 8;
        var7 >>= 8;
        var4 <<= 2;
        if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
            var5 = var6;
        }

        int var10001;
        for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var10001 = var3++;
        }

        for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
            var10001 = var3++;
        }

        var8.field321 = var2 << 8;
        return var3;
    }

    static int method942(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class46 var10) {
        var3 >>= 8;
        var9 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
            var7 = var8;
        }

        var4 <<= 1;
        var7 <<= 1;

        int var10001;
        byte var11;
        for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
            var2[var10001] += var11 * var6;
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
            var11 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var11 * var5;
            var10001 = var4++;
        }

        var10.field321 = var3 << 8;
        return var4 >> 1;
    }

    static int method935(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class46 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
            var7 = var8;
        }

        byte var13;
        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            var13 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
            var7 = var8;
        }

        while (var5 < var7) {
            var13 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var12 - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        var10.field321 = var4;
        return var5;
    }

    static int method922(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class46 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        byte var14;
        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var14 = var2[var4 >> 8];
            var0 = (var14 << 8) + (var13 - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field321 = var4;
        return var5 >> 1;
    }

    static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class46 var10, int var11, int var12) {
        if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        int var10001;
        while (var5 < var7) {
            var1 = var4 >> 8;
            byte var13 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
            var7 = var8;
        }

        while (var5 < var7) {
            var10001 = var5++;
            var3[var10001] += ((var12 << 8) + (var2[var4 >> 8] - var12) * (var4 & 255)) * var6 >> 6;
            var4 += var11;
        }

        var10.field321 = var4;
        return var5;
    }

    static int method873(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class46 var11, int var12, int var13) {
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        var5 <<= 1;

        int var10001;
        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        for (var8 <<= 1; var5 < var8; var4 += var12) {
            var0 = (var13 << 8) + (var2[var4 >> 8] - var13) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
        }

        var11.field321 = var4;
        return var5 >> 1;
    }

    static int method883(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class46 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var8 - var2) > var7) {
            var6 = var7;
        }

        var9.field318 += var9.field329 * (var6 - var3);
        var9.field322 += var9.field330 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2++] * var4;
        }

        var9.field320 = var4 >> 2;
        var9.field321 = var2 << 8;
        return var3;
    }

    static int method884(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class46 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var11 - var3) > var10) {
            var9 = var10;
        }

        var12.field320 += var12.field328 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3++];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field318 = var5 >> 2;
        var12.field322 = var6 >> 2;
        var12.field321 = var3 << 8;
        return var4 >> 1;
    }

    static int method885(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class46 var9) {
        var2 >>= 8;
        var8 >>= 8;
        var4 <<= 2;
        var5 <<= 2;
        if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
            var6 = var7;
        }

        var9.field318 += var9.field329 * (var6 - var3);
        var9.field322 += var9.field330 * (var6 - var3);

        int var10001;
        for (var6 -= 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
            var4 += var5;
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        for (var6 += 3; var3 < var6; var4 += var5) {
            var10001 = var3++;
            var1[var10001] += var0[var2--] * var4;
        }

        var9.field320 = var4 >> 2;
        var9.field321 = var2 << 8;
        return var3;
    }

    static int method886(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class46 var12) {
        var3 >>= 8;
        var11 >>= 8;
        var5 <<= 2;
        var6 <<= 2;
        var7 <<= 2;
        var8 <<= 2;
        if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
            var9 = var10;
        }

        var12.field320 += var12.field328 * (var9 - var4);
        var4 <<= 1;
        var9 <<= 1;

        byte var13;
        int var10001;
        for (var9 -= 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
            var6 += var8;
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        for (var9 += 6; var4 < var9; var6 += var8) {
            var13 = var1[var3--];
            var10001 = var4++;
            var2[var10001] += var13 * var5;
            var5 += var7;
            var10001 = var4++;
            var2[var10001] += var13 * var6;
        }

        var12.field318 = var5 >> 2;
        var12.field322 = var6 >> 2;
        var12.field321 = var3 << 8;
        return var4 >> 1;
    }

    static int method1003(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class46 var11, int var12, int var13) {
        var11.field318 -= var11.field329 * var5;
        var11.field322 -= var11.field330 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
            var8 = var9;
        }

        byte var14;
        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            var14 = var2[var1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
            var8 = var9;
        }

        while (var5 < var8) {
            var14 = var2[var4 >> 8];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var13 - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        var11.field318 += var11.field329 * var5;
        var11.field322 += var11.field330 * var5;
        var11.field320 = var6;
        var11.field321 = var4;
        return var5;
    }

    static int method907(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class46 var13, int var14, int var15) {
        var13.field320 -= var13.field328 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        byte var16;
        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            var16 = var2[var1];
            var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
            var10 = var11;
        }

        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var16 = var2[var4 >> 8];
            var0 = (var16 << 8) + (var15 - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field320 += var13.field328 * var5;
        var13.field318 = var6;
        var13.field322 = var7;
        var13.field321 = var4;
        return var5;
    }

    static int method982(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class46 var11, int var12, int var13) {
        var11.field318 -= var11.field329 * var5;
        var11.field322 -= var11.field330 * var5;
        if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        int var10001;
        while (var5 < var8) {
            var1 = var4 >> 8;
            byte var14 = var2[var1 - 1];
            var10001 = var5++;
            var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
            var8 = var9;
        }

        while (var5 < var8) {
            var10001 = var5++;
            var3[var10001] += ((var13 << 8) + (var2[var4 >> 8] - var13) * (var4 & 255)) * var6 >> 6;
            var6 += var7;
            var4 += var12;
        }

        var11.field318 += var11.field329 * var5;
        var11.field322 += var11.field330 * var5;
        var11.field320 = var6;
        var11.field321 = var4;
        return var5;
    }

    static int method890(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class46 var13, int var14, int var15) {
        var13.field320 -= var13.field328 * var5;
        if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        var5 <<= 1;

        int var10001;
        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var1 = var4 >> 8;
            byte var16 = var2[var1 - 1];
            var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
            var10 = var11;
        }

        for (var10 <<= 1; var5 < var10; var4 += var14) {
            var0 = (var15 << 8) + (var2[var4 >> 8] - var15) * (var4 & 255);
            var10001 = var5++;
            var3[var10001] += var0 * var6 >> 6;
            var6 += var8;
            var10001 = var5++;
            var3[var10001] += var0 * var7 >> 6;
            var7 += var9;
        }

        var5 >>= 1;
        var13.field320 += var13.field328 * var5;
        var13.field318 = var6;
        var13.field322 = var7;
        var13.field321 = var4;
        return var5;
    }

    int method1039() {
        int var1 = this.field320 * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (this.field317 == 0) {
            var1 -= var1 * this.field321 / (((class35) super.field371).field178.length << 8);
        } else if (this.field317 >= 0) {
            var1 -= var1 * this.field316 / ((class35) super.field371).field178.length;
        }

        return var1 > 255 ? 255 : var1;
    }

    void method850() {
        this.field320 = this.field326;
        this.field318 = method1004(this.field326, this.field324);
        this.field322 = method868(this.field326, this.field324);
    }

    public synchronized void method851(int var1) {
        this.field317 = var1;
    }

    public synchronized void method1006(int var1) {
        this.method949(var1 << 6, this.method880());
    }

    synchronized void method853(int var1) {
        this.method949(var1, this.method880());
    }

    synchronized void method949(int var1, int var2) {
        this.field326 = var1;
        this.field324 = var2;
        this.field327 = 0;
        this.method850();
    }

    public synchronized int method969() {
        return this.field326 == Integer.MIN_VALUE ? 0 : this.field326;
    }

    public synchronized int method880() {
        return this.field324 < 0 ? -1 : this.field324;
    }

    public synchronized void method950(int var1) {
        int var2 = ((class35) super.field371).field178.length << 8;
        if (var1 < -1) {
            var1 = -1;
        }

        if (var1 > var2) {
            var1 = var2;
        }

        this.field321 = var1;
    }

    public synchronized void method974(boolean var1) {
        this.field325 = (this.field325 ^ this.field325 >> 31) + (this.field325 >>> 31);
        if (var1) {
            this.field325 = -this.field325;
        }

    }

    void method859() {
        if (this.field327 != 0) {
            if (this.field326 == Integer.MIN_VALUE) {
                this.field326 = 0;
            }

            this.field327 = 0;
            this.method850();
        }

    }

    public synchronized void method860(int var1, int var2) {
        this.method861(var1, var2, this.method880());
    }

    public synchronized void method861(int var1, int var2, int var3) {
        if (var1 == 0) {
            this.method949(var2, var3);
        } else {
            int var4 = method1004(var2, var3);
            int var5 = method868(var2, var3);
            if (this.field318 == var4 && this.field322 == var5) {
                this.field327 = 0;
            } else {
                int var6 = var2 - this.field320;
                if (this.field320 - var2 > var6) {
                    var6 = this.field320 - var2;
                }

                if (var4 - this.field318 > var6) {
                    var6 = var4 - this.field318;
                }

                if (this.field318 - var4 > var6) {
                    var6 = this.field318 - var4;
                }

                if (var5 - this.field322 > var6) {
                    var6 = var5 - this.field322;
                }

                if (this.field322 - var5 > var6) {
                    var6 = this.field322 - var5;
                }

                if (var1 > var6) {
                    var1 = var6;
                }

                this.field327 = var1;
                this.field326 = var2;
                this.field324 = var3;
                this.field328 = (var2 - this.field320) / var1;
                this.field329 = (var4 - this.field318) / var1;
                this.field330 = (var5 - this.field322) / var1;
            }
        }
    }

    public synchronized void method862(int var1) {
        if (var1 == 0) {
            this.method853(0);
            this.method8116();
        } else if (this.field318 == 0 && this.field322 == 0) {
            this.field327 = 0;
            this.field326 = 0;
            this.field320 = 0;
            this.method8116();
        } else {
            int var2 = -this.field320;
            if (this.field320 > var2) {
                var2 = this.field320;
            }

            if (-this.field318 > var2) {
                var2 = -this.field318;
            }

            if (this.field318 > var2) {
                var2 = this.field318;
            }

            if (-this.field322 > var2) {
                var2 = -this.field322;
            }

            if (this.field322 > var2) {
                var2 = this.field322;
            }

            if (var1 > var2) {
                var1 = var2;
            }

            this.field327 = var1;
            this.field326 = Integer.MIN_VALUE;
            this.field328 = -this.field320 / var1;
            this.field329 = -this.field318 / var1;
            this.field330 = -this.field322 / var1;
        }
    }

    public synchronized void method863(int var1) {
        if (this.field325 < 0) {
            this.field325 = -var1;
        } else {
            this.field325 = var1;
        }

    }

    public synchronized int method864() {
        return this.field325 < 0 ? -this.field325 : this.field325;
    }

    public boolean method865() {
        return this.field321 < 0 || this.field321 >= ((class35) super.field371).field178.length << 8;
    }

    public boolean method993() {
        return this.field327 != 0;
    }

    protected class51 method1040() {
        return null;
    }

    protected class51 method1043() {
        return null;
    }

    protected int method1042() {
        return this.field326 == 0 && this.field327 == 0 ? 0 : 1;
    }

    public synchronized void method1044(int[] var1, int var2, int var3) {
        if (this.field326 == 0 && this.field327 == 0) {
            this.method1045(var3);
        } else {
            class35 var4 = (class35) super.field371;
            int var5 = this.field316 << 8;
            int var6 = this.field319 << 8;
            int var7 = var4.field178.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field317 = 0;
            }

            int var9 = var2;
            var3 += var2;
            if (this.field321 < 0) {
                if (this.field325 <= 0) {
                    this.method859();
                    this.method8116();
                    return;
                }

                this.field321 = 0;
            }

            if (this.field321 >= var7) {
                if (this.field325 >= 0) {
                    this.method859();
                    this.method8116();
                    return;
                }

                this.field321 = var7 - 1;
            }

            if (this.field317 < 0) {
                if (this.field323) {
                    if (this.field325 < 0) {
                        var9 = this.method958(var1, var2, var5, var3, var4.field178[this.field316]);
                        if (this.field321 >= var5) {
                            return;
                        }

                        this.field321 = var5 + var5 - 1 - this.field321;
                        this.field325 = -this.field325;
                    }

                    while (true) {
                        var9 = this.method872(var1, var9, var6, var3, var4.field178[this.field319 - 1]);
                        if (this.field321 < var6) {
                            return;
                        }

                        this.field321 = var6 + var6 - 1 - this.field321;
                        this.field325 = -this.field325;
                        var9 = this.method958(var1, var9, var5, var3, var4.field178[this.field316]);
                        if (this.field321 >= var5) {
                            return;
                        }

                        this.field321 = var5 + var5 - 1 - this.field321;
                        this.field325 = -this.field325;
                    }
                } else if (this.field325 < 0) {
                    while (true) {
                        var9 = this.method958(var1, var9, var5, var3, var4.field178[this.field319 - 1]);
                        if (this.field321 >= var5) {
                            return;
                        }

                        this.field321 = var6 - 1 - (var6 - 1 - this.field321) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method872(var1, var9, var6, var3, var4.field178[this.field316]);
                        if (this.field321 < var6) {
                            return;
                        }

                        this.field321 = var5 + (this.field321 - var5) % var8;
                    }
                }
            } else {
                if (this.field317 > 0) {
                    if (this.field323) {
                        label131:
                        {
                            if (this.field325 < 0) {
                                var9 = this.method958(var1, var2, var5, var3, var4.field178[this.field316]);
                                if (this.field321 >= var5) {
                                    return;
                                }

                                this.field321 = var5 + var5 - 1 - this.field321;
                                this.field325 = -this.field325;
                                if (--this.field317 == 0) {
                                    break label131;
                                }
                            }

                            do {
                                var9 = this.method872(var1, var9, var6, var3, var4.field178[this.field319 - 1]);
                                if (this.field321 < var6) {
                                    return;
                                }

                                this.field321 = var6 + var6 - 1 - this.field321;
                                this.field325 = -this.field325;
                                if (--this.field317 == 0) {
                                    break;
                                }

                                var9 = this.method958(var1, var9, var5, var3, var4.field178[this.field316]);
                                if (this.field321 >= var5) {
                                    return;
                                }

                                this.field321 = var5 + var5 - 1 - this.field321;
                                this.field325 = -this.field325;
                            } while (--this.field317 != 0);
                        }
                    } else {
                        int var10;
                        if (this.field325 < 0) {
                            while (true) {
                                var9 = this.method958(var1, var9, var5, var3, var4.field178[this.field319 - 1]);
                                if (this.field321 >= var5) {
                                    return;
                                }

                                var10 = (var6 - 1 - this.field321) / var8;
                                if (var10 >= this.field317) {
                                    this.field321 += var8 * this.field317;
                                    this.field317 = 0;
                                    break;
                                }

                                this.field321 += var8 * var10;
                                this.field317 -= var10;
                            }
                        } else {
                            while (true) {
                                var9 = this.method872(var1, var9, var6, var3, var4.field178[this.field316]);
                                if (this.field321 < var6) {
                                    return;
                                }

                                var10 = (this.field321 - var5) / var8;
                                if (var10 >= this.field317) {
                                    this.field321 -= var8 * this.field317;
                                    this.field317 = 0;
                                    break;
                                }

                                this.field321 -= var8 * var10;
                                this.field317 -= var10;
                            }
                        }
                    }
                }

                if (this.field325 < 0) {
                    this.method958(var1, var9, 0, var3, 0);
                    if (this.field321 < 0) {
                        this.field321 = -1;
                        this.method859();
                        this.method8116();
                    }
                } else {
                    this.method872(var1, var9, var7, var3, 0);
                    if (this.field321 >= var7) {
                        this.field321 = var7;
                        this.method859();
                        this.method8116();
                    }
                }

            }
        }
    }

    public synchronized void method1045(int var1) {
        if (this.field327 > 0) {
            if (var1 >= this.field327) {
                if (this.field326 == Integer.MIN_VALUE) {
                    this.field326 = 0;
                    this.field322 = 0;
                    this.field318 = 0;
                    this.field320 = 0;
                    this.method8116();
                    var1 = this.field327;
                }

                this.field327 = 0;
                this.method850();
            } else {
                this.field320 += this.field328 * var1;
                this.field318 += this.field329 * var1;
                this.field322 += this.field330 * var1;
                this.field327 -= var1;
            }
        }

        class35 var2 = (class35) super.field371;
        int var3 = this.field316 << 8;
        int var4 = this.field319 << 8;
        int var5 = var2.field178.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field317 = 0;
        }

        if (this.field321 < 0) {
            if (this.field325 <= 0) {
                this.method859();
                this.method8116();
                return;
            }

            this.field321 = 0;
        }

        if (this.field321 >= var5) {
            if (this.field325 >= 0) {
                this.method859();
                this.method8116();
                return;
            }

            this.field321 = var5 - 1;
        }

        this.field321 += this.field325 * var1;
        if (this.field317 < 0) {
            if (!this.field323) {
                if (this.field325 < 0) {
                    if (this.field321 >= var3) {
                        return;
                    }

                    this.field321 = var4 - 1 - (var4 - 1 - this.field321) % var6;
                } else {
                    if (this.field321 < var4) {
                        return;
                    }

                    this.field321 = var3 + (this.field321 - var3) % var6;
                }

            } else {
                if (this.field325 < 0) {
                    if (this.field321 >= var3) {
                        return;
                    }

                    this.field321 = var3 + var3 - 1 - this.field321;
                    this.field325 = -this.field325;
                }

                while (this.field321 >= var4) {
                    this.field321 = var4 + var4 - 1 - this.field321;
                    this.field325 = -this.field325;
                    if (this.field321 >= var3) {
                        return;
                    }

                    this.field321 = var3 + var3 - 1 - this.field321;
                    this.field325 = -this.field325;
                }

            }
        } else {
            if (this.field317 > 0) {
                if (this.field323) {
                    label122:
                    {
                        if (this.field325 < 0) {
                            if (this.field321 >= var3) {
                                return;
                            }

                            this.field321 = var3 + var3 - 1 - this.field321;
                            this.field325 = -this.field325;
                            if (--this.field317 == 0) {
                                break label122;
                            }
                        }

                        do {
                            if (this.field321 < var4) {
                                return;
                            }

                            this.field321 = var4 + var4 - 1 - this.field321;
                            this.field325 = -this.field325;
                            if (--this.field317 == 0) {
                                break;
                            }

                            if (this.field321 >= var3) {
                                return;
                            }

                            this.field321 = var3 + var3 - 1 - this.field321;
                            this.field325 = -this.field325;
                        } while (--this.field317 != 0);
                    }
                } else {
                    label154:
                    {
                        int var7;
                        if (this.field325 < 0) {
                            if (this.field321 >= var3) {
                                return;
                            }

                            var7 = (var4 - 1 - this.field321) / var6;
                            if (var7 >= this.field317) {
                                this.field321 += var6 * this.field317;
                                this.field317 = 0;
                                break label154;
                            }

                            this.field321 += var6 * var7;
                            this.field317 -= var7;
                        } else {
                            if (this.field321 < var4) {
                                return;
                            }

                            var7 = (this.field321 - var3) / var6;
                            if (var7 >= this.field317) {
                                this.field321 -= var6 * this.field317;
                                this.field317 = 0;
                                break label154;
                            }

                            this.field321 -= var6 * var7;
                            this.field317 -= var7;
                        }

                        return;
                    }
                }
            }

            if (this.field325 < 0) {
                if (this.field321 < 0) {
                    this.field321 = -1;
                    this.method859();
                    this.method8116();
                }
            } else if (this.field321 >= var5) {
                this.field321 = var5;
                this.method859();
                this.method8116();
            }

        }
    }

    int method872(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field327 > 0) {
                int var6 = var2 + this.field327;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.field327 += var2;
                if (this.field325 == 256 && (this.field321 & 255) == 0) {
                    if (class373.field4355) {
                        var2 = method884(0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, this.field329, this.field330, 0, var6, var3, this);
                    } else {
                        var2 = method883(((class35) super.field371).field178, var1, this.field321, var2, this.field320, this.field328, 0, var6, var3, this);
                    }
                } else if (class373.field4355) {
                    var2 = method907(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, this.field329, this.field330, 0, var6, var3, this, this.field325, var5);
                } else {
                    var2 = method1003(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field320, this.field328, 0, var6, var3, this, this.field325, var5);
                }

                this.field327 -= var2;
                if (this.field327 != 0) {
                    return var2;
                }

                if (!this.method874()) {
                    continue;
                }

                return var4;
            }

            if (this.field325 == 256 && (this.field321 & 255) == 0) {
                if (class373.field4355) {
                    return method866(0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, 0, var4, var3, this);
                }

                return method892(((class35) super.field371).field178, var1, this.field321, var2, this.field320, 0, var4, var3, this);
            }

            if (class373.field4355) {
                return method922(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, 0, var4, var3, this, this.field325, var5);
            }

            return method935(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field320, 0, var4, var3, this, this.field325, var5);
        }
    }

    int method958(int[] var1, int var2, int var3, int var4, int var5) {
        while (true) {
            if (this.field327 > 0) {
                int var6 = var2 + this.field327;
                if (var6 > var4) {
                    var6 = var4;
                }

                this.field327 += var2;
                if (this.field325 == -256 && (this.field321 & 255) == 0) {
                    if (class373.field4355) {
                        var2 = method886(0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, this.field329, this.field330, 0, var6, var3, this);
                    } else {
                        var2 = method885(((class35) super.field371).field178, var1, this.field321, var2, this.field320, this.field328, 0, var6, var3, this);
                    }
                } else if (class373.field4355) {
                    var2 = method890(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, this.field329, this.field330, 0, var6, var3, this, this.field325, var5);
                } else {
                    var2 = method982(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field320, this.field328, 0, var6, var3, this, this.field325, var5);
                }

                this.field327 -= var2;
                if (this.field327 != 0) {
                    return var2;
                }

                if (!this.method874()) {
                    continue;
                }

                return var4;
            }

            if (this.field325 == -256 && (this.field321 & 255) == 0) {
                if (class373.field4355) {
                    return method942(0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, 0, var4, var3, this);
                }

                return method1010(((class35) super.field371).field178, var1, this.field321, var2, this.field320, 0, var4, var3, this);
            }

            if (class373.field4355) {
                return method873(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field318, this.field322, 0, var4, var3, this, this.field325, var5);
            }

            return method928(0, 0, ((class35) super.field371).field178, var1, this.field321, var2, this.field320, 0, var4, var3, this, this.field325, var5);
        }
    }

    boolean method874() {
        int var1 = this.field326;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var3 = 0;
            var2 = 0;
            var1 = 0;
        } else {
            var2 = method1004(var1, this.field324);
            var3 = method868(var1, this.field324);
        }

        if (this.field320 == var1 && this.field318 == var2 && this.field322 == var3) {
            if (this.field326 == Integer.MIN_VALUE) {
                this.field326 = 0;
                this.field322 = 0;
                this.field318 = 0;
                this.field320 = 0;
                this.method8116();
                return true;
            } else {
                this.method850();
                return false;
            }
        } else {
            if (this.field320 < var1) {
                this.field328 = 1;
                this.field327 = var1 - this.field320;
            } else if (this.field320 > var1) {
                this.field328 = -1;
                this.field327 = this.field320 - var1;
            } else {
                this.field328 = 0;
            }

            if (this.field318 < var2) {
                this.field329 = 1;
                if (this.field327 == 0 || this.field327 > var2 - this.field318) {
                    this.field327 = var2 - this.field318;
                }
            } else if (this.field318 > var2) {
                this.field329 = -1;
                if (this.field327 == 0 || this.field327 > this.field318 - var2) {
                    this.field327 = this.field318 - var2;
                }
            } else {
                this.field329 = 0;
            }

            if (this.field322 < var3) {
                this.field330 = 1;
                if (this.field327 == 0 || this.field327 > var3 - this.field322) {
                    this.field327 = var3 - this.field322;
                }
            } else if (this.field322 > var3) {
                this.field330 = -1;
                if (this.field327 == 0 || this.field327 > this.field322 - var3) {
                    this.field327 = this.field322 - var3;
                }
            } else {
                this.field330 = 0;
            }

            return false;
        }
    }
}
