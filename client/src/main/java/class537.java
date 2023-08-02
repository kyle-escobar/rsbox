public final class class537 extends class535 {
   public byte[] field5220;
   public int field5214;
   public int field5216;
   public int field5217;
   public int field5218;
   public int field5219;
   public int field5221;
   public int[] field5215;

   static void method9317(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void method9319(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }

   public void method9314() {
      if (this.field5216 != this.field5221 || this.field5214 != this.field5218) {
         byte[] var1 = new byte[this.field5221 * this.field5218];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field5214; ++var3) {
            for(int var4 = 0; var4 < this.field5216; ++var4) {
               var1[var4 + this.field5217 + (var3 + this.field5219) * this.field5221] = this.field5220[var2++];
            }
         }

         this.field5220 = var1;
         this.field5216 = this.field5221;
         this.field5214 = this.field5218;
         this.field5217 = 0;
         this.field5219 = 0;
      }
   }

   public void method9325(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field5215.length; ++var4) {
         int var5 = this.field5215[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field5215[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field5215[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field5215[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void method9316(int var1, int var2) {
      var1 += this.field5217;
      var2 += this.field5219;
      int var3 = var1 + var2 * class535.field5202;
      int var4 = 0;
      int var5 = this.field5214;
      int var6 = this.field5216;
      int var7 = class535.field5202 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class535.field5206) {
         var9 = class535.field5206 - var2;
         var5 -= var9;
         var2 = class535.field5206;
         var4 += var9 * var6;
         var3 += var9 * class535.field5202;
      }

      if (var2 + var5 > class535.field5207) {
         var5 -= var2 + var5 - class535.field5207;
      }

      if (var1 < class535.field5208) {
         var9 = class535.field5208 - var1;
         var6 -= var9;
         var1 = class535.field5208;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > class535.field5209) {
         var9 = var1 + var6 - class535.field5209;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method9317(class535.field5201, this.field5220, this.field5215, var4, var3, var6, var5, var7, var8);
      }
   }

   public void method9326(int var1, int var2, int var3, int var4) {
      int var5 = this.field5216;
      int var6 = this.field5214;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field5221;
      int var10 = this.field5218;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field5217 > 0) {
         var13 = ((this.field5217 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field5217 << 16);
      }

      if (this.field5219 > 0) {
         var13 = ((this.field5219 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field5219 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * class535.field5202;
      int var14 = class535.field5202 - var3;
      if (var2 + var4 > class535.field5207) {
         var4 -= var2 + var4 - class535.field5207;
      }

      int var15;
      if (var2 < class535.field5206) {
         var15 = class535.field5206 - var2;
         var4 -= var15;
         var13 += var15 * class535.field5202;
         var8 += var12 * var15;
      }

      if (var1 + var3 > class535.field5209) {
         var15 = var1 + var3 - class535.field5209;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < class535.field5208) {
         var15 = class535.field5208 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method9319(class535.field5201, this.field5220, this.field5215, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }
}
