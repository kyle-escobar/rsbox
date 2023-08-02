public class class252 {
   public static boolean field2835 = false;
   public static boolean field2842 = false;
   public static int field2836 = 0;
   public static int field2837 = 0;
   public static int field2838 = 0;
   public static long[] field2843 = new long[1000];
   public static short[] field2847;
   static int field2839;
   static int field2840;
   static int field2841;

   class252() throws Throwable {
   }

   public static int method8084() {
      return field2838;
   }

   public static int method6950(int var0) {
      return method6178(field2843[var0]);
   }

   static int method6178(long var0) {
      return (int)(var0 >>> 0 & 127L);
   }

   public static int method3572(long var0) {
      return (int)(var0 >>> 7 & 127L);
   }

   public static int method110(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }

   public static int method7841(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static long method7702(int var0, int var1, int var2, boolean var3, int var4) {
      long var6 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
      if (var3) {
         var6 |= 65536L;
      }

      return var6;
   }

   static final boolean method2063() {
      return field2842;
   }

   static final void method308() {
      if (!field2835) {
         int var1 = class234.field2573;
         int var2 = class234.field2574;
         int var3 = class234.field2575;
         int var4 = class234.field2609;
         byte var5 = 50;
         short var6 = 3500;
         int var7 = (field2836 - class229.method4282()) * var5 / class229.method4288();
         int var8 = (field2837 - class229.method4283()) * var5 / class229.method4288();
         int var9 = (field2836 - class229.method4282()) * var6 / class229.method4288();
         int var10 = (field2837 - class229.method4283()) * var6 / class229.method4288();
         int var12 = var8 * var2 + var1 * var5 >> 16;
         int var13 = var5 * var2 - var8 * var1 >> 16;
         int var14 = var2 * var10 + var6 * var1 >> 16;
         int var15 = var6 * var2 - var10 * var1 >> 16;
         int var16 = var7 * var4 - var3 * var13 >> 16;
         int var17 = var3 * var7 + var4 * var13 >> 16;
         int var18 = var9 * var4 - var15 * var3 >> 16;
         int var19 = var15 * var4 + var9 * var3 >> 16;
         field2839 = (var16 + var18) / 2;
         field2840 = (var14 + var12) / 2;
         class150.field1382 = (var19 + var17) / 2;
         class533.field5189 = (var18 - var16) / 2;
         field2841 = (var14 - var12) / 2;
         class147.field1365 = (var19 - var17) / 2;
         class98.field917 = Math.abs(class533.field5189);
         class146.field1364 = Math.abs(field2841);
         class380.field4383 = Math.abs(class147.field1365);
      }
   }

   static final boolean method5838(class249 var0, int var1, int var2, int var3, int var4) {
      if (!method2063()) {
         return false;
      } else {
         method308();
         class214 var6 = (class214)var0.field2755.get(var1);
         int var7 = var2 + var6.field2326;
         int var8 = var6.field2324 + var3;
         int var9 = var6.field2323 + var4;
         int var10 = var6.field2325;
         int var11 = var6.field2327;
         int var12 = var6.field2328;
         int var13 = field2839 - var7;
         int var14 = field2840 - var8;
         int var15 = class150.field1382 - var9;
         if (Math.abs(var13) > var10 + class98.field917) {
            return false;
         } else if (Math.abs(var14) > class146.field1364 + var11) {
            return false;
         } else if (Math.abs(var15) > var12 + class380.field4383) {
            return false;
         } else if (Math.abs(field2841 * var15 - var14 * class147.field1365) > class380.field4383 * var11 + class146.field1364 * var12) {
            return false;
         } else if (Math.abs(var13 * class147.field1365 - var15 * class533.field5189) > var12 * class98.field917 + var10 * class380.field4383) {
            return false;
         } else {
            return Math.abs(class533.field5189 * var14 - field2841 * var13) <= var10 * class146.field1364 + var11 * class98.field917;
         }
      }
   }
}
