public class class29 {
   class69[] field151 = new class69[10];
   int field150;
   int field153;

   class29(class519 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method8748();
         if (var3 != 0) {
            --var1.field5129;
            this.field151[var2] = new class69();
            this.field151[var2].method1425(var1);
         }
      }

      this.field150 = var1.method8750();
      this.field153 = var1.method8750();
   }

   public static class29 method434(class342 var0, int var1, int var2) {
      byte[] var3 = var0.method6381(var1, var2);
      return var3 == null ? null : new class29(new class519(var3));
   }

   public class35 method430() {
      byte[] var1 = this.method432();
      return new class35(22050, var1, this.field150 * 22050 / 1000, this.field153 * 22050 / 1000);
   }

   public final int method429() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field151[var2] != null && this.field151[var2].field552 / 20 < var1) {
            var1 = this.field151[var2].field552 / 20;
         }
      }

      if (this.field150 < this.field153 && this.field150 / 20 < var1) {
         var1 = this.field150 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field151[var2] != null) {
               class69 var10000 = this.field151[var2];
               var10000.field552 -= var1 * 20;
            }
         }

         if (this.field150 < this.field153) {
            this.field150 -= var1 * 20;
            this.field153 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method432() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field151[var2] != null && this.field151[var2].field539 + this.field151[var2].field552 > var1) {
            var1 = this.field151[var2].field539 + this.field151[var2].field552;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field151[var4] != null) {
               int var5 = this.field151[var4].field539 * 22050 / 1000;
               int var6 = this.field151[var4].field552 * 22050 / 1000;
               int[] var7 = this.field151[var4].method1420(var5, this.field151[var4].field539);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }
}
