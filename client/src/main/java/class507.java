public class class507 implements class383 {
    public static final class507 field5071 = new class507(1, 1, Long.class, new class503());
    public static final class507 field5072 = new class507(2, 2, String.class, new class517());
    public static final class507 field5074 = new class507(0, 0, Integer.class, new class499());
    public final int field5073;
    public final int field5075;
    public final Class field5070;
    final class498 field5076;

    class507(int var1, int var2, Class var3, class498 var4) {
        this.field5075 = var1;
        this.field5073 = var2;
        this.field5070 = var3;
        this.field5076 = var4;
    }

    public static class507[] method8599() {
        return new class507[]{field5071, field5074, field5072};
    }

    public static class507 method8594(Class var0) {
        class507[] var2 = method8599();

        for (int var3 = 0; var3 < var2.length; ++var3) {
            class507 var4 = var2[var3];
            if (var4.field5070 == var0) {
                return var4;
            }
        }

        return null;
    }

    public static void method8600(Object var0, class519 var1) {
        Class var4 = var0.getClass();
        class507 var5 = method8594(var4);
        if (null == var5) {
            throw new IllegalArgumentException();
        } else {
            class498 var3 = var5.field5076;
            var3.method8513(var0, var1);
        }
    }

    public int method6917() {
        return this.field5073;
    }

    public Object method8596(class519 var1) {
        return this.field5076.method8512(var1);
    }
}
