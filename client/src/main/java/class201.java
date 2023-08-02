public class class201 {
    public boolean field2188 = false;
    public long field2184;
    int[] field2187;
    short[] field2186;
    short[] field2189;

    public class201(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
        this.field2184 = var1;
        this.field2187 = var3;
        this.field2186 = var4;
        this.field2189 = var5;
        this.field2188 = var6;
    }

    static float method3821(class143 var0, float var1) {
        if (null == var0) {
            return 0.0F;
        } else {
            float var3;
            if (var0.field1325 == var1) {
                var3 = 0.0F;
            } else if (var1 == var0.field1322) {
                var3 = 1.0F;
            } else {
                var3 = (var1 - var0.field1325) / (var0.field1322 - var0.field1325);
            }

            float var4;
            if (var0.field1330) {
                var4 = var3;
            } else {
                class130.field1220[3] = var0.field1337;
                class130.field1220[2] = var0.field1329;
                class130.field1220[1] = var0.field1328;
                class130.field1220[0] = var0.field1327 - var3;
                class130.field1225[0] = 0.0F;
                class130.field1225[1] = 0.0F;
                class130.field1225[2] = 0.0F;
                class130.field1225[3] = 0.0F;
                class130.field1225[4] = 0.0F;
                int var5 = class458.method8711(class130.field1220, 3, 0.0F, true, 1.0F, true, class130.field1225);
                if (var5 == 1) {
                    var4 = class130.field1225[0];
                } else {
                    var4 = 0.0F;
                }
            }

            return (var0.field1340 + (var0.field1333 + var4 * var0.field1324) * var4) * var4 + var0.field1331;
        }
    }
}
