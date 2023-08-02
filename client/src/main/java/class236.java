public class class236 implements class259 {
   class211[] field2623;
   class342 field2626;
   class368 field2621 = new class368();
   double field2620 = 1.0;
   int field2622;
   int field2624 = 0;
   int field2625 = 128;

   public class236(class342 var1, class342 var2, int var3, double var4, int var6) {
      this.field2626 = var2;
      this.field2622 = var3;
      this.field2624 = this.field2622;
      this.field2620 = var4;
      this.field2625 = var6;
      int[] var7 = var1.method6392(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.field2623 = new class211[var1.method6393(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            class519 var10 = new class519(var1.method6381(0, var7[var9]));
            this.field2623[var7[var9]] = new class211(var10);
         }
      } else {
         this.field2623 = new class211[0];
      }

   }

   public int method4585() {
      if (this.field2623.length == 0) {
         return 100;
      } else {
         int var2 = 0;
         int var3 = 0;
         class211[] var4 = this.field2623;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class211 var6 = var4[var5];
            if (null != var6 && var6.field2267 != null) {
               var2 += var6.field2267.length;
               int[] var7 = var6.field2267;

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  int var9 = var7[var8];
                  if (this.field2626.method6386(var9)) {
                     ++var3;
                  }
               }
            }
         }

         if (var2 == 0) {
            return 0;
         } else {
            return var3 * 100 / var2;
         }
      }
   }

   public void method4586(double var1) {
      this.field2620 = var1;
      this.method4598();
   }

   public int[] method5172(int var1) {
      class211 var3 = this.field2623[var1];
      if (null != var3) {
         if (var3.field2273 != null) {
            this.field2621.method6681(var3);
            var3.field2271 = true;
            return var3.field2273;
         }

         boolean var4 = var3.method3942(this.field2620, this.field2625, this.field2626);
         if (var4) {
            if (0 == this.field2624) {
               class211 var5 = (class211)this.field2621.method6688();
               var5.method3937();
            } else {
               --this.field2624;
            }

            this.field2621.method6681(var3);
            var3.field2271 = true;
            return var3.field2273;
         }
      }

      return null;
   }

   public int method5167(int var1) {
      return this.field2623[var1] != null ? this.field2623[var1].field2266 : 0;
   }

   public boolean method5168(int var1) {
      return this.field2623[var1].field2262;
   }

   public boolean method5169(int var1) {
      return 64 == this.field2625;
   }

   public void method4598() {
      for(int var2 = 0; var2 < this.field2623.length; ++var2) {
         if (this.field2623[var2] != null) {
            this.field2623[var2].method3937();
         }
      }

      this.field2621 = new class368();
      this.field2624 = this.field2622;
   }

   public void method4592(int var1) {
      for(int var3 = 0; var3 < this.field2623.length; ++var3) {
         class211 var4 = this.field2623[var3];
         if (var4 != null && var4.field2265 != 0 && var4.field2271) {
            var4.method3938(var1);
            var4.field2271 = false;
         }
      }

   }
}
