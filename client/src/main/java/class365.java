public final class class365 {
   public static final char[] field4332 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   static byte[][] field4331;
   static long[] field4334 = new long[12];

   static {
      for(int var0 = 0; var0 < field4334.length; ++var0) {
         field4334[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   class365() throws Throwable {
   }

   public static String method3380(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = field4332[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static final void method6639(class102 var0) {
      int var3;
      int var4;
      int var5;
      int var7;
      if (var0.field975 != -1) {
         Object var2 = null;
         var3 = 65536;
         if (var0.field975 < var3) {
            var2 = Client.field1489[var0.field975];
         } else {
            var2 = Client.field1527[var0.field975 - var3];
         }

         if (var2 != null) {
            var4 = var0.field949 - ((class102)var2).field949;
            var5 = var0.field963 - ((class102)var2).field963;
            if (var4 != 0 || var5 != 0) {
               var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167) & 2047;
               var0.field1007 = var7;
            }
         } else if (var0.field976) {
            var0.field975 = -1;
            var0.field976 = false;
         }
      }

      int var8;
      if (0 == var0.field1010 || var0.field1014 > 0) {
         var8 = -1;
         if (-1 != var0.field978 && -1 != var0.field979) {
            var3 = 64 + (var0.field978 * 128 - class342.field3837 * 128);
            var4 = 64 + (var0.field979 * 128 - class144.field1352 * 128);
            var5 = var0.field949 - var3;
            int var6 = var0.field963 - var4;
            if (var5 != 0 || var6 != 0) {
               var7 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167) & 2047;
               var8 = var7;
            }
         } else if (-1 != var0.field977) {
            var8 = var0.field977;
         }

         if (var8 != -1) {
            var0.field1007 = var8;
            if (var0.field980) {
               var0.field942 = var0.field1007;
            }
         }

         var0.method2073();
      }

      var8 = var0.field1007 - var0.field942 & 2047;
      if (var8 != 0) {
         boolean var9 = true;
         boolean var10 = true;
         ++var0.field1008;
         var5 = var8 > 1024 ? -1 : 1;
         var0.field942 += var5 * var0.field1009;
         boolean var11 = true;
         if (var8 < var0.field1009 || var8 > 2048 - var0.field1009) {
            var0.field942 = var0.field1007;
            var11 = false;
         }

         if (var0.field1009 > 0 && var0.field989 == var0.field1013 && (var0.field1008 > 25 || var11)) {
            if (var5 == -1 && -1 != var0.field995) {
               var0.field1013 = var0.field995;
            } else if (var5 == 1 && var0.field948 != -1) {
               var0.field1013 = var0.field948;
            } else {
               var0.field1013 = var0.field993;
            }
         }

         var0.field942 &= 2047;
      } else {
         if (var0.field976) {
            var0.field975 = -1;
            var0.field976 = false;
         }

         var0.field1008 = 0;
      }

   }
}
