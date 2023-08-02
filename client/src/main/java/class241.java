public class class241 extends class282 {
    static int field2683;
    final class256 field2682;
    final int field2684;
    class261 field2680;
    int field2677;
    int field2679;
    int field2681;

    class241(class330 var1, class330 var2, int var3, class256 var4) {
        super(var1, var2);
        this.field2684 = var3;
        this.field2682 = var4;
        this.method4655();
    }

    void method4655() {
        this.field2679 = class98.method2042(this.field2684).method3456().field1933;
        this.field2680 = this.field2682.method5075(class197.method4100(this.field2679));
        class197 var2 = class197.method4100(this.method5405());
        class523 var3 = var2.method3771(false);
        if (null != var3) {
            this.field2681 = var3.field5148;
            this.field2677 = var3.field5153;
        } else {
            this.field2681 = 0;
            this.field2677 = 0;
        }

    }

    public int method5405() {
        return this.field2679;
    }

    class261 method5381() {
        return this.field2680;
    }

    int method5385() {
        return this.field2681;
    }

    int method5386() {
        return this.field2677;
    }
}
