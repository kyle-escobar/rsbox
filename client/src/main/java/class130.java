public class class130 {
    public static final float field1222 = Math.ulp(1.0F);
    public static final float field1224;
    static class363 field1226;
    static float[] field1220;
    static float[] field1225;

    static {
        field1224 = field1222 * 2.0F;
        field1220 = new float[4];
        field1225 = new float[5];
    }

    class130() throws Throwable {
    }

    static float method1416(class143 var0, float var1) {
        if (var0 != null && var0.method2529() != 0) {
            if (var1 < (float) var0.field1323[0].field1194) {
                return class125.field1192 == var0.field1321 ? var0.field1323[0].field1199 : method6930(var0, var1, true);
            } else if (var1 > (float) var0.field1323[var0.method2529() - 1].field1194) {
                return var0.field1334 == class125.field1192 ? var0.field1323[var0.method2529() - 1].field1199 : method6930(var0, var1, false);
            } else if (var0.field1320) {
                return var0.field1323[0].field1199;
            } else {
                class126 var3 = var0.method2528(var1);
                boolean var4 = false;
                boolean var5 = false;
                if (var3 == null) {
                    return 0.0F;
                } else {
                    if (0.0 == (double) var3.field1197 && (double) var3.field1198 == 0.0) {
                        var4 = true;
                    } else if (Float.MAX_VALUE == var3.field1197 && Float.MAX_VALUE == var3.field1198) {
                        var5 = true;
                    } else if (null != var3.field1196) {
                        if (var0.field1335) {
                            float var6 = (float) var3.field1194;
                            float var10 = var3.field1199;
                            float var7 = var3.field1197 * 0.33333334F + var6;
                            float var11 = var10 + var3.field1198 * 0.33333334F;
                            float var9 = (float) var3.field1196.field1194;
                            float var13 = var3.field1196.field1199;
                            float var8 = var9 - 0.33333334F * var3.field1196.field1195;
                            float var12 = var13 - 0.33333334F * var3.field1196.field1193;
                            float var14;
                            float var15;
                            float var16;
                            float var17;
                            float var18;
                            float var19;
                            float var20;
                            if (var0.field1319) {
                                var16 = var11;
                                var17 = var12;
                                if (null != var0) {
                                    var18 = var9 - var6;
                                    if ((double) var18 != 0.0) {
                                        var19 = var7 - var6;
                                        var20 = var8 - var6;
                                        float[] var28 = new float[]{var19 / var18, var20 / var18};
                                        var0.field1330 = 0.33333334F == var28[0] && var28[1] == 0.6666667F;
                                        float var22 = var28[0];
                                        float var23 = var28[1];
                                        if ((double) var28[0] < 0.0) {
                                            var28[0] = 0.0F;
                                        }

                                        if ((double) var28[1] > 1.0) {
                                            var28[1] = 1.0F;
                                        }

                                        if ((double) var28[0] > 1.0 || var28[1] < -1.0F) {
                                            method2181(var28);
                                        }

                                        if (var22 != var28[0]) {
                                            var14 = var18 * var28[0] + var6;
                                            if ((double) var22 != 0.0) {
                                                var16 = (var11 - var10) * var28[0] / var22 + var10;
                                            }
                                        }

                                        if (var23 != var28[1]) {
                                            var15 = var18 * var28[1] + var6;
                                            if (1.0 != (double) var23) {
                                                var17 = (float) ((double) var13 - (double) (var13 - var12) * (1.0 - (double) var28[1]) / (1.0 - (double) var23));
                                            }
                                        }

                                        var0.field1325 = var6;
                                        var0.field1322 = var9;
                                        method3814(0.0F, var28[0], var28[1], 1.0F, var0);
                                        float var24 = var16 - var10;
                                        float var25 = var17 - var16;
                                        float var26 = var13 - var17;
                                        float var27 = var25 - var24;
                                        var0.field1324 = var26 - var25 - var27;
                                        var0.field1333 = var27 + var27 + var27;
                                        var0.field1340 = var24 + var24 + var24;
                                        var0.field1331 = var10;
                                    }
                                }
                            } else if (null != var0) {
                                var0.field1325 = var6;
                                var14 = var9 - var6;
                                var15 = var13 - var10;
                                var16 = var7 - var6;
                                var17 = 0.0F;
                                var18 = 0.0F;
                                if ((double) var16 != 0.0) {
                                    var17 = (var11 - var10) / var16;
                                }

                                var16 = var9 - var8;
                                if (0.0 != (double) var16) {
                                    var18 = (var13 - var12) / var16;
                                }

                                var19 = 1.0F / (var14 * var14);
                                var20 = var14 * var17;
                                float var21 = var18 * var14;
                                var0.field1327 = var19 * (var21 + var20 - var15 - var15) / var14;
                                var0.field1328 = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
                                var0.field1329 = var17;
                                var0.field1337 = var10;
                            }

                            var0.field1335 = false;
                        }
                    } else {
                        var4 = true;
                    }

                    if (var4) {
                        return var3.field1199;
                    } else if (var5) {
                        return (float) var3.field1194 != var1 && var3.field1196 != null ? var3.field1196.field1199 : var3.field1199;
                    } else {
                        return var0.field1319 ? class201.method3821(var0, var1) : class169.method3302(var0, var1);
                    }
                }
            }
        } else {
            return 0.0F;
        }
    }

    static float method6930(class143 var0, float var1, boolean var2) {
        float var4 = 0.0F;
        if (null != var0 && var0.method2529() != 0) {
            float var5 = (float) var0.field1323[0].field1194;
            float var6 = (float) var0.field1323[var0.method2529() - 1].field1194;
            float var7 = var6 - var5;
            if ((double) var7 == 0.0) {
                return var0.field1323[0].field1199;
            } else {
                float var8 = 0.0F;
                if (var1 > var6) {
                    var8 = (var1 - var6) / var7;
                } else {
                    var8 = (var1 - var5) / var7;
                }

                double var9 = (int) var8;
                float var11 = Math.abs((float) ((double) var8 - var9));
                float var12 = var11 * var7;
                var9 = Math.abs(var9 + 1.0);
                double var13 = var9 / 2.0;
                double var15 = (int) var13;
                var11 = (float) (var13 - var15);
                float var17;
                float var18;
                if (var2) {
                    if (var0.field1321 == class125.field1189) {
                        if ((double) var11 != 0.0) {
                            var12 += var5;
                        } else {
                            var12 = var6 - var12;
                        }
                    } else if (var0.field1321 != class125.field1185 && class125.field1186 != var0.field1321) {
                        if (class125.field1184 == var0.field1321) {
                            var12 = var5 - var1;
                            var17 = var0.field1323[0].field1195;
                            var18 = var0.field1323[0].field1193;
                            var4 = var0.field1323[0].field1199;
                            if (0.0 != (double) var17) {
                                var4 -= var12 * var18 / var17;
                            }

                            return var4;
                        }
                    } else {
                        var12 = var6 - var12;
                    }
                } else if (class125.field1189 == var0.field1334) {
                    if ((double) var11 != 0.0) {
                        var12 = var6 - var12;
                    } else {
                        var12 += var5;
                    }
                } else if (var0.field1334 != class125.field1185 && class125.field1186 != var0.field1334) {
                    if (class125.field1184 == var0.field1334) {
                        var12 = var1 - var6;
                        var17 = var0.field1323[var0.method2529() - 1].field1197;
                        var18 = var0.field1323[var0.method2529() - 1].field1198;
                        var4 = var0.field1323[var0.method2529() - 1].field1199;
                        if (0.0 != (double) var17) {
                            var4 += var12 * var18 / var17;
                        }

                        return var4;
                    }
                } else {
                    var12 += var5;
                }

                var4 = method1416(var0, var12);
                float var19;
                if (var2 && class125.field1186 == var0.field1321) {
                    var19 = var0.field1323[var0.method2529() - 1].field1199 - var0.field1323[0].field1199;
                    var4 = (float) ((double) var4 - (double) var19 * var9);
                } else if (!var2 && var0.field1334 == class125.field1186) {
                    var19 = var0.field1323[var0.method2529() - 1].field1199 - var0.field1323[0].field1199;
                    var4 = (float) ((double) var4 + var9 * (double) var19);
                }

                return var4;
            }
        } else {
            return var4;
        }
    }

    static void method2103(float[] var0) {
        if (var0[0] + field1222 < 1.3333334F) {
            float var2 = var0[0] - 2.0F;
            float var3 = var0[0] - 1.0F;
            float var4 = (float) Math.sqrt(var2 * var2 - var3 * var3 * 4.0F);
            float var5 = (-var2 + var4) * 0.5F;
            if (field1222 + var0[1] > var5) {
                var0[1] = var5 - field1222;
            } else {
                var5 = (-var2 - var4) * 0.5F;
                if (var0[1] < field1222 + var5) {
                    var0[1] = var5 + field1222;
                }
            }
        } else {
            var0[0] = 1.3333334F - field1222;
            var0[1] = 0.33333334F - field1222;
        }

    }

    static void method2181(float[] var0) {
        var0[1] = 1.0F - var0[1];
        if (var0[0] < 0.0F) {
            var0[0] = 0.0F;
        }

        if (var0[1] < 0.0F) {
            var0[1] = 0.0F;
        }

        if (var0[0] > 1.0F || var0[1] > 1.0F) {
            float var2 = (float) (((double) var0[1] - 2.0) * (double) var0[1] + (double) (var0[0] * (var0[0] - 2.0F + var0[1])) + 1.0);
            if (field1222 + var2 > 0.0F) {
                method2103(var0);
            }
        }

        var0[1] = 1.0F - var0[1];
    }

    static void method3814(float var0, float var1, float var2, float var3, class143 var4) {
        float var6 = var1 - var0;
        float var7 = var2 - var1;
        float var8 = var3 - var2;
        float var9 = var7 - var6;
        var4.field1337 = var8 - var7 - var9;
        var4.field1329 = var9 + var9 + var9;
        var4.field1328 = var6 + var6 + var6;
        var4.field1327 = var0;
    }
}
