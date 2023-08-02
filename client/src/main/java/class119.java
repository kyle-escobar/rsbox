import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class119 {
    static final class390 field1136 = new class390();
    static final class469 field1135 = new class469(1024);
    static final Map field1137 = new HashMap();
    static int field1138 = 0;

    class119() throws Throwable {
    }

    static int method7714() {
        return ++field1138 - 1;
    }

    static void method7274(int var0, String var1, String var2) {
        method4130(var0, var1, var2, null);
    }

    static void method4130(int var0, String var1, String var2, String var3) {
        class85 var5 = (class85) field1137.get(var0);
        if (null == var5) {
            var5 = new class85();
            field1137.put(var0, var5);
        }

        class76 var6 = var5.method1840(var0, var1, var2, var3);
        field1135.method8097(var6, var6.field625);
        field1136.method6965(var6);
        Client.field1633 = Client.field1624;
    }

    static class76 method1962(int var0, int var1) {
        class85 var3 = (class85) field1137.get(var0);
        return var3.method1828(var1);
    }

    static class76 method2285(int var0) {
        return (class76) field1135.method8096(var0);
    }

    static int method5748(int var0) {
        class85 var2 = (class85) field1137.get(var0);
        return var2 == null ? 0 : var2.method1827();
    }

    static void method503() {
        field1137.clear();
        field1135.method8098();
        field1136.method6964();
        field1138 = 0;
    }

    static void method2159() {
        Iterator var1 = field1135.iterator();

        while (var1.hasNext()) {
            class76 var2 = (class76) var1.next();
            var2.method1544();
        }

    }

    static int method6595(int var0) {
        class76 var2 = (class76) field1135.method8096(var0);
        if (var2 == null) {
            return -1;
        } else {
            return var2.field4849 == field1136.field4445 ? -1 : ((class76) var2.field4849).field625;
        }
    }
}
