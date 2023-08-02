public final class class296 {
    class268 field3138;
    class390 field3137;
    class469 field3134;
    int field3135;
    int field3136;

    public class296(int var1) {
        this(var1, var1);
    }

    public class296(int var1, int var2) {
        this.field3137 = new class390();
        this.field3136 = var1;
        this.field3135 = var1;

        int var3;
        for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
        }

        this.field3134 = new class469(var3);
    }

    public Object method5665(long var1) {
        class287 var3 = (class287) this.field3134.method8096(var1);
        if (var3 == null) {
            return null;
        } else {
            Object var4 = var3.method5457();
            if (var4 == null) {
                var3.method8116();
                var3.method8161();
                this.field3135 += var3.field3068;
                return null;
            } else {
                if (var3.method5458()) {
                    class295 var5 = new class295(var4, var3.field3068);
                    this.field3134.method8097(var5, var3.field4816);
                    this.field3137.method6965(var5);
                    var5.field4850 = 0L;
                    var3.method8116();
                    var3.method8161();
                } else {
                    this.field3137.method6965(var3);
                    var3.field4850 = 0L;
                }

                return var4;
            }
        }
    }

    void method5661(long var1) {
        class287 var3 = (class287) this.field3134.method8096(var1);
        this.method5671(var3);
    }

    void method5671(class287 var1) {
        if (var1 != null) {
            var1.method8116();
            var1.method8161();
            this.field3135 += var1.field3068;
        }

    }

    public void method5663(Object var1, long var2) {
        this.method5664(var1, var2, 1);
    }

    public void method5664(Object var1, long var2, int var4) {
        if (var4 > this.field3136) {
            throw new IllegalStateException();
        } else {
            this.method5661(var2);
            this.field3135 -= var4;

            while (this.field3135 < 0) {
                class287 var5 = (class287) this.field3137.method6974();
                if (var5 == null) {
                    throw new RuntimeException("");
                }

                if (!var5.method5458()) {
                }

                this.method5671(var5);
                if (this.field3138 != null) {
                    this.field3138.method5248(var5.method5457());
                }
            }

            class295 var6 = new class295(var1, var4);
            this.field3134.method8097(var6, var2);
            this.field3137.method6965(var6);
            var6.field4850 = 0L;
        }
    }

    public void method5659(int var1) {
        for (class287 var2 = (class287) this.field3137.method6967(); var2 != null; var2 = (class287) this.field3137.method6969()) {
            if (var2.method5458()) {
                if (var2.method5457() == null) {
                    var2.method8116();
                    var2.method8161();
                    this.field3135 += var2.field3068;
                }
            } else if (++var2.field4850 > (long) var1) {
                class304 var3 = new class304(var2.method5457(), var2.field3068);
                this.field3134.method8097(var3, var2.field4816);
                class390.method6972(var3, var2);
                var2.method8116();
                var2.method8161();
            }
        }

    }

    public void method5666() {
        this.field3137.method6964();
        this.field3134.method8098();
        this.field3135 = this.field3136;
    }
}
