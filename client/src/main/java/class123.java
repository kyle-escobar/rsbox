public class class123 extends class442 {
    final boolean field1173;

    public class123(boolean var1) {
        this.field1173 = var1;
    }

    int method2334(class417 var1, class417 var2) {
        if (Client.field1432 == var1.field4575) {
            if (var2.field4575 != Client.field1432) {
                return this.field1173 ? -1 : 1;
            }
        } else if (var2.field4575 == Client.field1432) {
            return this.field1173 ? 1 : -1;
        }

        return this.method7818(var1, var2);
    }

    public int compare(Object var1, Object var2) {
        return this.method2334((class417) var1, (class417) var2);
    }
}
