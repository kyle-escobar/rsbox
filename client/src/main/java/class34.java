import java.util.concurrent.ThreadPoolExecutor;

public class class34 {
   public static ThreadPoolExecutor field173;
   static class523 field170;
   static class62 field167;
   class342 field168;
   class342 field174;
   class481 field169;

   public class34(class342 var1, class342 var2) {
      new class481(256);
      this.field169 = new class481(256);
      this.field174 = var1;
      this.field168 = var2;
   }

   static class81 method520(byte[] var0) {
      class81 var2 = new class81();
      class519 var3 = new class519(var0);
      var3.field5129 = var3.field5127.length - 2;
      int var4 = var3.method8750();
      int var5 = var3.field5127.length - 2 - var4 - 12;
      var3.field5129 = var5;
      int var6 = var3.method9000();
      var2.field715 = var3.method8750();
      var2.field714 = var3.method8750();
      var2.field711 = var3.method8750();
      var2.field716 = var3.method8750();
      int var7 = var3.method8748();
      int var8;
      int var9;
      if (var7 > 0) {
         var2.field717 = var2.method1743(var7);

         for(var8 = 0; var8 < var7; ++var8) {
            var9 = var3.method8750();
            class469 var10 = new class469(var9 > 0 ? class311.method2196(var9) : 1);
            var2.field717[var8] = var10;

            while(var9-- > 0) {
               int var11 = var3.method9000();
               int var12 = var3.method9000();
               var10.method8097(new class492(var12), (long)var11);
            }
         }
      }

      var3.field5129 = 0;
      var2.field709 = var3.method8758();
      var2.field712 = new int[var6];
      var2.field713 = new int[var6];
      var2.field710 = new String[var6];

      for(var8 = 0; var3.field5129 < var5; var2.field712[var8++] = var9) {
         var9 = var3.method8750();
         if (var9 == 3) {
            var2.field710[var8] = var3.method8873();
         } else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
            var2.field713[var8] = var3.method9000();
         } else {
            var2.field713[var8] = var3.method8748();
         }
      }

      return var2;
   }

   static void method512(class332[] var0, class332 var1, boolean var2) {
      int var4 = 0 != var1.field3629 ? var1.field3629 : var1.field3598;
      int var5 = var1.field3719 != 0 ? var1.field3719 : var1.field3622;
      Client.method834(var0, var1.field3606, var4, var5, var2);
      if (var1.field3743 != null) {
         Client.method834(var1.field3743, var1.field3606, var4, var5, var2);
      }

      class92 var6 = (class92) Client.field1601.method8184((long)var1.field3606);
      if (var6 != null) {
         int var7 = var6.field853;
         if (class332.method1200(var7)) {
            Client.method834(class96.field884[var7], -1, var4, var5, var2);
         }
      }

      if (var1.field3631 == 1337) {
      }

   }

   class35 method502(int var1, int var2, int[] var3) {
      long var5 = this.method507(var1, var2, false);
      class58 var7 = (class58)this.field169.method8184(var5);
      if (null != var7) {
         return var7.method1183();
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         class29 var8 = class29.method434(this.field174, var1, var2);
         if (null == var8) {
            return null;
         } else {
            class35 var9 = var8.method430();
            this.field169.method8193(new class58(var9), var5);
            if (var3 != null) {
               var3[0] -= var9.field178.length;
            }

            return var9;
         }
      }
   }

   class58 method522(int var1, int var2) {
      long var4 = this.method507(var1, var2, true);
      class58 var6 = (class58)this.field169.method8184(var4);
      if (var6 != null) {
         return var6;
      } else {
         class78 var7 = class78.method1594(this.field168, var1, var2);
         if (var7 == null) {
            return new class58();
         } else {
            class58 var8 = new class58(var7);
            this.field169.method8193(var8, var4);
            return var8;
         }
      }
   }

   class35 method504(int var1, int[] var2) {
      if (this.field174.method6394() == 1) {
         return this.method502(0, var1, var2);
      } else if (this.field174.method6393(var1) == 1) {
         return this.method502(var1, 0, var2);
      } else {
         throw new RuntimeException();
      }
   }

   public class58 method514(int var1) {
      if (this.field168.method6394() == 1) {
         return this.method522(0, var1);
      } else if (this.field168.method6393(var1) == 1) {
         return this.method522(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public class35 method506(int var1) {
      return this.method504(var1, (int[])null);
   }

   long method507(int var1, int var2, boolean var3) {
      int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >> 12);
      var5 |= var1 << 16;
      return var3 ? (long)var5 ^ 4294967296L : (long)var5;
   }
}
