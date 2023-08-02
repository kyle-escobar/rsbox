public class class100 extends class470 {
    class183 field925;
    class382 field927 = new class382();

    class100(class183 var1) {
        this.field925 = var1;
    }

    void method2053(int var1, int var2, int var3, int var4) {
        class94 var6 = null;
        int var7 = 0;

        for (class94 var8 = (class94) this.field927.method6847(); var8 != null; var8 = (class94) this.field927.method6849()) {
            ++var7;
            if (var8.field864 == var1) {
                var8.method1992(var1, var2, var3, var4);
                return;
            }

            if (var8.field864 <= var1) {
                var6 = var8;
            }
        }

        if (null == var6) {
            if (var7 < 4) {
                this.field927.method6845(new class94(var1, var2, var3, var4));
            }

        } else {
            class382.method6846(new class94(var1, var2, var3, var4), var6);
            if (var7 >= 4) {
                this.field927.method6847().method8116();
            }

        }
    }

    class94 method2047(int var1) {
        class94 var3 = (class94) this.field927.method6847();
        if (var3 != null && var3.field864 <= var1) {
            for (class94 var4 = (class94) this.field927.method6849(); var4 != null && var4.field864 <= var1; var4 = (class94) this.field927.method6849()) {
                var3.method8116();
                var3 = var4;
            }

            if (this.field925.field1895 + var3.field861 + var3.field864 > var1) {
                return var3;
            } else {
                var3.method8116();
                return null;
            }
        } else {
            return null;
        }
    }

    boolean method2048() {
        return this.field927.method6851();
    }
}
