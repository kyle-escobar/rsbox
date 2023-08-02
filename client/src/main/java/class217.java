public abstract class class217 extends class535 {
   boolean field2376 = false;
   boolean field2381 = false;
   class251 field2382;
   int[] field2378;

   class217(class251 var1) {
      this.field2378 = class229.field2514;
      this.field2382 = var1;
   }

   static int method4149(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   static final int method4162(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   abstract void method4138(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void method4137(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void method4139(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void method4152(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   void method4132(int[] var1, int var2, int var3, float[] var4) {
      method9241(var1, var2, var3, var4);
   }

   void method4135(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = method4149(var10, var13, var14, var15, var16);
      var11 = method4149(var11, var13, var14, var15, var16);
      var12 = method4149(var12, var13, var14, var15, var16);
      this.method4137(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   void method4140(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = method4149(var10, var11, var12, var13, var14);
      var10 = this.field2378[var15];
      this.method4138(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }
}
