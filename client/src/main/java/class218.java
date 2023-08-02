public class class218 {
    public static String field2396;
    public int[][] field2393;
    int field2383;
    int field2392 = 0;
    int field2394;
    int field2397 = 0;

    public class218(int var1, int var2) {
        this.field2383 = var1;
        this.field2394 = var2;
        this.field2393 = new int[this.field2383][this.field2394];
        this.method4164();
    }

    public void method4164() {
        for (int var2 = 0; var2 < this.field2383; ++var2) {
            for (int var3 = 0; var3 < this.field2394; ++var3) {
                if (var2 != 0 && var3 != 0 && var2 < this.field2383 - 5 && var3 < this.field2394 - 5) {
                    this.field2393[var2][var3] = 16777216;
                } else {
                    this.field2393[var2][var3] = 16777215;
                }
            }
        }

    }

    public void method4170(int var1, int var2, int var3, int var4, boolean var5) {
        var1 -= this.field2397;
        var2 -= this.field2392;
        if (var3 == 0) {
            if (var4 == 0) {
                this.method4169(var1, var2, 128);
                this.method4169(var1 - 1, var2, 8);
            }

            if (var4 == 1) {
                this.method4169(var1, var2, 2);
                this.method4169(var1, var2 + 1, 32);
            }

            if (var4 == 2) {
                this.method4169(var1, var2, 8);
                this.method4169(var1 + 1, var2, 128);
            }

            if (var4 == 3) {
                this.method4169(var1, var2, 32);
                this.method4169(var1, var2 - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
                this.method4169(var1, var2, 1);
                this.method4169(var1 - 1, var2 + 1, 16);
            }

            if (var4 == 1) {
                this.method4169(var1, var2, 4);
                this.method4169(var1 + 1, var2 + 1, 64);
            }

            if (var4 == 2) {
                this.method4169(var1, var2, 16);
                this.method4169(var1 + 1, var2 - 1, 1);
            }

            if (var4 == 3) {
                this.method4169(var1, var2, 64);
                this.method4169(var1 - 1, var2 - 1, 4);
            }
        }

        if (var3 == 2) {
            if (var4 == 0) {
                this.method4169(var1, var2, 130);
                this.method4169(var1 - 1, var2, 8);
                this.method4169(var1, var2 + 1, 32);
            }

            if (var4 == 1) {
                this.method4169(var1, var2, 10);
                this.method4169(var1, var2 + 1, 32);
                this.method4169(var1 + 1, var2, 128);
            }

            if (var4 == 2) {
                this.method4169(var1, var2, 40);
                this.method4169(var1 + 1, var2, 128);
                this.method4169(var1, var2 - 1, 2);
            }

            if (var4 == 3) {
                this.method4169(var1, var2, 160);
                this.method4169(var1, var2 - 1, 2);
                this.method4169(var1 - 1, var2, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (var4 == 0) {
                    this.method4169(var1, var2, 65536);
                    this.method4169(var1 - 1, var2, 4096);
                }

                if (var4 == 1) {
                    this.method4169(var1, var2, 1024);
                    this.method4169(var1, var2 + 1, 16384);
                }

                if (var4 == 2) {
                    this.method4169(var1, var2, 4096);
                    this.method4169(var1 + 1, var2, 65536);
                }

                if (var4 == 3) {
                    this.method4169(var1, var2, 16384);
                    this.method4169(var1, var2 - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (var4 == 0) {
                    this.method4169(var1, var2, 512);
                    this.method4169(var1 - 1, var2 + 1, 8192);
                }

                if (var4 == 1) {
                    this.method4169(var1, var2, 2048);
                    this.method4169(var1 + 1, var2 + 1, 32768);
                }

                if (var4 == 2) {
                    this.method4169(var1, var2, 8192);
                    this.method4169(var1 + 1, var2 - 1, 512);
                }

                if (var4 == 3) {
                    this.method4169(var1, var2, 32768);
                    this.method4169(var1 - 1, var2 - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (var4 == 0) {
                    this.method4169(var1, var2, 66560);
                    this.method4169(var1 - 1, var2, 4096);
                    this.method4169(var1, var2 + 1, 16384);
                }

                if (var4 == 1) {
                    this.method4169(var1, var2, 5120);
                    this.method4169(var1, var2 + 1, 16384);
                    this.method4169(var1 + 1, var2, 65536);
                }

                if (var4 == 2) {
                    this.method4169(var1, var2, 20480);
                    this.method4169(var1 + 1, var2, 65536);
                    this.method4169(var1, var2 - 1, 1024);
                }

                if (var4 == 3) {
                    this.method4169(var1, var2, 81920);
                    this.method4169(var1, var2 - 1, 1024);
                    this.method4169(var1 - 1, var2, 4096);
                }
            }
        }

    }

    public void method4166(int var1, int var2, int var3, int var4, boolean var5) {
        int var7 = 256;
        if (var5) {
            var7 += 131072;
        }

        var1 -= this.field2397;
        var2 -= this.field2392;

        for (int var8 = var1; var8 < var1 + var3; ++var8) {
            if (var8 >= 0 && var8 < this.field2383) {
                for (int var9 = var2; var9 < var4 + var2; ++var9) {
                    if (var9 >= 0 && var9 < this.field2394) {
                        this.method4169(var8, var9, var7);
                    }
                }
            }
        }

    }

    public void method4167(int var1, int var2) {
        var1 -= this.field2397;
        var2 -= this.field2392;
        int[] var10000 = this.field2393[var1];
        var10000[var2] |= 2097152;
    }

    public void method4190(int var1, int var2) {
        var1 -= this.field2397;
        var2 -= this.field2392;
        int[] var10000 = this.field2393[var1];
        var10000[var2] |= 262144;
    }

    void method4169(int var1, int var2, int var3) {
        int[] var10000 = this.field2393[var1];
        var10000[var2] |= var3;
    }

    public void method4181(int var1, int var2, int var3, int var4, boolean var5) {
        var1 -= this.field2397;
        var2 -= this.field2392;
        if (var3 == 0) {
            if (var4 == 0) {
                this.method4172(var1, var2, 128);
                this.method4172(var1 - 1, var2, 8);
            }

            if (var4 == 1) {
                this.method4172(var1, var2, 2);
                this.method4172(var1, var2 + 1, 32);
            }

            if (var4 == 2) {
                this.method4172(var1, var2, 8);
                this.method4172(var1 + 1, var2, 128);
            }

            if (var4 == 3) {
                this.method4172(var1, var2, 32);
                this.method4172(var1, var2 - 1, 2);
            }
        }

        if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
                this.method4172(var1, var2, 1);
                this.method4172(var1 - 1, var2 + 1, 16);
            }

            if (var4 == 1) {
                this.method4172(var1, var2, 4);
                this.method4172(var1 + 1, var2 + 1, 64);
            }

            if (var4 == 2) {
                this.method4172(var1, var2, 16);
                this.method4172(var1 + 1, var2 - 1, 1);
            }

            if (var4 == 3) {
                this.method4172(var1, var2, 64);
                this.method4172(var1 - 1, var2 - 1, 4);
            }
        }

        if (var3 == 2) {
            if (var4 == 0) {
                this.method4172(var1, var2, 130);
                this.method4172(var1 - 1, var2, 8);
                this.method4172(var1, var2 + 1, 32);
            }

            if (var4 == 1) {
                this.method4172(var1, var2, 10);
                this.method4172(var1, var2 + 1, 32);
                this.method4172(var1 + 1, var2, 128);
            }

            if (var4 == 2) {
                this.method4172(var1, var2, 40);
                this.method4172(var1 + 1, var2, 128);
                this.method4172(var1, var2 - 1, 2);
            }

            if (var4 == 3) {
                this.method4172(var1, var2, 160);
                this.method4172(var1, var2 - 1, 2);
                this.method4172(var1 - 1, var2, 8);
            }
        }

        if (var5) {
            if (var3 == 0) {
                if (var4 == 0) {
                    this.method4172(var1, var2, 65536);
                    this.method4172(var1 - 1, var2, 4096);
                }

                if (var4 == 1) {
                    this.method4172(var1, var2, 1024);
                    this.method4172(var1, var2 + 1, 16384);
                }

                if (var4 == 2) {
                    this.method4172(var1, var2, 4096);
                    this.method4172(var1 + 1, var2, 65536);
                }

                if (var4 == 3) {
                    this.method4172(var1, var2, 16384);
                    this.method4172(var1, var2 - 1, 1024);
                }
            }

            if (var3 == 1 || var3 == 3) {
                if (var4 == 0) {
                    this.method4172(var1, var2, 512);
                    this.method4172(var1 - 1, var2 + 1, 8192);
                }

                if (var4 == 1) {
                    this.method4172(var1, var2, 2048);
                    this.method4172(var1 + 1, var2 + 1, 32768);
                }

                if (var4 == 2) {
                    this.method4172(var1, var2, 8192);
                    this.method4172(var1 + 1, var2 - 1, 512);
                }

                if (var4 == 3) {
                    this.method4172(var1, var2, 32768);
                    this.method4172(var1 - 1, var2 - 1, 2048);
                }
            }

            if (var3 == 2) {
                if (var4 == 0) {
                    this.method4172(var1, var2, 66560);
                    this.method4172(var1 - 1, var2, 4096);
                    this.method4172(var1, var2 + 1, 16384);
                }

                if (var4 == 1) {
                    this.method4172(var1, var2, 5120);
                    this.method4172(var1, var2 + 1, 16384);
                    this.method4172(var1 + 1, var2, 65536);
                }

                if (var4 == 2) {
                    this.method4172(var1, var2, 20480);
                    this.method4172(var1 + 1, var2, 65536);
                    this.method4172(var1, var2 - 1, 1024);
                }

                if (var4 == 3) {
                    this.method4172(var1, var2, 81920);
                    this.method4172(var1, var2 - 1, 1024);
                    this.method4172(var1 - 1, var2, 4096);
                }
            }
        }

    }

    public void method4171(int var1, int var2, int var3, int var4, int var5, boolean var6) {
        int var8 = 256;
        if (var6) {
            var8 += 131072;
        }

        var1 -= this.field2397;
        var2 -= this.field2392;
        int var9;
        if (var5 == 1 || var5 == 3) {
            var9 = var3;
            var3 = var4;
            var4 = var9;
        }

        for (var9 = var1; var9 < var3 + var1; ++var9) {
            if (var9 >= 0 && var9 < this.field2383) {
                for (int var10 = var2; var10 < var4 + var2; ++var10) {
                    if (var10 >= 0 && var10 < this.field2394) {
                        this.method4172(var9, var10, var8);
                    }
                }
            }
        }

    }

    void method4172(int var1, int var2, int var3) {
        int[] var10000 = this.field2393[var1];
        var10000[var2] &= ~var3;
    }

    public void method4173(int var1, int var2) {
        var1 -= this.field2397;
        var2 -= this.field2392;
        int[] var10000 = this.field2393[var1];
        var10000[var2] &= -262145;
    }
}
