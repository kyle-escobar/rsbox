public class class139 extends class163 {
    static byte[][] field1290;
    // $FF: synthetic field
    final class175 this$0;
    byte field1292;
    int field1288;
    String field1289;

    class139(class175 var1) {
        this.this$0 = var1;
        this.field1289 = null;
    }

    void method3248(class519 var1) {
        if (var1.method8748() != 255) {
            --var1.field5129;
            var1.method8755();
        }

        this.field1289 = var1.method8758();
        this.field1288 = var1.method8750();
        this.field1292 = var1.method8768();
        var1.method8755();
    }

    void method3255(class164 var1) {
        class152 var3 = new class152();
        var3.field1389 = new class526(this.field1289);
        var3.field1388 = this.field1288;
        var3.field1391 = this.field1292;
        var1.method3260(var3);
    }
}
