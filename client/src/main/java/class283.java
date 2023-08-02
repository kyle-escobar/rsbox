public final class class283 {
   final int[] field3050;

   class283() {
      this.field3050 = new int[4096];
   }

   class283(int[] var1) {
      this.field3050 = var1;
   }

   public static int method5407(int var0, int var1, int var2, class222 var3, class218 var4, boolean var5, int[] var6, int[] var7, class225 var8) {
      var8.method4222();
      int var10 = var8.method4226();
      int var11 = var8.method4227();
      int[][] var12 = var8.method4250();
      int[][] var13 = var8.method4228();
      int[] var14 = var8.method4230();
      int[] var15 = var8.method4231();
      boolean var16;
      int var18;
      int var19;
      int var24;
      int var25;
      int var26;
      int var27;
      int var28;
      int var29;
      int var30;
      int var31;
      int var32;
      int var34;
      if (var2 == 1) {
         var16 = class210.method3301(var0, var1, var3, var4, var8);
      } else {
         boolean var17;
         int[][] var20;
         int[][] var21;
         int[] var22;
         int[] var23;
         int[][] var33;
         int var35;
         int var36;
         if (var2 == 2) {
            var18 = var8.method4226();
            var19 = var8.method4227();
            var20 = var8.method4250();
            var21 = var8.method4228();
            var22 = var8.method4230();
            var23 = var8.method4231();
            var24 = var8.method4232();
            var25 = var0;
            var26 = var1;
            var27 = var18 >> 1;
            var28 = var19 >> 1;
            var29 = var0 - var27;
            var30 = var1 - var28;
            var21[var27][var28] = 99;
            var20[var27][var28] = 0;
            var31 = 0;
            var32 = 0;
            var22[var31] = var0;
            var23[var31++] = var1;
            var33 = var4.field2393;

            while(true) {
               if (var31 == var32) {
                  var8.method4223(var25, var26);
                  var17 = false;
                  break;
               }

               var25 = var22[var32];
               var26 = var23[var32];
               var32 = var32 + 1 & var24;
               var27 = var25 - var29;
               var28 = var26 - var30;
               var34 = var25 - var4.field2397;
               var35 = var26 - var4.field2392;
               if (var3.method4210(2, var25, var26, var4)) {
                  var8.method4223(var25, var26);
                  var17 = true;
                  break;
               }

               var36 = var20[var27][var28] + 1;
               if (var27 > 0 && 0 == var21[var27 - 1][var28] && 0 == (var33[var34 - 1][var35] & 19136782) && 0 == (var33[var34 - 1][var35 + 1] & 19136824)) {
                  var22[var31] = var25 - 1;
                  var23[var31] = var26;
                  var31 = var31 + 1 & var24;
                  var21[var27 - 1][var28] = 2;
                  var20[var27 - 1][var28] = var36;
               }

               if (var27 < var18 - 2 && 0 == var21[var27 + 1][var28] && 0 == (var33[var34 + 2][var35] & 19136899) && (var33[var34 + 2][var35 + 1] & 19136992) == 0) {
                  var22[var31] = var25 + 1;
                  var23[var31] = var26;
                  var31 = var31 + 1 & var24;
                  var21[var27 + 1][var28] = 8;
                  var20[var27 + 1][var28] = var36;
               }

               if (var28 > 0 && var21[var27][var28 - 1] == 0 && (var33[var34][var35 - 1] & 19136782) == 0 && (var33[var34 + 1][var35 - 1] & 19136899) == 0) {
                  var22[var31] = var25;
                  var23[var31] = var26 - 1;
                  var31 = var31 + 1 & var24;
                  var21[var27][var28 - 1] = 1;
                  var20[var27][var28 - 1] = var36;
               }

               if (var28 < var19 - 2 && var21[var27][var28 + 1] == 0 && (var33[var34][var35 + 2] & 19136824) == 0 && 0 == (var33[var34 + 1][var35 + 2] & 19136992)) {
                  var22[var31] = var25;
                  var23[var31] = var26 + 1;
                  var31 = var31 + 1 & var24;
                  var21[var27][var28 + 1] = 4;
                  var20[var27][var28 + 1] = var36;
               }

               if (var27 > 0 && var28 > 0 && 0 == var21[var27 - 1][var28 - 1] && 0 == (var33[var34 - 1][var35] & 19136830) && 0 == (var33[var34 - 1][var35 - 1] & 19136782) && 0 == (var33[var34][var35 - 1] & 19136911)) {
                  var22[var31] = var25 - 1;
                  var23[var31] = var26 - 1;
                  var31 = var31 + 1 & var24;
                  var21[var27 - 1][var28 - 1] = 3;
                  var20[var27 - 1][var28 - 1] = var36;
               }

               if (var27 < var18 - 2 && var28 > 0 && 0 == var21[var27 + 1][var28 - 1] && (var33[var34 + 1][var35 - 1] & 19136911) == 0 && (var33[var34 + 2][var35 - 1] & 19136899) == 0 && (var33[var34 + 2][var35] & 19136995) == 0) {
                  var22[var31] = var25 + 1;
                  var23[var31] = var26 - 1;
                  var31 = var31 + 1 & var24;
                  var21[var27 + 1][var28 - 1] = 9;
                  var20[var27 + 1][var28 - 1] = var36;
               }

               if (var27 > 0 && var28 < var19 - 2 && 0 == var21[var27 - 1][var28 + 1] && 0 == (var33[var34 - 1][var35 + 1] & 19136830) && 0 == (var33[var34 - 1][var35 + 2] & 19136824) && 0 == (var33[var34][var35 + 2] & 19137016)) {
                  var22[var31] = var25 - 1;
                  var23[var31] = var26 + 1;
                  var31 = var31 + 1 & var24;
                  var21[var27 - 1][var28 + 1] = 6;
                  var20[var27 - 1][var28 + 1] = var36;
               }

               if (var27 < var18 - 2 && var28 < var19 - 2 && var21[var27 + 1][var28 + 1] == 0 && (var33[var34 + 1][var35 + 2] & 19137016) == 0 && (var33[var34 + 2][var35 + 2] & 19136992) == 0 && (var33[var34 + 2][var35 + 1] & 19136995) == 0) {
                  var22[var31] = var25 + 1;
                  var23[var31] = var26 + 1;
                  var31 = var31 + 1 & var24;
                  var21[var27 + 1][var28 + 1] = 12;
                  var20[var27 + 1][var28 + 1] = var36;
               }
            }

            var16 = var17;
         } else {
            var18 = var8.method4226();
            var19 = var8.method4227();
            var20 = var8.method4250();
            var21 = var8.method4228();
            var22 = var8.method4230();
            var23 = var8.method4231();
            var24 = var8.method4232();
            var25 = var0;
            var26 = var1;
            var27 = var18 >> 1;
            var28 = var19 >> 1;
            var29 = var0 - var27;
            var30 = var1 - var28;
            var21[var27][var28] = 99;
            var20[var27][var28] = 0;
            byte var45 = 0;
            var32 = 0;
            var22[var45] = var0;
            var31 = var45 + 1;
            var23[var45] = var1;
            var33 = var4.field2393;

            label519:
            while(true) {
               label517:
               while(true) {
                  int var37;
                  do {
                     do {
                        do {
                           label494:
                           do {
                              if (var32 == var31) {
                                 var8.method4223(var25, var26);
                                 var17 = false;
                                 break label519;
                              }

                              var25 = var22[var32];
                              var26 = var23[var32];
                              var32 = var32 + 1 & var24;
                              var27 = var25 - var29;
                              var28 = var26 - var30;
                              var34 = var25 - var4.field2397;
                              var35 = var26 - var4.field2392;
                              if (var3.method4210(var2, var25, var26, var4)) {
                                 var8.method4223(var25, var26);
                                 var17 = true;
                                 break label519;
                              }

                              var36 = var20[var27][var28] + 1;
                              if (var27 > 0 && 0 == var21[var27 - 1][var28] && 0 == (var33[var34 - 1][var35] & 19136782) && (var33[var34 - 1][var35 + var2 - 1] & 19136824) == 0) {
                                 var37 = 1;

                                 while(true) {
                                    if (var37 >= var2 - 1) {
                                       var22[var31] = var25 - 1;
                                       var23[var31] = var26;
                                       var31 = var31 + 1 & var24;
                                       var21[var27 - 1][var28] = 2;
                                       var20[var27 - 1][var28] = var36;
                                       break;
                                    }

                                    if ((var33[var34 - 1][var35 + var37] & 19136830) != 0) {
                                       break;
                                    }

                                    ++var37;
                                 }
                              }

                              if (var27 < var18 - var2 && 0 == var21[var27 + 1][var28] && 0 == (var33[var34 + var2][var35] & 19136899) && (var33[var2 + var34][var2 + var35 - 1] & 19136992) == 0) {
                                 var37 = 1;

                                 while(true) {
                                    if (var37 >= var2 - 1) {
                                       var22[var31] = var25 + 1;
                                       var23[var31] = var26;
                                       var31 = var31 + 1 & var24;
                                       var21[var27 + 1][var28] = 8;
                                       var20[var27 + 1][var28] = var36;
                                       break;
                                    }

                                    if (0 != (var33[var34 + var2][var35 + var37] & 19136995)) {
                                       break;
                                    }

                                    ++var37;
                                 }
                              }

                              if (var28 > 0 && 0 == var21[var27][var28 - 1] && 0 == (var33[var34][var35 - 1] & 19136782) && 0 == (var33[var34 + var2 - 1][var35 - 1] & 19136899)) {
                                 var37 = 1;

                                 while(true) {
                                    if (var37 >= var2 - 1) {
                                       var22[var31] = var25;
                                       var23[var31] = var26 - 1;
                                       var31 = var31 + 1 & var24;
                                       var21[var27][var28 - 1] = 1;
                                       var20[var27][var28 - 1] = var36;
                                       break;
                                    }

                                    if (0 != (var33[var37 + var34][var35 - 1] & 19136911)) {
                                       break;
                                    }

                                    ++var37;
                                 }
                              }

                              if (var28 < var19 - var2 && var21[var27][var28 + 1] == 0 && (var33[var34][var35 + var2] & 19136824) == 0 && (var33[var2 + var34 - 1][var2 + var35] & 19136992) == 0) {
                                 var37 = 1;

                                 while(true) {
                                    if (var37 >= var2 - 1) {
                                       var22[var31] = var25;
                                       var23[var31] = var26 + 1;
                                       var31 = var31 + 1 & var24;
                                       var21[var27][var28 + 1] = 4;
                                       var20[var27][var28 + 1] = var36;
                                       break;
                                    }

                                    if ((var33[var34 + var37][var2 + var35] & 19137016) != 0) {
                                       break;
                                    }

                                    ++var37;
                                 }
                              }

                              if (var27 > 0 && var28 > 0 && var21[var27 - 1][var28 - 1] == 0 && (var33[var34 - 1][var35 - 1] & 19136782) == 0) {
                                 var37 = 1;

                                 while(true) {
                                    if (var37 >= var2) {
                                       var22[var31] = var25 - 1;
                                       var23[var31] = var26 - 1;
                                       var31 = var31 + 1 & var24;
                                       var21[var27 - 1][var28 - 1] = 3;
                                       var20[var27 - 1][var28 - 1] = var36;
                                       break;
                                    }

                                    if (0 != (var33[var34 - 1][var37 + (var35 - 1)] & 19136830) || 0 != (var33[var34 - 1 + var37][var35 - 1] & 19136911)) {
                                       break;
                                    }

                                    ++var37;
                                 }
                              }

                              if (var27 < var18 - var2 && var28 > 0 && 0 == var21[var27 + 1][var28 - 1] && 0 == (var33[var34 + var2][var35 - 1] & 19136899)) {
                                 var37 = 1;

                                 while(true) {
                                    if (var37 >= var2) {
                                       var22[var31] = var25 + 1;
                                       var23[var31] = var26 - 1;
                                       var31 = var31 + 1 & var24;
                                       var21[var27 + 1][var28 - 1] = 9;
                                       var20[var27 + 1][var28 - 1] = var36;
                                       break;
                                    }

                                    if (0 != (var33[var2 + var34][var37 + (var35 - 1)] & 19136995) || (var33[var34 + var37][var35 - 1] & 19136911) != 0) {
                                       break;
                                    }

                                    ++var37;
                                 }
                              }

                              if (var27 > 0 && var28 < var19 - var2 && var21[var27 - 1][var28 + 1] == 0 && (var33[var34 - 1][var2 + var35] & 19136824) == 0) {
                                 for(var37 = 1; var37 < var2; ++var37) {
                                    if (0 != (var33[var34 - 1][var37 + var35] & 19136830) || (var33[var34 - 1 + var37][var2 + var35] & 19137016) != 0) {
                                       continue label494;
                                    }
                                 }

                                 var22[var31] = var25 - 1;
                                 var23[var31] = var26 + 1;
                                 var31 = var31 + 1 & var24;
                                 var21[var27 - 1][var28 + 1] = 6;
                                 var20[var27 - 1][var28 + 1] = var36;
                              }
                           } while(var27 >= var18 - var2);
                        } while(var28 >= var19 - var2);
                     } while(var21[var27 + 1][var28 + 1] != 0);
                  } while(0 != (var33[var34 + var2][var2 + var35] & 19136992));

                  for(var37 = 1; var37 < var2; ++var37) {
                     if (0 != (var33[var34 + var37][var35 + var2] & 19137016) || (var33[var34 + var2][var37 + var35] & 19136995) != 0) {
                        continue label517;
                     }
                  }

                  var22[var31] = var25 + 1;
                  var23[var31] = var26 + 1;
                  var31 = var31 + 1 & var24;
                  var21[var27 + 1][var28 + 1] = 12;
                  var20[var27 + 1][var28 + 1] = var36;
               }
            }

            var16 = var17;
         }
      }

      int var38 = var0 - (var10 >> 1);
      var18 = var1 - (var11 >> 1);
      var19 = var8.method4224();
      int var39 = var8.method4247();
      int var40;
      int var42;
      int var43;
      if (!var16) {
         if (!var5) {
            return -1;
         }

         var40 = Integer.MAX_VALUE;
         var42 = Integer.MAX_VALUE;
         var43 = 10;
         var24 = var3.field2447;
         var25 = var3.field2445;
         var26 = var3.field2446;
         var27 = var3.field2444;

         for(var28 = var24 - var43; var28 <= var43 + var24; ++var28) {
            for(var29 = var25 - var43; var29 <= var25 + var43; ++var29) {
               var30 = var28 - var38;
               var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
                  var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var24 + var26 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var44 = 0;
                  if (var29 < var25) {
                     var44 = var25 - var29;
                  } else if (var29 > var27 + var25 - 1) {
                     var44 = var29 - (var27 + var25 - 1);
                  }

                  var34 = var32 * var32 + var44 * var44;
                  if (var34 < var40 || var40 == var34 && var12[var30][var31] < var42) {
                     var40 = var34;
                     var42 = var12[var30][var31];
                     var19 = var28;
                     var39 = var29;
                  }
               }
            }
         }

         if (var40 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var0 == var19 && var1 == var39) {
         var6[0] = var19;
         var7[0] = var39;
         return 0;
      } else {
         byte var41 = 0;
         var14[var41] = var19;
         var40 = var41 + 1;
         var15[var41] = var39;

         for(var42 = var43 = var13[var19 - var38][var39 - var18]; var0 != var19 || var39 != var1; var42 = var13[var19 - var38][var39 - var18]) {
            if (var43 != var42) {
               var43 = var42;
               var14[var40] = var19;
               var15[var40++] = var39;
            }

            if (0 != (var42 & 2)) {
               ++var19;
            } else if ((var42 & 8) != 0) {
               --var19;
            }

            if (0 != (var42 & 1)) {
               ++var39;
            } else if (0 != (var42 & 4)) {
               --var39;
            }
         }

         var24 = 0;

         while(var40-- > 0) {
            var6[var24] = var14[var40];
            var7[var24++] = var15[var40];
            if (var24 >= var6.length) {
               break;
            }
         }

         return var24;
      }
   }

   final int method5408(int var1, int var2) {
      return this.field3050[var1 + var2 * 64];
   }
}
