public class class209 extends class476 {
   public static class290 field2251 = new class290(64);
   public static class342 field2253;
   public boolean field2256 = true;
   public int field2245;
   public int field2247 = 0;
   public int field2248 = -1;
   public int field2249;
   public int field2250 = -1;
   public int field2252;
   public int field2254;
   public int field2255;
   public int field2258;

   public static int method3916(CharSequence var0, CharSequence var1, class384 var2) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;
      char var9 = 0;

      int var10;
      int var11;
      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if (var6 - var8 >= var4) {
            return -1;
         }

         if (var7 - var9 >= var5) {
            return 1;
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         if (var9 != 0) {
            var11 = var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         var8 = class370.method2652((char)var10);
         var9 = class370.method2652((char)var11);
         var10 = class370.method1741((char)var10, var2);
         var11 = class370.method1741((char)var11, var2);
         if (var10 != var11 && Character.toUpperCase((char)var10) != Character.toUpperCase((char)var11)) {
            var10 = Character.toLowerCase((char)var10);
            var11 = Character.toLowerCase((char)var11);
            if (var10 != var11) {
               return class370.method1246((char)var10, var2) - class370.method1246((char)var11, var2);
            }
         }
      }

      var10 = Math.min(var4, var5);

      int var12;
      char var13;
      for(var11 = 0; var11 < var10; ++var11) {
         if (class384.field4410 == var2) {
            var6 = var4 - 1 - var11;
            var7 = var5 - 1 - var11;
         } else {
            var7 = var11;
            var6 = var11;
         }

         var12 = var0.charAt(var6);
         var13 = var1.charAt(var7);
         if (var13 != var12 && Character.toUpperCase((char)var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase((char)var12);
            var13 = Character.toLowerCase(var13);
            if (var13 != var12) {
               return class370.method1246((char)var12, var2) - class370.method1246(var13, var2);
            }
         }
      }

      var11 = var4 - var5;
      if (var11 != 0) {
         return var11;
      } else {
         for(var12 = 0; var12 < var10; ++var12) {
            var13 = var0.charAt(var12);
            char var14 = var1.charAt(var12);
            if (var13 != var14) {
               return class370.method1246(var13, var2) - class370.method1246(var14, var2);
            }
         }

         return 0;
      }
   }

   public static void method2479(class342 var0) {
      field2253 = var0;
   }

   public static class209 method2449(int var0) {
      class209 var2 = (class209)field2251.method5643((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field2253.method6381(4, var0);
         var2 = new class209();
         if (var3 != null) {
            var2.method3908(new class519(var3), var0);
         }

         var2.method3912();
         field2251.method5640(var2, (long)var0);
         return var2;
      }
   }

   public static void method7425() {
      field2251.method5637();
   }

   public void method3912() {
      if (-1 != this.field2250) {
         this.method3910(this.field2250);
         this.field2258 = this.field2249;
         this.field2255 = this.field2245;
         this.field2252 = this.field2254;
      }

      this.method3910(this.field2247);
   }

   public void method3908(class519 var1, int var2) {
      while(true) {
         int var4 = var1.method8748();
         if (var4 == 0) {
            return;
         }

         this.method3909(var1, var4, var2);
      }
   }

   void method3909(class519 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field2247 = var1.method8752();
      } else if (var2 == 2) {
         this.field2248 = var1.method8748();
      } else if (var2 == 5) {
         this.field2256 = false;
      } else if (var2 == 7) {
         this.field2250 = var1.method8752();
      } else if (var2 == 8) {
      }

   }

   void method3910(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0;
      double var5 = (double)(var1 >> 8 & 255) / 256.0;
      double var7 = (double)(var1 & 255) / 256.0;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0;
      double var15 = 0.0;
      double var17 = (var11 + var9) / 2.0;
      if (var11 != var9) {
         if (var17 < 0.5) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5) {
            var15 = (var11 - var9) / (2.0 - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = 2.0 + (var7 - var3) / (var11 - var9);
         } else if (var7 == var11) {
            var13 = 4.0 + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0;
      this.field2249 = (int)(var13 * 256.0);
      this.field2245 = (int)(var15 * 256.0);
      this.field2254 = (int)(var17 * 256.0);
      if (this.field2245 < 0) {
         this.field2245 = 0;
      } else if (this.field2245 > 255) {
         this.field2245 = 255;
      }

      if (this.field2254 < 0) {
         this.field2254 = 0;
      } else if (this.field2254 > 255) {
         this.field2254 = 255;
      }

   }
}
