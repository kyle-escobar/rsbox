import java.util.HashMap;

public class class381 {
   class453 field4388 = new class453(0, 0);
   int field4389 = 0;
   int[] field4387 = new int[2048];
   int[] field4393 = new int[2048];
   final HashMap field4390 = new HashMap();

   public class381() {
      class235.field2616 = new int[2000];
      int var1 = 0;
      int var2 = 240;

      int var3;
      int var4;
      for(var3 = 12; var1 < 16; var2 -= var3) {
         var4 = class278.method6634((double)((float)var2 / 360.0F), 0.9998999834060669, (double)((float)var1 * 0.425F / 16.0F + 0.075F));
         class235.field2616[var1] = var4;
         ++var1;
      }

      var2 = 48;

      for(var3 = var2 / 6; var1 < class235.field2616.length; var2 -= var3) {
         var4 = var1 * 2;

         for(int var5 = class278.method6634((double)((float)var2 / 360.0F), 0.9998999834060669, 0.5); var1 < var4 && var1 < class235.field2616.length; ++var1) {
            class235.field2616[var1] = var5;
         }
      }

   }

   void method6820(int var1) {
      int var3 = var1 * 2 + 1;
      double var5 = (double)((float)var1 / 3.0F);
      int var7 = 1 + var1 * 2;
      double[] var8 = new double[var7];
      int var9 = -var1;

      for(int var10 = 0; var9 <= var1; ++var10) {
         var8[var10] = class444.method10((double)var9, 0.0, var5);
         ++var9;
      }

      double[] var4 = var8;
      double var15 = var8[var1] * var8[var1];
      int[] var16 = new int[var3 * var3];
      boolean var11 = false;

      for(int var12 = 0; var12 < var3; ++var12) {
         for(int var13 = 0; var13 < var3; ++var13) {
            int var14 = var16[var3 * var12 + var13] = (int)(256.0 * (var4[var13] * var4[var12] / var15));
            if (!var11 && var14 > 0) {
               var11 = true;
            }
         }
      }

      class523 var17 = new class523(var16, var3, var3);
      this.field4390.put(var1, var17);
   }

   class523 method6821(int var1) {
      if (!this.field4390.containsKey(var1)) {
         this.method6820(var1);
      }

      return (class523)this.field4390.get(var1);
   }

   public final void method6822(int var1, int var2) {
      if (this.field4389 < this.field4387.length) {
         this.field4387[this.field4389] = var1;
         this.field4393[this.field4389] = var2;
         ++this.field4389;
      }
   }

   public final void method6823() {
      this.field4389 = 0;
   }

   public final void method6824(int var1, int var2, class523 var3, float var4) {
      int var6 = (int)(var4 * 18.0F);
      class523 var7 = this.method6821(var6);
      int var8 = 1 + var6 * 2;
      class453 var9 = new class453(0, 0, var3.field5148, var3.field5153);
      class453 var10 = new class453(0, 0);
      this.field4388.method7916(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field4389; ++var11) {
         var12 = this.field4387[var11];
         var13 = this.field4393[var11];
         int var14 = (int)((float)(var12 - var1) * var4) - var6;
         int var15 = (int)((float)var3.field5153 - (float)(var13 - var2) * var4) - var6;
         this.field4388.method7915(var14, var15);
         this.field4388.method7928(var9, var10);
         this.method6825(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field5147.length; ++var11) {
         if (var3.field5147[var11] == 0) {
            var3.field5147[var11] = -16777216;
         } else {
            var12 = (var3.field5147[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field5147[var11] = -16777216;
            } else {
               if (var12 > class235.field2616.length) {
                  var12 = class235.field2616.length;
               }

               var13 = class235.field2616[var12 - 1];
               var3.field5147[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void method6825(class523 var1, class523 var2, class453 var3) {
      if (0 != var3.field4742 && 0 != var3.field4740) {
         int var5 = 0;
         int var6 = 0;
         if (0 == var3.field4741) {
            var5 = var1.field5148 - var3.field4742;
         }

         if (var3.field4739 == 0) {
            var6 = var1.field5153 - var3.field4740;
         }

         int var7 = var5 + var6 * var1.field5148;
         int var8 = var3.field4741 + var3.field4739 * var2.field5148;

         for(int var9 = 0; var9 < var3.field4740; ++var9) {
            for(int var10 = 0; var10 < var3.field4742; ++var10) {
               int[] var10000 = var2.field5147;
               int var10001 = var8++;
               var10000[var10001] += var1.field5147[var7++];
            }

            var7 += var1.field5148 - var3.field4742;
            var8 += var2.field5148 - var3.field4742;
         }

      }
   }
}
