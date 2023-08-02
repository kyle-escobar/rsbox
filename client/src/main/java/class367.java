public class class367 {
    public int field4337;
    public int field4338;
    public int field4339;
    public int field4340;
    public int field4341;
    byte field4342;

    public class367() {
    }

    public class367(class519 var1, boolean var2) {
        this.field4342 = var1.method8768();
        this.field4337 = var1.method8750();
        this.field4340 = var1.method9000();
        this.field4339 = var1.method9000();
        this.field4338 = var1.method9000();
        this.field4341 = var1.method9000();
        if (var2) {
            this.method6654(method78(var1));
        }

    }

    static Integer method78(class519 var0) {
        int var2 = 0;
        boolean var3 = false;

        while (true) {
            int var4 = var0.method8748();
            if (var4 == 255) {
                return var3 ? var2 : null;
            }

            if (var4 != 0) {
                throw new IllegalStateException("");
            }

            while (true) {
                int var5 = var0.method8748();
                if (var5 == 255) {
                    break;
                }

                --var0.field5129;
                if (var0.method8750() != 0) {
                    throw new IllegalStateException("");
                }

                if (var3) {
                    throw new IllegalStateException("");
                }

                var2 = var0.method9000();
                var3 = true;
            }
        }
    }

    void method6654(Integer var1) {
    }

    public int method6674() {
        return this.field4342 & 7;
    }

    public int method6656() {
        return (this.field4342 & 8) == 8 ? 1 : 0;
    }

    void method6663(int var1) {
        this.field4342 &= -8;
        this.field4342 = (byte) (this.field4342 | var1 & 7);
    }

    void method6653(int var1) {
        this.field4342 &= -9;
        if (var1 == 1) {
            this.field4342 = (byte) (this.field4342 | 8);
        }

    }
}
