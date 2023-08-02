public abstract class class102 extends class228 {
    boolean field950 = false;
    boolean field962;
    boolean field974 = false;
    boolean field976 = false;
    boolean field980;
    byte field1003;
    byte field1005;
    byte field1006;
    byte field967 = 0;
    byte field996;
    class223[] field998 = new class223[10];
    class382 field946 = new class382();
    class469 field944 = new class469(4);
    int field1000 = 200;
    int field1001 = -1;
    int field1002 = -1;
    int field1004 = -1;
    int field1007;
    int field1008 = 0;
    int field1009 = 32;
    int field1010 = 0;
    int field1011 = 0;
    int field1013 = -1;
    int field1014 = 0;
    int field1015 = 0;
    int field1016 = -1;
    int field940 = 100;
    int field941 = -1;
    int field942;
    int field948 = -1;
    int field949;
    int field951 = 0;
    int field952 = -1;
    int field953 = -1;
    int field954;
    int field955 = -1;
    int field956 = -1;
    int field957 = 0;
    int field958 = -1;
    int field959 = -1;
    int field960 = -1;
    int field963;
    int field964;
    int field965 = 0;
    int field966 = 0;
    int field968 = -1;
    int field969 = -1;
    int field975 = -1;
    int field977 = -1;
    int field978 = -1;
    int field979 = -1;
    int field981 = 1;
    int field982;
    int field983 = 0;
    int field984 = -1;
    int field985;
    int field986 = 0;
    int field987 = 0;
    int field988 = 0;
    int field989 = -1;
    int field990;
    int field991 = 0;
    int field992;
    int field993 = -1;
    int field994;
    int field995 = -1;
    int field997;
    int field999 = 0;
    int[] field1012 = new int[10];
    int[] field943 = new int[4];
    int[] field945 = new int[10];
    int[] field947 = null;
    int[] field961 = new int[4];
    int[] field970 = new int[4];
    int[] field972 = new int[4];
    int[] field973 = new int[4];
    String field971 = null;

    class102() {
    }

    static final void method2083(class92 var0, boolean var1) {
        int var3 = var0.field853;
        int var4 = (int) var0.field4816;
        var0.method8116();
        if (var1 && var3 != -1 && class332.field3674[var3]) {
            class96.field885.method6396(var3);
            if (null != class96.field884[var3]) {
                for (int var5 = 0; var5 < class96.field884[var3].length; ++var5) {
                    if (null != class96.field884[var3][var5]) {
                        class96.field884[var3][var5] = null;
                    }
                }

                class96.field884[var3] = null;
                class332.field3674[var3] = false;
            }
        }

        for (class492 var6 = (class492) Client.field1647.method8186(); var6 != null; var6 = (class492) Client.field1647.method8194()) {
            if ((var6.field4816 >> 48 & 65535L) == (long) var3) {
                var6.method8116();
            }
        }

        class332 var7 = class332.method3765(var4);
        if (null != var7) {
            Client.method3898(var7);
        }

        if (Client.field1600 != -1) {
            Client.method1839(Client.field1600, 1);
        }

    }

    final void method2081() {
        this.field1010 = 0;
        this.field1015 = 0;
    }

    boolean method2065() {
        return false;
    }

    final void method2066(int var1, int var2, int var3, int var4, int var5, int var6) {
        boolean var8 = true;
        boolean var9 = true;

        int var10;
        for (var10 = 0; var10 < 4; ++var10) {
            if (this.field961[var10] > var5) {
                var8 = false;
            } else {
                var9 = false;
            }
        }

        var10 = -1;
        int var11 = -1;
        int var12 = 0;
        if (var1 >= 0) {
            class193 var13 = class193.method3287(var1);
            var11 = var13.field2120;
            var12 = var13.field2112;
        }

        int var15;
        if (var9) {
            if (var11 == -1) {
                return;
            }

            var10 = 0;
            var15 = 0;
            if (var11 == 0) {
                var15 = this.field961[0];
            } else if (var11 == 1) {
                var15 = this.field970[0];
            }

            for (int var14 = 1; var14 < 4; ++var14) {
                if (var11 == 0) {
                    if (this.field961[var14] < var15) {
                        var10 = var14;
                        var15 = this.field961[var14];
                    }
                } else if (var11 == 1 && this.field970[var14] < var15) {
                    var10 = var14;
                    var15 = this.field970[var14];
                }
            }

            if (var11 == 1 && var15 >= var2) {
                return;
            }
        } else {
            if (var8) {
                this.field967 = 0;
            }

            for (var15 = 0; var15 < 4; ++var15) {
                byte var16 = this.field967;
                this.field967 = (byte) ((this.field967 + 1) % 4);
                if (this.field961[var16] <= var5) {
                    var10 = var16;
                    break;
                }
            }
        }

        if (var10 >= 0) {
            this.field943[var10] = var1;
            this.field970[var10] = var2;
            this.field972[var10] = var3;
            this.field973[var10] = var4;
            this.field961[var10] = var12 + var5 + var6;
        }
    }

    final void method2067(int var1, int var2, int var3, int var4, int var5, int var6) {
        class183 var9 = (class183) class183.field1889.method5643(var1);
        class183 var8;
        if (null != var9) {
            var8 = var9;
        } else {
            byte[] var10 = class183.field1891.method6381(33, var1);
            var9 = new class183();
            var9.field1896 = var1;
            if (var10 != null) {
                var9.method3433(new class519(var10));
            }

            class183.field1889.method5640(var9, var1);
            var8 = var9;
        }

        class100 var15 = null;
        class100 var11 = null;
        int var12 = var8.field1894;
        int var13 = 0;

        class100 var14;
        for (var14 = (class100) this.field946.method6847(); null != var14; var14 = (class100) this.field946.method6849()) {
            ++var13;
            if (var8.field1896 == var14.field925.field1896) {
                var14.method2053(var4 + var2, var5, var6, var3);
                return;
            }

            if (var14.field925.field1893 <= var8.field1893) {
                var15 = var14;
            }

            if (var14.field925.field1894 > var12) {
                var11 = var14;
                var12 = var14.field925.field1894;
            }
        }

        if (var11 != null || var13 < 4) {
            var14 = new class100(var8);
            if (null == var15) {
                this.field946.method6845(var14);
            } else {
                class382.method6846(var14, var15);
            }

            var14.method2053(var2 + var4, var5, var6, var3);
            if (var13 >= 4) {
                var11.method8116();
            }

        }
    }

    final void method2068(int var1) {
        class183 var4 = (class183) class183.field1889.method5643(var1);
        class183 var3;
        if (null != var4) {
            var3 = var4;
        } else {
            byte[] var5 = class183.field1891.method6381(33, var1);
            var4 = new class183();
            var4.field1896 = var1;
            if (null != var5) {
                var4.method3433(new class519(var5));
            }

            class183.field1889.method5640(var4, var1);
            var3 = var4;
        }

        for (class100 var6 = (class100) this.field946.method6847(); var6 != null; var6 = (class100) this.field946.method6849()) {
            if (var3 == var6.field925) {
                var6.method8116();
                return;
            }
        }

    }

    void method2080(int var1, int var2, int var3, int var4) {
        int var6 = var4 + Client.field1445;
        class521 var7 = (class521) this.field944.method8096(var1);
        if (var7 != null) {
            var7.method8116();
            --this.field991;
        }

        if (var2 != 65535 && var2 != -1) {
            byte var8 = 0;
            if (var4 > 0) {
                var8 = -1;
            }

            this.field944.method8097(new class521(var2, var3, var6, var8), var1);
            ++this.field991;
        }
    }

    class469 method2069() {
        return this.field944;
    }

    void method2090() {
        class491 var2 = new class491(this.field944);

        for (class521 var3 = (class521) var2.method8449(); null != var3; var3 = (class521) var2.next()) {
            var3.method8116();
        }

        this.field991 = 0;
    }

    class249 method2072(class249 var1) {
        if (this.field991 == 0) {
            return var1;
        } else {
            class491 var3 = new class491(this.field944);
            int var4 = var1.field2795;
            int var5 = var1.field2750;
            int var6 = var1.field2741;
            byte var7 = var1.field2729;

            for (class521 var8 = (class521) var3.method8449(); var8 != null; var8 = (class521) var3.next()) {
                if (-1 != var8.field5135) {
                    class249 var9 = class205.method3634(var8.field5136).method3858();
                    if (null != var9) {
                        var4 += var9.field2795;
                        var5 += var9.field2750;
                        var6 += var9.field2741;
                    }
                }
            }

            class249 var11 = new class249(var4, var5, var6, var7);
            var11.method4775(var1);

            for (class521 var12 = (class521) var3.method8449(); null != var12; var12 = (class521) var3.next()) {
                if (-1 != var12.field5135) {
                    class249 var10 = class205.method3634(var12.field5136).method3857(var12.field5135);
                    if (null != var10) {
                        var10.method4830(0, -var12.field5133, 0);
                        var11.method4775(var10);
                    }
                }
            }

            return var11;
        }
    }

    void method2073() {
        this.field980 = false;
        this.field977 = -1;
        this.field978 = -1;
        this.field979 = -1;
    }
}
