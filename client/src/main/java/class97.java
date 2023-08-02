public class class97 {
   class537[] field893;
   int field889 = 0;
   int field894 = 0;
   int field897 = 0;
   int field898 = 0;
   int field903 = 0;
   int field905 = 0;
   int[] field886;
   int[] field891 = new int[256];
   int[] field892;
   int[] field895;
   int[] field896;
   int[] field899;
   int[] field900;
   int[] field901;
   int[] field904;

   class97(class537[] var1) {
      this.field893 = var1;
      this.method2022();
   }

   void method2022() {
      this.field900 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field900[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field900[var2 + 64] = 16711680 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field900[var2 + 128] = var2 * 4 + 16776960;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field900[var2 + 192] = 16777215;
      }

      this.field895 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field895[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field895[var2 + 64] = '\uff00' + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field895[var2 + 128] = '\uffff' + var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field895[var2 + 192] = 16777215;
      }

      this.field896 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field896[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field896[var2 + 64] = var2 * 262144 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field896[var2 + 128] = 16711935 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field896[var2 + 192] = 16777215;
      }

      this.field904 = new int[256];
      this.field903 = 0;
      this.field886 = new int['\u8000'];
      this.field892 = new int['\u8000'];
      this.method2012((class537)null);
      this.field899 = new int['\u8000'];
      this.field901 = new int['\u8000'];
   }

   void method2034() {
      this.field900 = null;
      this.field895 = null;
      this.field896 = null;
      this.field904 = null;
      this.field886 = null;
      this.field892 = null;
      this.field899 = null;
      this.field901 = null;
      this.field903 = 0;
      this.field889 = 0;
   }

   void method2029(int var1, int var2) {
      if (this.field899 == null) {
         this.method2022();
      }

      if (this.field905 == 0) {
         this.field905 = var2;
      }

      int var4 = var2 - this.field905;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.field905 = var2;
      if (var4 > 0) {
         this.method2007(var4);
      }

      this.method2003(var1);
   }

   final void method2007(int var1) {
      this.field903 += var1 * 128;
      int var3;
      if (this.field903 > this.field886.length) {
         this.field903 -= this.field886.length;
         var3 = (int)(Math.random() * 12.0);
         this.method2012(this.field893[var3]);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = 128 * (256 - var1);

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field899[var3 + var4] - var1 * this.field886[this.field903 + var3 & this.field886.length - 1] / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.field899[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = var8 * 128;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0);
            if (var11 < 50 && var10 > var16 && var10 < var7) {
               this.field899[var10 + var9] = 255;
            } else {
               this.field899[var9 + var10] = 0;
            }
         }
      }

      if (this.field897 > 0) {
         this.field897 -= var1 * 4;
      }

      if (this.field898 > 0) {
         this.field898 -= var1 * 4;
      }

      if (0 == this.field897 && 0 == this.field898) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (var8 == 0) {
            this.field897 = 1024;
         }

         if (var8 == 1) {
            this.field898 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field891[var8] = this.field891[var1 + var8];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field891[var8] = (int)(Math.sin((double)this.field894 / 14.0) * 16.0 + Math.sin((double)this.field894 / 15.0) * 14.0 + Math.sin((double)this.field894 / 16.0) * 12.0);
         ++this.field894;
      }

      this.field889 += var1;
      var8 = ((Client.field1445 & 1) + var1) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field889 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field899[var13 + (var14 << 7)] = 192;
         }

         this.field889 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var15 + var8 < 128) {
                  var13 += this.field899[var8 + var15 + var14];
               }

               if (var15 - (var8 + 1) >= 0) {
                  var13 -= this.field899[var14 + var15 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.field901[var14 + var15] = var13 / (1 + var8 * 2);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = var14 * 128;
               if (var8 + var14 < 256) {
                  var13 += this.field901[var12 + var15 + var8 * 128];
               }

               if (var14 - (var8 + 1) >= 0) {
                  var13 -= this.field901[var12 + var15 - 128 * (var8 + 1)];
               }

               if (var14 >= 0) {
                  this.field899[var12 + var15] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final int method2009(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return (var5 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var5 & 16711680) >> 8;
   }

   final void method2003(int var1) {
      int var3 = this.field904.length;
      if (this.field897 > 0) {
         this.method2010(this.field897, this.field895);
      } else if (this.field898 > 0) {
         this.method2010(this.field898, this.field896);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field904[var4] = this.field900[var4];
         }
      }

      this.method2011(var1);
   }

   final void method2010(int var1, int[] var2) {
      int var4 = this.field904.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.field904[var5] = this.method2009(this.field900[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.field904[var5] = var2[var5];
         } else {
            this.field904[var5] = this.method2009(var2[var5], this.field900[var5], 256 - var1);
         }
      }

   }

   final void method2011(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = (256 - var4) * this.field891[var4] / 256;
         int var6 = var5 + var1;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (var6 + 128 >= class159.field1749.field5169) {
            var8 = class159.field1749.field5169 - var6;
         }

         int var9 = class159.field1749.field5169 * (var4 + 8) + var6;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field899[var3++];
            int var12 = var9 % class535.field5202;
            if (var11 != 0 && var12 >= class535.field5208 && var12 < class535.field5209) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field904[var11];
               int var15 = class159.field1749.field5172[var9];
               class159.field1749.field5172[var9++] = -16777216 | ((var11 & 16711935) * var13 + var14 * (var15 & 16711935) & -16711936) + (var14 * (var15 & '\uff00') + var13 * (var11 & '\uff00') & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void method2012(class537 var1) {
      int var3;
      for(var3 = 0; var3 < this.field886.length; ++var3) {
         this.field886[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0 * 256.0);
         this.field886[var4] = (int)(Math.random() * 256.0);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.field892[var6] = (this.field886[var6 - 128] + this.field886[var6 + 1] + this.field886[var6 - 1] + this.field886[var6 + 128]) / 4;
            }
         }

         int[] var9 = this.field886;
         this.field886 = this.field892;
         this.field892 = var9;
      }

      if (var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field5214; ++var4) {
            for(var5 = 0; var5 < var1.field5216; ++var5) {
               if (var1.field5220[var3++] != 0) {
                  var6 = var5 + 16 + var1.field5217;
                  int var7 = var1.field5219 + var4 + 16;
                  int var8 = var6 + (var7 << 7);
                  this.field886[var8] = 0;
               }
            }
         }
      }

   }
}
