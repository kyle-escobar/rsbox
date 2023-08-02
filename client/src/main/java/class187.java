public class class187 extends class476 {
    public static class342 field2027;
    static class290 field2024 = new class290(64);
    public boolean field2026 = false;

    class187() {
    }

    public static class187 method2491(int var0) {
        class187 var2 = (class187) field2024.method5643(var0);
        if (null != var2) {
            return var2;
        } else {
            byte[] var3 = field2027.method6381(19, var0);
            var2 = new class187();
            if (null != var3) {
                var2.method3575(new class519(var3));
            }

            field2024.method5640(var2, var0);
            return var2;
        }
    }

    void method3575(class519 var1) {
        while (true) {
            int var3 = var1.method8748();
            if (var3 == 0) {
                return;
            }

            this.method3583(var1, var3);
        }
    }

    void method3583(class519 var1, int var2) {
        if (var2 == 2) {
            this.field2026 = true;
        }

    }
}
