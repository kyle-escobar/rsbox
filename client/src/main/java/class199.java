public class class199 extends class476 {
    public static class290 field2175 = new class290(64);
    public static class342 field2178;
    public int field2177;
    public String field2174;
    boolean field2179 = true;
    char field2176;

    class199() {
    }

    public static class199 method6362(int var0) {
        class199 var2 = (class199) field2175.method5643(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field2178.method6381(11, var0);
            var2 = new class199();
            if (var3 != null) {
                var2.method3812(new class519(var3));
            }

            var2.method3797();
            field2175.method5640(var2, var0);
            return var2;
        }
    }

    void method3797() {
    }

    void method3812(class519 var1) {
        while (true) {
            int var3 = var1.method8748();
            if (var3 == 0) {
                return;
            }

            this.method3799(var1, var3);
        }
    }

    void method3799(class519 var1, int var2) {
        if (var2 == 1) {
            this.field2176 = class389.method53(var1.method8768());
        } else if (var2 == 2) {
            this.field2177 = var1.method9000();
        } else if (var2 == 4) {
            this.field2179 = false;
        } else if (var2 == 5) {
            this.field2174 = var1.method8873();
        }

    }

    public boolean method3800() {
        return this.field2176 == 's';
    }
}
