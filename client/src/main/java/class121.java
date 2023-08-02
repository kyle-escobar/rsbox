public class class121 extends class442 {
    public static class381 field1152;
    final boolean field1151;

    public class121(boolean var1) {
        this.field1151 = var1;
    }

    int method2325(class417 var1, class417 var2) {
        if (0 != var1.field4575 && 0 != var2.field4575) {
            return this.field1151 ? var1.field4576 - var2.field4576 : var2.field4576 - var1.field4576;
        } else {
            return this.method7818(var1, var2);
        }
    }

    public int compare(Object var1, Object var2) {
        return this.method2325((class417) var1, (class417) var2);
    }
}
