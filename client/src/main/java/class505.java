public class class505 extends class476 {
    static class290 field5065 = new class290(64);
    static class342 field5069;
    static class523[] field5067;
    public int[][] field5066;
    public Object[][] field5068;

    class505() {
    }

    public static void method7056(class342 var0) {
        field5069 = var0;
    }

    public static class505 method7608(int var0) {
        class505 var2 = (class505) field5065.method5643(var0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field5069.method6381(39, var0);
            var2 = new class505();
            if (var3 != null) {
                var2.method8572(new class519(var3));
            }

            var2.method8571();
            field5065.method5640(var2, var0);
            return var2;
        }
    }

    public static void method1546() {
        field5065.method5637();
    }

    void method8572(class519 var1) {
        while (true) {
            int var3 = var1.method8748();
            if (var3 == 0) {
                return;
            }

            this.method8573(var1, var3);
        }
    }

    void method8573(class519 var1, int var2) {
        if (var2 == 1) {
            int var4 = var1.method8748();
            if (null == this.field5066) {
                this.field5066 = new int[var4][];
            }

            for (int var5 = var1.method8748(); var5 != 255; var5 = var1.method8748()) {
                int var6 = var5 & 127;
                boolean var7 = (var5 & 128) != 0;
                int[] var8 = new int[var1.method8748()];

                for (int var9 = 0; var9 < var8.length; ++var9) {
                    var8[var9] = var1.method8764();
                }

                this.field5066[var6] = var8;
                if (var7) {
                    if (this.field5068 == null) {
                        this.field5068 = new Object[this.field5066.length][];
                    }

                    this.field5068[var6] = class511.method302(var1, var8);
                }
            }
        }

    }

    void method8571() {
    }
}
