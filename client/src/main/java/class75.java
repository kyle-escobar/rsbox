public class class75 {
   boolean field621;
   boolean[] field624;
   class47 field622;
   int[] field620;
   int[] field623;

   class75(class47 var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      this.field622 = var1;
      this.field621 = var2;
      this.field620 = var3;
      this.field623 = var4;
      this.field624 = var5;
   }

   void method1528(float[] var1, int var2) {
      int var4 = this.field622.field337.length;
      class47 var10000 = this.field622;
      int var5 = class47.field338[this.field622.field334 - 1];
      boolean[] var6 = this.field624;
      this.field624[1] = true;
      var6[0] = true;

      int var7;
      int var8;
      int var9;
      int var10;
      int var11;
      for(var7 = 2; var7 < var4; ++var7) {
         var8 = this.field622.method1017(this.field620, var7);
         var9 = this.field622.method1013(this.field620, var7);
         var10 = this.field622.method1012(this.field620[var8], this.field623[var8], this.field620[var9], this.field623[var9], this.field620[var7]);
         var11 = this.field623[var7];
         int var12 = var5 - var10;
         int var14 = (var12 < var10 ? var12 : var10) << 1;
         if (var11 != 0) {
            boolean[] var15 = this.field624;
            this.field624[var9] = true;
            var15[var8] = true;
            this.field624[var7] = true;
            if (var11 >= var14) {
               this.field623[var7] = var12 > var10 ? var11 - var10 + var10 : var10 - var11 + var12 - 1;
            } else {
               this.field623[var7] = (var11 & 1) != 0 ? var10 - (var11 + 1) / 2 : var11 / 2 + var10;
            }
         } else {
            this.field624[var7] = false;
            this.field623[var7] = var10;
         }
      }

      this.method1539(0, var4 - 1);
      var7 = 0;
      var8 = this.field623[0] * this.field622.field334;

      for(var9 = 1; var9 < var4; ++var9) {
         if (this.field624[var9]) {
            var10 = this.field620[var9];
            var11 = this.field623[var9] * this.field622.field334;
            this.field622.method1015(var7, var8, var10, var11, var1, var2);
            if (var10 >= var2) {
               return;
            }

            var7 = var10;
            var8 = var11;
         }
      }

      var10000 = this.field622;
      float var17 = class47.field332[var8];

      for(var10 = var7; var10 < var2; ++var10) {
         var1[var10] *= var17;
      }

   }

   boolean method1532() {
      return this.field621;
   }

   void method1539(int var1, int var2) {
      if (var1 < var2) {
         int var4 = var1;
         int var5 = this.field620[var1];
         int var6 = this.field623[var1];
         boolean var7 = this.field624[var1];

         for(int var8 = var1 + 1; var8 <= var2; ++var8) {
            int var9 = this.field620[var8];
            if (var9 < var5) {
               this.field620[var4] = var9;
               this.field623[var4] = this.field623[var8];
               this.field624[var4] = this.field624[var8];
               ++var4;
               this.field620[var8] = this.field620[var4];
               this.field623[var8] = this.field623[var4];
               this.field624[var8] = this.field624[var4];
            }
         }

         this.field620[var4] = var5;
         this.field623[var4] = var6;
         this.field624[var4] = var7;
         this.method1539(var1, var4 - 1);
         this.method1539(var4 + 1, var2);
      }
   }
}
