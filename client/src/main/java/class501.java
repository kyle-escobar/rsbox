public final class class501 {
   static int[] field5053;

   class501() throws Throwable {
   }

   public static String method7095(byte[] var0, int var1, int var2) {
      char[] var4 = new char[var2];
      int var5 = 0;
      int var6 = var1;

      int var9;
      for(int var7 = var1 + var2; var6 < var7; var4[var5++] = (char)var9) {
         int var8 = var0[var6++] & 255;
         if (var8 < 128) {
            if (var8 == 0) {
               var9 = 65533;
            } else {
               var9 = var8;
            }
         } else if (var8 < 192) {
            var9 = 65533;
         } else if (var8 < 224) {
            if (var6 < var7 && 128 == (var0[var6] & 192)) {
               var9 = (var8 & 31) << 6 | var0[var6++] & 63;
               if (var9 < 128) {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         } else if (var8 < 240) {
            if (var6 + 1 < var7 && (var0[var6] & 192) == 128 && 128 == (var0[var6 + 1] & 192)) {
               var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if (var9 < 2048) {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         } else if (var8 < 248) {
            if (var6 + 2 < var7 && (var0[var6] & 192) == 128 && (var0[var6 + 1] & 192) == 128 && (var0[var6 + 2] & 192) == 128) {
               var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if (var9 >= 65536 && var9 <= 1114111) {
                  var9 = 65533;
               } else {
                  var9 = 65533;
               }
            } else {
               var9 = 65533;
            }
         } else {
            var9 = 65533;
         }
      }

      return new String(var4, 0, var5);
   }
}
