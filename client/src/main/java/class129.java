public class class129 extends class442 {
    final boolean field1217;

    public class129(boolean var1) {
        this.field1217 = var1;
    }

    int method2416(class417 var1, class417 var2) {
        if (var1.field4575 == Client.field1432 && Client.field1432 == var2.field4575) {
            return this.field1217 ? var1.method7542().method9154(var2.method7542()) : var2.method7542().method9154(var1.method7542());
        } else {
            return this.method7818(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.method2416((class417) var1, (class417) var2);
    }
}
