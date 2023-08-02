public class class311 {
   static class537[] field3469;
   static int[] field3470;

   static {
      new Object();
      field3470 = new int[33];
      field3470[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field3470[var1] = var0 - 1;
         var0 += var0;
      }

   }

   class311() throws Throwable {
   }

   public static int method4195(int var0, int var1) {
      int var3;
      for(var3 = 1; var1 > 1; var1 >>= 1) {
         if (0 != (var1 & 1)) {
            var3 *= var0;
         }

         var0 *= var0;
      }

      if (var1 == 1) {
         return var0 * var3;
      } else {
         return var3;
      }
   }

   public static int method4379(int var0) {
      return field3470[var0];
   }

   public static int method1770(int var0) {
      var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   public static int method598(int var0, int var1, int var2) {
      int var4 = method4379(1 + (var2 - var1));
      var4 <<= var1;
      return var0 & ~var4;
   }

   public static int method4046(int var0, int var1, int var2) {
      int var4 = method4379(var2 - var1 + 1);
      var4 <<= var1;
      var0 |= var4;
      return var0;
   }

   public static int method2196(int var0) {
      --var0;
      var0 |= var0 >>> 1;
      var0 |= var0 >>> 2;
      var0 |= var0 >>> 4;
      var0 |= var0 >>> 8;
      var0 |= var0 >>> 16;
      return var0 + 1;
   }

   public static int method5127(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var0 + var2;
   }

   public static int method5298(int var0, int var1) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   public static int method4376(int var0, int var1) {
      int var3 = var0 >>> 31;
      return (var3 + var0) / var1 - var3;
   }

   public static long method3213(int var0) {
      if (var0 > 63) {
         throw new class402("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0, (double)var0) - 1L;
      }
   }
}
