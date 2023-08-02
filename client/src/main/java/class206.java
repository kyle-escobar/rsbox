public class class206 extends class476 {
   public static class290 field2223 = new class290(64);
   public static int field2222;
   static class342 field2229;
   int[] field2225;
   int[] field2230 = new int[]{-1, -1, -1, -1, -1};
   short[] field2221;
   short[] field2226;
   short[] field2227;
   short[] field2228;
   public boolean field2234 = false;
   public int field2224 = -1;

   class206() {
   }

   public static void method2331(class342 var0, class342 var1) {
      class70.field577 = var0;
      field2229 = var1;
      field2222 = class70.field577.method6393(3);
   }

   public static class206 method2493(int var0) {
      class206 var2 = (class206)field2223.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class70.field577.method6381(3, var0);
         var2 = new class206();
         if (null != var3) {
            var2.method3872(new class519(var3));
         }

         field2223.method5640(var2, (long)var0);
         return var2;
      }
   }

   void method3872(class519 var1) {
      while(true) {
         int var3 = var1.method8748();
         if (var3 == 0) {
            return;
         }

         this.method3873(var1, var3);
      }
   }

   void method3873(class519 var1, int var2) {
      if (var2 == 1) {
         this.field2224 = var1.method8748();
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            var4 = var1.method8748();
            this.field2225 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2225[var5] = var1.method8750();
            }
         } else if (var2 == 3) {
            this.field2234 = true;
         } else if (var2 == 40) {
            var4 = var1.method8748();
            this.field2227 = new short[var4];
            this.field2221 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2227[var5] = (short)var1.method8750();
               this.field2221[var5] = (short)var1.method8750();
            }
         } else if (var2 == 41) {
            var4 = var1.method8748();
            this.field2228 = new short[var4];
            this.field2226 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2228[var5] = (short)var1.method8750();
               this.field2226[var5] = (short)var1.method8750();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field2230[var2 - 60] = var1.method8750();
         }
      }

   }

   public boolean method3874() {
      if (this.field2225 == null) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field2225.length; ++var3) {
            if (!field2229.method6464(this.field2225[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public class213 method3882() {
      if (null == this.field2225) {
         return null;
      } else {
         class213[] var2 = new class213[this.field2225.length];

         for(int var3 = 0; var3 < this.field2225.length; ++var3) {
            var2[var3] = class213.method3952(field2229, this.field2225[var3], 0);
         }

         class213 var5;
         if (1 == var2.length) {
            var5 = var2[0];
         } else {
            var5 = new class213(var2, var2.length);
         }

         int var4;
         if (null != this.field2227) {
            for(var4 = 0; var4 < this.field2227.length; ++var4) {
               var5.method3968(this.field2227[var4], this.field2221[var4]);
            }
         }

         if (this.field2228 != null) {
            for(var4 = 0; var4 < this.field2228.length; ++var4) {
               var5.method3969(this.field2228[var4], this.field2226[var4]);
            }
         }

         return var5;
      }
   }

   public boolean method3876() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (-1 != this.field2230[var3] && !field2229.method6464(this.field2230[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class213 method3878() {
      class213[] var2 = new class213[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (-1 != this.field2230[var4]) {
            var2[var3++] = class213.method3952(field2229, this.field2230[var4], 0);
         }
      }

      class213 var6 = new class213(var2, var3);
      int var5;
      if (this.field2227 != null) {
         for(var5 = 0; var5 < this.field2227.length; ++var5) {
            var6.method3968(this.field2227[var5], this.field2221[var5]);
         }
      }

      if (this.field2228 != null) {
         for(var5 = 0; var5 < this.field2228.length; ++var5) {
            var6.method3969(this.field2228[var5], this.field2226[var5]);
         }
      }

      return var6;
   }
}
