public class class134 extends class133 {
    // $FF: synthetic field
    final class148 this$0;
    String field1251;
    long field1250;

    class134(class148 var1) {
        this.this$0 = var1;
        this.field1250 = -1L;
        this.field1251 = null;
    }

    static int method2468(class497 var0) {
        int var2 = var0.method8483(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = var0.method8483(5);
        } else if (var2 == 2) {
            var3 = var0.method8483(8);
        } else {
            var3 = var0.method8483(11);
        }

        return var3;
    }

    void method2457(class519 var1) {
        if (var1.method8748() != 255) {
            --var1.field5129;
            this.field1250 = var1.method8755();
        }

        this.field1251 = var1.method8758();
    }

    void method2458(class154 var1) {
        var1.method2593(this.field1250, this.field1251, 0);
    }
}
