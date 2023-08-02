public class class362 extends class476 {
    byte field3998;
    class363 field4000;
    int field3999;

    class362() {
    }

    static final void method6594(boolean var0, class497 var1) {
        Client.field1561 = 0;
        Client.field1717 = 0;
        Client.method1190(var1);

        int var3;
        int var4;
        int var8;
        int var9;
        int var10;
        int var11;
        int var13;
        while (true) {
            var3 = 16;
            var4 = 1 << var3;
            if (var1.method8485(Client.field1436.field1042) < var3 + 12) {
                break;
            }

            int var5 = var1.method8483(var3);
            if (var5 == var4 - 1) {
                break;
            }

            boolean var6 = false;
            if (Client.field1489[var5] == null) {
                Client.field1489[var5] = new class86();
                var6 = true;
            }

            class86 var7 = Client.field1489[var5];
            Client.field1491[++Client.field1565 - 1] = var5;
            var7.field999 = Client.field1445;
            var11 = var1.method8483(1);
            if (var11 == 1) {
                Client.field1503[++Client.field1717 - 1] = var5;
            }

            var8 = var1.method8483(1);
            boolean var12 = var1.method8483(1) == 1;
            if (var12) {
                var1.method8483(32);
            }

            if (var0) {
                var10 = var1.method8483(8);
                if (var10 > 127) {
                    var10 -= 256;
                }
            } else {
                var10 = var1.method8483(5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            }

            if (var0) {
                var9 = var1.method8483(8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            } else {
                var9 = var1.method8483(5);
                if (var9 > 15) {
                    var9 -= 32;
                }
            }

            var7.field776 = class191.method4208(var1.method8483(14));
            var13 = Client.field1620[var1.method8483(3)];
            if (var6) {
                var7.field1007 = var7.field942 = var13;
            }

            Client.method3032(var7);
            if (var7.field1009 == 0) {
                var7.field942 = 0;
            }

            var7.method1847(class146.field1362.field945[0] + var9, class146.field1362.field1012[0] + var10, var8 == 1);
        }

        var1.method8482();

        for (var3 = 0; var3 < Client.field1717; ++var3) {
            var4 = Client.field1503[var3];
            class86 var15 = Client.field1489[var4];
            int var16 = var1.method8748();
            int var17;
            if (0 != (var16 & 32)) {
                var17 = var1.method8748();
                var16 += var17 << 8;
            }

            if ((var16 & 1024) != 0) {
                var17 = var1.method8748();
                var16 += var17 << 16;
            }

            if (0 != (var16 & 8)) {
                var15.field975 = var1.method8750();
                var15.field975 += var1.method8748() << 16;
                var17 = 16777215;
                if (var17 == var15.field975) {
                    var15.field975 = -1;
                }
            }

            if (0 != (var16 & 1)) {
                var15.field776 = class191.method4208(var1.method8778());
                Client.method3032(var15);
                var15.method1879();
            }

            if (0 != (var16 & 4)) {
                var17 = var1.method8749();
                if (var17 == 65535) {
                    var17 = -1;
                }

                var8 = var1.method8751();
                if (var15.field968 == var17 && var17 != -1) {
                    var9 = class215.method2582(var17).field2346;
                    if (var9 == 1) {
                        var15.field986 = 0;
                        var15.field987 = 0;
                        var15.field988 = var8;
                        var15.field957 = 0;
                    }

                    if (var9 == 2) {
                        var15.field957 = 0;
                    }
                } else if (var17 == -1 || var15.field968 == -1 || class215.method2582(var17).field2330 >= class215.method2582(var15.field968).field2330) {
                    var15.field968 = var17;
                    var15.field986 = 0;
                    var15.field987 = 0;
                    var15.field988 = var8;
                    var15.field957 = 0;
                    var15.field1015 = var15.field1010;
                }
            }

            if (0 != (var16 & 64)) {
                var1.method8749();
                var1.method9000();
            }

            int[] var18;
            short[] var19;
            int var20;
            long var21;
            short[] var22;
            boolean var23;
            if ((var16 & 512) != 0) {
                var17 = var1.method8751();
                if ((var17 & 1) == 1) {
                    var15.method1858();
                } else {
                    var18 = null;
                    if (2 == (var17 & 2)) {
                        var9 = var1.method8782();
                        var18 = new int[var9];

                        for (var10 = 0; var10 < var9; ++var10) {
                            var11 = var1.method8750();
                            var11 = var11 == 65535 ? -1 : var11;
                            var18[var10] = var11;
                        }
                    }

                    var19 = null;
                    if (4 == (var17 & 4)) {
                        var10 = 0;
                        if (var15.field776.field2068 != null) {
                            var10 = var15.field776.field2068.length;
                        }

                        var19 = new short[var10];

                        for (var11 = 0; var11 < var10; ++var11) {
                            var19[var11] = (short) var1.method8750();
                        }
                    }

                    var22 = null;
                    if ((var17 & 8) == 8) {
                        var11 = 0;
                        if (null != var15.field776.field2056) {
                            var11 = var15.field776.field2056.length;
                        }

                        var22 = new short[var11];

                        for (var20 = 0; var20 < var11; ++var20) {
                            var22[var20] = (short) var1.method8778();
                        }
                    }

                    var23 = false;
                    if ((var17 & 16) != 0) {
                        var23 = var1.method8748() == 1;
                    }

                    var21 = ++class86.field781 - 1;
                    var15.method1859(new class201(var21, var18, var19, var22, var23));
                }
            }

            if ((var16 & 256) != 0) {
                var17 = var1.method8751();
                if (1 == (var17 & 1)) {
                    var15.method1852();
                } else {
                    var18 = null;
                    if ((var17 & 2) == 2) {
                        var9 = var1.method8781();
                        var18 = new int[var9];

                        for (var10 = 0; var10 < var9; ++var10) {
                            var11 = var1.method8750();
                            var11 = var11 == 65535 ? -1 : var11;
                            var18[var10] = var11;
                        }
                    }

                    var19 = null;
                    if (4 == (var17 & 4)) {
                        var10 = 0;
                        if (null != var15.field776.field2068) {
                            var10 = var15.field776.field2068.length;
                        }

                        var19 = new short[var10];

                        for (var11 = 0; var11 < var10; ++var11) {
                            var19[var11] = (short) var1.method8749();
                        }
                    }

                    var22 = null;
                    if (8 == (var17 & 8)) {
                        var11 = 0;
                        if (null != var15.field776.field2056) {
                            var11 = var15.field776.field2056.length;
                        }

                        var22 = new short[var11];

                        for (var20 = 0; var20 < var11; ++var20) {
                            var22[var20] = (short) var1.method8749();
                        }
                    }

                    var23 = false;
                    if (0 != (var17 & 16)) {
                        var23 = var1.method8782() == 1;
                    }

                    var21 = ++class86.field779 - 1;
                    var15.method1857(new class201(var21, var18, var19, var22, var23));
                }
            }

            if ((var16 & 262144) != 0) {
                var17 = var1.method8862();
                var15.field995 = (var17 & 1) != 0 ? var1.method8749() : var15.field776.field2050;
                var15.field948 = 0 != (var17 & 2) ? var1.method8750() : var15.field776.field2054;
                var15.field993 = (var17 & 4) != 0 ? var1.method8750() : var15.field776.field2083;
                var15.field1004 = (var17 & 8) != 0 ? var1.method8749() : 2045371335 * var15.field776.field2061 * 551218679;
                var15.field1001 = 0 != (var17 & 16) ? var1.method8792() : var15.field776.field2057;
                var15.field984 = 0 != (var17 & 32) ? var1.method8778() : var15.field776.field2058;
                var15.field953 = (var17 & 64) != 0 ? var1.method8778() : var15.field776.field2043;
                var15.field952 = (var17 & 128) != 0 ? var1.method8750() : var15.field776.field2060;
                var15.field955 = 0 != (var17 & 256) ? var1.method8792() : var15.field776.field2045;
                var15.field956 = (var17 & 512) != 0 ? var1.method8792() : var15.field776.field2062;
                var15.field969 = 0 != (var17 & 1024) ? var1.method8749() : 1478538629 * var15.field776.field2063 * -1703871667;
                var15.field958 = 0 != (var17 & 2048) ? var1.method8749() : var15.field776.field2064;
                var15.field959 = 0 != (var17 & 4096) ? var1.method8792() : 1944282437 * var15.field776.field2065 * 904488333;
                var15.field960 = (var17 & 8192) != 0 ? var1.method8778() : 881727523 * var15.field776.field2071 * 1352095627;
                var15.field989 = (var17 & 16384) != 0 ? var1.method8749() : 1344848923 * var15.field776.field2052 * -1626376685;
            }

            if ((var16 & 131072) != 0) {
                var17 = var1.method8782();

                for (var8 = 0; var8 < var17; ++var8) {
                    var9 = var1.method8782();
                    var10 = var1.method8750();
                    var11 = var1.method8862();
                    var15.method2080(var9, var10, var11 >> 16, var11 & '\uffff');
                }
            }

            if (0 != (var16 & '\u8000')) {
                var15.field992 = var1.method8786();
                var15.field994 = var1.method8784();
                var15.field954 = var1.method8768();
                var15.field982 = var1.method8768();
                var15.field964 = var1.method8750() + Client.field1445;
                var15.field997 = var1.method8749() + Client.field1445;
                var15.field990 = var1.method8778();
                var15.field1010 = 1;
                var15.field1015 = 0;
                var15.field992 += var15.field945[0];
                var15.field994 += var15.field1012[0];
                var15.field954 += var15.field945[0];
                var15.field982 += var15.field1012[0];
            }

            if ((var16 & 2) != 0) {
                var17 = var1.method8792();
                var8 = var1.method8792();
                var15.field980 = var1.method8748() == 1;
                if (Client.field1441 >= 212) {
                    var15.field978 = var17;
                    var15.field979 = var8;
                } else {
                    var9 = var15.field949 - (var17 - class342.field3837 - class342.field3837) * 64;
                    var10 = var15.field963 - (var8 - class144.field1352 - class144.field1352) * 64;
                    if (var9 != 0 || var10 != 0) {
                        var20 = (int) (Math.atan2(var9, var10) * 325.94932345220167) & 2047;
                        var15.field977 = var20;
                    }
                }
            }

            if (0 != (var16 & 4096)) {
                var15.field941 = Client.field1445 + var1.method8749();
                var15.field1002 = Client.field1445 + var1.method8750();
                var15.field1003 = var1.method8784();
                var15.field996 = var1.method8768();
                var15.field1005 = var1.method8785();
                var15.field1006 = (byte) var1.method8748();
            }

            if ((var16 & 16) != 0) {
                var17 = var1.method8748();
                if (var17 > 0) {
                    for (var8 = 0; var8 < var17; ++var8) {
                        var10 = -1;
                        var11 = -1;
                        var20 = -1;
                        var9 = var1.method8764();
                        if (var9 == 32767) {
                            var9 = var1.method8764();
                            var11 = var1.method8764();
                            var10 = var1.method8764();
                            var20 = var1.method8764();
                        } else if (var9 != 32766) {
                            var11 = var1.method8764();
                        } else {
                            var9 = -1;
                        }

                        var13 = var1.method8764();
                        var15.method2066(var9, var11, var10, var20, Client.field1445, var13);
                    }
                }

                var8 = var1.method8748();
                if (var8 > 0) {
                    for (var9 = 0; var9 < var8; ++var9) {
                        var10 = var1.method8764();
                        var11 = var1.method8764();
                        if (var11 != 32767) {
                            var20 = var1.method8764();
                            var13 = var1.method8751();
                            int var14 = var11 > 0 ? var1.method8751() : var13;
                            var15.method2067(var10, Client.field1445, var11, var20, var13, var14);
                        } else {
                            var15.method2068(var10);
                        }
                    }
                }
            }

            if ((var16 & 8192) != 0) {
                var15.method1855(var1.method8782());
            }

            if (0 != (var16 & 16384)) {
                var15.field1016 = var1.method8998();
            }

            if (0 != (var16 & 65536)) {
                var17 = var1.method8781();
                var18 = new int[8];
                var19 = new short[8];

                for (var10 = 0; var10 < 8; ++var10) {
                    if (0 != (var17 & 1 << var10)) {
                        var18[var10] = var1.method8814();
                        var19[var10] = (short) var1.method8923();
                    } else {
                        var18[var10] = -1;
                        var19[var10] = -1;
                    }
                }

                var15.method1848(var18, var19);
            }

            if (0 != (var16 & 2048)) {
                var15.method1842(var1.method8873());
            }

            if (0 != (var16 & 128)) {
                var15.field971 = var1.method8873();
                var15.field940 = 100;
            }
        }

        for (var3 = 0; var3 < Client.field1561; ++var3) {
            var4 = Client.field1517[var3];
            if (Client.field1489[var4].field999 != Client.field1445) {
                Client.field1489[var4].field776 = null;
                Client.field1489[var4] = null;
            }
        }

        if (var1.field5129 != Client.field1436.field1042) {
            throw new RuntimeException(var1.field5129 + class90.field829 + Client.field1436.field1042);
        } else {
            for (var3 = 0; var3 < Client.field1565; ++var3) {
                if (Client.field1489[Client.field1491[var3]] == null) {
                    throw new RuntimeException(var3 + class90.field829 + Client.field1565);
                }
            }

        }
    }
}
