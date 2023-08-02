public class class136 extends class163 {
    static class363 field1254;
    // $FF: synthetic field
    final class175 this$0;
    byte field1260;
    int field1256;
    int field1258;
    String field1257;

    class136(class175 var1) {
        this.this$0 = var1;
        this.field1256 = -1;
    }

    void method3248(class519 var1) {
        this.field1256 = var1.method8750();
        this.field1260 = var1.method8768();
        this.field1258 = var1.method8750();
        var1.method8755();
        this.field1257 = var1.method8873();
    }

    void method3255(class164 var1) {
        class152 var3 = (class152) var1.field1772.get(this.field1256);
        var3.field1391 = this.field1260;
        var3.field1388 = this.field1258;
        var3.field1389 = new class526(this.field1257);
    }
}
