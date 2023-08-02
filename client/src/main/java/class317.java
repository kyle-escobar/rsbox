public abstract class class317 {
    class317() {
    }

    public static Object method6363(byte[] var0, boolean var1) {
        if (var0 == null) {
            return null;
        } else if (var0.length > 136) {
            class354 var3 = new class354();
            var3.method5839(var0);
            return var3;
        } else if (var1) {
            int var4 = var0.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var0, 0, var5, 0, var4);
            return var5;
        } else {
            return var0;
        }
    }

    public static byte[] method2517(Object var0, boolean var1) {
        if (var0 == null) {
            return null;
        } else if (var0 instanceof byte[]) {
            byte[] var7 = (byte[]) var0;
            if (var1) {
                int var5 = var7.length;
                byte[] var6 = new byte[var5];
                System.arraycopy(var7, 0, var6, 0, var5);
                return var6;
            } else {
                return var7;
            }
        } else if (var0 instanceof class317) {
            class317 var3 = (class317) var0;
            return var3.method5849();
        } else {
            throw new IllegalArgumentException();
        }
    }

    abstract byte[] method5849();

    public abstract void method5839(byte[] var1);
}
