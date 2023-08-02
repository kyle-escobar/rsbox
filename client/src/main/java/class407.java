import java.util.Random;

public abstract class class407 extends class535 {
    public static class537[] field4521;
    static int field4517 = 256;
    static int field4529 = -1;
    static int field4530 = -1;
    static int field4531 = -1;
    static int field4532 = -1;
    static int field4533 = 0;
    static int field4534 = 0;
    static int field4536 = 0;
    static int field4537 = 0;
    static String[] field4539 = new String[100];
    static Random field4535 = new Random();
    public int field4522;
    public int field4525;
    public int field4527 = 0;
    byte[] field4528;
    byte[][] field4518 = new byte[256][];
    int[] field4520;
    int[] field4523;
    int[] field4524;
    int[] field4526;
    int[] field4538;

    class407(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        this.field4526 = var2;
        this.field4523 = var3;
        this.field4520 = var4;
        this.field4524 = var5;
        this.method7154(var1);
        this.field4518 = var7;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;

        for (int var10 = 0; var10 < 256; ++var10) {
            if (this.field4523[var10] < var8 && this.field4524[var10] != 0) {
                var8 = this.field4523[var10];
            }

            if (this.field4523[var10] + this.field4524[var10] > var9) {
                var9 = this.field4523[var10] + this.field4524[var10];
            }
        }

        this.field4525 = this.field4527 - var8;
        this.field4522 = var9 - this.field4527;
    }

    class407(byte[] var1) {
        this.method7154(var1);
    }

    static int method7155(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
        int var7 = var2[var5];
        int var8 = var7 + var4[var5];
        int var9 = var2[var6];
        int var10 = var9 + var4[var6];
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }

        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }

        int var13 = var3[var5];
        if (var3[var6] < var13) {
            var13 = var3[var6];
        }

        byte[] var14 = var1[var5];
        byte[] var15 = var0[var6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;

        for (int var18 = var11; var18 < var12; ++var18) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }

        return -var13;
    }

    public static String method7161(String var0) {
        int var1 = var0.length();
        int var2 = 0;

        int var4;
        for (int var3 = 0; var3 < var1; ++var3) {
            var4 = var0.charAt(var3);
            if (var4 == 60 || var4 == 62) {
                var2 += 3;
            }
        }

        StringBuilder var6 = new StringBuilder(var1 + var2);

        for (var4 = 0; var4 < var1; ++var4) {
            char var5 = var0.charAt(var4);
            if (var5 == '<') {
                var6.append("<lt>");
            } else if (var5 == '>') {
                var6.append("<gt>");
            } else {
                var6.append(var5);
            }
        }

        return var6.toString();
    }

    static void method7184(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
        int var6 = var1 + var2 * class535.field5202;
        int var7 = class535.field5202 - var3;
        int var8 = 0;
        int var9 = 0;
        int var10;
        if (var2 < class535.field5206) {
            var10 = class535.field5206 - var2;
            var4 -= var10;
            var2 = class535.field5206;
            var9 += var10 * var3;
            var6 += var10 * class535.field5202;
        }

        if (var2 + var4 > class535.field5207) {
            var4 -= var2 + var4 - class535.field5207;
        }

        if (var1 < class535.field5208) {
            var10 = class535.field5208 - var1;
            var3 -= var10;
            var1 = class535.field5208;
            var9 += var10;
            var6 += var10;
            var8 += var10;
            var7 += var10;
        }

        if (var1 + var3 > class535.field5209) {
            var10 = var1 + var3 - class535.field5209;
            var3 -= var10;
            var8 += var10;
            var7 += var10;
        }

        if (var3 > 0 && var4 > 0) {
            method7249(class535.field5201, var0, var5, var9, var6, var3, var4, var7, var8);
        }
    }

    static void method7249(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        int var9 = -(var5 >> 2);
        var5 = -(var5 & 3);

        for (int var10 = -var6; var10 < 0; ++var10) {
            int var11;
            for (var11 = var9; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }

                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            for (var11 = var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    var0[var4++] = var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    static void method7186(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var1 + var2 * class535.field5202;
        int var8 = class535.field5202 - var3;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var2 < class535.field5206) {
            var11 = class535.field5206 - var2;
            var4 -= var11;
            var2 = class535.field5206;
            var10 += var11 * var3;
            var7 += var11 * class535.field5202;
        }

        if (var2 + var4 > class535.field5207) {
            var4 -= var2 + var4 - class535.field5207;
        }

        if (var1 < class535.field5208) {
            var11 = class535.field5208 - var1;
            var3 -= var11;
            var1 = class535.field5208;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var1 + var3 > class535.field5209) {
            var11 = var1 + var3 - class535.field5209;
            var3 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var3 > 0 && var4 > 0) {
            method7187(class535.field5201, var0, var5, var10, var7, var3, var4, var8, var9, var6);
        }
    }

    static void method7187(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
        var9 = 256 - var9;

        for (int var10 = -var6; var10 < 0; ++var10) {
            for (int var11 = -var5; var11 < 0; ++var11) {
                if (var1[var3++] != 0) {
                    int var12 = var0[var4];
                    var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
                } else {
                    ++var4;
                }
            }

            var4 += var7;
            var3 += var8;
        }

    }

    abstract void method7182(byte[] var1, int var2, int var3, int var4, int var5, int var6);

    abstract void method7183(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

    void method7154(byte[] var1) {
        this.field4538 = new int[256];
        int var2;
        if (var1.length == 257) {
            for (var2 = 0; var2 < this.field4538.length; ++var2) {
                this.field4538[var2] = var1[var2] & 255;
            }

            this.field4527 = var1[256] & 255;
        } else {
            var2 = 0;

            for (int var3 = 0; var3 < 256; ++var3) {
                this.field4538[var3] = var1[var2++] & 255;
            }

            int[] var10 = new int[256];
            int[] var4 = new int[256];

            int var5;
            for (var5 = 0; var5 < 256; ++var5) {
                var10[var5] = var1[var2++] & 255;
            }

            for (var5 = 0; var5 < 256; ++var5) {
                var4[var5] = var1[var2++] & 255;
            }

            byte[][] var11 = new byte[256][];

            int var7;
            int var8;
            for (int var6 = 0; var6 < 256; ++var6) {
                var11[var6] = new byte[var10[var6]];
                var7 = 0;

                for (var8 = 0; var8 < var11[var6].length; ++var8) {
                    var7 += var1[var2++];
                    var11[var6][var8] = (byte) var7;
                }
            }

            byte[][] var12 = new byte[256][];

            for (var7 = 0; var7 < 256; ++var7) {
                var12[var7] = new byte[var10[var7]];
                byte var13 = 0;

                for (int var9 = 0; var9 < var12[var7].length; ++var9) {
                    var13 += var1[var2++];
                    var12[var7][var9] = var13;
                }
            }

            this.field4528 = new byte[65536];

            for (var7 = 0; var7 < 256; ++var7) {
                if (var7 != 32 && var7 != 160) {
                    for (var8 = 0; var8 < 256; ++var8) {
                        if (var8 != 32 && var8 != 160) {
                            this.field4528[(var7 << 8) + var8] = (byte) method7155(var11, var12, var4, this.field4538, var10, var7, var8);
                        }
                    }
                }
            }

            this.field4527 = var4[32] + var10[32];
        }

    }

    public int method7241(char var1) {
        if (var1 == 160) {
            var1 = ' ';
        }

        return this.field4538[class318.method5854(var1) & 255];
    }

    public int method7225(String var1) {
        if (var1 == null) {
            return 0;
        } else {
            int var2 = -1;
            int var3 = -1;
            int var4 = 0;

            for (int var5 = 0; var5 < var1.length(); ++var5) {
                char var6 = var1.charAt(var5);
                if (var6 == '<') {
                    var2 = var5;
                } else {
                    if (var6 == '>' && var2 != -1) {
                        String var7 = var1.substring(var2 + 1, var5);
                        var2 = -1;
                        if (var7.equals("lt")) {
                            var6 = '<';
                        } else {
                            if (!var7.equals("gt")) {
                                if (var7.startsWith("img=")) {
                                    try {
                                        int var8 = class380.method5731(var7.substring(4));
                                        var4 += field4521[var8].field5221;
                                        var3 = -1;
                                    } catch (Exception var9) {
                                    }
                                }
                                continue;
                            }

                            var6 = '>';
                        }
                    }

                    if (var6 == 160) {
                        var6 = ' ';
                    }

                    if (var2 == -1) {
                        var4 += this.field4538[(char) (class318.method5854(var6) & 255)];
                        if (this.field4528 != null && var3 != -1) {
                            var4 += this.field4528[(var3 << 8) + var6];
                        }

                        var3 = var6;
                    }
                }
            }

            return var4;
        }
    }

    public int method7214(String var1, int[] var2, String[] var3) {
        if (var1 == null) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            StringBuilder var6 = new StringBuilder(100);
            int var7 = -1;
            int var8 = 0;
            byte var9 = 0;
            int var10 = -1;
            char var11 = 0;
            int var12 = 0;
            int var13 = var1.length();

            for (int var14 = 0; var14 < var13; ++var14) {
                char var15 = var1.charAt(var14);
                if (var15 == '<') {
                    var10 = var14;
                } else {
                    if (var15 == '>' && var10 != -1) {
                        String var16 = var1.substring(var10 + 1, var14);
                        var10 = -1;
                        var6.append('<');
                        var6.append(var16);
                        var6.append('>');
                        if (var16.equals("br")) {
                            var3[var12] = var6.substring(var5, var6.length());
                            ++var12;
                            var5 = var6.length();
                            var4 = 0;
                            var7 = -1;
                            var11 = 0;
                        } else if (var16.equals("lt")) {
                            var4 += this.method7241('<');
                            if (this.field4528 != null && var11 != -1) {
                                var4 += this.field4528[(var11 << 8) + 60];
                            }

                            var11 = '<';
                        } else if (var16.equals("gt")) {
                            var4 += this.method7241('>');
                            if (this.field4528 != null && var11 != -1) {
                                var4 += this.field4528[(var11 << 8) + 62];
                            }

                            var11 = '>';
                        } else if (var16.startsWith("img=")) {
                            try {
                                int var17 = class380.method5731(var16.substring(4));
                                var4 += field4521[var17].field5221;
                                var11 = 0;
                            } catch (Exception var18) {
                            }
                        }

                        var15 = 0;
                    }

                    if (var10 == -1) {
                        if (var15 != 0) {
                            var6.append(var15);
                            var4 += this.method7241(var15);
                            if (this.field4528 != null && var11 != -1) {
                                var4 += this.field4528[(var11 << 8) + var15];
                            }

                            var11 = var15;
                        }

                        if (var15 == ' ') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 1;
                        }

                        if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                            var3[var12] = var6.substring(var5, var7 - var9);
                            ++var12;
                            var5 = var7;
                            var7 = -1;
                            var4 -= var8;
                            var11 = 0;
                        }

                        if (var15 == '-') {
                            var7 = var6.length();
                            var8 = var4;
                            var9 = 0;
                        }
                    }
                }
            }

            String var19 = var6.toString();
            if (var19.length() > var5) {
                var3[var12++] = var19.substring(var5);
            }

            return var12;
        }
    }

    public int method7263(String var1, int var2) {
        int var3 = this.method7214(var1, new int[]{var2}, field4539);
        int var4 = 0;

        for (int var5 = 0; var5 < var3; ++var5) {
            int var6 = this.method7225(field4539[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }

        return var4;
    }

    public int method7160(String var1, int var2) {
        return this.method7214(var1, new int[]{var2}, field4539);
    }

    public class453 method7162(int var1, int var2, String var3, int var4, int var5) {
        if (var3 != null && var3.length() >= var1 + var2) {
            int var6 = var4 - this.method7225(var3) / 2;
            var6 += this.method7225(var3.substring(0, var1));
            int var7 = var5 - this.field4525;
            int var8 = this.method7225(var3.substring(var1, var1 + var2));
            int var9 = this.field4525 + this.field4522;
            return new class453(var6, var7, var8, var9);
        } else {
            return new class453(var4, var5, 0, 0);
        }
    }

    public void method7163(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method7177(var4, var5);
            this.method7254(var1, var2, var3);
        }
    }

    public void method7164(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method7177(var4, var5);
            field4517 = var6;
            this.method7254(var1, var2, var3);
        }
    }

    public void method7165(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method7177(var4, var5);
            this.method7254(var1, var2 - this.method7225(var1), var3);
        }
    }

    public void method7166(String var1, int var2, int var3, int var4, int var5) {
        if (var1 != null) {
            this.method7177(var4, var5);
            this.method7254(var1, var2 - this.method7225(var1) / 2, var3);
        }
    }

    public int method7238(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
        return this.method7168(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
    }

    public int method7168(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        if (var1 == null) {
            return 0;
        } else {
            if (var8 == 255) {
                var8 = 256;
            }

            this.method7177(var6, var7);
            field4517 = var8;
            if (var11 == 0) {
                var11 = this.field4527;
            }

            int[] var12 = new int[]{var4};
            if (var5 < this.field4525 + this.field4522 + var11 && var5 < var11 + var11) {
                var12 = null;
            }

            int var13 = this.method7214(var1, var12, field4539);
            if (var10 == 3 && var13 == 1) {
                var10 = 1;
            }

            int var14;
            int var15;
            if (var10 == 0) {
                var14 = var3 + this.field4525;
            } else if (var10 == 1) {
                var14 = var3 + this.field4525 + (var5 - this.field4525 - this.field4522 - (var13 - 1) * var11) / 2;
            } else if (var10 == 2) {
                var14 = var3 + var5 - this.field4522 - (var13 - 1) * var11;
            } else {
                var15 = (var5 - this.field4525 - this.field4522 - (var13 - 1) * var11) / (var13 + 1);
                if (var15 < 0) {
                    var15 = 0;
                }

                var14 = var3 + this.field4525 + var15;
                var11 += var15;
            }

            for (var15 = 0; var15 < var13; ++var15) {
                if (var9 == 0) {
                    this.method7254(field4539[var15], var2, var14);
                } else if (var9 == 1) {
                    this.method7254(field4539[var15], var2 + (var4 - this.method7225(field4539[var15])) / 2, var14);
                } else if (var9 == 2) {
                    this.method7254(field4539[var15], var2 + var4 - this.method7225(field4539[var15]), var14);
                } else if (var15 == var13 - 1) {
                    this.method7254(field4539[var15], var2, var14);
                } else {
                    this.method7179(field4539[var15], var4);
                    this.method7254(field4539[var15], var2, var14);
                    field4536 = 0;
                }

                var14 += var11;
            }

            return var13;
        }
    }

    public class474 method7198(class405 var1, int var2, int var3, int var4, int var5, int var6) {
        if (!var1.method7103()) {
            this.method7177(var4, var5);
            var3 -= this.field4527;

            for (int var7 = 0; var7 < var1.method7104(); ++var7) {
                class416 var8 = var1.method7108(var7);
                if (var6 != -1 && var8.field4574 > var6) {
                    return new class474(var8.field4572, var8.field4574);
                }

                char var9 = var8.field4573;
                if (var9 != '\n') {
                    if (var1.method7123(var7)) {
                        var9 = '*';
                    }

                    if (var9 != '\t') {
                        if (var9 == 160) {
                            var9 = ' ';
                        }

                        int var10 = var2 + var8.field4572;
                        int var11 = var3 + var8.field4574;
                        int var12 = this.field4520[var9];
                        int var13 = this.field4524[var9];
                        if (field4532 != -1) {
                            this.method7182(this.field4518[var9], var10 + this.field4526[var9] + 1, var11 + this.field4523[var9] + 1, var12, var13, field4532);
                        }

                        this.method7182(this.field4518[var9], var10 + this.field4526[var9], var11 + this.field4523[var9], var12, var13, field4534);
                    }
                }
            }
        }

        return var1.method7107();
    }

    public void method7170(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
        if (var1 != null) {
            this.method7177(var4, var5);
            int[] var8 = null;
            if (var7 != null) {
                var8 = this.method7175(var7, var1.length());
            }

            int[] var9 = new int[var1.length()];

            for (int var10 = 0; var10 < var1.length(); ++var10) {
                var9[var10] = (int) (Math.sin((double) var10 / 2.0 + (double) var6 / 5.0) * 5.0);
            }

            this.method7181(var1, var2 - this.method7225(var1) / 2, var3, var8, null, var9);
        }
    }

    public void method7171(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
        if (var1 != null) {
            this.method7177(var4, var5);
            int[] var8 = null;
            if (var7 != null) {
                var8 = this.method7175(var7, var1.length());
            }

            int[] var9 = new int[var1.length()];
            int[] var10 = new int[var1.length()];

            for (int var11 = 0; var11 < var1.length(); ++var11) {
                var9[var11] = (int) (Math.sin((double) var11 / 5.0 + (double) var6 / 5.0) * 5.0);
                var10[var11] = (int) (Math.sin((double) var11 / 3.0 + (double) var6 / 5.0) * 5.0);
            }

            this.method7181(var1, var2 - this.method7225(var1) / 2, var3, var8, var9, var10);
        }
    }

    public void method7172(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
        if (var1 != null) {
            this.method7177(var4, var5);
            int[] var9 = null;
            if (var8 != null) {
                var9 = this.method7175(var8, var1.length());
            }

            double var10 = 7.0 - (double) var7 / 8.0;
            if (var10 < 0.0) {
                var10 = 0.0;
            }

            int[] var12 = new int[var1.length()];

            for (int var13 = 0; var13 < var1.length(); ++var13) {
                var12[var13] = (int) (Math.sin((double) var13 / 1.5 + (double) var6) * var10);
            }

            this.method7181(var1, var2 - this.method7225(var1) / 2, var3, var9, null, var12);
        }
    }

    public void method7210(String var1, int var2, int var3, int var4, int var5, int[] var6) {
        if (var1 != null) {
            this.method7177(var4, var5);
            int[] var7 = null;
            if (var6 != null) {
                var7 = this.method7175(var6, var1.length());
            }

            this.method7181(var1, var2 - this.method7225(var1) / 2, var3, var7, null, null);
        }
    }

    public void method7203(String var1, int var2, int var3, int var4, int var5, int[] var6) {
        if (var1 != null) {
            this.method7177(var4, var5);
            int[] var7 = null;
            if (var6 != null) {
                var7 = this.method7175(var6, var1.length());
            }

            this.method7181(var1, var2, var3, var7, null, null);
        }
    }

    int[] method7175(int[] var1, int var2) {
        if (var2 == 0) {
            return null;
        } else {
            int[] var3 = new int[var2];
            float var4 = (float) var1.length / (float) var2;

            for (int var5 = 0; var5 < var2; ++var5) {
                var3[var5] = var1[(int) ((float) var5 * var4)];
            }

            return var3;
        }
    }

    public void method7176(String var1, int var2, int var3, int var4, int var5, int var6) {
        if (var1 != null) {
            this.method7177(var4, var5);
            field4535.setSeed(var6);
            field4517 = 192 + (field4535.nextInt() & 31);
            int[] var7 = new int[var1.length()];
            int var8 = 0;

            for (int var9 = 0; var9 < var1.length(); ++var9) {
                var7[var9] = var8;
                if ((field4535.nextInt() & 3) == 0) {
                    ++var8;
                }
            }

            this.method7181(var1, var2, var3, null, var7, null);
        }
    }

    void method7177(int var1, int var2) {
        field4529 = -1;
        field4530 = -1;
        field4531 = var2;
        field4532 = var2;
        field4533 = var1;
        field4534 = var1;
        field4517 = 256;
        field4536 = 0;
        field4537 = 0;
    }

    void method7205(String var1) {
        try {
            int var2;
            String var3;
            if (var1.startsWith("col=")) {
                var3 = var1.substring(4);
                var2 = class380.method3276(var3, 16, true);
                field4534 = var2;
            } else if (var1.equals("/col")) {
                field4534 = field4533;
            } else if (var1.startsWith("str=")) {
                var3 = var1.substring(4);
                var2 = class380.method3276(var3, 16, true);
                field4529 = var2;
            } else if (var1.equals("str")) {
                field4529 = 8388608;
            } else if (var1.equals("/str")) {
                field4529 = -1;
            } else if (var1.startsWith("u=")) {
                var3 = var1.substring(2);
                var2 = class380.method3276(var3, 16, true);
                field4530 = var2;
            } else if (var1.equals("u")) {
                field4530 = 0;
            } else if (var1.equals("/u")) {
                field4530 = -1;
            } else if (var1.startsWith("shad=")) {
                var3 = var1.substring(5);
                var2 = class380.method3276(var3, 16, true);
                field4532 = var2;
            } else if (var1.equals("shad")) {
                field4532 = 0;
            } else if (var1.equals("/shad")) {
                field4532 = field4531;
            } else if (var1.equals("br")) {
                this.method7177(field4533, field4531);
            }
        } catch (Exception var4) {
        }

    }

    void method7179(String var1, int var2) {
        int var3 = 0;
        boolean var4 = false;

        for (int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
                var4 = true;
            } else if (var6 == '>') {
                var4 = false;
            } else if (!var4 && var6 == ' ') {
                ++var3;
            }
        }

        if (var3 > 0) {
            field4536 = (var2 - this.method7225(var1) << 8) / var3;
        }

    }

    void method7254(String var1, int var2, int var3) {
        var3 -= this.field4527;
        int var4 = -1;
        int var5 = -1;

        for (int var6 = 0; var6 < var1.length(); ++var6) {
            if (var1.charAt(var6) != 0) {
                char var7 = (char) (class318.method5854(var1.charAt(var6)) & 255);
                if (var7 == '<') {
                    var4 = var6;
                } else {
                    int var9;
                    if (var7 == '>' && var4 != -1) {
                        String var8 = var1.substring(var4 + 1, var6);
                        var4 = -1;
                        if (var8.equals("lt")) {
                            var7 = '<';
                        } else {
                            if (!var8.equals("gt")) {
                                if (var8.startsWith("img=")) {
                                    try {
                                        var9 = class380.method5731(var8.substring(4));
                                        class537 var13 = field4521[var9];
                                        var13.method9316(var2, var3 + this.field4527 - var13.field5218);
                                        var2 += var13.field5221;
                                        var5 = -1;
                                    } catch (Exception var11) {
                                    }
                                } else {
                                    this.method7205(var8);
                                }
                                continue;
                            }

                            var7 = '>';
                        }
                    }

                    if (var7 == 160) {
                        var7 = ' ';
                    }

                    if (var4 == -1) {
                        if (this.field4528 != null && var5 != -1) {
                            var2 += this.field4528[(var5 << 8) + var7];
                        }

                        int var12 = this.field4520[var7];
                        var9 = this.field4524[var7];
                        if (var7 != ' ') {
                            if (field4517 == 256) {
                                if (field4532 != -1) {
                                    method7184(this.field4518[var7], var2 + this.field4526[var7] + 1, var3 + this.field4523[var7] + 1, var12, var9, field4532);
                                }

                                this.method7182(this.field4518[var7], var2 + this.field4526[var7], var3 + this.field4523[var7], var12, var9, field4534);
                            } else {
                                if (field4532 != -1) {
                                    method7186(this.field4518[var7], var2 + this.field4526[var7] + 1, var3 + this.field4523[var7] + 1, var12, var9, field4532, field4517);
                                }

                                this.method7183(this.field4518[var7], var2 + this.field4526[var7], var3 + this.field4523[var7], var12, var9, field4534, field4517);
                            }
                        } else if (field4536 > 0) {
                            field4537 += field4536;
                            var2 += field4537 >> 8;
                            field4537 &= 255;
                        }

                        int var10 = this.field4538[var7];
                        if (field4529 != -1) {
                            method9237(var2, var3 + (int) ((double) this.field4527 * 0.7), var10, field4529);
                        }

                        if (field4530 != -1) {
                            method9237(var2, var3 + this.field4527 + 1, var10, field4530);
                        }

                        var2 += var10;
                        var5 = var7;
                    }
                }
            }
        }

    }

    void method7181(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
        var3 -= this.field4527;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;

        for (int var10 = 0; var10 < var1.length(); ++var10) {
            if (var1.charAt(var10) != 0) {
                char var11 = (char) (class318.method5854(var1.charAt(var10)) & 255);
                if (var11 == '<') {
                    var7 = var10;
                } else {
                    int var13;
                    int var14;
                    int var15;
                    if (var11 == '>' && var7 != -1) {
                        String var12 = var1.substring(var7 + 1, var10);
                        var7 = -1;
                        if (var12.equals("lt")) {
                            var11 = '<';
                        } else {
                            if (!var12.equals("gt")) {
                                if (var12.startsWith("img=")) {
                                    try {
                                        if (var5 != null) {
                                            var13 = var5[var9];
                                        } else {
                                            var13 = 0;
                                        }

                                        if (var6 != null) {
                                            var14 = var6[var9];
                                        } else {
                                            var14 = 0;
                                        }

                                        ++var9;
                                        var15 = class380.method5731(var12.substring(4));
                                        class537 var20 = field4521[var15];
                                        var20.method9316(var2 + var13, var3 + this.field4527 - var20.field5218 + var14);
                                        var2 += var20.field5221;
                                        var8 = -1;
                                    } catch (Exception var18) {
                                    }
                                } else {
                                    this.method7205(var12);
                                }
                                continue;
                            }

                            var11 = '>';
                        }
                    }

                    if (var11 == 160) {
                        var11 = ' ';
                    }

                    if (var7 == -1) {
                        if (this.field4528 != null && var8 != -1) {
                            var2 += this.field4528[(var8 << 8) + var11];
                        }

                        int var19 = this.field4520[var11];
                        var13 = this.field4524[var11];
                        if (var5 != null) {
                            var14 = var5[var9];
                        } else {
                            var14 = 0;
                        }

                        if (var6 != null) {
                            var15 = var6[var9];
                        } else {
                            var15 = 0;
                        }

                        int var16;
                        if (var4 != null) {
                            var16 = var4[var9];
                        } else {
                            var16 = field4534;
                        }

                        ++var9;
                        if (var11 != ' ') {
                            if (field4517 == 256) {
                                if (field4532 != -1) {
                                    method7184(this.field4518[var11], var2 + this.field4526[var11] + 1 + var14, var3 + this.field4523[var11] + 1 + var15, var19, var13, field4532);
                                }

                                this.method7182(this.field4518[var11], var2 + this.field4526[var11] + var14, var3 + this.field4523[var11] + var15, var19, var13, var16);
                            } else {
                                if (field4532 != -1) {
                                    method7186(this.field4518[var11], var2 + this.field4526[var11] + 1 + var14, var3 + this.field4523[var11] + 1 + var15, var19, var13, field4532, field4517);
                                }

                                this.method7183(this.field4518[var11], var2 + this.field4526[var11] + var14, var3 + this.field4523[var11] + var15, var19, var13, var16, field4517);
                            }
                        } else if (field4536 > 0) {
                            field4537 += field4536;
                            var2 += field4537 >> 8;
                            field4537 &= 255;
                        }

                        int var17 = this.field4538[var11];
                        if (field4529 != -1) {
                            method9237(var2, var3 + (int) ((double) this.field4527 * 0.7), var17, field4529);
                        }

                        if (field4530 != -1) {
                            method9237(var2, var3 + this.field4527, var17, field4530);
                        }

                        var2 += var17;
                        var8 = var11;
                    }
                }
            }
        }

    }
}
