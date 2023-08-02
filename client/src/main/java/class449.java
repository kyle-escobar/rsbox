import java.io.EOFException;
import java.io.IOException;

public final class class449 {
    static byte[] field4718 = new byte[520];
    class513 field4713 = null;
    class513 field4714 = null;
    int field4715;
    int field4716 = 65000;

    public class449(int var1, class513 var2, class513 var3, int var4) {
        this.field4715 = var1;
        this.field4713 = var2;
        this.field4714 = var3;
        this.field4716 = var4;
    }

    public byte[] method7860(int var1) {
        synchronized (this.field4713) {
            Object var10000;
            try {
                if (this.field4714.method8663() < (long) (6 + var1 * 6L)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }

                this.field4714.method8669(var1 * 6L);
                this.field4714.method8664(field4718, 0, 6);
                int var4 = (field4718[2] & 255) + ((field4718[0] & 255) << 16) + ((field4718[1] & 255) << 8);
                int var5 = (field4718[5] & 255) + ((field4718[4] & 255) << 8) + ((field4718[3] & 255) << 16);
                if (var4 < 0 || var4 > this.field4716) {
                    var10000 = null;
                    return (byte[]) var10000;
                }

                if (var5 > 0 && (long) var5 <= this.field4713.method8663() / 520L) {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;

                    while (var7 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }

                        this.field4713.method8669((long) var5 * 520L);
                        int var9 = var4 - var7;
                        int var10;
                        int var11;
                        int var12;
                        int var13;
                        byte var14;
                        if (var1 > 65535) {
                            if (var9 > 510) {
                                var9 = 510;
                            }

                            var14 = 10;
                            this.field4713.method8664(field4718, 0, var9 + var14);
                            var10 = ((field4718[2] & 255) << 8) + ((field4718[0] & 255) << 24) + ((field4718[1] & 255) << 16) + (field4718[3] & 255);
                            var11 = ((field4718[4] & 255) << 8) + (field4718[5] & 255);
                            var12 = ((field4718[7] & 255) << 8) + ((field4718[6] & 255) << 16) + (field4718[8] & 255);
                            var13 = field4718[9] & 255;
                        } else {
                            if (var9 > 512) {
                                var9 = 512;
                            }

                            var14 = 8;
                            this.field4713.method8664(field4718, 0, var14 + var9);
                            var10 = ((field4718[0] & 255) << 8) + (field4718[1] & 255);
                            var11 = ((field4718[2] & 255) << 8) + (field4718[3] & 255);
                            var12 = ((field4718[5] & 255) << 8) + ((field4718[4] & 255) << 16) + (field4718[6] & 255);
                            var13 = field4718[7] & 255;
                        }

                        if (var10 == var1 && var11 == var8 && var13 == this.field4715) {
                            if (var12 >= 0 && (long) var12 <= this.field4713.method8663() / 520L) {
                                int var15 = var9 + var14;

                                for (int var16 = var14; var16 < var15; ++var16) {
                                    var6[var7++] = field4718[var16];
                                }

                                var5 = var12;
                                ++var8;
                                continue;
                            }

                            var10000 = null;
                            return (byte[]) var10000;
                        }

                        var10000 = null;
                        return (byte[]) var10000;
                    }

                    byte[] var20 = var6;
                    return var20;
                }

                var10000 = null;
            } catch (IOException var18) {
                return null;
            }

            return (byte[]) var10000;
        }
    }

    public boolean method7868(int var1, byte[] var2, int var3) {
        synchronized (this.field4713) {
            if (var3 >= 0 && var3 <= this.field4716) {
                boolean var6 = this.method7862(var1, var2, var3, true);
                if (!var6) {
                    var6 = this.method7862(var1, var2, var3, false);
                }

                return var6;
            } else {
                throw new IllegalArgumentException("" + this.field4715 + ',' + var1 + ',' + var3);
            }
        }
    }

    boolean method7862(int var1, byte[] var2, int var3, boolean var4) {
        synchronized (this.field4713) {
            try {
                int var7;
                boolean var10000;
                if (var4) {
                    if (this.field4714.method8663() < (long) (6 + var1 * 6L)) {
                        var10000 = false;
                        return var10000;
                    }

                    this.field4714.method8669(var1 * 6L);
                    this.field4714.method8664(field4718, 0, 6);
                    var7 = ((field4718[3] & 255) << 16) + ((field4718[4] & 255) << 8) + (field4718[5] & 255);
                    if (var7 <= 0 || (long) var7 > this.field4713.method8663() / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field4713.method8663() + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }

                field4718[0] = (byte) (var3 >> 16);
                field4718[1] = (byte) (var3 >> 8);
                field4718[2] = (byte) var3;
                field4718[3] = (byte) (var7 >> 16);
                field4718[4] = (byte) (var7 >> 8);
                field4718[5] = (byte) var7;
                this.field4714.method8669(var1 * 6L);
                this.field4714.method8683(field4718, 0, 6);
                int var8 = 0;
                int var9 = 0;

                while (true) {
                    if (var8 < var3) {
                        label154:
                        {
                            int var10 = 0;
                            int var11;
                            if (var4) {
                                this.field4713.method8669((long) var7 * 520L);
                                int var12;
                                int var13;
                                if (var1 > 65535) {
                                    try {
                                        this.field4713.method8664(field4718, 0, 10);
                                    } catch (EOFException var17) {
                                        break label154;
                                    }

                                    var11 = ((field4718[2] & 255) << 8) + ((field4718[0] & 255) << 24) + ((field4718[1] & 255) << 16) + (field4718[3] & 255);
                                    var12 = ((field4718[4] & 255) << 8) + (field4718[5] & 255);
                                    var10 = ((field4718[7] & 255) << 8) + ((field4718[6] & 255) << 16) + (field4718[8] & 255);
                                    var13 = field4718[9] & 255;
                                } else {
                                    try {
                                        this.field4713.method8664(field4718, 0, 8);
                                    } catch (EOFException var16) {
                                        break label154;
                                    }

                                    var11 = (field4718[1] & 255) + ((field4718[0] & 255) << 8);
                                    var12 = ((field4718[2] & 255) << 8) + (field4718[3] & 255);
                                    var10 = ((field4718[4] & 255) << 16) + ((field4718[5] & 255) << 8) + (field4718[6] & 255);
                                    var13 = field4718[7] & 255;
                                }

                                if (var1 != var11 || var9 != var12 || this.field4715 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }

                                if (var10 < 0 || (long) var10 > this.field4713.method8663() / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }

                            if (var10 == 0) {
                                var4 = false;
                                var10 = (int) ((this.field4713.method8663() + 519L) / 520L);
                                if (var10 == 0) {
                                    ++var10;
                                }

                                if (var7 == var10) {
                                    ++var10;
                                }
                            }

                            if (var1 > 65535) {
                                if (var3 - var8 <= 510) {
                                    var10 = 0;
                                }

                                field4718[0] = (byte) (var1 >> 24);
                                field4718[1] = (byte) (var1 >> 16);
                                field4718[2] = (byte) (var1 >> 8);
                                field4718[3] = (byte) var1;
                                field4718[4] = (byte) (var9 >> 8);
                                field4718[5] = (byte) var9;
                                field4718[6] = (byte) (var10 >> 16);
                                field4718[7] = (byte) (var10 >> 8);
                                field4718[8] = (byte) var10;
                                field4718[9] = (byte) this.field4715;
                                this.field4713.method8669((long) var7 * 520L);
                                this.field4713.method8683(field4718, 0, 10);
                                var11 = var3 - var8;
                                if (var11 > 510) {
                                    var11 = 510;
                                }

                                this.field4713.method8683(var2, var8, var11);
                                var8 += var11;
                            } else {
                                if (var3 - var8 <= 512) {
                                    var10 = 0;
                                }

                                field4718[0] = (byte) (var1 >> 8);
                                field4718[1] = (byte) var1;
                                field4718[2] = (byte) (var9 >> 8);
                                field4718[3] = (byte) var9;
                                field4718[4] = (byte) (var10 >> 16);
                                field4718[5] = (byte) (var10 >> 8);
                                field4718[6] = (byte) var10;
                                field4718[7] = (byte) this.field4715;
                                this.field4713.method8669((long) var7 * 520L);
                                this.field4713.method8683(field4718, 0, 8);
                                var11 = var3 - var8;
                                if (var11 > 512) {
                                    var11 = 512;
                                }

                                this.field4713.method8683(var2, var8, var11);
                                var8 += var11;
                            }

                            var7 = var10;
                            ++var9;
                            continue;
                        }
                    }

                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var18) {
                return false;
            }
        }
    }

    public String toString() {
        return "" + this.field4715;
    }
}
