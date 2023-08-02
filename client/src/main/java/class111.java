public class class111 extends class442 {
    final boolean field1075;

    public class111(boolean var1) {
        this.field1075 = var1;
    }

    int method2183(class417 var1, class417 var2) {
        if (var2.field4575 != var1.field4575) {
            return this.field1075 ? var1.field4575 - var2.field4575 : var2.field4575 - var1.field4575;
        } else {
            return this.method7818(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.method2183((class417) var1, (class417) var2);
    }
}
