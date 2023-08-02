import java.awt.Image;

public class class468 {
   public static int[] field4798;
   static int field4805;
   static int[] field4803 = new int['\u8000'];
   static Image field4804;

   static {
      for(int var0 = 0; var0 < 32768; ++var0) {
         field4803[var0] = method8089(var0);
      }

      method8085();
   }

   class468() throws Throwable {
   }

   static final int method8089(int var0) {
      double var2 = (double)(var0 >> 10 & 31) / 31.0;
      double var4 = (double)(var0 >> 5 & 31) / 31.0;
      double var6 = (double)(var0 & 31) / 31.0;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0;
      double var14 = 0.0;
      double var16 = (var8 + var10) / 2.0;
      if (var8 != var10) {
         if (var16 < 0.5) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5) {
            var14 = (var10 - var8) / (2.0 - var10 - var8);
         }

         if (var10 == var2) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0;
         } else if (var10 == var6) {
            var12 = 4.0 + (var2 - var4) / (var10 - var8);
         }
      }

      int var18 = (int)(var12 * 256.0 / 6.0);
      var18 &= 255;
      double var19 = var14 * 256.0;
      if (var19 < 0.0) {
         var19 = 0.0;
      } else if (var19 > 255.0) {
         var19 = 255.0;
      }

      if (var16 > 0.7) {
         var19 /= 2.0;
         var19 = Math.floor(var19);
      }

      if (var16 > 0.75) {
         var19 /= 2.0;
         var19 = Math.floor(var19);
      }

      if (var16 > 0.85) {
         var19 /= 2.0;
         var19 = Math.floor(var19);
      }

      if (var16 > 0.95) {
         var19 /= 2.0;
         var19 = Math.floor(var19);
      }

      if (var16 > 0.995) {
         var16 = 0.995;
      }

      int var21 = (int)((double)(var18 / 4 * 8) + var19 / 32.0);
      return (var21 << 7) + (int)(var16 * 128.0);
   }

   static void method8085() {
      if (null == field4798) {
         field4798 = new int[65536];
         double var1 = 0.949999988079071;

         for(int var3 = 0; var3 < 65536; ++var3) {
            double var4 = (double)(var3 >> 10 & 63) / 64.0 + 0.0078125;
            double var6 = (double)(var3 >> 7 & 7) / 8.0 + 0.0625;
            double var8 = (double)(var3 & 127) / 128.0;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (0.0 != var6) {
               double var16;
               if (var8 < 0.5) {
                  var16 = var8 * (var6 + 1.0);
               } else {
                  var16 = var6 + var8 - var8 * var6;
               }

               double var18 = var8 * 2.0 - var16;
               double var20 = var4 + 0.3333333333333333;
               if (var20 > 1.0) {
                  --var20;
               }

               double var24 = var4 - 0.3333333333333333;
               if (var24 < 0.0) {
                  ++var24;
               }

               if (var20 * 6.0 < 1.0) {
                  var10 = var18 + var20 * 6.0 * (var16 - var18);
               } else if (var20 * 2.0 < 1.0) {
                  var10 = var16;
               } else if (var20 * 3.0 < 2.0) {
                  var10 = var18 + 6.0 * (0.6666666666666666 - var20) * (var16 - var18);
               } else {
                  var10 = var18;
               }

               if (var4 * 6.0 < 1.0) {
                  var12 = var18 + var4 * (var16 - var18) * 6.0;
               } else if (var4 * 2.0 < 1.0) {
                  var12 = var16;
               } else if (var4 * 3.0 < 2.0) {
                  var12 = (var16 - var18) * (0.6666666666666666 - var4) * 6.0 + var18;
               } else {
                  var12 = var18;
               }

               if (var24 * 6.0 < 1.0) {
                  var14 = 6.0 * (var16 - var18) * var24 + var18;
               } else if (var24 * 2.0 < 1.0) {
                  var14 = var16;
               } else if (var24 * 3.0 < 2.0) {
                  var14 = (var16 - var18) * (0.6666666666666666 - var24) * 6.0 + var18;
               } else {
                  var14 = var18;
               }
            }

            var10 = Math.pow(var10, var1);
            var12 = Math.pow(var12, var1);
            var14 = Math.pow(var14, var1);
            int var26 = (int)(var10 * 256.0);
            int var17 = (int)(var12 * 256.0);
            int var27 = (int)(var14 * 256.0);
            int var19 = var27 + (var26 << 16) + (var17 << 8);
            field4798[var3] = var19 & 16777215;
         }

      }
   }

   public static int method8086(int var0) {
      return 255 - (var0 & 255);
   }
}
