public final class class393 extends class407 {
    public class393(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
        super(var1, var2, var3, var4, var5, var6, var7);
    }

    public class393(byte[] var1) {
        super(var1);
    }

    void method7182(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
        int var7 = var2 + var3 * class535.field5202;
        int var8 = class535.field5202 - var4;
        int var9 = 0;
        int var10 = 0;
        int var11;
        if (var3 < class535.field5206) {
            var11 = class535.field5206 - var3;
            var5 -= var11;
            var3 = class535.field5206;
            var10 += var11 * var4;
            var7 += var11 * class535.field5202;
        }

        if (var3 + var5 > class535.field5207) {
            var5 -= var3 + var5 - class535.field5207;
        }

        if (var2 < class535.field5208) {
            var11 = class535.field5208 - var2;
            var4 -= var11;
            var2 = class535.field5208;
            var10 += var11;
            var7 += var11;
            var9 += var11;
            var8 += var11;
        }

        if (var2 + var4 > class535.field5209) {
            var11 = var2 + var4 - class535.field5209;
            var4 -= var11;
            var9 += var11;
            var8 += var11;
        }

        if (var4 > 0 && var5 > 0) {
            method7249(class535.field5201, var1, var6, var10, var7, var4, var5, var8, var9);
        }
    }

    void method7183(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        int var8 = var2 + var3 * class535.field5202;
        int var9 = class535.field5202 - var4;
        int var10 = 0;
        int var11 = 0;
        int var12;
        if (var3 < class535.field5206) {
            var12 = class535.field5206 - var3;
            var5 -= var12;
            var3 = class535.field5206;
            var11 += var12 * var4;
            var8 += var12 * class535.field5202;
        }

        if (var3 + var5 > class535.field5207) {
            var5 -= var3 + var5 - class535.field5207;
        }

        if (var2 < class535.field5208) {
            var12 = class535.field5208 - var2;
            var4 -= var12;
            var2 = class535.field5208;
            var11 += var12;
            var8 += var12;
            var10 += var12;
            var9 += var12;
        }

        if (var2 + var4 > class535.field5209) {
            var12 = var2 + var4 - class535.field5209;
            var4 -= var12;
            var10 += var12;
            var9 += var12;
        }

        if (var4 > 0 && var5 > 0) {
            method7187(class535.field5201, var1, var6, var11, var8, var4, var5, var9, var10, var7);
        }
    }
}
