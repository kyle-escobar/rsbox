import java.util.*;

public class class256 {
    public static class296 field2910 = new class296(37748736, 256);
    static class60 field2911;
    final HashMap field2904;
    class248 field2901;
    int field2896;
    int field2899;
    int field2900;
    int field2907;
    HashMap field2906;
    LinkedList field2908;
    List field2905;

    class256(int var1, int var2, int var3, HashMap var4) {
        this.field2899 = var1;
        this.field2900 = var2;
        this.field2908 = new LinkedList();
        this.field2905 = new LinkedList();
        this.field2906 = new HashMap();
        this.field2907 = var3 | -16777216;
        this.field2904 = var4;
    }

    static class523 method99(int var0, int var1, int var2) {
        class296 var4 = field2910;
        long var5 = (long) var2 << 16 | (long) var0 << 8 | var1;
        return (class523) var4.method5665(var5);
    }

    static boolean method2006(class184 var0) {
        if (var0.field1946 != null) {
            int[] var2 = var0.field1946;

            for (int var3 = 0; var3 < var2.length; ++var3) {
                int var4 = var2[var3];
                class184 var5 = class98.method2042(var4);
                if (-1 != var5.field1933) {
                    return true;
                }
            }
        } else return -1 != var0.field1933;

        return false;
    }

    void method5007(int var1, int var2, int var3) {
        class523 var5 = method99(this.field2899, this.field2900, this.field2896);
        if (null != var5) {
            if (var3 == this.field2896 * 64) {
                var5.method9034(var1, var2);
            } else {
                var5.method9056(var1, var2, var3, var3);
            }

        }
    }

    void method5008(class248 var1, List var2) {
        this.field2906.clear();
        this.field2901 = var1;
        this.method5013(var2);
    }

    void method5009(HashSet var1, List var2) {
        this.field2906.clear();
        Iterator var4 = var1.iterator();

        while (var4.hasNext()) {
            class280 var5 = (class280) var4.next();
            if (var5.method5308() == this.field2899 && var5.method5309() == this.field2900) {
                this.field2908.add(var5);
            }
        }

        this.method5013(var2);
    }

    void method5010(int var1, int var2, int var3, int var4, class273 var5) {
        for (int var7 = var1; var7 < var1 + var3; ++var7) {
            label44:
            for (int var8 = var2; var8 < var4 + var2; ++var8) {
                for (int var9 = 0; var9 < var5.field3001; ++var9) {
                    class271[] var10 = var5.field3008[var9][var7][var8];
                    if (null != var10 && var10.length != 0) {
                        for (int var12 = 0; var12 < var10.length; ++var12) {
                            class271 var13 = var10[var12];
                            class184 var14 = class98.method2042(var13.field2989);
                            if (method2006(var14)) {
                                this.method5077(var14, var9, var7, var8, var5);
                                continue label44;
                            }
                        }
                    }
                }
            }
        }

    }

    void method5077(class184 var1, int var2, int var3, int var4, class273 var5) {
        class330 var7 = new class330(var2, var3 + this.field2899 * 64, var4 + this.field2900 * 64);
        class330 var8 = null;
        if (null != this.field2901) {
            var8 = new class330(this.field2901.field3006 + var2, var3 + this.field2901.field3000 * 64, this.field2901.field2997 * 64 + var4);
        } else {
            class280 var9 = (class280) var5;
            var8 = new class330(var9.field3006 + var2, var3 + var9.field3000 * 64 + var9.method5364() * 8, var9.field2997 * 64 + var4 + var9.method5365() * 8);
        }

        class197 var10;
        Object var11;
        if (var1.field1946 != null) {
            var11 = new class241(var8, var7, var1.field1912, this);
        } else {
            var10 = class197.method4100(var1.field1933);
            var11 = new class266(var8, var7, var10.field2158, this.method5075(var10));
        }

        var10 = class197.method4100(((class282) var11).method5405());
        if (var10.field2157) {
            this.field2906.put(new class330(0, var3, var4), var11);
        }

    }

    void method5011() {
        Iterator var2 = this.field2906.values().iterator();

        while (var2.hasNext()) {
            class282 var3 = (class282) var2.next();
            if (var3 instanceof class241) {
                ((class241) var3).method4655();
            }
        }

    }

    void method5013(List var1) {
        Iterator var3 = var1.iterator();

        while (var3.hasNext()) {
            class266 var4 = (class266) var3.next();
            if (class197.method4100(var4.field2962).field2157 && this.field2899 == var4.field3046.field3581 >> 6 && var4.field3046.field3583 >> 6 == this.field2900) {
                class266 var5 = new class266(var4.field3046, var4.field3046, var4.field2962, this.method5034(var4.field2962));
                this.field2905.add(var5);
            }
        }

    }

    void method5051() {
        if (null != this.field2901) {
            this.field2901.method5303();
        } else {
            Iterator var2 = this.field2908.iterator();

            while (var2.hasNext()) {
                class280 var3 = (class280) var2.next();
                var3.method5303();
            }
        }

    }

    boolean method5041(class342 var1) {
        this.field2906.clear();
        if (this.field2901 != null) {
            this.field2901.method5302(var1);
            if (this.field2901.method5301()) {
                this.method5010(0, 0, 64, 64, this.field2901);
                return true;
            } else {
                return false;
            }
        } else {
            boolean var3 = true;

            Iterator var4;
            class280 var5;
            for (var4 = this.field2908.iterator(); var4.hasNext(); var3 &= var5.method5301()) {
                var5 = (class280) var4.next();
                var5.method5302(var1);
            }

            if (var3) {
                var4 = this.field2908.iterator();

                while (var4.hasNext()) {
                    var5 = (class280) var4.next();
                    this.method5010(var5.method5366() * 8, var5.method5371() * 8, 8, 8, var5);
                }
            }

            return var3;
        }
    }

    void method5016(int var1, class269 var2, class537[] var3, class342 var4, class342 var5) {
        this.field2896 = var1;
        if (null != this.field2901 || !this.field2908.isEmpty()) {
            if (method99(this.field2899, this.field2900, var1) == null) {
                boolean var7 = true;
                var7 &= this.method5041(var4);
                int var9;
                if (this.field2901 != null) {
                    var9 = this.field2901.field3002;
                } else {
                    var9 = ((class273) this.field2908.getFirst()).field3002;
                }

                var7 &= var5.method6432(var9);
                if (var7) {
                    byte[] var8 = var5.method6388(var9);
                    class283 var10;
                    if (null == var8) {
                        var10 = new class283();
                    } else {
                        var10 = new class283(class32.method2580(var8).field5147);
                    }

                    class523 var12 = new class523(this.field2896 * 64, this.field2896 * 64);
                    var12.method9027();
                    if (this.field2901 != null) {
                        this.method5039(var2, var3, var10);
                    } else {
                        this.method5020(var2, var3, var10);
                    }

                    int var13 = this.field2899;
                    int var14 = this.field2900;
                    int var15 = this.field2896;
                    class296 var16 = field2910;
                    long var18 = (long) var15 << 16 | (long) var13 << 8 | var14;
                    var16.method5664(var12, var18, 4 * var12.field5147.length);
                    this.method5051();
                }
            }
        }
    }

    void method5017(int var1, int var2, int var3, HashSet var4) {
        if (null == var4) {
            var4 = new HashSet();
        }

        this.method5026(var1, var2, var4, var3);
        this.method5032(var1, var2, var4, var3);
    }

    void method5018(HashSet var1, int var2, int var3) {
        Iterator var5 = this.field2906.values().iterator();

        while (var5.hasNext()) {
            class282 var6 = (class282) var5.next();
            if (var6.method5387()) {
                int var7 = var6.method5405();
                if (var1.contains(var7)) {
                    class197 var8 = class197.method4100(var7);
                    this.method5028(var8, var6.field3044, var6.field3042, var2, var3);
                }
            }
        }

        this.method5027(var1, var2, var3);
    }

    void method5039(class269 var1, class537[] var2, class283 var3) {
        int var5;
        int var6;
        for (var5 = 0; var5 < 64; ++var5) {
            for (var6 = 0; var6 < 64; ++var6) {
                this.method5109(var5, var6, this.field2901, var1, var3);
                this.method5022(var5, var6, this.field2901, var1);
            }
        }

        for (var5 = 0; var5 < 64; ++var5) {
            for (var6 = 0; var6 < 64; ++var6) {
                this.method5123(var5, var6, this.field2901, var1, var2);
            }
        }

    }

    void method5020(class269 var1, class537[] var2, class283 var3) {
        Iterator var5 = this.field2908.iterator();

        class280 var6;
        int var7;
        int var8;
        while (var5.hasNext()) {
            var6 = (class280) var5.next();

            for (var7 = var6.method5366() * 8; var7 < var6.method5366() * 8 + 8; ++var7) {
                for (var8 = var6.method5371() * 8; var8 < var6.method5371() * 8 + 8; ++var8) {
                    this.method5109(var7, var8, var6, var1, var3);
                    this.method5022(var7, var8, var6, var1);
                }
            }
        }

        var5 = this.field2908.iterator();

        while (var5.hasNext()) {
            var6 = (class280) var5.next();

            for (var7 = var6.method5366() * 8; var7 < var6.method5366() * 8 + 8; ++var7) {
                for (var8 = var6.method5371() * 8; var8 < var6.method5371() * 8 + 8; ++var8) {
                    this.method5123(var7, var8, var6, var1, var2);
                }
            }
        }

    }

    void method5123(int var1, int var2, class273 var3, class269 var4, class537[] var5) {
        this.method5050(var1, var2, var3);
        this.method5024(var1, var2, var3, var5);
    }

    void method5109(int var1, int var2, class273 var3, class269 var4, class283 var5) {
        int var7 = var3.field3004[0][var1][var2] - 1;
        int var8 = var3.field3005[0][var1][var2] - 1;
        if (var7 == -1 && var8 == -1) {
            class535.method9231(var1 * this.field2896, this.field2896 * (63 - var2), this.field2896, this.field2896, this.field2907);
        }

        int var9 = 16711935;
        if (var8 != -1) {
            var9 = class277.method8160(var8, this.field2907);
        }

        if (var8 > -1 && var3.field2996[0][var1][var2] == 0) {
            class535.method9231(this.field2896 * var1, this.field2896 * (63 - var2), this.field2896, this.field2896, var9);
        } else {
            int var10 = this.method5014(var1, var2, var3, var5);
            if (var8 == -1) {
                class535.method9231(this.field2896 * var1, (63 - var2) * this.field2896, this.field2896, this.field2896, var10);
            } else {
                var4.method5262(var1 * this.field2896, this.field2896 * (63 - var2), var10, var9, this.field2896, this.field2896, var3.field2996[0][var1][var2], var3.field3007[0][var1][var2]);
            }
        }
    }

    void method5022(int var1, int var2, class273 var3, class269 var4) {
        for (int var6 = 1; var6 < var3.field3001; ++var6) {
            int var7 = var3.field3005[var6][var1][var2] - 1;
            if (var7 > -1) {
                int var8 = class277.method8160(var7, this.field2907);
                if (0 == var3.field2996[var6][var1][var2]) {
                    class535.method9231(this.field2896 * var1, this.field2896 * (63 - var2), this.field2896, this.field2896, var8);
                } else {
                    var4.method5262(this.field2896 * var1, (63 - var2) * this.field2896, 0, var8, this.field2896, this.field2896, var3.field2996[var6][var1][var2], var3.field3007[var6][var1][var2]);
                }
            }
        }

    }

    int method5014(int var1, int var2, class273 var3, class283 var4) {
        return 0 == var3.field3004[0][var1][var2] ? this.field2907 : var4.method5408(var1, var2);
    }

    void method5024(int var1, int var2, class273 var3, class537[] var4) {
        for (int var6 = 0; var6 < var3.field3001; ++var6) {
            class271[] var7 = var3.field3008[var6][var1][var2];
            if (null != var7 && var7.length != 0) {
                for (int var9 = 0; var9 < var7.length; ++var9) {
                    class271 var10 = var7[var9];
                    int var12 = var10.field2987;
                    boolean var11 = var12 >= class353.field3916.field3894 && var12 <= class353.field3910.field3894;
                    if (var11 || class353.method2278(var10.field2987)) {
                        class184 var13 = class98.method2042(var10.field2989);
                        if (var13.field1934 != -1) {
                            if (46 != var13.field1934 && var13.field1934 != 52) {
                                var4[var13.field1934].method9326(this.field2896 * var1, this.field2896 * (63 - var2), this.field2896 * 2, this.field2896 * 2);
                            } else {
                                var4[var13.field1934].method9326(var1 * this.field2896, (63 - var2) * this.field2896, this.field2896 * 2 + 1, 1 + this.field2896 * 2);
                            }
                        }
                    }
                }
            }
        }

    }

    void method5050(int var1, int var2, class273 var3) {
        for (int var5 = 0; var5 < var3.field3001; ++var5) {
            class271[] var6 = var3.field3008[var5][var1][var2];
            if (var6 != null && var6.length != 0) {
                for (int var8 = 0; var8 < var6.length; ++var8) {
                    class271 var9 = var6[var8];
                    int var11 = var9.field2987;
                    boolean var10 = var11 >= class353.field3897.field3894 && var11 <= class353.field3896.field3894 || var11 == class353.field3898.field3894;
                    if (var10) {
                        class184 var12 = class98.method2042(var9.field2989);
                        int var13 = 0 != var12.field1924 ? -3407872 : -3355444;
                        if (var9.field2987 == class353.field3897.field3894) {
                            this.method5038(var1, var2, var9.field2988, var13);
                        }

                        if (var9.field2987 == class353.field3895.field3894) {
                            this.method5038(var1, var2, var9.field2988, -3355444);
                            this.method5038(var1, var2, 1 + var9.field2988, var13);
                        }

                        if (class353.field3896.field3894 == var9.field2987) {
                            if (var9.field2988 == 0) {
                                class535.method9237(this.field2896 * var1, this.field2896 * (63 - var2), 1, var13);
                            }

                            if (1 == var9.field2988) {
                                class535.method9237(this.field2896 + var1 * this.field2896 - 1, this.field2896 * (63 - var2), 1, var13);
                            }

                            if (var9.field2988 == 2) {
                                class535.method9237(this.field2896 + var1 * this.field2896 - 1, this.field2896 + (63 - var2) * this.field2896 - 1, 1, var13);
                            }

                            if (3 == var9.field2988) {
                                class535.method9237(this.field2896 * var1, this.field2896 * (63 - var2) + this.field2896 - 1, 1, var13);
                            }
                        }

                        if (class353.field3898.field3894 == var9.field2987) {
                            int var14 = var9.field2988 % 2;
                            int var15;
                            if (var14 == 0) {
                                for (var15 = 0; var15 < this.field2896; ++var15) {
                                    class535.method9237(var15 + this.field2896 * var1, (64 - var2) * this.field2896 - 1 - var15, 1, var13);
                                }
                            } else {
                                for (var15 = 0; var15 < this.field2896; ++var15) {
                                    class535.method9237(var1 * this.field2896 + var15, (63 - var2) * this.field2896 + var15, 1, var13);
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    void method5026(int var1, int var2, HashSet var3, int var4) {
        float var6 = (float) var4 / 64.0F;
        float var7 = var6 / 2.0F;
        Iterator var8 = this.field2906.entrySet().iterator();

        while (var8.hasNext()) {
            Map.Entry var9 = (Map.Entry) var8.next();
            class330 var10 = (class330) var9.getKey();
            int var11 = (int) ((float) var10.field3581 * var6 + (float) var1 - var7);
            int var12 = (int) ((float) (var4 + var2) - (float) var10.field3583 * var6 - var7);
            class282 var13 = (class282) var9.getValue();
            if (null != var13 && var13.method5387()) {
                var13.field3044 = var11;
                var13.field3042 = var12;
                class197 var14 = class197.method4100(var13.method5405());
                if (!var3.contains(var14.method3774())) {
                    this.method5029(var13, var11, var12, var6);
                }
            }
        }

    }

    void method5027(HashSet var1, int var2, int var3) {
        Iterator var5 = this.field2905.iterator();

        while (var5.hasNext()) {
            class282 var6 = (class282) var5.next();
            if (var6.method5387()) {
                class197 var7 = class197.method4100(var6.method5405());
                if (null != var7 && var1.contains(var7.method3774())) {
                    this.method5028(var7, var6.field3044, var6.field3042, var2, var3);
                }
            }
        }

    }

    void method5028(class197 var1, int var2, int var3, int var4, int var5) {
        class523 var7 = var1.method3771(false);
        if (var7 != null) {
            var7.method9139(var2 - var7.field5148 / 2, var3 - var7.field5153 / 2);
            if (var4 % var5 < var5 / 2) {
                class535.method9220(var2, var3, 15, 16776960, 128);
                class535.method9220(var2, var3, 7, 16777215, 256);
            }

        }
    }

    void method5029(class282 var1, int var2, int var3, float var4) {
        class197 var6 = class197.method4100(var1.method5405());
        this.method5030(var6, var2, var3);
        this.method5031(var1, var6, var2, var3, var4);
    }

    void method5030(class197 var1, int var2, int var3) {
        class523 var5 = var1.method3771(false);
        if (var5 != null) {
            int var6 = this.method5023(var5, var1.field2166);
            int var7 = this.method5033(var5, var1.field2164);
            var5.method9139(var2 + var6, var7 + var3);
        }

    }

    void method5031(class282 var1, class197 var2, int var3, int var4, float var5) {
        class261 var7 = var1.method5381();
        if (null != var7) {
            if (var7.field2934.method4734(var5)) {
                class393 var8 = (class393) this.field2904.get(var7.field2934);
                var8.method7238(var7.field2936, var3 - var7.field2933 / 2, var4, var7.field2933, var7.field2932, -16777216 | var2.field2160, 0, 1, 0, var8.field4527 / 2);
            }
        }
    }

    void method5032(int var1, int var2, HashSet var3, int var4) {
        float var6 = (float) var4 / 64.0F;
        Iterator var7 = this.field2905.iterator();

        while (var7.hasNext()) {
            class282 var8 = (class282) var7.next();
            if (var8.method5387()) {
                int var9 = var8.field3046.field3581 % 64;
                int var10 = var8.field3046.field3583 % 64;
                var8.field3044 = (int) ((float) var9 * var6 + (float) var1);
                var8.field3042 = (int) ((float) var2 + (float) (63 - var10) * var6);
                if (!var3.contains(var8.method5405())) {
                    this.method5029(var8, var8.field3044, var8.field3042, var6);
                }
            }
        }

    }

    int method5023(class523 var1, class208 var2) {
        switch (var2.field2241) {
            case 0:
                return -var1.field5148 / 2;
            case 1:
                return 0;
            default:
                return -var1.field5148;
        }
    }

    int method5033(class523 var1, class194 var2) {
        switch (var2.field2122) {
            case 0:
                return 0;
            case 2:
                return -var1.field5153 / 2;
            default:
                return -var1.field5153;
        }
    }

    class261 method5034(int var1) {
        class197 var3 = class197.method4100(var1);
        return this.method5075(var3);
    }

    class261 method5075(class197 var1) {
        if (var1.field2154 != null && null != this.field2904 && this.field2904.get(class244.field2686) != null) {
            int var4 = var1.field2156;
            class244[] var5 = new class244[]{class244.field2686, class244.field2687, class244.field2688};
            int var7 = 0;

            class244 var3;
            while (true) {
                if (var7 >= var5.length) {
                    var3 = null;
                    break;
                }

                class244 var8 = var5[var7];
                if (var8.field2692 == var4) {
                    var3 = var8;
                    break;
                }

                ++var7;
            }

            if (null == var3) {
                return null;
            } else {
                class393 var6 = (class393) this.field2904.get(var3);
                if (null == var6) {
                    return null;
                } else {
                    var7 = var6.method7160(var1.field2154, 1000000);
                    String[] var15 = new String[var7];
                    var6.method7214(var1.field2154, null, var15);
                    int var9 = var15.length * var6.field4527 / 2;
                    int var10 = 0;

                    for (int var12 = 0; var12 < var15.length; ++var12) {
                        String var13 = var15[var12];
                        int var14 = var6.method7225(var13);
                        if (var14 > var10) {
                            var10 = var14;
                        }
                    }

                    return new class261(var1.field2154, var10, var9, var3);
                }
            }
        } else {
            return null;
        }
    }

    List method5126(int var1, int var2, int var3, int var4, int var5) {
        LinkedList var7 = new LinkedList();
        if (var4 >= var1 && var5 >= var2) {
            if (var4 < var3 + var1 && var5 < var3 + var2) {
                Iterator var8 = this.field2906.values().iterator();

                class282 var9;
                while (var8.hasNext()) {
                    var9 = (class282) var8.next();
                    if (var9.method5387() && var9.method5382(var4, var5)) {
                        var7.add(var9);
                    }
                }

                var8 = this.field2905.iterator();

                while (var8.hasNext()) {
                    var9 = (class282) var8.next();
                    if (var9.method5387() && var9.method5382(var4, var5)) {
                        var7.add(var9);
                    }
                }

                return var7;
            } else {
                return var7;
            }
        } else {
            return var7;
        }
    }

    List method5037() {
        LinkedList var2 = new LinkedList();
        var2.addAll(this.field2905);
        var2.addAll(this.field2906.values());
        return var2;
    }

    void method5038(int var1, int var2, int var3, int var4) {
        var3 %= 4;
        if (var3 == 0) {
            class535.method9239(var1 * this.field2896, this.field2896 * (63 - var2), this.field2896, var4);
        }

        if (var3 == 1) {
            class535.method9237(this.field2896 * var1, (63 - var2) * this.field2896, this.field2896, var4);
        }

        if (var3 == 2) {
            class535.method9239(var1 * this.field2896 + this.field2896 - 1, (63 - var2) * this.field2896, this.field2896, var4);
        }

        if (var3 == 3) {
            class535.method9237(this.field2896 * var1, (63 - var2) * this.field2896 + this.field2896 - 1, this.field2896, var4);
        }

    }
}
