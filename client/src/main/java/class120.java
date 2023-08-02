import java.util.concurrent.Callable;

public class class120 implements Callable {
    final class131 field1144;
    final class137 field1141;
    final class143 field1142;
    // $FF: synthetic field
    final class156 this$0;
    final int field1140;

    class120(class156 var1, class143 var2, class131 var3, class137 var4, int var5) {
        this.this$0 = var1;
        this.field1142 = var2;
        this.field1144 = var3;
        this.field1141 = var4;
        this.field1140 = var5;
    }

    public Object call() {
        this.field1142.method2522();
        class143[][] var1;
        if (class131.field1228 == this.field1144) {
            var1 = this.this$0.field1426;
        } else {
            var1 = this.this$0.field1424;
        }

        var1[this.field1140][this.field1141.method2482()] = this.field1142;
        return null;
    }
}
