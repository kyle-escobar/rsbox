public class class269 {
   static Component field2984;
   byte[][][] field2982;
   int field2981;

   class269(int var1) {
      this.field2981 = var1;
   }

   void method5262(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && 0 != this.field2981 && this.field2982 != null) {
         var8 = this.method5252(var8, var7);
         var7 = this.method5250(var7);
         class535.method9234(var1, var2, var5, var6, var3, var4, this.field2982[var7 - 1][var8], this.field2981, true);
      }
   }

   int method5252(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   int method5250(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   void method5264() {
      if (this.field2982 == null) {
         this.field2982 = new byte[8][4][];
         this.method5255();
         this.method5256();
         this.method5257();
         this.method5253();
         this.method5259();
         this.method5287();
         this.method5261();
         this.method5254();
      }
   }

   void method5255() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[0][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[0][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[0][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[0][3] = var2;
   }

   void method5256() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[1][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var3 >= 0 && var3 < var2.length) {
               if (var5 >= var4 << 1) {
                  var2[var3] = -1;
               }

               ++var3;
            } else {
               ++var3;
            }
         }
      }

      this.field2982[1][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[1][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[1][3] = var2;
   }

   void method5257() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[2][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[2][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[2][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[2][3] = var2;
   }

   void method5253() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[3][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[3][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[3][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[3][3] = var2;
   }

   void method5259() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      int var3 = 0;

      int var4;
      int var5;
      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[4][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[4][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4 >> 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[4][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var3 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 << 1) {
               var2[var3] = -1;
            }

            ++var3;
         }
      }

      this.field2982[4][3] = var2;
   }

   void method5287() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      boolean var3 = false;
      var2 = new byte[this.field2981 * this.field2981];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[5][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var4 <= this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[5][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[5][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var4 >= this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[5][3] = var2;
   }

   void method5261() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      boolean var3 = false;
      var2 = new byte[this.field2981 * this.field2981];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[6][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 <= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[6][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[6][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 <= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[6][3] = var2;
   }

   void method5254() {
      byte[] var2 = new byte[this.field2981 * this.field2981];
      boolean var3 = false;
      var2 = new byte[this.field2981 * this.field2981];
      int var6 = 0;

      int var4;
      int var5;
      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[7][0] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = 0; var5 < this.field2981; ++var5) {
            if (var5 >= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[7][1] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = this.field2981 - 1; var4 >= 0; --var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[7][2] = var2;
      var2 = new byte[this.field2981 * this.field2981];
      var6 = 0;

      for(var4 = 0; var4 < this.field2981; ++var4) {
         for(var5 = this.field2981 - 1; var5 >= 0; --var5) {
            if (var5 >= var4 - this.field2981 / 2) {
               var2[var6] = -1;
            }

            ++var6;
         }
      }

      this.field2982[7][3] = var2;
   }
}
