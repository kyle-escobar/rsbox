public class class93 extends class470 {
   static class481 field858 = new class481(32);
   int[] field857 = new int[]{0};
   int[] field860 = new int[]{-1};

   class93() {
   }

   static int method5753(int var0, int var1) {
      class93 var3 = (class93)field858.get((long)var0);
      if (var3 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var3.field860.length ? var3.field860[var1] : -1;
      }
   }

   static int method8154(int var0, int var1) {
      class93 var3 = (class93)field858.get((long)var0);
      if (var3 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field857.length ? var3.field857[var1] : 0;
      }
   }

   static int method1586(int var0, int var1) {
      class93 var3 = (class93)field858.get((long)var0);
      if (null == var3) {
         return 0;
      } else if (var1 == -1) {
         return 0;
      } else {
         int var4 = 0;

         for(int var5 = 0; var5 < var3.field857.length; ++var5) {
            if (var3.field860[var5] == var1) {
               var4 += var3.field857[var5];
            }
         }

         return var4;
      }
   }

   static void method3491(int var0, int var1, int var2, int var3) {
      class93 var5 = (class93)field858.get((long)var0);
      if (var5 == null) {
         var5 = new class93();
         field858.put(var5, (long)var0);
      }

      if (var5.field860.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field860.length; ++var8) {
            var6[var8] = var5.field860[var8];
            var7[var8] = var5.field857[var8];
         }

         for(var8 = var5.field860.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field860 = var6;
         var5.field857 = var7;
      }

      var5.field860[var1] = var2;
      var5.field857[var1] = var3;
   }

   static void method1534(int var0) {
      class93 var2 = (class93)field858.get((long)var0);
      if (var2 != null) {
         var2.method8116();
      }
   }
}
