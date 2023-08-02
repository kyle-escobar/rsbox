import java.io.IOException;
import java.util.zip.CRC32;

public class class355 {
    public int field3925 = 0;
    public int field3945 = 0;
    boolean field3934;
    byte field3944 = 0;
    class362 field3935;
    class363[] field3933 = new class363[256];
    class366 field3929 = new class366();
    class424 field3936;
    class481 field3927 = new class481(32);
    class481 field3930 = new class481(4096);
    class481 field3932 = new class481(4096);
    class481 field3942 = new class481(4096);
    class519 field3922;
    class519 field3926 = new class519(8);
    class519 field3941;
    int field3923 = 0;
    int field3924 = 0;
    int field3928 = 0;
    int field3931 = 0;
    int field3937 = 0;
    int field3938 = 0;
    int field3940 = 255;
    int field3943 = -1;
    CRC32 field3939 = new CRC32();
    long field3946;

    public boolean method6545() {
        long var2 = class302.method2194();
        int var4 = (int) (var2 - this.field3946);
        this.field3946 = var2;
        if (var4 > 200) {
            var4 = 200;
        }

        this.field3923 += var4;
        if (0 == this.field3924 && 0 == this.field3928 && 0 == this.field3931 && this.field3937 == 0) {
            return true;
        } else if (null == this.field3936) {
            return false;
        } else {
            try {
                if (this.field3923 > 30000) {
                    throw new IOException();
                } else {
                    class362 var5;
                    class519 var6;
                    while (this.field3928 < 200 && this.field3937 > 0) {
                        var5 = (class362) this.field3942.method8186();
                        var6 = new class519(4);
                        var6.method8731(1);
                        var6.method8733((int) var5.field4816);
                        this.field3936.method7588(var6.field5127, 0, 4);
                        this.field3927.method8193(var5, var5.field4816);
                        --this.field3937;
                        ++this.field3928;
                    }

                    while (this.field3924 < 200 && this.field3931 > 0) {
                        var5 = (class362) this.field3929.method6641();
                        var6 = new class519(4);
                        var6.method8731(0);
                        var6.method8733((int) var5.field4816);
                        this.field3936.method7588(var6.field5127, 0, 4);
                        var5.method8161();
                        this.field3932.method8193(var5, var5.field4816);
                        --this.field3931;
                        ++this.field3924;
                    }

                    for (int var20 = 0; var20 < 100; ++var20) {
                        int var21 = this.field3936.method7585();
                        if (var21 < 0) {
                            throw new IOException();
                        }

                        if (var21 == 0) {
                            break;
                        }

                        this.field3923 = 0;
                        byte var7 = 0;
                        if (this.field3935 == null) {
                            var7 = 8;
                        } else if (0 == this.field3938) {
                            var7 = 1;
                        }

                        int var8;
                        int var9;
                        int var10;
                        byte[] var10000;
                        int var10001;
                        class519 var23;
                        if (var7 > 0) {
                            var8 = var7 - this.field3926.field5129;
                            if (var8 > var21) {
                                var8 = var21;
                            }

                            this.field3936.method7603(this.field3926.field5127, this.field3926.field5129, var8);
                            if (this.field3944 != 0) {
                                for (var9 = 0; var9 < var8; ++var9) {
                                    var10000 = this.field3926.field5127;
                                    var10001 = this.field3926.field5129 + var9;
                                    var10000[var10001] ^= this.field3944;
                                }
                            }

                            var23 = this.field3926;
                            var23.field5129 += var8;
                            if (this.field3926.field5129 < var7) {
                                break;
                            }

                            if (null == this.field3935) {
                                this.field3926.field5129 = 0;
                                var9 = this.field3926.method8748();
                                var10 = this.field3926.method8750();
                                int var11 = this.field3926.method8748();
                                int var12 = this.field3926.method9000();
                                long var13 = var10 + ((long) var9 << 16);
                                class362 var15 = (class362) this.field3927.method8184(var13);
                                this.field3934 = true;
                                if (var15 == null) {
                                    var15 = (class362) this.field3932.method8184(var13);
                                    this.field3934 = false;
                                }

                                if (var15 == null) {
                                    throw new IOException();
                                }

                                int var16 = var11 == 0 ? 5 : 9;
                                this.field3935 = var15;
                                this.field3941 = new class519(this.field3935.field3998 + var16 + var12);
                                this.field3941.method8731(var11);
                                this.field3941.method8734(var12);
                                this.field3938 = 8;
                                this.field3926.field5129 = 0;
                            } else if (0 == this.field3938) {
                                if (-1 == this.field3926.field5127[0]) {
                                    this.field3938 = 1;
                                    this.field3926.field5129 = 0;
                                } else {
                                    this.field3935 = null;
                                }
                            }
                        } else {
                            var8 = this.field3941.field5127.length - this.field3935.field3998;
                            var9 = 512 - this.field3938;
                            if (var9 > var8 - this.field3941.field5129) {
                                var9 = var8 - this.field3941.field5129;
                            }

                            if (var9 > var21) {
                                var9 = var21;
                            }

                            this.field3936.method7603(this.field3941.field5127, this.field3941.field5129, var9);
                            if (this.field3944 != 0) {
                                for (var10 = 0; var10 < var9; ++var10) {
                                    var10000 = this.field3941.field5127;
                                    var10001 = var10 + this.field3941.field5129;
                                    var10000[var10001] ^= this.field3944;
                                }
                            }

                            var23 = this.field3941;
                            var23.field5129 += var9;
                            this.field3938 += var9;
                            if (this.field3941.field5129 == var8) {
                                if (this.field3935.field4816 == 16711935L) {
                                    this.field3922 = this.field3941;

                                    for (var10 = 0; var10 < 256; ++var10) {
                                        class363 var22 = this.field3933[var10];
                                        if (null != var22) {
                                            this.method6549(var22, var10);
                                        }
                                    }
                                } else {
                                    this.field3939.reset();
                                    this.field3939.update(this.field3941.field5127, 0, var8);
                                    var10 = (int) this.field3939.getValue();
                                    if (this.field3935.field3999 != var10) {
                                        try {
                                            this.field3936.method7589();
                                        } catch (Exception var18) {
                                        }

                                        ++this.field3945;
                                        this.field3936 = null;
                                        this.field3944 = (byte) ((int) (Math.random() * 255.0 + 1.0));
                                        return false;
                                    }

                                    this.field3945 = 0;
                                    this.field3925 = 0;
                                    this.field3935.field4000.method6613((int) (this.field3935.field4816 & 65535L), this.field3941.field5127, (this.field3935.field4816 & 16711680L) == 16711680L, this.field3934);
                                }

                                this.field3935.method8116();
                                if (this.field3934) {
                                    --this.field3928;
                                } else {
                                    --this.field3924;
                                }

                                this.field3938 = 0;
                                this.field3935 = null;
                                this.field3941 = null;
                            } else {
                                if (512 != this.field3938) {
                                    break;
                                }

                                this.field3938 = 0;
                            }
                        }
                    }

                    return true;
                }
            } catch (IOException var19) {
                try {
                    this.field3936.method7589();
                } catch (Exception var17) {
                }

                ++this.field3925;
                this.field3936 = null;
                return false;
            }
        }
    }

    public void method6532(boolean var1) {
        if (this.field3936 != null) {
            try {
                class519 var3 = new class519(4);
                var3.method8731(var1 ? 2 : 3);
                var3.method8733(0);
                this.field3936.method7588(var3.field5127, 0, 4);
            } catch (IOException var6) {
                try {
                    this.field3936.method7589();
                } catch (Exception var5) {
                }

                ++this.field3925;
                this.field3936 = null;
            }

        }
    }

    public void method6533(class424 var1, boolean var2) {
        if (this.field3936 != null) {
            try {
                this.field3936.method7589();
            } catch (Exception var8) {
            }

            this.field3936 = null;
        }

        this.field3936 = var1;
        this.method6532(var2);
        this.field3926.field5129 = 0;
        this.field3935 = null;
        this.field3941 = null;
        this.field3938 = 0;

        while (true) {
            class362 var4 = (class362) this.field3927.method8186();
            if (null == var4) {
                while (true) {
                    var4 = (class362) this.field3932.method8186();
                    if (var4 == null) {
                        if (this.field3944 != 0) {
                            try {
                                class519 var9 = new class519(4);
                                var9.method8731(4);
                                var9.method8731(this.field3944);
                                var9.method8732(0);
                                this.field3936.method7588(var9.field5127, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field3936.method7589();
                                } catch (Exception var6) {
                                }

                                ++this.field3925;
                                this.field3936 = null;
                            }
                        }

                        this.field3923 = 0;
                        this.field3946 = class302.method2194();
                        return;
                    }

                    this.field3929.method6643(var4);
                    this.field3930.method8193(var4, var4.field4816);
                    ++this.field3931;
                    --this.field3924;
                }
            }

            this.field3942.method8193(var4, var4.field4816);
            ++this.field3937;
            --this.field3928;
        }
    }

    void method6561(class363 var1, int var2) {
        if (var1.field4017) {
            if (var2 <= this.field3943) {
                throw new RuntimeException("");
            }

            if (var2 < this.field3940) {
                this.field3940 = var2;
            }
        } else {
            if (var2 >= this.field3940) {
                throw new RuntimeException("");
            }

            if (var2 > this.field3943) {
                this.field3943 = var2;
            }
        }

        if (this.field3922 != null) {
            this.method6549(var1, var2);
        } else {
            this.method6536(null, 255, 255, 0, (byte) 0, true);
            this.field3933[var2] = var1;
        }
    }

    void method6549(class363 var1, int var2) {
        this.field3922.field5129 = var2 * 8 + 5;
        if (this.field3922.field5129 >= this.field3922.field5127.length) {
            if (var1.field4017) {
                var1.method6599();
            } else {
                throw new RuntimeException("");
            }
        } else {
            int var4 = this.field3922.method9000();
            int var5 = this.field3922.method9000();
            var1.method6600(var4, var5);
        }
    }

    void method6536(class363 var1, int var2, int var3, int var4, byte var5, boolean var6) {
        long var8 = var3 + ((long) var2 << 16);
        class362 var10 = (class362) this.field3942.method8184(var8);
        if (var10 == null) {
            var10 = (class362) this.field3927.method8184(var8);
            if (null == var10) {
                var10 = (class362) this.field3930.method8184(var8);
                if (var10 != null) {
                    if (var6) {
                        var10.method8161();
                        this.field3942.method8193(var10, var8);
                        --this.field3931;
                        ++this.field3937;
                    }

                } else {
                    if (!var6) {
                        var10 = (class362) this.field3932.method8184(var8);
                        if (var10 != null) {
                            return;
                        }
                    }

                    var10 = new class362();
                    var10.field4000 = var1;
                    var10.field3999 = var4;
                    var10.field3998 = var5;
                    if (var6) {
                        this.field3942.method8193(var10, var8);
                        ++this.field3937;
                    } else {
                        this.field3929.method6642(var10);
                        this.field3930.method8193(var10, var8);
                        ++this.field3931;
                    }

                }
            }
        }
    }

    void method6537(int var1, int var2) {
        long var4 = ((long) var1 << 16) + var2;
        class362 var6 = (class362) this.field3930.method8184(var4);
        if (null != var6) {
            this.field3929.method6643(var6);
        }
    }

    int method6538(int var1, int var2) {
        long var4 = ((long) var1 << 16) + var2;
        return this.field3935 != null && this.field3935.field4816 == var4 ? 1 + this.field3941.field5129 * 99 / (this.field3941.field5127.length - this.field3935.field3998) : 0;
    }

    public int method6539(boolean var1, boolean var2) {
        int var4 = 0;
        if (var1) {
            var4 += this.field3937 + this.field3928;
        }

        if (var2) {
            var4 += this.field3931 + this.field3924;
        }

        return var4;
    }

    public void method6540() {
        if (this.field3936 != null) {
            this.field3936.method7589();
        }

    }
}
