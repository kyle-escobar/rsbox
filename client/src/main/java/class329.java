public class class329 {
   public static int[] field3576;
   public static int[] field3577;
   static int field3580;
   static int[] field3579 = new int[32];

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3579[var1] = var0 - 1;
         var0 += var0;
      }

      field3576 = new int[4000];
      field3577 = new int[4000];
   }

   class329() throws Throwable {
   }

   public static void method3291(int var0, int var1) {
      class196 var4 = (class196)class196.field2143.method5643((long)var0);
      class196 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class196.field2144.method6381(14, var0);
         var4 = new class196();
         if (var5 != null) {
            var4.method3754(new Buffer(var5));
         }

         class196.field2143.method5640(var4, (long)var0);
         var3 = var4;
      }

      int var9 = var3.field2142;
      int var6 = var3.field2140;
      int var7 = var3.field2141;
      int var8 = field3579[var7 - var6];
      if (var1 < 0 || var1 > var8) {
         var1 = 0;
      }

      var8 <<= var6;
      field3577[var9] = field3577[var9] & ~var8 | var1 << var6 & var8;
   }
}
