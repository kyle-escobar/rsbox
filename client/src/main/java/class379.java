public class class379 {
    static char[] field4377 = new char[64];
    static char[] field4378;
    static char[] field4381;
    static class363 field4382;
    static int field4380;
    static int[] field4379;

    static {
        int var0;
        for (var0 = 0; var0 < 26; ++var0) {
            field4377[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field4377[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field4377[var0] = (char) (var0 + 48 - 52);
        }

        field4377[62] = '+';
        field4377[63] = '/';
        field4381 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field4381[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field4381[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field4381[var0] = (char) (var0 + 48 - 52);
        }

        field4381[62] = '*';
        field4381[63] = '-';
        field4378 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field4378[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field4378[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field4378[var0] = (char) (var0 + 48 - 52);
        }

        field4378[62] = '-';
        field4378[63] = '_';
        field4379 = new int[128];

        for (var0 = 0; var0 < field4379.length; ++var0) {
            field4379[var0] = -1;
        }

        for (var0 = 65; var0 <= 90; ++var0) {
            field4379[var0] = var0 - 65;
        }

        for (var0 = 97; var0 <= 122; ++var0) {
            field4379[var0] = 26 + (var0 - 97);
        }

        for (var0 = 48; var0 <= 57; ++var0) {
            field4379[var0] = 52 + (var0 - 48);
        }

        int[] var2 = field4379;
        field4379[43] = 62;
        var2[42] = 62;
        int[] var1 = field4379;
        field4379[47] = 63;
        var1[45] = 63;
    }

    class379() throws Throwable {
    }

    public static String method6576(byte[] var0) {
        int var3 = var0.length;
        StringBuilder var4 = new StringBuilder();

        for (int var5 = 0; var5 < var3; var5 += 3) {
            int var6 = var0[var5] & 255;
            var4.append(field4377[var6 >>> 2]);
            if (var5 < var3 - 1) {
                int var7 = var0[var5 + 1] & 255;
                var4.append(field4377[(var6 & 3) << 4 | var7 >>> 4]);
                if (var5 < var3 - 2) {
                    int var8 = var0[var5 + 2] & 255;
                    var4.append(field4377[(var7 & 15) << 2 | var8 >>> 6]).append(field4377[var8 & 63]);
                } else {
                    var4.append(field4377[(var7 & 15) << 2]).append("=");
                }
            } else {
                var4.append(field4377[(var6 & 3) << 4]).append("==");
            }
        }

        String var2 = var4.toString();
        return var2;
    }
}
