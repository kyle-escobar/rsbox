public class class265 implements class383 {
   public static class50 field2956;
   public static short[][] field2961;
   static int field2959;
   static int field2960;
   static final class265 field2952 = new class265(1, (byte)0);
   static final class265 field2953 = new class265(0, (byte)1);
   static final class265 field2954 = new class265(3, (byte)2);
   static final class265 field2955 = new class265(2, (byte)3);
   final byte field2957;
   final int field2958;

   class265(int var1, byte var2) {
      this.field2958 = var1;
      this.field2957 = var2;
   }

   public static void method5209(class519 var0, int var1) {
      if (null != class160.field1755) {
         try {
            class160.field1755.method8669(0L);
            class160.field1755.method8683(var0.field5127, var1, 24);
         } catch (Exception var4) {
         }
      }

   }

   static void method5208(class84 var0, int var1, int var2) {
      if (var1 == var0.field968 && var1 != -1) {
         int var4 = class215.method2582(var1).field2346;
         if (var4 == 1) {
            var0.field986 = 0;
            var0.field987 = 0;
            var0.field988 = var2;
            var0.field957 = 0;
         }

         if (var4 == 2) {
            var0.field957 = 0;
         }
      } else if (var1 == -1 || -1 == var0.field968 || class215.method2582(var1).field2330 >= class215.method2582(var0.field968).field2330) {
         var0.field968 = var1;
         var0.field986 = 0;
         var0.field987 = 0;
         var0.field988 = var2;
         var0.field957 = 0;
         var0.field1015 = var0.field1010;
      }

   }

   static void method5207() {
      if (class121.field1152 != null) {
         Client.field1708 = Client.field1445;
         class121.field1152.method6823();

         for(int var1 = 0; var1 < Client.field1527.length; ++var1) {
            if (null != Client.field1527[var1]) {
               class121.field1152.method6822((Client.field1527[var1].field949 >> 7) + class342.field3837, (Client.field1527[var1].field963 >> 7) + class144.field1352);
            }
         }
      }

   }

   public int method6917() {
      return this.field2957;
   }
}
