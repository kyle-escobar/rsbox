import java.util.Random;

public class class69 {
   static int[] field536;
   static int[] field543;
   static int[] field554 = new int['\u8000'];
   static int[] field555;
   static int[] field557;
   static int[] field558;
   static int[] field559;
   static int[] field560;
   class52 field537;
   class52 field538;
   class52 field540;
   class52 field541;
   class52 field542;
   class52 field546;
   class52 field548;
   class52 field550;
   class52 field553;
   class66 field549;
   int field539 = 500;
   int field547 = 0;
   int field551 = 100;
   int field552 = 0;
   int[] field544 = new int[]{0, 0, 0, 0, 0};
   int[] field545 = new int[]{0, 0, 0, 0, 0};
   int[] field561 = new int[]{0, 0, 0, 0, 0};

   static {
      Random var0 = new Random(0L);

      int var1;
      for(var1 = 0; var1 < 32768; ++var1) {
         field554[var1] = (var0.nextInt() & 2) - 1;
      }

      field555 = new int['\u8000'];

      for(var1 = 0; var1 < 32768; ++var1) {
         field555[var1] = (int)(Math.sin((double)var1 / 5215.1903) * 16384.0);
      }

      field558 = new int[220500];
      field536 = new int[5];
      field560 = new int[5];
      field559 = new int[5];
      field557 = new int[5];
      field543 = new int[5];
   }

   class69() {
   }

   final int[] method1420(int var1, int var2) {
      class415.method7436(field558, 0, var1);
      if (var2 < 10) {
         return field558;
      } else {
         double var3 = (double)var1 / ((double)var2 + 0.0);
         this.field540.method1066();
         this.field537.method1066();
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (this.field538 != null) {
            this.field538.method1066();
            this.field548.method1066();
            var5 = (int)((double)(this.field538.field378 - this.field538.field377) * 32.768 / var3);
            var6 = (int)((double)this.field538.field377 * 32.768 / var3);
         }

         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         if (this.field553 != null) {
            this.field553.method1066();
            this.field541.method1066();
            var8 = (int)((double)(this.field553.field378 - this.field553.field377) * 32.768 / var3);
            var9 = (int)((double)this.field553.field377 * 32.768 / var3);
         }

         int var11;
         for(var11 = 0; var11 < 5; ++var11) {
            if (this.field544[var11] != 0) {
               field536[var11] = 0;
               field560[var11] = (int)((double)this.field545[var11] * var3);
               field559[var11] = (this.field544[var11] << 14) / 100;
               field557[var11] = (int)((double)(this.field540.field378 - this.field540.field377) * 32.768 * Math.pow(1.0057929410678534, (double)this.field561[var11]) / var3);
               field543[var11] = (int)((double)this.field540.field377 * 32.768 / var3);
            }
         }

         int var12;
         int var13;
         int var14;
         int var15;
         int[] var10000;
         for(var11 = 0; var11 < var1; ++var11) {
            var12 = this.field540.method1067(var1);
            var13 = this.field537.method1067(var1);
            if (this.field538 != null) {
               var14 = this.field538.method1067(var1);
               var15 = this.field548.method1067(var1);
               var12 += this.method1424(var7, var15, this.field538.field381) >> 1;
               var7 += (var14 * var5 >> 16) + var6;
            }

            if (this.field553 != null) {
               var14 = this.field553.method1067(var1);
               var15 = this.field541.method1067(var1);
               var13 = var13 * ((this.method1424(var10, var15, this.field553.field381) >> 1) + '\u8000') >> 15;
               var10 += (var14 * var8 >> 16) + var9;
            }

            for(var14 = 0; var14 < 5; ++var14) {
               if (this.field544[var14] != 0) {
                  var15 = var11 + field560[var14];
                  if (var15 < var1) {
                     var10000 = field558;
                     var10000[var15] += this.method1424(field536[var14], var13 * field559[var14] >> 15, this.field540.field381);
                     var10000 = field536;
                     var10000[var14] += (var12 * field557[var14] >> 16) + field543[var14];
                  }
               }
            }
         }

         int var16;
         if (this.field542 != null) {
            this.field542.method1066();
            this.field546.method1066();
            var11 = 0;
            boolean var19 = false;
            boolean var20 = true;

            for(var14 = 0; var14 < var1; ++var14) {
               var15 = this.field542.method1067(var1);
               var16 = this.field546.method1067(var1);
               if (var20) {
                  var12 = this.field542.field377 + ((this.field542.field378 - this.field542.field377) * var15 >> 8);
               } else {
                  var12 = this.field542.field377 + ((this.field542.field378 - this.field542.field377) * var16 >> 8);
               }

               var11 += 256;
               if (var11 >= var12) {
                  var11 = 0;
                  var20 = !var20;
               }

               if (var20) {
                  field558[var14] = 0;
               }
            }
         }

         if (this.field547 > 0 && this.field551 > 0) {
            var11 = (int)((double)this.field547 * var3);

            for(var12 = var11; var12 < var1; ++var12) {
               var10000 = field558;
               var10000[var12] += field558[var12 - var11] * this.field551 / 100;
            }
         }

         if (this.field549.field516[0] > 0 || this.field549.field516[1] > 0) {
            this.field550.method1066();
            var11 = this.field550.method1067(var1 + 1);
            var12 = this.field549.method1394(0, (float)var11 / 65536.0F);
            var13 = this.field549.method1394(1, (float)var11 / 65536.0F);
            if (var1 >= var12 + var13) {
               var14 = 0;
               var15 = var13;
               if (var13 > var1 - var12) {
                  var15 = var1 - var12;
               }

               int var17;
               while(var14 < var15) {
                  var16 = (int)((long)field558[var14 + var12] * (long)class66.field520 >> 16);

                  for(var17 = 0; var17 < var12; ++var17) {
                     var16 += (int)((long)field558[var14 + var12 - 1 - var17] * (long)class66.field517[0][var17] >> 16);
                  }

                  for(var17 = 0; var17 < var14; ++var17) {
                     var16 -= (int)((long)field558[var14 - 1 - var17] * (long)class66.field517[1][var17] >> 16);
                  }

                  field558[var14] = var16;
                  var11 = this.field550.method1067(var1 + 1);
                  ++var14;
               }

               boolean var21 = true;
               var15 = 128;

               while(true) {
                  if (var15 > var1 - var12) {
                     var15 = var1 - var12;
                  }

                  int var18;
                  while(var14 < var15) {
                     var17 = (int)((long)field558[var14 + var12] * (long)class66.field520 >> 16);

                     for(var18 = 0; var18 < var12; ++var18) {
                        var17 += (int)((long)field558[var14 + var12 - 1 - var18] * (long)class66.field517[0][var18] >> 16);
                     }

                     for(var18 = 0; var18 < var13; ++var18) {
                        var17 -= (int)((long)field558[var14 - 1 - var18] * (long)class66.field517[1][var18] >> 16);
                     }

                     field558[var14] = var17;
                     var11 = this.field550.method1067(var1 + 1);
                     ++var14;
                  }

                  if (var14 >= var1 - var12) {
                     while(var14 < var1) {
                        var17 = 0;

                        for(var18 = var14 + var12 - var1; var18 < var12; ++var18) {
                           var17 += (int)((long)field558[var14 + var12 - 1 - var18] * (long)class66.field517[0][var18] >> 16);
                        }

                        for(var18 = 0; var18 < var13; ++var18) {
                           var17 -= (int)((long)field558[var14 - 1 - var18] * (long)class66.field517[1][var18] >> 16);
                        }

                        field558[var14] = var17;
                        this.field550.method1067(var1 + 1);
                        ++var14;
                     }
                     break;
                  }

                  var12 = this.field549.method1394(0, (float)var11 / 65536.0F);
                  var13 = this.field549.method1394(1, (float)var11 / 65536.0F);
                  var15 += 128;
               }
            }
         }

         for(var11 = 0; var11 < var1; ++var11) {
            if (field558[var11] < -32768) {
               field558[var11] = -32768;
            }

            if (field558[var11] > 32767) {
               field558[var11] = 32767;
            }
         }

         return field558;
      }
   }

   final int method1424(int var1, int var2, int var3) {
      if (var3 == 1) {
         return (var1 & 32767) < 16384 ? var2 : -var2;
      } else if (var3 == 2) {
         return field555[var1 & 32767] * var2 >> 14;
      } else if (var3 == 3) {
         return ((var1 & 32767) * var2 >> 14) - var2;
      } else {
         return var3 == 4 ? field554[var1 / 2607 & 32767] * var2 : 0;
      }
   }

   final void method1425(class519 var1) {
      this.field540 = new class52();
      this.field540.method1064(var1);
      this.field537 = new class52();
      this.field537.method1064(var1);
      int var2 = var1.method8748();
      if (var2 != 0) {
         --var1.field5129;
         this.field538 = new class52();
         this.field538.method1064(var1);
         this.field548 = new class52();
         this.field548.method1064(var1);
      }

      var2 = var1.method8748();
      if (var2 != 0) {
         --var1.field5129;
         this.field553 = new class52();
         this.field553.method1064(var1);
         this.field541 = new class52();
         this.field541.method1064(var1);
      }

      var2 = var1.method8748();
      if (var2 != 0) {
         --var1.field5129;
         this.field542 = new class52();
         this.field542.method1064(var1);
         this.field546 = new class52();
         this.field546.method1064(var1);
      }

      for(int var3 = 0; var3 < 10; ++var3) {
         int var4 = var1.method8764();
         if (var4 == 0) {
            break;
         }

         this.field544[var3] = var4;
         this.field561[var3] = var1.method8763();
         this.field545[var3] = var1.method8764();
      }

      this.field547 = var1.method8764();
      this.field551 = var1.method8764();
      this.field539 = var1.method8750();
      this.field552 = var1.method8750();
      this.field549 = new class66();
      this.field550 = new class52();
      this.field549.method1403(var1, this.field550);
   }
}
