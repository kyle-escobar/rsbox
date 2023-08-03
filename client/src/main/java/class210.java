public class class210 {
   public static class225[] field2260;

   class210() throws Throwable {
   }

   public static class202 method3928(int var0) {
      class202 var2 = (class202)class202.field2191.method5643((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class202.field2192.method6381(34, var0);
         var2 = new class202();
         if (null != var3) {
            var2.method3824(new Buffer(var3));
         }

         var2.method3831();
         class202.field2191.method5640(var2, (long)var0);
         return var2;
      }
   }

   static final boolean method3301(int var0, int var1, class222 var2, class218 var3, class225 var4) {
      int var6 = var4.method4226();
      int var7 = var4.method4227();
      int[][] var8 = var4.method4250();
      int[][] var9 = var4.method4228();
      int[] var10 = var4.method4230();
      int[] var11 = var4.method4231();
      int var12 = var4.method4232();
      int var13 = var0;
      int var14 = var1;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var0 - var15;
      int var18 = var1 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      int var19 = 0;
      int var20 = 0;
      var10[var19] = var0;
      var11[var19++] = var1;
      int[][] var21 = var3.field2393;

      while(var20 != var19) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = var20 + 1 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - var3.field2397;
         int var23 = var14 - var3.field2392;
         if (var2.method4210(1, var13, var14, var3)) {
            var4.method4223(var13, var14);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && (var21[var22 - 1][var23] & 19136776) == 0) {
            var10[var19] = var13 - 1;
            var11[var19] = var14;
            var19 = var19 + 1 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 1 && 0 == var9[var15 + 1][var16] && 0 == (var21[var22 + 1][var23] & 19136896)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 19136770)) {
            var10[var19] = var13;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][var16 + 1] && (var21[var22][var23 + 1] & 19136800) == 0) {
            var10[var19] = var13;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][var16 + 1] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && 0 == (var21[var22 - 1][var23 - 1] & 19136782) && 0 == (var21[var22 - 1][var23] & 19136776) && (var21[var22][var23 - 1] & 19136770) == 0) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 1 && var16 > 0 && 0 == var9[var15 + 1][var16 - 1] && (var21[var22 + 1][var23 - 1] & 19136899) == 0 && (var21[var22 + 1][var23] & 19136896) == 0 && (var21[var22][var23 - 1] & 19136770) == 0) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 - 1;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 1 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][var23 + 1] & 19136824) == 0 && (var21[var22 - 1][var23] & 19136776) == 0 && (var21[var22][var23 + 1] & 19136800) == 0) {
            var10[var19] = var13 - 1;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 1 && var16 < var7 - 1 && 0 == var9[var15 + 1][var16 + 1] && (var21[var22 + 1][var23 + 1] & 19136992) == 0 && 0 == (var21[var22 + 1][var23] & 19136896) && 0 == (var21[var22][var23 + 1] & 19136800)) {
            var10[var19] = var13 + 1;
            var11[var19] = var14 + 1;
            var19 = var19 + 1 & var12;
            var9[var15 + 1][var16 + 1] = 12;
            var8[var15 + 1][var16 + 1] = var24;
         }
      }

      var4.method4223(var13, var14);
      return false;
   }
}
