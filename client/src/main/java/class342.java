public abstract class class342 {
   static class531 field3833 = new class531();
   static int field3836 = 0;
   static int baseX;
   boolean field3822;
   boolean field3835;
   class527 field3823;
   class527[] field3829;
   int field3832;
   int[] field3821;
   int[] field3824;
   int[] field3825;
   int[] field3826;
   int[] field3834;
   int[][] field3827;
   int[][] field3828;
   Object[] field3830;
   Object[][] field3820;
   public int field3831;

   class342(boolean var1, boolean var2) {
      this.field3822 = var1;
      this.field3835 = var2;
   }

   static final byte[] method5782(byte[] var0) {
      Buffer var2 = new Buffer(var0);
      int var3 = var2.readUnsignedByte();
      int var4 = var2.readInt();
      if (var4 >= 0 && (0 == field3836 || var4 <= field3836)) {
         if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.readBytes(var7, 0, var4);
            return var7;
         } else {
            int var5 = var2.readInt();
            if (var5 < 0 || 0 != field3836 && var5 > field3836) {
               throw new RuntimeException();
            } else {
               byte[] var6 = new byte[var5];
               if (var3 == 1) {
                  class504.method8546(var6, var5, var0, var4, 9);
               } else {
                  field3833.method9212(var2, var6);
               }

               return var6;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   void method6379(byte[] var1) {
      this.field3831 = class318.method5851(var1, var1.length);
      Buffer var3 = new Buffer(method5782(var1));
      int var4 = var3.readUnsignedByte();
      if (var4 >= 5 && var4 <= 7) {
         if (var4 >= 6) {
            var3.readInt();
         }

         int var5 = var3.readUnsignedByte();
         if (var4 >= 7) {
            this.field3832 = var3.method8767();
         } else {
            this.field3832 = var3.readUnsignedShort();
         }

         int var6 = 0;
         int var7 = -1;
         this.field3834 = new int[this.field3832];
         int var8;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3832; ++var8) {
               this.field3834[var8] = var6 += var3.method8767();
               if (this.field3834[var8] > var7) {
                  var7 = this.field3834[var8];
               }
            }
         } else {
            for(var8 = 0; var8 < this.field3832; ++var8) {
               this.field3834[var8] = var6 += var3.readUnsignedShort();
               if (this.field3834[var8] > var7) {
                  var7 = this.field3834[var8];
               }
            }
         }

         this.field3824 = new int[var7 + 1];
         this.field3825 = new int[var7 + 1];
         this.field3826 = new int[var7 + 1];
         this.field3827 = new int[var7 + 1][];
         this.field3830 = new Object[var7 + 1];
         this.field3820 = new Object[var7 + 1][];
         if (var5 != 0) {
            this.field3821 = new int[var7 + 1];

            for(var8 = 0; var8 < this.field3832; ++var8) {
               this.field3821[this.field3834[var8]] = var3.readInt();
            }

            this.field3823 = new class527(this.field3821);
         }

         for(var8 = 0; var8 < this.field3832; ++var8) {
            this.field3824[this.field3834[var8]] = var3.readInt();
         }

         for(var8 = 0; var8 < this.field3832; ++var8) {
            this.field3825[this.field3834[var8]] = var3.readInt();
         }

         for(var8 = 0; var8 < this.field3832; ++var8) {
            this.field3826[this.field3834[var8]] = var3.readUnsignedShort();
         }

         int var9;
         int var10;
         int var11;
         int var12;
         int var13;
         if (var4 >= 7) {
            for(var8 = 0; var8 < this.field3832; ++var8) {
               var9 = this.field3834[var8];
               var10 = this.field3826[var9];
               var6 = 0;
               var11 = -1;
               this.field3827[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3827[var9][var12] = var6 += var3.method8767();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3820[var9] = new Object[var11 + 1];
            }
         } else {
            for(var8 = 0; var8 < this.field3832; ++var8) {
               var9 = this.field3834[var8];
               var10 = this.field3826[var9];
               var6 = 0;
               var11 = -1;
               this.field3827[var9] = new int[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  var13 = this.field3827[var9][var12] = var6 += var3.readUnsignedShort();
                  if (var13 > var11) {
                     var11 = var13;
                  }
               }

               this.field3820[var9] = new Object[var11 + 1];
            }
         }

         if (var5 != 0) {
            this.field3828 = new int[var7 + 1][];
            this.field3829 = new class527[var7 + 1];

            for(var8 = 0; var8 < this.field3832; ++var8) {
               var9 = this.field3834[var8];
               var10 = this.field3826[var9];
               this.field3828[var9] = new int[this.field3820[var9].length];

               for(var11 = 0; var11 < var10; ++var11) {
                  this.field3828[var9][this.field3827[var9][var11]] = var3.readInt();
               }

               this.field3829[var9] = new class527(this.field3828[var9]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method6435(int var1) {
   }

   public byte[] method6381(int var1, int var2) {
      return this.method6383(var1, var2, (int[])null);
   }

   public byte[] method6383(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.field3820.length && null != this.field3820[var1] && var2 >= 0 && var2 < this.field3820[var1].length) {
         if (this.field3820[var1][var2] == null) {
            boolean var5 = this.method6398(var1, var3);
            if (!var5) {
               this.method6391(var1);
               var5 = this.method6398(var1, var3);
               if (!var5) {
                  return null;
               }
            }
         }

         byte[] var6 = class317.method2517(this.field3820[var1][var2], false);
         if (this.field3835) {
            this.field3820[var1][var2] = null;
         }

         return var6;
      } else {
         return null;
      }
   }

   public boolean method6464(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3820.length && null != this.field3820[var1] && var2 >= 0 && var2 < this.field3820[var1].length) {
         if (null != this.field3820[var1][var2]) {
            return true;
         } else if (null != this.field3830[var1]) {
            return true;
         } else {
            this.method6391(var1);
            return null != this.field3830[var1];
         }
      } else {
         return false;
      }
   }

   public boolean method6386(int var1) {
      if (1 == this.field3820.length) {
         return this.method6464(0, var1);
      } else if (this.field3820[var1].length == 1) {
         return this.method6464(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean method6432(int var1) {
      if (this.field3830[var1] != null) {
         return true;
      } else {
         this.method6391(var1);
         return this.field3830[var1] != null;
      }
   }

   public boolean method6399() {
      boolean var2 = true;

      for(int var3 = 0; var3 < this.field3834.length; ++var3) {
         int var4 = this.field3834[var3];
         if (this.field3830[var4] == null) {
            this.method6391(var4);
            if (this.field3830[var4] == null) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   int method6387(int var1) {
      return this.field3830[var1] != null ? 100 : 0;
   }

   public byte[] method6388(int var1) {
      if (this.field3820.length == 1) {
         return this.method6381(0, var1);
      } else if (this.field3820[var1].length == 1) {
         return this.method6381(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] method6389(int var1, int var2) {
      if (var1 >= 0 && var1 < this.field3820.length && this.field3820[var1] != null && var2 >= 0 && var2 < this.field3820[var1].length) {
         if (this.field3820[var1][var2] == null) {
            boolean var4 = this.method6398(var1, (int[])null);
            if (!var4) {
               this.method6391(var1);
               var4 = this.method6398(var1, (int[])null);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = class317.method2517(this.field3820[var1][var2], false);
         return var5;
      } else {
         return null;
      }
   }

   public byte[] method6390(int var1) {
      if (this.field3820.length == 1) {
         return this.method6389(0, var1);
      } else if (1 == this.field3820[var1].length) {
         return this.method6389(var1, 0);
      } else {
         throw new RuntimeException();
      }
   }

   void method6391(int var1) {
   }

   public int[] method6392(int var1) {
      return var1 >= 0 && var1 < this.field3827.length ? this.field3827[var1] : null;
   }

   public int method6393(int var1) {
      return null != this.field3820 && var1 < this.field3820.length && this.field3820[var1] != null ? this.field3820[var1].length : 0;
   }

   public int method6394() {
      return this.field3820.length;
   }

   public void method6406() {
      for(int var2 = 0; var2 < this.field3830.length; ++var2) {
         this.field3830[var2] = null;
      }

   }

   public void method6396(int var1) {
      for(int var3 = 0; var3 < this.field3820[var1].length; ++var3) {
         this.field3820[var1][var3] = null;
      }

   }

   public void method6397() {
      for(int var2 = 0; var2 < this.field3820.length; ++var2) {
         if (null != this.field3820[var2]) {
            for(int var3 = 0; var3 < this.field3820[var2].length; ++var3) {
               this.field3820[var2][var3] = null;
            }
         }
      }

   }

   boolean method6398(int var1, int[] var2) {
      if (this.field3830[var1] == null) {
         return false;
      } else {
         int var4 = this.field3826[var1];
         int[] var5 = this.field3827[var1];
         Object[] var6 = this.field3820[var1];
         boolean var7 = true;

         for(int var8 = 0; var8 < var4; ++var8) {
            if (null == var6[var5[var8]]) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            return true;
         } else {
            byte[] var22;
            if (null == var2 || 0 == var2[0] && 0 == var2[1] && 0 == var2[2] && 0 == var2[3]) {
               var22 = class317.method2517(this.field3830[var1], false);
            } else {
               var22 = class317.method2517(this.field3830[var1], true);
               Buffer var9 = new Buffer(var22);
               var9.method8774(var2, 5, var9.data.length);
            }

            byte[] var23 = method5782(var22);
            if (this.field3822) {
               this.field3830[var1] = null;
            }

            if (var4 > 1) {
               int var10 = var23.length;
               --var10;
               int var11 = var23[var10] & 255;
               var10 -= 4 * var11 * var4;
               Buffer var12 = new Buffer(var23);
               int[] var13 = new int[var4];
               var12.offset = var10;

               int var15;
               int var16;
               for(int var14 = 0; var14 < var11; ++var14) {
                  var15 = 0;

                  for(var16 = 0; var16 < var4; ++var16) {
                     var15 += var12.readInt();
                     var13[var16] += var15;
                  }
               }

               byte[][] var24 = new byte[var4][];

               for(var15 = 0; var15 < var4; ++var15) {
                  var24[var15] = new byte[var13[var15]];
                  var13[var15] = 0;
               }

               var12.offset = var10;
               var15 = 0;

               int var18;
               for(var16 = 0; var16 < var11; ++var16) {
                  int var17 = 0;

                  for(var18 = 0; var18 < var4; ++var18) {
                     var17 += var12.readInt();
                     System.arraycopy(var23, var15, var24[var18], var13[var18], var17);
                     var13[var18] += var17;
                     var15 += var17;
                  }
               }

               for(var16 = 0; var16 < var4; ++var16) {
                  if (!this.field3835) {
                     var18 = var5[var16];
                     byte[] var20 = var24[var16];
                     Object var19;
                     if (var20 == null) {
                        var19 = null;
                     } else if (var20.length > 136) {
                        class354 var21 = new class354();
                        var21.method5839(var20);
                        var19 = var21;
                     } else {
                        var19 = var20;
                     }

                     var6[var18] = var19;
                  } else {
                     var6[var5[var16]] = var24[var16];
                  }
               }
            } else if (!this.field3835) {
               var6[var5[0]] = class317.method6363(var23, false);
            } else {
               var6[var5[0]] = var23;
            }

            return true;
         }
      }
   }

   public int getGroupId(String var1) {
      var1 = var1.toLowerCase();
      return this.field3823.method9181(class380.method559(var1));
   }

   public int method6400(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.field3829[var1].method9181(class380.method559(var2));
   }

   public boolean method6401(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3823.method9181(class380.method559(var1));
      if (var4 < 0) {
         return false;
      } else {
         int var5 = this.field3829[var4].method9181(class380.method559(var2));
         return var5 >= 0;
      }
   }

   public byte[] method6402(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3823.method9181(class380.method559(var1));
      int var5 = this.field3829[var4].method9181(class380.method559(var2));
      return this.method6381(var4, var5);
   }

   public boolean method6403(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var4 = this.field3823.method9181(class380.method559(var1));
      int var5 = this.field3829[var4].method9181(class380.method559(var2));
      return this.method6464(var4, var5);
   }

   public boolean method6404(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3823.method9181(class380.method559(var1));
      return this.method6432(var3);
   }

   public void method6385(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3823.method9181(class380.method559(var1));
      if (var3 >= 0) {
         this.method6435(var3);
      }
   }

   public int method6423(String var1) {
      var1 = var1.toLowerCase();
      int var3 = this.field3823.method9181(class380.method559(var1));
      return this.method6387(var3);
   }
}
