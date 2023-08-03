import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class class63 {
   static boolean field477 = false;
   static boolean field491 = false;
   static class363 field498;
   static class384 field496;
   static class53[] field488 = new class53[50];
   static int field479;
   static int field486;
   static int field487 = 0;
   static int field494 = 0;
   static int[] field481 = new int[5];
   static int[] field482;
   static int[] field483 = new int[1000];
   static int[][] field490 = new int[5][5000];
   static String[] field480;
   static String[] field484 = new String[1000];
   static ArrayList field493 = new ArrayList();
   static Calendar field499 = Calendar.getInstance();
   static final double field495 = Math.log(2.0);
   static final String[] field492 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   class63() throws Throwable {
   }

   public static void method1516(class87 var0) {
      method2337(var0, 500000, 475000);
   }

   static void method2337(class87 var0, int var1, int var2) {
      Object[] var4 = var0.field790;
      class81 var5;
      if (class509.method6578(var0.field795)) {
         class53.field389 = (class272)var4[0];
         class197 var6 = class197.method4100(class53.field389.field2992);
         var5 = class81.method652(var0.field795, var6.field2158, var6.field2170);
      } else {
         int var7 = (Integer)var4[0];
         var5 = class81.method1382(var7);
      }

      if (var5 != null) {
         method81(var0, var5, var1, var2);
      }

   }

   static void method81(class87 var0, class81 var1, int var2, int var3) {
      Object[] var5 = var0.field790;
      field479 = 0;
      field486 = 0;
      int var6 = -1;
      int[] var7 = var1.field712;
      int[] var8 = var1.field713;
      int var9 = -1;
      field487 = 0;
      field491 = false;
      boolean var10 = false;
      int var11 = 0;
      boolean var23 = false;

      label859: {
         label860: {
            try {
               int var14;
               try {
                  var23 = true;
                  field482 = new int[var1.field715];
                  int var12 = 0;
                  field480 = new String[var1.field714];
                  int var27 = 0;

                  int var15;
                  String var37;
                  for(var14 = 1; var14 < var5.length; ++var14) {
                     if (var5[var14] instanceof Integer) {
                        var15 = (Integer)var5[var14];
                        if (var15 == -2147483647) {
                           var15 = var0.field787;
                        }

                        if (var15 == -2147483646) {
                           var15 = var0.field788;
                        }

                        if (var15 == -2147483645) {
                           var15 = null != var0.field786 ? -232044627 * var0.field786.field3606 * -1780632539 : -1;
                        }

                        if (var15 == -2147483644) {
                           var15 = var0.field791;
                        }

                        if (var15 == -2147483643) {
                           var15 = null != var0.field786 ? var0.field786.field3607 : -1;
                        }

                        if (var15 == -2147483642) {
                           var15 = var0.field794 != null ? -232044627 * var0.field794.field3606 * -1780632539 : -1;
                        }

                        if (var15 == -2147483641) {
                           var15 = null != var0.field794 ? var0.field794.field3607 : -1;
                        }

                        if (var15 == -2147483640) {
                           var15 = var0.field784;
                        }

                        if (var15 == -2147483639) {
                           var15 = var0.field792;
                        }

                        field482[var12++] = var15;
                     } else if (var5[var14] instanceof String) {
                        var37 = (String)var5[var14];
                        if (var37.equals("event_opbase")) {
                           var37 = var0.field793;
                        }

                        field480[var27++] = var37;
                     }
                  }

                  field494 = var0.field789;

                  label840:
                  while(true) {
                     ++var11;
                     if (var11 > var2) {
                        throw new RuntimeException();
                     }

                     ++var6;
                     var9 = var7[var6];
                     if (var9 >= 100) {
                        boolean var36;
                        if (var1.field713[var6] == 1) {
                           var36 = true;
                        } else {
                           var36 = false;
                        }

                        var15 = class138.method2495(var9, var1, var36);
                        switch (var15) {
                           case 0:
                              var23 = false;
                              break label840;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                        }
                     } else if (var9 == 0) {
                        field483[++field479 - 1] = var8[var6];
                     } else if (var9 == 1) {
                        var14 = var8[var6];
                        field483[++field479 - 1] = class329.field3577[var14];
                     } else if (var9 == 2) {
                        var14 = var8[var6];
                        class329.field3577[var14] = field483[--field479];
                        Client.method1195(var14);
                     } else if (var9 == 3) {
                        field484[++field486 - 1] = var1.field710[var6];
                     } else if (var9 == 6) {
                        var6 += var8[var6];
                     } else if (var9 == 7) {
                        field479 -= 2;
                        if (field483[field479] != field483[1 + field479]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 8) {
                        field479 -= 2;
                        if (field483[field479] == field483[1 + field479]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 9) {
                        field479 -= 2;
                        if (field483[field479] < field483[field479 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 10) {
                        field479 -= 2;
                        if (field483[field479] > field483[1 + field479]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 21) {
                        if (0 == field487) {
                           var23 = false;
                           break label860;
                        }

                        class53 var35 = field488[--field487];
                        var1 = var35.field388;
                        var7 = var1.field712;
                        var8 = var1.field713;
                        var6 = var35.field386;
                        field482 = var35.field387;
                        field480 = var35.field385;
                     } else if (var9 == 25) {
                        var14 = var8[var6];
                        field483[++field479 - 1] = class254.method5005(var14);
                     } else if (var9 == 27) {
                        var14 = var8[var6];
                        class329.method3291(var14, field483[--field479]);
                     } else if (var9 == 31) {
                        field479 -= 2;
                        if (field483[field479] <= field483[field479 + 1]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 32) {
                        field479 -= 2;
                        if (field483[field479] >= field483[1 + field479]) {
                           var6 += var8[var6];
                        }
                     } else if (var9 == 33) {
                        field483[++field479 - 1] = field482[var8[var6]];
                     } else if (var9 == 34) {
                        field482[var8[var6]] = field483[--field479];
                     } else if (var9 == 35) {
                        field484[++field486 - 1] = field480[var8[var6]];
                     } else if (var9 == 36) {
                        field480[var8[var6]] = field484[--field486];
                     } else if (var9 == 37) {
                        var14 = var8[var6];
                        field486 -= var14;
                        var37 = class380.method2550(field484, field486, var14);
                        field484[++field486 - 1] = var37;
                     } else if (var9 == 38) {
                        --field479;
                     } else if (var9 == 39) {
                        --field486;
                     } else {
                        int var18;
                        if (var9 != 40) {
                           if (var9 == 42) {
                              field483[++field479 - 1] = class104.field1038.method2383(var8[var6]);
                           } else if (var9 == 43) {
                              class104.field1038.method2391(var8[var6], field483[--field479]);
                           } else if (var9 == 44) {
                              var14 = var8[var6] >> 16;
                              var15 = var8[var6] & '\uffff';
                              int var28 = field483[--field479];
                              if (var28 < 0 || var28 > 5000) {
                                 throw new RuntimeException();
                              }

                              field481[var14] = var28;
                              byte var31 = -1;
                              if (var15 == 105) {
                                 var31 = 0;
                              }

                              for(var18 = 0; var18 < var28; ++var18) {
                                 field490[var14][var18] = var31;
                              }
                           } else if (var9 == 45) {
                              var14 = var8[var6];
                              var15 = field483[--field479];
                              if (var15 < 0 || var15 >= field481[var14]) {
                                 throw new RuntimeException();
                              }

                              field483[++field479 - 1] = field490[var14][var15];
                           } else if (var9 == 46) {
                              var14 = var8[var6];
                              field479 -= 2;
                              var15 = field483[field479];
                              if (var15 < 0 || var15 >= field481[var14]) {
                                 throw new RuntimeException();
                              }

                              field490[var14][var15] = field483[field479 + 1];
                           } else {
                              String var29;
                              if (var9 == 47) {
                                 var29 = class104.field1038.method2365(var8[var6]);
                                 if (null == var29) {
                                    var29 = class364.field4028;
                                 }

                                 field484[++field486 - 1] = var29;
                              } else if (var9 == 48) {
                                 class104.field1038.method2407(var8[var6], field484[--field486]);
                              } else if (var9 == 49) {
                                 var29 = class104.field1038.method2368(var8[var6]);
                                 field484[++field486 - 1] = var29;
                              } else if (var9 == 50) {
                                 class104.field1038.method2363(var8[var6], field484[--field486]);
                              } else if (var9 == 60) {
                                 class469 var32 = var1.field717[var8[var6]];
                                 class492 var40 = (class492)var32.method8096((long)field483[--field479]);
                                 if (var40 != null) {
                                    var6 += var40.field4960;
                                 }
                              } else {
                                 Integer var33;
                                 if (var9 == 74) {
                                    var33 = class308.field3359.method2589(var8[var6]);
                                    if (var33 == null) {
                                       field483[++field479 - 1] = -1;
                                    } else {
                                       field483[++field479 - 1] = var33;
                                    }
                                 } else {
                                    if (var9 != 76) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = class153.field1393.method8044(var8[var6]);
                                    if (null == var33) {
                                       field483[++field479 - 1] = -1;
                                    } else {
                                       field483[++field479 - 1] = var33;
                                    }
                                 }
                              }
                           }
                        } else {
                           var14 = var8[var6];
                           class81 var39 = class81.method1382(var14);
                           int[] var16 = new int[var39.field715];
                           String[] var17 = new String[var39.field714];

                           for(var18 = 0; var18 < var39.field711; ++var18) {
                              var16[var18] = field483[field479 - var39.field711 + var18];
                           }

                           for(var18 = 0; var18 < var39.field716; ++var18) {
                              var17[var18] = field484[var18 + (field486 - var39.field716)];
                           }

                           field479 -= var39.field711;
                           field486 -= var39.field716;
                           class53 var34 = new class53();
                           var34.field388 = var1;
                           var34.field386 = var6;
                           var34.field387 = field482;
                           var34.field385 = field480;
                           field488[++field487 - 1] = var34;
                           var1 = var39;
                           var7 = var39.field712;
                           var8 = var39.field713;
                           var6 = -1;
                           field482 = var16;
                           field480 = var17;
                        }
                     }
                  }
               } catch (Exception var24) {
                  var10 = true;
                  StringBuilder var13 = new StringBuilder(30);
                  var13.append("").append(var1.field4816).append(" ");

                  for(var14 = field487 - 1; var14 >= 0; --var14) {
                     var13.append("").append(field488[var14].field388.field4816).append(" ");
                  }

                  var13.append("").append(var9);
                  class524.method5856(var13.toString(), var24);
                  var23 = false;
                  break label859;
               }
            } finally {
               if (var23) {
                  while(field493.size() > 0) {
                     class80 var20 = (class80)field493.remove(0);
                     Client.method7794(var20.method1727(), var20.method1728(), var20.method1729(), var20.method1731(), "");
                  }

                  if (field491) {
                     field491 = false;
                     class402.method7065();
                  }

                  if (!var10 && var3 > 0 && var11 >= var3) {
                     class524.method5856("Warning: Script " + var1.field709 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
                  }

               }
            }

            while(field493.size() > 0) {
               class80 var30 = (class80)field493.remove(0);
               Client.method7794(var30.method1727(), var30.method1728(), var30.method1729(), var30.method1731(), "");
            }

            if (field491) {
               field491 = false;
               class402.method7065();
            }

            if (!var10 && var3 > 0 && var11 >= var3) {
               class524.method5856("Warning: Script " + var1.field709 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
            }

            return;
         }

         while(field493.size() > 0) {
            class80 var38 = (class80)field493.remove(0);
            Client.method7794(var38.method1727(), var38.method1728(), var38.method1729(), var38.method1731(), "");
         }

         if (field491) {
            field491 = false;
            class402.method7065();
         }

         if (!var10 && var3 > 0 && var11 >= var3) {
            class524.method5856("Warning: Script " + var1.field709 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
         }

         return;
      }

      while(field493.size() > 0) {
         class80 var26 = (class80)field493.remove(0);
         Client.method7794(var26.method1727(), var26.method1728(), var26.method1729(), var26.method1731(), "");
      }

      if (field491) {
         field491 = false;
         class402.method7065();
      }

      if (!var10 && var3 > 0 && var11 >= var3) {
         class524.method5856("Warning: Script " + var1.field709 + " finished at op count " + var11 + " of max " + var2, (Throwable)null);
      }

   }

   static int method5740(int var0, class81 var1, boolean var2) {
      int var4;
      int var5;
      if (var0 == 100) {
         field479 -= 3;
         var4 = field483[field479];
         var5 = field483[field479 + 1];
         int var12 = field483[field479 + 2];
         if (var5 == 0) {
            throw new RuntimeException();
         } else {
            class332 var7 = class332.method3765(var4);
            if (null == var7.field3743) {
               var7.field3743 = new class332[var12 + 1];
            }

            if (var7.field3743.length <= var12) {
               class332[] var8 = new class332[var12 + 1];

               for(int var9 = 0; var9 < var7.field3743.length; ++var9) {
                  var8[var9] = var7.field3743[var9];
               }

               var7.field3743 = var8;
            }

            if (var12 > 0 && null == var7.field3743[var12 - 1]) {
               throw new RuntimeException("" + (var12 - 1));
            } else {
               class332 var13 = new class332();
               var13.field3608 = var5;
               var13.field3625 = var13.field3606 = var7.field3606;
               var13.field3607 = var12;
               var13.field3605 = true;
               if (var5 == 12) {
                  var13.method6228();
                  var13.method6277().method5949(new class117(var13));
                  var13.method6277().method5969(new class107(var13));
               }

               var7.field3743[var12] = var13;
               if (var2) {
                  class44.field301 = var13;
               } else {
                  class358.field3961 = var13;
               }

               Client.method3898(var7);
               return 1;
            }
         }
      } else {
         class332 var10;
         if (var0 == 101) {
            var10 = var2 ? class44.field301 : class358.field3961;
            class332 var11 = class332.method3765(var10.field3606);
            var11.field3743[var10.field3607] = null;
            Client.method3898(var11);
            return 1;
         } else if (var0 == 102) {
            var10 = class332.method3765(field483[--field479]);
            var10.field3743 = null;
            Client.method3898(var10);
            return 1;
         } else if (var0 != 200) {
            if (var0 == 201) {
               var10 = class332.method3765(field483[--field479]);
               if (null != var10) {
                  field483[++field479 - 1] = 1;
                  if (var2) {
                     class44.field301 = var10;
                  } else {
                     class358.field3961 = var10;
                  }
               } else {
                  field483[++field479 - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            field479 -= 2;
            var4 = field483[field479];
            var5 = field483[1 + field479];
            class332 var6 = class332.method1772(var4, var5);
            if (null != var6 && var5 != -1) {
               field483[++field479 - 1] = 1;
               if (var2) {
                  class44.field301 = var6;
               } else {
                  class358.field3961 = var6;
               }
            } else {
               field483[++field479 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method2166(int var0, class81 var1, boolean var2) {
      int var4 = -1;
      class332 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = field483[--field479];
         var5 = class332.method3765(var4);
      } else {
         var5 = var2 ? class44.field301 : class358.field3961;
      }

      if (var0 == 1000) {
         field479 -= 4;
         var5.field3615 = field483[field479];
         var5.field3616 = field483[field479 + 1];
         var5.field3700 = field483[field479 + 2];
         var5.field3612 = field483[field479 + 3];
         Client.method3898(var5);
         class124.field1180.method2717(var5);
         if (var4 != -1 && var5.field3608 == 0) {
            class34.method512(class96.field884[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1001) {
         field479 -= 4;
         var5.field3732 = field483[field479];
         var5.field3740 = field483[field479 + 1];
         var5.field3592 = field483[field479 + 2];
         var5.field3614 = field483[field479 + 3];
         Client.method3898(var5);
         class124.field1180.method2717(var5);
         if (var4 != -1 && var5.field3608 == 0) {
            class34.method512(class96.field884[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = field483[--field479] == 1;
         if (var6 != var5.field3626) {
            var5.field3626 = var6;
            Client.method3898(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.field3753 = field483[--field479] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.field3754 = field483[--field479] == 1;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1083(int var0, class81 var1, boolean var2) {
      int var5 = -1;
      class332 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = field483[--field479];
         var4 = class332.method3765(var5);
      } else {
         var4 = var2 ? class44.field301 : class358.field3961;
      }

      int var14;
      if (var0 == 1100) {
         field479 -= 2;
         var14 = field483[field479];
         int var11 = field483[1 + field479];
         if (12 == var4.field3608) {
            class327 var8 = var4.method6277();
            if (null != var8 && var8.method5950(var14, var11)) {
               Client.method3898(var4);
            }
         } else {
            var4.field3627 = var14;
            if (var4.field3627 > var4.field3629 - var4.field3598) {
               var4.field3627 = var4.field3629 - var4.field3598;
            }

            if (var4.field3627 < 0) {
               var4.field3627 = 0;
            }

            var4.field3628 = var11;
            if (var4.field3628 > var4.field3719 - var4.field3622) {
               var4.field3628 = var4.field3719 - var4.field3622;
            }

            if (var4.field3628 < 0) {
               var4.field3628 = 0;
            }

            Client.method3898(var4);
         }

         return 1;
      } else if (var0 == 1101) {
         var4.field3718 = field483[--field479];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1102) {
         var4.field3721 = field483[--field479] == 1;
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1103) {
         var4.field3637 = field483[--field479];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1104) {
         var4.field3639 = field483[--field479];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1105) {
         var4.field3641 = field483[--field479];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1106) {
         var4.field3644 = field483[--field479];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1107) {
         var4.field3645 = field483[--field479] == 1;
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1108) {
         var4.field3650 = 1;
         var4.field3603 = field483[--field479];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1109) {
         field479 -= 6;
         var4.field3656 = field483[field479];
         var4.field3657 = field483[field479 + 1];
         var4.field3646 = field483[2 + field479];
         var4.field3659 = field483[3 + field479];
         var4.field3750 = field483[field479 + 4];
         var4.field3661 = field483[field479 + 5];
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1110) {
         var14 = field483[--field479];
         if (var14 != var4.field3654) {
            var4.field3654 = var14;
            var4.field3741 = 0;
            var4.field3742 = 0;
            Client.method3898(var4);
         }

         return 1;
      } else if (var0 == 1111) {
         var4.field3665 = field483[--field479] == 1;
         Client.method3898(var4);
         return 1;
      } else if (var0 == 1112) {
         String var15 = field484[--field486];
         if (!var15.equals(var4.field3621)) {
            var4.field3621 = var15;
            Client.method3898(var4);
         }

         return 1;
      } else {
         class327 var9;
         if (var0 == 1113) {
            var4.field3590 = field483[--field479];
            if (var4.field3608 == 12) {
               var9 = var4.method6277();
               if (null != var9) {
                  var9.method5918();
               }
            }

            Client.method3898(var4);
            return 1;
         } else if (var0 == 1114) {
            field479 -= 3;
            if (var4.field3608 == 12) {
               var9 = var4.method6277();
               if (null != var9) {
                  var9.method5912(field483[field479], field483[1 + field479]);
                  var9.method6052(field483[field479 + 2]);
               }
            } else {
               var4.field3672 = field483[field479];
               var4.field3673 = field483[field479 + 1];
               var4.field3671 = field483[field479 + 2];
            }

            Client.method3898(var4);
            return 1;
         } else if (var0 == 1115) {
            var4.field3688 = field483[--field479] == 1;
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1116) {
            var4.field3696 = field483[--field479];
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1117) {
            var4.field3709 = field483[--field479];
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1118) {
            var4.field3648 = field483[--field479] == 1;
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1119) {
            var4.field3649 = field483[--field479] == 1;
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1120) {
            field479 -= 2;
            var4.field3629 = field483[field479];
            var4.field3719 = field483[field479 + 1];
            Client.method3898(var4);
            if (var5 != -1 && var4.field3608 == 0) {
               class34.method512(class96.field884[var5 >> 16], var4, false);
            }

            return 1;
         } else if (var0 == 1121) {
            Client.method5003(var4.field3606, var4.field3607);
            Client.field1605 = var4;
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1122) {
            var4.field3642 = field483[--field479];
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1123) {
            var4.field3632 = field483[--field479];
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1124) {
            var4.field3638 = field483[--field479];
            Client.method3898(var4);
            return 1;
         } else if (var0 == 1125) {
            var14 = field483[--field479];
            class522 var10 = (class522)class373.method1724(class522.method4400(), var14);
            if (var10 != null) {
               var4.field3636 = var10;
               Client.method3898(var4);
            }

            return 1;
         } else {
            boolean var12;
            if (var0 == 1126) {
               var12 = field483[--field479] == 1;
               var4.field3708 = var12;
               return 1;
            } else if (var0 == 1127) {
               var12 = field483[--field479] == 1;
               var4.field3666 = var12;
               return 1;
            } else if (var0 == 1129) {
               var4.field3643 = field484[--field486];
               Client.method3898(var4);
               return 1;
            } else if (var0 == 1130) {
               var4.method6291(field484[--field486], class261.field2935, Client.method2114());
               return 1;
            } else if (var0 == 1131) {
               field479 -= 2;
               var4.method6229(field483[field479], field483[field479 + 1]);
               return 1;
            } else if (var0 == 1132) {
               var4.method6230(field484[--field486], field483[--field479]);
               return 1;
            } else {
               class337 var13;
               if (var0 == 1133) {
                  --field479;
                  var13 = var4.method6242();
                  if (var13 != null) {
                     var13.field3781 = field483[field479];
                     Client.method3898(var4);
                  }

                  return 1;
               } else if (var0 == 1134) {
                  --field479;
                  var13 = var4.method6242();
                  if (var13 != null) {
                     var13.field3782 = field483[field479];
                     Client.method3898(var4);
                  }

                  return 1;
               } else if (var0 == 1135) {
                  --field486;
                  var9 = var4.method6277();
                  if (var9 != null) {
                     var4.field3670 = field484[field486];
                  }

                  return 1;
               } else if (var0 == 1136) {
                  --field479;
                  var13 = var4.method6242();
                  if (var13 != null) {
                     var13.field3783 = field483[field479];
                     Client.method3898(var4);
                  }

                  return 1;
               } else if (var0 == 1137) {
                  --field479;
                  var9 = var4.method6277();
                  if (null != var9 && var9.method6073(field483[field479])) {
                     Client.method3898(var4);
                  }

                  return 1;
               } else if (var0 == 1138) {
                  --field479;
                  var9 = var4.method6277();
                  if (null != var9 && var9.method5909(field483[field479])) {
                     Client.method3898(var4);
                  }

                  return 1;
               } else if (var0 == 1139) {
                  --field479;
                  var9 = var4.method6277();
                  if (var9 != null && var9.method5910(field483[field479])) {
                     Client.method3898(var4);
                  }

                  return 1;
               } else {
                  class327 var7;
                  if (var0 == 1140) {
                     var12 = field483[--field479] == 1;
                     Client.field1528.method4390();
                     var7 = var4.method6277();
                     if (var7 != null && var7.method5902(var12)) {
                        if (var12) {
                           Client.field1528.method4393(var4);
                        }

                        Client.method3898(var4);
                     }

                     return 1;
                  } else if (var0 == 1141) {
                     var12 = field483[--field479] == 1;
                     if (!var12 && Client.field1528.method4389() == var4) {
                        Client.field1528.method4390();
                        Client.method3898(var4);
                     }

                     var7 = var4.method6277();
                     if (null != var7) {
                        var7.method5903(var12);
                     }

                     return 1;
                  } else if (var0 == 1142) {
                     field479 -= 2;
                     var9 = var4.method6277();
                     if (var9 != null && var9.method5926(field483[field479], field483[1 + field479])) {
                        Client.method3898(var4);
                     }

                     return 1;
                  } else if (var0 == 1143) {
                     --field479;
                     var9 = var4.method6277();
                     if (var9 != null && var9.method5926(field483[field479], field483[field479])) {
                        Client.method3898(var4);
                     }

                     return 1;
                  } else if (var0 == 1144) {
                     --field479;
                     var9 = var4.method6277();
                     if (var9 != null) {
                        var9.method5915(field483[field479]);
                        Client.method3898(var4);
                     }

                     return 1;
                  } else if (var0 == 1145) {
                     --field479;
                     var9 = var4.method6277();
                     if (var9 != null) {
                        var9.method6092(field483[field479]);
                     }

                     return 1;
                  } else if (var0 == 1146) {
                     --field479;
                     var9 = var4.method6277();
                     if (null != var9) {
                        var9.method5917(field483[field479]);
                     }

                     return 1;
                  } else if (var0 == 1147) {
                     --field479;
                     var9 = var4.method6277();
                     if (var9 != null) {
                        var9.method6019(field483[field479]);
                        Client.method3898(var4);
                     }

                     return 1;
                  } else {
                     class28 var6;
                     if (var0 == 1148) {
                        field479 -= 2;
                        var6 = var4.method6236();
                        if (var6 != null) {
                           var6.method393(field483[field479], field483[1 + field479]);
                        }

                        return 1;
                     } else if (var0 == 1149) {
                        field479 -= 2;
                        var6 = var4.method6236();
                        if (null != var6) {
                           var6.method394((char)field483[field479], field483[field479 + 1]);
                        }

                        return 1;
                     } else if (var0 == 1150) {
                        var4.method6227(field484[--field486], class261.field2935);
                        return 1;
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      }
   }

   static int method1174(int var0, class81 var1, boolean var2) {
      class332 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class332.method3765(field483[--field479]);
      } else {
         var4 = var2 ? class44.field301 : class358.field3961;
      }

      Client.method3898(var4);
      int var5;
      int var6;
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field3650 = 2;
            var4.field3603 = field483[--field479];
            return 1;
         } else if (var0 == 1202) {
            var4.field3650 = 3;
            var4.field3603 = class146.field1362.field764.method5803();
            return 1;
         } else if (var0 == 1207) {
            boolean var8 = field483[--field479] == 1;
            class332.method4653(var4, class146.field1362.field764, var8);
            return 1;
         } else if (var0 == 1208) {
            var5 = field483[--field479];
            if (null == var4.field3664) {
               throw new RuntimeException("");
            } else {
               class332.method2415(var4, var5);
               return 1;
            }
         } else if (var0 == 1209) {
            field479 -= 2;
            var5 = field483[field479];
            var6 = field483[1 + field479];
            if (var4.field3664 == null) {
               throw new RuntimeException("");
            } else {
               class332.method5687(var4, var5, var6);
               return 1;
            }
         } else if (var0 == 1210) {
            var5 = field483[--field479];
            if (null == var4.field3664) {
               throw new RuntimeException("");
            } else {
               class332.method3413(var4, class146.field1362.field764.field3486, var5);
               return 1;
            }
         } else {
            return 2;
         }
      } else {
         field479 -= 2;
         var5 = field483[field479];
         var6 = field483[1 + field479];
         var4.field3739 = var5;
         var4.field3630 = var6;
         class185 var7 = class185.method2355(var5);
         var4.field3646 = var7.field1970;
         var4.field3659 = var7.field1960;
         var4.field3750 = var7.field1972;
         var4.field3656 = var7.field1973;
         var4.field3657 = var7.field1971;
         var4.field3661 = var7.field1969;
         if (var0 == 1205) {
            var4.field3667 = 0;
         } else if (var0 == 1212 | var7.field1975 == 1) {
            var4.field3667 = 1;
         } else {
            var4.field3667 = 2;
         }

         if (var4.field3662 > 0) {
            var4.field3661 = var4.field3661 * 32 / var4.field3662;
         } else if (var4.field3732 > 0) {
            var4.field3661 = var4.field3661 * 32 / var4.field3732;
         }

         return 1;
      }
   }

   static int method282(int var0, class81 var1, boolean var2) {
      boolean var4 = true;
      class332 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class332.method3765(field483[--field479]);
         var4 = false;
      } else {
         var5 = var2 ? class44.field301 : class358.field3961;
      }

      int var9;
      if (var0 == 1300) {
         var9 = field483[--field479] - 1;
         if (var9 >= 0 && var9 <= 9) {
            var5.method6223(var9, field484[--field486]);
            return 1;
         } else {
            --field486;
            return 1;
         }
      } else {
         int var11;
         if (var0 == 1301) {
            field479 -= 2;
            var9 = field483[field479];
            var11 = field483[field479 + 1];
            var5.field3714 = class332.method1772(var9, var11);
            return 1;
         } else if (var0 == 1302) {
            var5.field3691 = field483[--field479] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.field3651 = field483[--field479];
            return 1;
         } else if (var0 == 1304) {
            var5.field3690 = field483[--field479];
            return 1;
         } else if (var0 == 1305) {
            var5.field3686 = field484[--field486];
            return 1;
         } else if (var0 == 1306) {
            var5.field3692 = field484[--field486];
            return 1;
         } else if (var0 == 1307) {
            var5.field3647 = null;
            return 1;
         } else if (var0 == 1308) {
            var5.field3755 = field483[--field479] == 1;
            return 1;
         } else if (var0 == 1309) {
            --field479;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (var0 != 1350) {
               byte var10;
               if (var0 == 1351) {
                  field479 -= 2;
                  var10 = 10;
                  var7 = new byte[]{(byte)field483[field479]};
                  byte[] var12 = new byte[]{(byte)field483[1 + field479]};
                  method7035(var5, var10, var7, var12);
                  return 1;
               } else if (var0 == 1352) {
                  field479 -= 3;
                  var9 = field483[field479] - 1;
                  var11 = field483[1 + field479];
                  var8 = field483[field479 + 2];
                  if (var9 >= 0 && var9 <= 9) {
                     method3593(var5, var9, var11, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var10 = 10;
                  var11 = field483[--field479];
                  var8 = field483[--field479];
                  method3593(var5, var10, var11, var8);
                  return 1;
               } else if (var0 == 1354) {
                  --field479;
                  var9 = field483[field479] - 1;
                  if (var9 >= 0 && var9 <= 9) {
                     method1390(var5, var9);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var9 = 10;
                  method1390(var5, var9);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  field479 -= 10;

                  for(var8 = 0; var8 < 10 && field483[var8 + field479] >= 0; var8 += 2) {
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)field483[var8 + field479];
                        var7[var8 / 2] = (byte)field483[var8 + field479 + 1];
                     }
                  }
               } else {
                  field479 -= 2;
                  var6 = new byte[]{(byte)field483[field479]};
                  var7 = new byte[]{(byte)field483[1 + field479]};
               }

               var8 = field483[--field479] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  method7035(var5, var8, var6, var7);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   static final void method7035(class332 var0, int var1, byte[] var2, byte[] var3) {
      if (null == var0.field3694) {
         if (null == var2) {
            return;
         }

         var0.field3694 = new byte[11][];
         var0.field3683 = new byte[11][];
         var0.field3640 = new int[11];
         var0.field3613 = new int[11];
      }

      var0.field3694[var1] = var2;
      if (var2 != null) {
         var0.field3681 = true;
      } else {
         var0.field3681 = false;

         for(int var5 = 0; var5 < var0.field3694.length; ++var5) {
            if (var0.field3694[var5] != null) {
               var0.field3681 = true;
               break;
            }
         }
      }

      var0.field3683[var1] = var3;
   }

   static final void method3593(class332 var0, int var1, int var2, int var3) {
      if (null == var0.field3640) {
         throw new RuntimeException();
      } else {
         var0.field3640[var1] = var2;
         var0.field3613[var1] = var3;
      }
   }

   static final void method1390(class332 var0, int var1) {
      if (var0.field3694 == null) {
         throw new RuntimeException();
      } else {
         if (null == var0.field3752) {
            var0.field3752 = new int[var0.field3694.length];
         }

         var0.field3752[var1] = Integer.MAX_VALUE;
      }
   }

   static int method69(int var0, class81 var1, boolean var2) {
      class332 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class332.method3765(field483[--field479]);
      } else {
         var4 = var2 ? class44.field301 : class358.field3961;
      }

      String var5 = field484[--field486];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = field483[--field479];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = field483[--field479]) {
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var10 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var10.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var10[var8] = field484[--field486];
         } else {
            var10[var8] = new Integer(field483[--field479]);
         }
      }

      var8 = field483[--field479];
      if (var8 != -1) {
         var10[0] = new Integer(var8);
      } else {
         var10 = null;
      }

      if (var0 == 1400) {
         var4.field3695 = var10;
      } else if (var0 == 1401) {
         var4.field3698 = var10;
      } else if (var0 == 1402) {
         var4.field3697 = var10;
      } else if (var0 == 1403) {
         var4.field3699 = var10;
      } else if (var0 == 1404) {
         var4.field3701 = var10;
      } else if (var0 == 1405) {
         var4.field3702 = var10;
      } else if (var0 == 1406) {
         var4.field3706 = var10;
      } else if (var0 == 1407) {
         var4.field3668 = var10;
         var4.field3707 = var6;
      } else if (var0 == 1408) {
         var4.field3687 = var10;
      } else if (var0 == 1409) {
         var4.field3713 = var10;
      } else if (var0 == 1410) {
         var4.field3703 = var10;
      } else if (var0 == 1411) {
         var4.field3693 = var10;
      } else if (var0 == 1412) {
         var4.field3660 = var10;
      } else if (var0 == 1414) {
         var4.field3685 = var10;
         var4.field3704 = var6;
      } else if (var0 == 1415) {
         var4.field3710 = var10;
         var4.field3711 = var6;
      } else if (var0 == 1416) {
         var4.field3716 = var10;
      } else if (var0 == 1417) {
         var4.field3715 = var10;
      } else if (var0 == 1418) {
         var4.field3751 = var10;
      } else if (var0 == 1419) {
         var4.field3717 = var10;
      } else if (var0 == 1420) {
         var4.field3720 = var10;
      } else if (var0 == 1421) {
         var4.field3623 = var10;
      } else if (var0 == 1422) {
         var4.field3724 = var10;
      } else if (var0 == 1423) {
         var4.field3725 = var10;
      } else if (var0 == 1424) {
         var4.field3726 = var10;
      } else if (var0 == 1425) {
         var4.field3635 = var10;
      } else if (var0 == 1426) {
         var4.field3729 = var10;
      } else if (var0 == 1427) {
         var4.field3597 = var10;
      } else if (var0 == 1428) {
         var4.field3722 = var10;
      } else if (var0 == 1429) {
         var4.field3723 = var10;
      } else if (var0 == 1430) {
         var4.field3601 = var10;
      } else if (var0 == 1431) {
         var4.field3618 = var10;
      } else if (var0 == 1434) {
         var4.field3730 = var10;
      } else if (var0 == 1435) {
         var4.field3611 = var10;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class338 var9 = var4.method6244();
         if (var9 != null) {
            if (var0 == 1436) {
               var9.field3791 = var10;
            } else if (var0 == 1437) {
               var9.field3790 = var10;
            } else if (var0 == 1438) {
               var9.field3788 = var10;
            } else if (var0 == 1439) {
               var9.field3787 = var10;
            }
         }
      }

      var4.field3747 = true;
      return 1;
   }

   static int method283(int var0, class81 var1, boolean var2) {
      class332 var4 = var2 ? class44.field301 : class358.field3961;
      if (var0 == 1500) {
         field483[++field479 - 1] = var4.field3619;
         return 1;
      } else if (var0 == 1501) {
         field483[++field479 - 1] = var4.field3620;
         return 1;
      } else if (var0 == 1502) {
         field483[++field479 - 1] = var4.field3598;
         return 1;
      } else if (var0 == 1503) {
         field483[++field479 - 1] = var4.field3622;
         return 1;
      } else if (var0 == 1504) {
         field483[++field479 - 1] = var4.field3626 ? 1 : 0;
         return 1;
      } else if (var0 == 1505) {
         field483[++field479 - 1] = var4.field3625;
         return 1;
      } else {
         return 2;
      }
   }

   static int method7679(int var0, class81 var1, boolean var2) {
      class332 var4 = var2 ? class44.field301 : class358.field3961;
      if (var0 == 1600) {
         field483[++field479 - 1] = var4.field3627;
         return 1;
      } else if (var0 == 1601) {
         field483[++field479 - 1] = var4.field3628;
         return 1;
      } else {
         class327 var8;
         if (var0 == 1602) {
            if (var4.field3608 == 12) {
               var8 = var4.method6277();
               if (var8 != null) {
                  field484[++field486 - 1] = var8.method6006().method7333();
                  return 1;
               }
            }

            field484[++field486 - 1] = var4.field3621;
            return 1;
         } else if (var0 == 1603) {
            field483[++field479 - 1] = var4.field3629;
            return 1;
         } else if (var0 == 1604) {
            field483[++field479 - 1] = var4.field3719;
            return 1;
         } else if (var0 == 1605) {
            field483[++field479 - 1] = var4.field3661;
            return 1;
         } else if (var0 == 1606) {
            field483[++field479 - 1] = var4.field3646;
            return 1;
         } else if (var0 == 1607) {
            field483[++field479 - 1] = var4.field3750;
            return 1;
         } else if (var0 == 1608) {
            field483[++field479 - 1] = var4.field3659;
            return 1;
         } else if (var0 == 1609) {
            field483[++field479 - 1] = var4.field3637;
            return 1;
         } else if (var0 == 1610) {
            field483[++field479 - 1] = var4.field3638;
            return 1;
         } else if (var0 == 1611) {
            field483[++field479 - 1] = var4.field3718;
            return 1;
         } else if (var0 == 1612) {
            field483[++field479 - 1] = var4.field3632;
            return 1;
         } else if (var0 == 1613) {
            field483[++field479 - 1] = var4.field3636.method6917();
            return 1;
         } else if (var0 == 1614) {
            field483[++field479 - 1] = var4.field3666 ? 1 : 0;
            return 1;
         } else {
            class337 var5;
            if (var0 == 1617) {
               var5 = var4.method6242();
               field483[++field479 - 1] = null != var5 ? var5.field3781 : 0;
            }

            if (var0 == 1618) {
               var5 = var4.method6242();
               field483[++field479 - 1] = var5 != null ? var5.field3782 : 0;
               return 1;
            } else if (var0 == 1619) {
               var8 = var4.method6277();
               field484[++field486 - 1] = null != var8 ? var8.method6157().method7333() : "";
               return 1;
            } else if (var0 == 1620) {
               var5 = var4.method6242();
               field483[++field479 - 1] = null != var5 ? var5.field3783 : 0;
               return 1;
            } else if (var0 == 1621) {
               var8 = var4.method6277();
               field483[++field479 - 1] = var8 != null ? var8.method5961() : 0;
               return 1;
            } else if (var0 == 1622) {
               var8 = var4.method6277();
               field483[++field479 - 1] = null != var8 ? var8.method5962() : 0;
               return 1;
            } else if (var0 == 1623) {
               var8 = var4.method6277();
               field483[++field479 - 1] = var8 != null ? var8.method5963() : 0;
               return 1;
            } else if (var0 == 1624) {
               var8 = var4.method6277();
               field483[++field479 - 1] = null != var8 && var8.method5953() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var8 = var4.method6277();
                  field484[++field486 - 1] = var8 != null ? var8.method5952().method7101() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var8 = var4.method6277();
                  int var6 = var8 != null ? var8.method5957() : 0;
                  int var7 = null != var8 ? var8.method5956() : 0;
                  field483[++field479 - 1] = Math.min(var6, var7);
                  field483[++field479 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 1628) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method5956() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method5965() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method5946() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method6053() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = var8 != null ? var8.method6042() : 0;
                  return 1;
               } else {
                  class28 var9;
                  if (var0 == 1633) {
                     var9 = var4.method6236();
                     field483[field479 - 1] = null != var9 ? var9.method395(field483[field479 - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var9 = var4.method6236();
                     field483[field479 - 1] = null != var9 ? var9.method392((char)field483[field479 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method6277();
               field483[++field479 - 1] = null != var8 && var8.method5954() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static int method1825(int var0, class81 var1, boolean var2) {
      class332 var4 = var2 ? class44.field301 : class358.field3961;
      if (var0 == 1700) {
         field483[++field479 - 1] = var4.field3739;
         return 1;
      } else if (var0 == 1701) {
         if (var4.field3739 != -1) {
            field483[++field479 - 1] = var4.field3630;
         } else {
            field483[++field479 - 1] = 0;
         }

         return 1;
      } else if (var0 == 1702) {
         field483[++field479 - 1] = var4.field3607;
         return 1;
      } else if (var0 == 1707) {
         field483[++field479 - 1] = var4.method6232() ? 1 : 0;
         return 1;
      } else if (var0 == 1708) {
         return method1194(var4);
      } else {
         return var0 == 1709 ? method2554(var4) : 2;
      }
   }

   static int method1194(class332 var0) {
      if (11 != var0.field3608) {
         --field486;
         field483[++field479 - 1] = -1;
         return 1;
      } else {
         String var2 = field484[--field486];
         field483[++field479 - 1] = var0.method6233(var2);
         return 1;
      }
   }

   static int method2554(class332 var0) {
      if (var0.field3608 != 11) {
         field484[field486 - 1] = "";
         return 1;
      } else {
         String var2 = field484[--field486];
         field484[++field486 - 1] = var0.method6234(var2);
         return 1;
      }
   }

   static int method4662(int var0, class81 var1, boolean var2) {
      class332 var4 = var2 ? class44.field301 : class358.field3961;
      if (var0 == 1800) {
         field483[++field479 - 1] = class323.method5357(Client.method2338(var4));
         return 1;
      } else if (var0 != 1801) {
         if (var0 == 1802) {
            if (var4.field3686 == null) {
               field484[++field486 - 1] = "";
            } else {
               field484[++field486 - 1] = var4.field3686;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = field483[--field479];
         --var5;
         if (var4.field3647 != null && var5 < var4.field3647.length && var4.field3647[var5] != null) {
            field484[++field486 - 1] = var4.field3647[var5];
         } else {
            field484[++field486 - 1] = "";
         }

         return 1;
      }
   }

   static int method6367(int var0, class81 var1, boolean var2) {
      class332 var4;
      if (var0 != 1927 && var0 != 2927) {
         int var9;
         if (var0 == 1928) {
            var4 = var2 ? class44.field301 : class358.field3961;
            var9 = field483[--field479];
            if (var9 >= 1 && var9 <= 10) {
               class80 var10 = new class80(var9, var4.field3606, var4.field3607, var4.field3739);
               field493.add(var10);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else if (var0 == 2928) {
            field479 -= 3;
            int var8 = field483[field479];
            var9 = field483[1 + field479];
            int var6 = field483[field479 + 2];
            if (var6 >= 1 && var6 <= 10) {
               class80 var7 = new class80(var6, var8, var9, class332.method3765(var8).field3739);
               field493.add(var7);
               return 1;
            } else {
               throw new RuntimeException();
            }
         } else {
            return 2;
         }
      } else if (field494 >= 10) {
         throw new RuntimeException();
      } else {
         if (var0 >= 2000) {
            var4 = class332.method3765(field483[--field479]);
         } else {
            var4 = var2 ? class44.field301 : class358.field3961;
         }

         if (var4.field3597 == null) {
            return 0;
         } else {
            class87 var5 = new class87();
            var5.field786 = var4;
            var5.field790 = var4.field3597;
            var5.field789 = 1 + field494;
            Client.field1643.method6680(var5);
            return 1;
         }
      }
   }

   static int method3586(int var0, class81 var1, boolean var2) {
      class332 var4 = class332.method3765(field483[--field479]);
      if (var0 == 2500) {
         field483[++field479 - 1] = var4.field3619;
         return 1;
      } else if (var0 == 2501) {
         field483[++field479 - 1] = var4.field3620;
         return 1;
      } else if (var0 == 2502) {
         field483[++field479 - 1] = var4.field3598;
         return 1;
      } else if (var0 == 2503) {
         field483[++field479 - 1] = var4.field3622;
         return 1;
      } else if (var0 == 2504) {
         field483[++field479 - 1] = var4.field3626 ? 1 : 0;
         return 1;
      } else if (var0 == 2505) {
         field483[++field479 - 1] = var4.field3625;
         return 1;
      } else {
         return 2;
      }
   }

   static int method587(int var0, class81 var1, boolean var2) {
      class332 var4 = class332.method3765(field483[--field479]);
      if (var0 == 2600) {
         field483[++field479 - 1] = var4.field3627;
         return 1;
      } else if (var0 == 2601) {
         field483[++field479 - 1] = var4.field3628;
         return 1;
      } else if (var0 == 2602) {
         field484[++field486 - 1] = var4.field3621;
         return 1;
      } else if (var0 == 2603) {
         field483[++field479 - 1] = var4.field3629;
         return 1;
      } else if (var0 == 2604) {
         field483[++field479 - 1] = var4.field3719;
         return 1;
      } else if (var0 == 2605) {
         field483[++field479 - 1] = var4.field3661;
         return 1;
      } else if (var0 == 2606) {
         field483[++field479 - 1] = var4.field3646;
         return 1;
      } else if (var0 == 2607) {
         field483[++field479 - 1] = var4.field3750;
         return 1;
      } else if (var0 == 2608) {
         field483[++field479 - 1] = var4.field3659;
         return 1;
      } else if (var0 == 2609) {
         field483[++field479 - 1] = var4.field3637;
         return 1;
      } else if (var0 == 2610) {
         field483[++field479 - 1] = var4.field3638;
         return 1;
      } else if (var0 == 2611) {
         field483[++field479 - 1] = var4.field3718;
         return 1;
      } else if (var0 == 2612) {
         field483[++field479 - 1] = var4.field3632;
         return 1;
      } else if (var0 == 2613) {
         field483[++field479 - 1] = var4.field3636.method6917();
         return 1;
      } else if (var0 == 2614) {
         field483[++field479 - 1] = var4.field3666 ? 1 : 0;
         return 1;
      } else {
         class337 var5;
         if (var0 == 2617) {
            var5 = var4.method6242();
            field483[++field479 - 1] = null != var5 ? var5.field3781 : 0;
         }

         if (var0 == 2618) {
            var5 = var4.method6242();
            field483[++field479 - 1] = var5 != null ? var5.field3782 : 0;
            return 1;
         } else {
            class327 var8;
            if (var0 == 2619) {
               var8 = var4.method6277();
               field484[++field486 - 1] = null != var8 ? var8.method6157().method7333() : "";
               return 1;
            } else if (var0 == 2620) {
               var5 = var4.method6242();
               field483[++field479 - 1] = null != var5 ? var5.field3783 : 0;
               return 1;
            } else if (var0 == 2621) {
               var8 = var4.method6277();
               field483[++field479 - 1] = null != var8 ? var8.method5961() : 0;
               return 1;
            } else if (var0 == 2622) {
               var8 = var4.method6277();
               field483[++field479 - 1] = null != var8 ? var8.method5962() : 0;
               return 1;
            } else if (var0 == 2623) {
               var8 = var4.method6277();
               field483[++field479 - 1] = var8 != null ? var8.method5963() : 0;
               return 1;
            } else if (var0 == 2624) {
               var8 = var4.method6277();
               field483[++field479 - 1] = var8 != null && var8.method5953() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var8 = var4.method6277();
                  field484[++field486 - 1] = null != var8 ? var8.method5952().method7101() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var8 = var4.method6277();
                  int var6 = null != var8 ? var8.method5957() : 0;
                  int var7 = var8 != null ? var8.method5956() : 0;
                  field483[++field479 - 1] = Math.min(var6, var7);
                  field483[++field479 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 2628) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method5956() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = var8 != null ? var8.method5965() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = var8 != null ? var8.method5946() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method6053() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var8 = var4.method6277();
                  field483[++field479 - 1] = null != var8 ? var8.method6042() : 0;
                  return 1;
               } else {
                  class28 var9;
                  if (var0 == 2633) {
                     var9 = var4.method6236();
                     field483[field479 - 1] = null != var9 ? var9.method395(field483[field479 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var9 = var4.method6236();
                     field483[field479 - 1] = var9 != null ? var9.method392((char)field483[field479 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method6277();
               field483[++field479 - 1] = var8 != null && var8.method5954() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static int method3277(int var0, class81 var1, boolean var2) {
      class332 var4;
      if (var0 == 2700) {
         var4 = class332.method3765(field483[--field479]);
         field483[++field479 - 1] = var4.field3739;
         return 1;
      } else if (var0 == 2701) {
         var4 = class332.method3765(field483[--field479]);
         if (var4.field3739 != -1) {
            field483[++field479 - 1] = var4.field3630;
         } else {
            field483[++field479 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2702) {
         int var6 = field483[--field479];
         class92 var5 = (class92) Client.field1601.method8184((long)var6);
         if (null != var5) {
            field483[++field479 - 1] = 1;
         } else {
            field483[++field479 - 1] = 0;
         }

         return 1;
      } else if (var0 == 2706) {
         field483[++field479 - 1] = Client.field1600;
         return 1;
      } else if (var0 == 2707) {
         var4 = class332.method3765(field483[--field479]);
         field483[++field479 - 1] = var4.method6232() ? 1 : 0;
         return 1;
      } else if (var0 == 2708) {
         var4 = class332.method3765(field483[--field479]);
         return method1194(var4);
      } else if (var0 == 2709) {
         var4 = class332.method3765(field483[--field479]);
         return method2554(var4);
      } else {
         return 2;
      }
   }

   static int method1989(int var0, class81 var1, boolean var2) {
      class332 var4 = class332.method3765(field483[--field479]);
      if (var0 == 2800) {
         field483[++field479 - 1] = class323.method5357(Client.method2338(var4));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var4.field3686 == null) {
               field484[++field486 - 1] = "";
            } else {
               field484[++field486 - 1] = var4.field3686;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = field483[--field479];
         --var5;
         if (null != var4.field3647 && var5 < var4.field3647.length && null != var4.field3647[var5]) {
            field484[++field486 - 1] = var4.field3647[var5];
         } else {
            field484[++field486 - 1] = "";
         }

         return 1;
      }
   }

   static int method276(int var0, class81 var1, boolean var2) {
      String var12;
      if (var0 == 3100) {
         var12 = field484[--field486];
         class119.method7274(0, "", var12);
         return 1;
      } else if (var0 == 3101) {
         field479 -= 2;
         class265.method5208(class146.field1362, field483[field479], field483[field479 + 1]);
         return 1;
      } else if (var0 == 3103) {
         if (!field477) {
            field491 = true;
         }

         return 1;
      } else {
         int var11;
         if (var0 == 3104) {
            var12 = field484[--field486];
            var11 = 0;
            if (class380.method4205(var12)) {
               var11 = class380.method5731(var12);
            }

            class308 var15 = class308.method8607(class309.field3412, Client.field1436.field1046);
            var15.field3351.writeInt(var11);
            Client.field1436.method2148(var15);
            return 1;
         } else {
            class308 var9;
            if (var0 == 3105) {
               var12 = field484[--field486];
               var9 = class308.method8607(class309.field3391, Client.field1436.field1046);
               var9.field3351.writeByte(var12.length() + 1);
               var9.field3351.writeString(var12);
               Client.field1436.method2148(var9);
               return 1;
            } else if (var0 == 3106) {
               var12 = field484[--field486];
               var9 = class308.method8607(class309.field3414, Client.field1436.field1046);
               var9.field3351.writeByte(var12.length() + 1);
               var9.field3351.writeString(var12);
               Client.field1436.method2148(var9);
               return 1;
            } else {
               int var4;
               String var5;
               if (var0 == 3107) {
                  var4 = field483[--field479];
                  var5 = field484[--field486];
                  class40.method595(var4, var5);
                  return 1;
               } else if (var0 == 3108) {
                  field479 -= 3;
                  var4 = field483[field479];
                  var11 = field483[1 + field479];
                  int var14 = field483[2 + field479];
                  class332 var16 = class332.method3765(var14);
                  Client.method6574(var16, var4, var11);
                  return 1;
               } else if (var0 == 3109) {
                  field479 -= 2;
                  var4 = field483[field479];
                  var11 = field483[field479 + 1];
                  class332 var13 = var2 ? class44.field301 : class358.field3961;
                  Client.method6574(var13, var4, var11);
                  return 1;
               } else if (var0 == 3110) {
                  class40.field238 = field483[--field479] == 1;
                  return 1;
               } else if (var0 == 3111) {
                  field483[++field479 - 1] = class141.field1307.method1613() ? 1 : 0;
                  return 1;
               } else if (var0 == 3112) {
                  class141.field1307.method1612(field483[--field479] == 1);
                  return 1;
               } else if (var0 == 3113) {
                  var12 = field484[--field486];
                  boolean var10 = field483[--field479] == 1;
                  class45.method1843(var12, var10, false);
                  return 1;
               } else if (var0 == 3115) {
                  var4 = field483[--field479];
                  var9 = class308.method8607(class309.field3403, Client.field1436.field1046);
                  var9.field3351.writeShort(var4);
                  Client.field1436.method2148(var9);
                  return 1;
               } else if (var0 == 3116) {
                  var4 = field483[--field479];
                  field486 -= 2;
                  var5 = field484[field486];
                  String var6 = field484[1 + field486];
                  if (var5.length() > 500) {
                     return 1;
                  } else if (var6.length() > 500) {
                     return 1;
                  } else {
                     class308 var7 = class308.method8607(class309.field3454, Client.field1436.field1046);
                     var7.field3351.writeShort(1 + PacketBuffer.getJagStringSize(var5) + PacketBuffer.getJagStringSize(var6));
                     var7.field3351.writeString(var6);
                     var7.field3351.writeString(var5);
                     var7.field3351.writeByteNeg(var4);
                     Client.field1436.method2148(var7);
                     return 1;
                  }
               } else if (var0 == 3117) {
                  --field479;
                  return 1;
               } else if (var0 == 3118) {
                  Client.field1617 = field483[--field479] == 1;
                  return 1;
               } else if (var0 == 3119) {
                  Client.field1682 = field483[--field479] == 1;
                  return 1;
               } else if (var0 == 3120) {
                  if (field483[--field479] == 1) {
                     Client.field1560 |= 1;
                  } else {
                     Client.field1560 &= -2;
                  }

                  return 1;
               } else if (var0 == 3121) {
                  if (field483[--field479] == 1) {
                     Client.field1560 |= 2;
                  } else {
                     Client.field1560 &= -3;
                  }

                  return 1;
               } else if (var0 == 3122) {
                  if (field483[--field479] == 1) {
                     Client.field1560 |= 4;
                  } else {
                     Client.field1560 &= -5;
                  }

                  return 1;
               } else if (var0 == 3123) {
                  if (field483[--field479] == 1) {
                     Client.field1560 |= 8;
                  } else {
                     Client.field1560 &= -9;
                  }

                  return 1;
               } else if (var0 == 3124) {
                  Client.field1560 = 0;
                  return 1;
               } else if (var0 == 3125) {
                  Client.field1555 = field483[--field479] == 1;
                  return 1;
               } else if (var0 == 3126) {
                  Client.field1496 = field483[--field479] == 1;
                  return 1;
               } else if (var0 == 3127) {
                  Client.method5889(field483[--field479] == 1);
                  return 1;
               } else if (var0 == 3128) {
                  field483[++field479 - 1] = Client.method2575() ? 1 : 0;
                  return 1;
               } else if (var0 == 3129) {
                  field479 -= 2;
                  Client.field1526 = field483[field479];
                  Client.field1702 = field483[1 + field479];
                  return 1;
               } else if (var0 == 3130) {
                  field479 -= 2;
                  return 1;
               } else if (var0 == 3131) {
                  --field479;
                  return 1;
               } else if (var0 == 3132) {
                  field483[++field479 - 1] = class343.field3838;
                  field483[++field479 - 1] = class488.field4948;
                  return 1;
               } else if (var0 == 3133) {
                  --field479;
                  return 1;
               } else if (var0 == 3134) {
                  return 1;
               } else if (var0 == 3135) {
                  field479 -= 2;
                  return 1;
               } else if (var0 == 3136) {
                  Client.field1533 = 3;
                  Client.field1603 = field483[--field479];
                  return 1;
               } else if (var0 == 3137) {
                  Client.field1533 = 2;
                  Client.field1603 = field483[--field479];
                  return 1;
               } else if (var0 == 3138) {
                  Client.field1533 = 0;
                  return 1;
               } else if (var0 == 3139) {
                  Client.field1533 = 1;
                  return 1;
               } else if (var0 == 3140) {
                  Client.field1533 = 3;
                  Client.field1603 = var2 ? class44.field301.field3606 : class358.field3961.field3606;
                  return 1;
               } else {
                  boolean var8;
                  if (var0 == 3141) {
                     var8 = field483[--field479] == 1;
                     class141.field1307.method1677(var8);
                     return 1;
                  } else if (var0 == 3142) {
                     field483[++field479 - 1] = class141.field1307.method1615() ? 1 : 0;
                     return 1;
                  } else if (var0 == 3143) {
                     var8 = field483[--field479] == 1;
                     Client.field1483 = var8;
                     if (!var8) {
                        class141.field1307.method1630("");
                     }

                     return 1;
                  } else if (var0 == 3144) {
                     field483[++field479 - 1] = Client.field1483 ? 1 : 0;
                     return 1;
                  } else if (var0 == 3145) {
                     return 1;
                  } else if (var0 == 3146) {
                     var8 = field483[--field479] == 1;
                     class141.field1307.method1616(!var8);
                     return 1;
                  } else if (var0 == 3147) {
                     field483[++field479 - 1] = class141.field1307.method1617() ? 0 : 1;
                     return 1;
                  } else if (var0 == 3148) {
                     return 1;
                  } else if (var0 == 3149) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3150) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3151) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3152) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3153) {
                     field483[++field479 - 1] = class61.field450;
                     return 1;
                  } else if (var0 == 3154) {
                     field483[++field479 - 1] = Client.method3284();
                     return 1;
                  } else if (var0 == 3155) {
                     --field486;
                     return 1;
                  } else if (var0 == 3156) {
                     return 1;
                  } else if (var0 == 3157) {
                     field479 -= 2;
                     return 1;
                  } else if (var0 == 3158) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3159) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3160) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3161) {
                     --field479;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3162) {
                     --field479;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3163) {
                     --field486;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3164) {
                     --field479;
                     field484[++field486 - 1] = "";
                     return 1;
                  } else if (var0 == 3165) {
                     --field479;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3166) {
                     field479 -= 2;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3167) {
                     field479 -= 2;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3168) {
                     field479 -= 2;
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     return 1;
                  } else if (var0 == 3169) {
                     return 1;
                  } else if (var0 == 3170) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3171) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3172) {
                     --field479;
                     return 1;
                  } else if (var0 == 3173) {
                     --field479;
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3174) {
                     --field479;
                     return 1;
                  } else if (var0 == 3175) {
                     field483[++field479 - 1] = 0;
                     return 1;
                  } else if (var0 == 3176) {
                     return 1;
                  } else if (var0 == 3177) {
                     return 1;
                  } else if (var0 == 3178) {
                     --field486;
                     return 1;
                  } else if (var0 == 3179) {
                     return 1;
                  } else if (var0 == 3180) {
                     --field486;
                     return 1;
                  } else if (var0 == 3181) {
                     Client.method2230(field483[--field479]);
                     return 1;
                  } else if (var0 == 3182) {
                     field483[++field479 - 1] = Client.method3234();
                     return 1;
                  } else if (var0 == 3189) {
                     var4 = field483[--field479];
                     Client.method316(var4);
                     return 1;
                  } else {
                     return 2;
                  }
               }
            }
         }
      }
   }

   static int method4899(int var0, class81 var1, boolean var2) {
      if (var0 == 3200) {
         field479 -= 3;
         Client.method21(field483[field479], field483[1 + field479], field483[field479 + 2]);
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         int var13;
         int var16;
         if (var0 == 3201) {
            field479 -= 5;
            var13 = field483[field479];
            var16 = field483[1 + field479];
            var6 = field483[field479 + 2];
            var7 = field483[field479 + 3];
            var8 = field483[field479 + 4];
            ArrayList var15 = new ArrayList();
            var15.add(var13);
            Client.method3492(var15, var16, var6, var7, var8);
            return 1;
         } else if (var0 == 3202) {
            field479 -= 2;
            Client.method1303(field483[field479], field483[field479 + 1]);
            return 1;
         } else {
            class98 var4;
            class82 var5;
            String var12;
            if (var0 != 3212 && var0 != 3213 && var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
               boolean var11;
               if (var0 != 3214 && var0 != 3215 && var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
                  if (var0 == 3211) {
                     return 1;
                  } else if (var0 == 3216) {
                     var13 = field483[--field479];
                     var16 = 0;
                     class98 var20 = (class98)class373.method1724(class98.method358(), var13);
                     if (var20 != null) {
                        var16 = var20 != class98.field908 ? 1 : 0;
                     }

                     field483[++field479 - 1] = var16;
                     return 1;
                  } else if (var0 == 3218) {
                     var13 = field483[--field479];
                     var16 = 0;
                     class82 var19 = (class82)class373.method1724(class82.method8158(), var13);
                     if (null != var19) {
                        var16 = class82.field728 != var19 ? 1 : 0;
                     }

                     field483[++field479 - 1] = var16;
                     return 1;
                  } else if (var0 != 3217 && var0 != 3219) {
                     if (var0 == 3220) {
                        field479 -= 2;
                        var13 = field483[field479];
                        var16 = field483[1 + field479];
                        class303.method4211(var13, var16);
                        return 1;
                     } else if (var0 == 3221) {
                        field479 -= 6;
                        var13 = field483[field479];
                        var16 = field483[field479 + 1];
                        var6 = field483[2 + field479];
                        var7 = field483[field479 + 3];
                        var8 = field483[4 + field479];
                        int var9 = field483[5 + field479];
                        ArrayList var10 = new ArrayList();
                        var10.add(var13);
                        var10.add(var16);
                        Client.method3492(var10, var6, var7, var8, var9);
                        return 1;
                     } else if (var0 == 3222) {
                        field479 -= 4;
                        var13 = field483[field479];
                        var16 = field483[1 + field479];
                        var6 = field483[2 + field479];
                        var7 = field483[field479 + 3];
                        class303.method8062(var13, var16, var6, var7);
                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     var4 = class98.field908;
                     var5 = class82.field728;
                     var11 = true;
                     boolean var18 = true;
                     if (var0 == 3217) {
                        var8 = field483[--field479];
                        var4 = (class98)class373.method1724(class98.method358(), var8);
                        if (null == var4) {
                           throw new RuntimeException(String.format("Unrecognized device option %d", var8));
                        }
                     }

                     if (var0 == 3219) {
                        var8 = field483[--field479];
                        var5 = (class82)class373.method1724(class82.method8158(), var8);
                        if (null == var5) {
                           throw new RuntimeException(String.format("Unrecognized game option %d", var8));
                        }
                     }

                     String var14;
                     byte var17;
                     if (class82.field728 == var5) {
                        switch (var4.field912) {
                           case 1:
                           case 2:
                           case 3:
                              var17 = 0;
                              var7 = 1;
                              break;
                           case 4:
                              var17 = 0;
                              var7 = Integer.MAX_VALUE;
                              break;
                           case 5:
                              var17 = 0;
                              var7 = 100;
                              break;
                           default:
                              var14 = String.format("Unkown device option: %s.", var4.toString());
                              throw new RuntimeException(var14);
                        }
                     } else {
                        switch (var5.field725) {
                           case 1:
                              var17 = 0;
                              var7 = 1;
                              break;
                           case 2:
                           case 3:
                           case 4:
                              var17 = 0;
                              var7 = 100;
                              break;
                           default:
                              var14 = String.format("Unkown game option: %s.", var5.toString());
                              throw new RuntimeException(var14);
                        }
                     }

                     field483[++field479 - 1] = var17;
                     field483[++field479 - 1] = var7;
                     return 1;
                  }
               } else {
                  var4 = class98.field908;
                  var5 = class82.field728;
                  var11 = false;
                  if (var0 == 3214) {
                     var7 = field483[--field479];
                     var4 = (class98)class373.method1724(class98.method358(), var7);
                     if (null == var4) {
                        throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                     }
                  }

                  if (var0 == 3215) {
                     var7 = field483[--field479];
                     var5 = (class82)class373.method1724(class82.method8158(), var7);
                     if (null == var5) {
                        throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                     }
                  }

                  if (var0 == 3210) {
                     var7 = field483[--field479];
                     var4 = (class98)class373.method1724(class98.method358(), var7);
                     if (null == var4) {
                        var5 = (class82)class373.method1724(class82.method8158(), var7);
                        if (null == var5) {
                           throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                        }
                     }
                  } else if (var0 == 3182) {
                     var4 = class98.field911;
                  } else if (var0 == 3204) {
                     var5 = class82.field722;
                  } else if (var0 == 3206) {
                     var5 = class82.field724;
                  } else if (var0 == 3208) {
                     var5 = class82.field720;
                  }

                  if (class82.field728 == var5) {
                     switch (var4.field912) {
                        case 1:
                           var6 = class141.field1307.method1615() ? 1 : 0;
                           break;
                        case 2:
                           var6 = class141.field1307.method1617() ? 1 : 0;
                           break;
                        case 3:
                           var6 = class141.field1307.method1694() ? 1 : 0;
                           break;
                        case 4:
                           var6 = class141.field1307.method1609();
                           break;
                        case 5:
                           var6 = Client.method3234();
                           break;
                        default:
                           var12 = String.format("Unkown device option: %s.", var4.toString());
                           throw new RuntimeException(var12);
                     }
                  } else {
                     switch (var5.field725) {
                        case 1:
                           var6 = class141.field1307.method1613() ? 1 : 0;
                           break;
                        case 2:
                           var7 = class141.field1307.method1626();
                           var6 = Math.round((float)(var7 * 100) / 255.0F);
                           break;
                        case 3:
                           var7 = class141.field1307.method1628();
                           var6 = Math.round((float)(var7 * 100) / 127.0F);
                           break;
                        case 4:
                           var7 = class141.field1307.method1629();
                           var6 = Math.round((float)(var7 * 100) / 127.0F);
                           break;
                        default:
                           var12 = String.format("Unkown game option: %s.", var5.toString());
                           throw new RuntimeException(var12);
                     }
                  }

                  field483[++field479 - 1] = var6;
                  return 1;
               }
            } else {
               var4 = class98.field908;
               var5 = class82.field728;
               var6 = field483[--field479];
               if (var0 == 3212) {
                  var7 = field483[--field479];
                  var4 = (class98)class373.method1724(class98.method358(), var7);
                  if (null == var4) {
                     throw new RuntimeException(String.format("Unrecognized device option %d", var7));
                  }
               }

               if (var0 == 3213) {
                  var7 = field483[--field479];
                  var5 = (class82)class373.method1724(class82.method8158(), var7);
                  if (var5 == null) {
                     throw new RuntimeException(String.format("Unrecognized game option %d", var7));
                  }
               }

               if (var0 == 3209) {
                  var7 = field483[--field479];
                  var4 = (class98)class373.method1724(class98.method358(), var7);
                  if (null == var4) {
                     var5 = (class82)class373.method1724(class82.method8158(), var7);
                     if (var5 == null) {
                        throw new RuntimeException(String.format("Unrecognized client option %d", var7));
                     }
                  }
               } else if (var0 == 3181) {
                  var4 = class98.field911;
               } else if (var0 == 3203) {
                  var5 = class82.field722;
               } else if (var0 == 3205) {
                  var5 = class82.field724;
               } else if (var0 == 3207) {
                  var5 = class82.field720;
               }

               if (var5 == class82.field728) {
                  switch (var4.field912) {
                     case 1:
                        class141.field1307.method1677(var6 == 1);
                        break;
                     case 2:
                        class141.field1307.method1616(var6 == 1);
                        break;
                     case 3:
                        class141.field1307.method1667(var6 == 1);
                        break;
                     case 4:
                        if (var6 < 0) {
                           var6 = 0;
                        }

                        class141.field1307.method1621(var6);
                        break;
                     case 5:
                        Client.method2230(var6);
                        break;
                     default:
                        var12 = String.format("Unkown device option: %s.", var4.toString());
                        throw new RuntimeException(var12);
                  }
               } else {
                  switch (var5.field725) {
                     case 1:
                        class141.field1307.method1612(var6 == 1);
                        break;
                     case 2:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 255) / 100.0F);
                        class359.method6580(var7);
                        break;
                     case 3:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 127) / 100.0F);
                        Client.method7572(var7);
                        break;
                     case 4:
                        var6 = Math.min(Math.max(var6, 0), 100);
                        var7 = Math.round((float)(var6 * 127) / 100.0F);
                        Client.method1274(var7);
                        break;
                     default:
                        var12 = String.format("Unkown game option: %s.", var5.toString());
                        throw new RuntimeException(var12);
                  }
               }

               return 1;
            }
         }
      }
   }

   static int method1417(int var0, class81 var1, boolean var2) {
      if (var0 == 3300) {
         field483[++field479 - 1] = Client.field1445;
         return 1;
      } else {
         int var4;
         int var5;
         if (var0 == 3301) {
            field479 -= 2;
            var4 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = class93.method5753(var4, var5);
            return 1;
         } else if (var0 == 3302) {
            field479 -= 2;
            var4 = field483[field479];
            var5 = field483[field479 + 1];
            field483[++field479 - 1] = class93.method8154(var4, var5);
            return 1;
         } else if (var0 == 3303) {
            field479 -= 2;
            var4 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = class93.method1586(var4, var5);
            return 1;
         } else if (var0 == 3304) {
            var4 = field483[--field479];
            field483[++field479 - 1] = class190.method818(var4).field2036;
            return 1;
         } else if (var0 == 3305) {
            var4 = field483[--field479];
            field483[++field479 - 1] = Client.field1572[var4];
            return 1;
         } else if (var0 == 3306) {
            var4 = field483[--field479];
            field483[++field479 - 1] = Client.field1493[var4];
            return 1;
         } else if (var0 == 3307) {
            var4 = field483[--field479];
            field483[++field479 - 1] = Client.field1574[var4];
            return 1;
         } else {
            int var6;
            if (var0 == 3308) {
               var4 = class44.field306;
               var5 = (class146.field1362.field949 >> 7) + class342.field3837;
               var6 = (class146.field1362.field963 >> 7) + class144.field1352;
               field483[++field479 - 1] = var6 + (var4 << 28) + (var5 << 14);
               return 1;
            } else if (var0 == 3309) {
               var4 = field483[--field479];
               field483[++field479 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if (var0 == 3310) {
               var4 = field483[--field479];
               field483[++field479 - 1] = var4 >> 28;
               return 1;
            } else if (var0 == 3311) {
               var4 = field483[--field479];
               field483[++field479 - 1] = var4 & 16383;
               return 1;
            } else if (var0 == 3312) {
               field483[++field479 - 1] = Client.field1435 ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               field479 -= 2;
               var4 = field483[field479] + '\u8000';
               var5 = field483[field479 + 1];
               field483[++field479 - 1] = class93.method5753(var4, var5);
               return 1;
            } else if (var0 == 3314) {
               field479 -= 2;
               var4 = '\u8000' + field483[field479];
               var5 = field483[1 + field479];
               field483[++field479 - 1] = class93.method8154(var4, var5);
               return 1;
            } else if (var0 == 3315) {
               field479 -= 2;
               var4 = '\u8000' + field483[field479];
               var5 = field483[1 + field479];
               field483[++field479 - 1] = class93.method1586(var4, var5);
               return 1;
            } else if (var0 == 3316) {
               if (Client.field1608 >= 2) {
                  field483[++field479 - 1] = Client.field1608;
               } else {
                  field483[++field479 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               field483[++field479 - 1] = Client.field1451;
               return 1;
            } else if (var0 == 3318) {
               field483[++field479 - 1] = Client.field1432;
               return 1;
            } else if (var0 == 3321) {
               field483[++field479 - 1] = Client.field1606 / 100;
               return 1;
            } else if (var0 == 3322) {
               field483[++field479 - 1] = Client.field1607;
               return 1;
            } else if (var0 == 3323) {
               if (Client.field1610) {
                  field483[++field479 - 1] = 1;
               } else {
                  field483[++field479 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3324) {
               field483[++field479 - 1] = Client.field1433;
               return 1;
            } else if (var0 == 3325) {
               field479 -= 4;
               var4 = field483[field479];
               var5 = field483[field479 + 1];
               var6 = field483[2 + field479];
               int var7 = field483[3 + field479];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               field483[++field479 - 1] = var4;
               return 1;
            } else if (var0 == 3326) {
               field483[++field479 - 1] = Client.field1659;
               return 1;
            } else if (var0 == 3327) {
               field483[++field479 - 1] = Client.field1448;
               return 1;
            } else if (var0 == 3331) {
               field483[++field479 - 1] = Client.field1606;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static int method4220(int var0, class81 var1, boolean var2) {
      int var4;
      int var5;
      int var7;
      if (var0 == 3400) {
         field479 -= 2;
         var4 = field483[field479];
         var5 = field483[1 + field479];
         class195 var11 = class195.method6711(var4);
         if (var11.field2133 != 's') {
         }

         for(var7 = 0; var7 < var11.field2139; ++var7) {
            if (var11.field2137[var7] == var5) {
               field484[++field486 - 1] = var11.field2132[var7];
               var11 = null;
               break;
            }
         }

         if (null != var11) {
            field484[++field486 - 1] = var11.field2135;
         }

         return 1;
      } else if (var0 != 3408) {
         if (var0 == 3411) {
            var4 = field483[--field479];
            class195 var10 = class195.method6711(var4);
            field483[++field479 - 1] = var10.method3746();
            return 1;
         } else {
            return 2;
         }
      } else {
         field479 -= 4;
         var4 = field483[field479];
         var5 = field483[field479 + 1];
         int var6 = field483[field479 + 2];
         var7 = field483[3 + field479];
         class195 var8 = class195.method6711(var6);
         if (var4 == var8.field2134 && var8.field2133 == var5) {
            for(int var9 = 0; var9 < var8.field2139; ++var9) {
               if (var8.field2137[var9] == var7) {
                  if (var5 == 115) {
                     field484[++field486 - 1] = var8.field2132[var9];
                  } else {
                     field483[++field479 - 1] = var8.field2138[var9];
                  }

                  var8 = null;
                  break;
               }
            }

            if (var8 != null) {
               if (var5 == 115) {
                  field484[++field486 - 1] = var8.field2135;
               } else {
                  field483[++field479 - 1] = var8.field2130;
               }
            }

            return 1;
         } else {
            if (var5 == 115) {
               field484[++field486 - 1] = class364.field4028;
            } else {
               field483[++field479 - 1] = 0;
            }

            return 1;
         }
      }
   }

   static int method8093(int var0, class81 var1, boolean var2) {
      int var4;
      if (var0 == 3500) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1666.method4103(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3501) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1666.method4102(var4) ? 1 : 0;
         return 1;
      } else if (var0 == 3502) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1666.method4104(var4) ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static int method1381(int var0, class81 var1, boolean var2) {
      return 2;
   }

   static int method6575(int var0, class81 var1, boolean var2) {
      if (var0 == 3800) {
         if (null != class20.field109) {
            field483[++field479 - 1] = 1;
            class308.field3359 = class20.field109;
         } else {
            field483[++field479 - 1] = 0;
         }

         return 1;
      } else {
         int var4;
         if (var0 == 3801) {
            var4 = field483[--field479];
            if (Client.field1628[var4] != null) {
               field483[++field479 - 1] = 1;
               class308.field3359 = Client.field1628[var4];
            } else {
               field483[++field479 - 1] = 0;
            }

            return 1;
         } else if (var0 == 3802) {
            field484[++field486 - 1] = class308.field3359.field1399;
            return 1;
         } else if (var0 == 3803) {
            field483[++field479 - 1] = class308.field3359.field1401 ? 1 : 0;
            return 1;
         } else if (var0 == 3804) {
            field483[++field479 - 1] = class308.field3359.field1403;
            return 1;
         } else if (var0 == 3805) {
            field483[++field479 - 1] = class308.field3359.field1397;
            return 1;
         } else if (var0 == 3806) {
            field483[++field479 - 1] = class308.field3359.field1404;
            return 1;
         } else if (var0 == 3807) {
            field483[++field479 - 1] = class308.field3359.field1405;
            return 1;
         } else if (var0 == 3809) {
            field483[++field479 - 1] = class308.field3359.field1406;
            return 1;
         } else if (var0 == 3810) {
            var4 = field483[--field479];
            field484[++field486 - 1] = class308.field3359.field1417[var4];
            return 1;
         } else if (var0 == 3811) {
            var4 = field483[--field479];
            field483[++field479 - 1] = class308.field3359.field1408[var4];
            return 1;
         } else if (var0 == 3812) {
            field483[++field479 - 1] = class308.field3359.field1415;
            return 1;
         } else if (var0 == 3813) {
            var4 = field483[--field479];
            field484[++field486 - 1] = class308.field3359.field1418[var4];
            return 1;
         } else {
            int var6;
            int var7;
            if (var0 == 3814) {
               field479 -= 3;
               var4 = field483[field479];
               var7 = field483[field479 + 1];
               var6 = field483[2 + field479];
               field483[++field479 - 1] = class308.field3359.method2630(var4, var7, var6);
               return 1;
            } else if (var0 == 3815) {
               field483[++field479 - 1] = class308.field3359.field1413;
               return 1;
            } else if (var0 == 3816) {
               field483[++field479 - 1] = class308.field3359.field1416;
               return 1;
            } else if (var0 == 3817) {
               field483[++field479 - 1] = class308.field3359.method2601(field484[--field486]);
               return 1;
            } else if (var0 == 3818) {
               field483[field479 - 1] = class308.field3359.method2590()[field483[field479 - 1]];
               return 1;
            } else if (var0 == 3819) {
               field479 -= 2;
               var4 = field483[field479];
               var7 = field483[field479 + 1];
               Client.method8718(var7, var4);
               return 1;
            } else if (var0 == 3820) {
               var4 = field483[--field479];
               field483[++field479 - 1] = class308.field3359.field1411[var4];
               return 1;
            } else {
               if (var0 == 3821) {
                  field479 -= 3;
                  var4 = field483[field479];
                  boolean var5 = 1 == field483[1 + field479];
                  var6 = field483[2 + field479];
                  Client.method2519(var6, var4, var5);
               }

               if (var0 == 3822) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = class308.field3359.field1412[var4] ? 1 : 0;
                  return 1;
               } else if (var0 == 3850) {
                  if (null != class244.field2690) {
                     field483[++field479 - 1] = 1;
                     class82.field723 = class244.field2690;
                  } else {
                     field483[++field479 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3851) {
                  var4 = field483[--field479];
                  if (Client.field1673[var4] != null) {
                     field483[++field479 - 1] = 1;
                     class82.field723 = Client.field1673[var4];
                     class339.field3794 = var4;
                  } else {
                     field483[++field479 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 3852) {
                  field484[++field486 - 1] = class82.field723.field1775;
                  return 1;
               } else if (var0 == 3853) {
                  field483[++field479 - 1] = class82.field723.field1778;
                  return 1;
               } else if (var0 == 3854) {
                  field483[++field479 - 1] = class82.field723.field1776;
                  return 1;
               } else if (var0 == 3855) {
                  field483[++field479 - 1] = class82.field723.method3279();
                  return 1;
               } else if (var0 == 3856) {
                  var4 = field483[--field479];
                  field484[++field486 - 1] = ((class152)class82.field723.field1772.get(var4)).field1389.method9155();
                  return 1;
               } else if (var0 == 3857) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = ((class152)class82.field723.field1772.get(var4)).field1391;
                  return 1;
               } else if (var0 == 3858) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = ((class152)class82.field723.field1772.get(var4)).field1388;
                  return 1;
               } else if (var0 == 3859) {
                  var4 = field483[--field479];
                  Client.method3214(class339.field3794, var4);
                  return 1;
               } else if (var0 == 3860) {
                  field483[++field479 - 1] = class82.field723.method3266(field484[--field486]);
                  return 1;
               } else if (var0 == 3861) {
                  field483[field479 - 1] = class82.field723.method3259()[field483[field479 - 1]];
                  return 1;
               } else if (var0 == 3890) {
                  field483[++field479 - 1] = null != class153.field1393 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static int method4883(int var0, class81 var1, boolean var2) {
      int var4;
      if (var0 == 3903) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1720[var4].method6656();
         return 1;
      } else if (var0 == 3904) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1720[var4].field4337;
         return 1;
      } else if (var0 == 3905) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1720[var4].field4340;
         return 1;
      } else if (var0 == 3906) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1720[var4].field4339;
         return 1;
      } else if (var0 == 3907) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1720[var4].field4338;
         return 1;
      } else if (var0 == 3908) {
         var4 = field483[--field479];
         field483[++field479 - 1] = Client.field1720[var4].field4341;
         return 1;
      } else {
         int var14;
         if (var0 == 3910) {
            var4 = field483[--field479];
            var14 = Client.field1720[var4].method6674();
            field483[++field479 - 1] = var14 == 0 ? 1 : 0;
            return 1;
         } else if (var0 == 3911) {
            var4 = field483[--field479];
            var14 = Client.field1720[var4].method6674();
            field483[++field479 - 1] = var14 == 2 ? 1 : 0;
            return 1;
         } else if (var0 == 3912) {
            var4 = field483[--field479];
            var14 = Client.field1720[var4].method6674();
            field483[++field479 - 1] = var14 == 5 ? 1 : 0;
            return 1;
         } else if (var0 == 3913) {
            var4 = field483[--field479];
            var14 = Client.field1720[var4].method6674();
            field483[++field479 - 1] = var14 == 1 ? 1 : 0;
            return 1;
         } else {
            boolean var12;
            if (var0 == 3914) {
               var12 = field483[--field479] == 1;
               if (class40.field234 != null) {
                  class40.field234.method6487(class345.field3843, var12);
               }

               return 1;
            } else if (var0 == 3915) {
               var12 = field483[--field479] == 1;
               if (null != class40.field234) {
                  class40.field234.method6487(class345.field3842, var12);
               }

               return 1;
            } else if (var0 == 3916) {
               field479 -= 2;
               var12 = field483[field479] == 1;
               boolean var13 = 1 == field483[1 + field479];
               if (class40.field234 != null) {
                  Client.field1721.field588 = var13;
                  class40.field234.method6487(Client.field1721, var12);
               }

               return 1;
            } else if (var0 == 3917) {
               var12 = field483[--field479] == 1;
               if (class40.field234 != null) {
                  class40.field234.method6487(class345.field3840, var12);
               }

               return 1;
            } else if (var0 == 3918) {
               var12 = field483[--field479] == 1;
               if (class40.field234 != null) {
                  class40.field234.method6487(class345.field3844, var12);
               }

               return 1;
            } else if (var0 == 3919) {
               field483[++field479 - 1] = null == class40.field234 ? 0 : class40.field234.field3845.size();
               return 1;
            } else {
               class376 var5;
               if (var0 == 3920) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  field483[++field479 - 1] = var5.field4365;
                  return 1;
               } else if (var0 == 3921) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  field484[++field486 - 1] = var5.method6742();
                  return 1;
               } else if (var0 == 3922) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  field484[++field486 - 1] = var5.method6741();
                  return 1;
               } else if (var0 == 3923) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  long var6 = class302.safeTime() - class194.field2128 - var5.field4368;
                  int var8 = (int)(var6 / 3600000L);
                  int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
                  int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * '\uea60')) / 1000L);
                  String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
                  field484[++field486 - 1] = var11;
                  return 1;
               } else if (var0 == 3924) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  field483[++field479 - 1] = var5.field4366.field4339;
                  return 1;
               } else if (var0 == 3925) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  field483[++field479 - 1] = var5.field4366.field4340;
                  return 1;
               } else if (var0 == 3926) {
                  var4 = field483[--field479];
                  var5 = (class376)class40.field234.field3845.get(var4);
                  field483[++field479 - 1] = var5.field4366.field4337;
                  return 1;
               } else if (var0 == 3939) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = class185.method2355(var4).field2008 ? 1 : 0;
                  return 1;
               } else {
                  return 2;
               }
            }
         }
      }
   }

   static int method1775(int var0, class81 var1, boolean var2) {
      int var5;
      int var10;
      if (var0 == 4000) {
         field479 -= 2;
         var10 = field483[field479];
         var5 = field483[field479 + 1];
         field483[++field479 - 1] = var5 + var10;
         return 1;
      } else if (var0 == 4001) {
         field479 -= 2;
         var10 = field483[field479];
         var5 = field483[field479 + 1];
         field483[++field479 - 1] = var10 - var5;
         return 1;
      } else if (var0 == 4002) {
         field479 -= 2;
         var10 = field483[field479];
         var5 = field483[1 + field479];
         field483[++field479 - 1] = var5 * var10;
         return 1;
      } else if (var0 == 4003) {
         field479 -= 2;
         var10 = field483[field479];
         var5 = field483[1 + field479];
         field483[++field479 - 1] = var10 / var5;
         return 1;
      } else if (var0 == 4004) {
         var10 = field483[--field479];
         field483[++field479 - 1] = (int)(Math.random() * (double)var10);
         return 1;
      } else if (var0 == 4005) {
         var10 = field483[--field479];
         field483[++field479 - 1] = (int)(Math.random() * (double)(var10 + 1));
         return 1;
      } else {
         int var6;
         int var7;
         int var8;
         if (var0 == 4006) {
            field479 -= 5;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            var6 = field483[field479 + 2];
            var7 = field483[field479 + 3];
            var8 = field483[4 + field479];
            field483[++field479 - 1] = var10 + (var8 - var6) * (var5 - var10) / (var7 - var6);
            return 1;
         } else if (var0 == 4007) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var5 * var10 / 100 + var10;
            return 1;
         } else if (var0 == 4008) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var10 | 1 << var5;
            return 1;
         } else if (var0 == 4009) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            field483[++field479 - 1] = var10 & -1 - (1 << var5);
            return 1;
         } else if (var0 == 4010) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            field483[++field479 - 1] = 0 != (var10 & 1 << var5) ? 1 : 0;
            return 1;
         } else if (var0 == 4011) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var10 % var5;
            return 1;
         } else if (var0 == 4012) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            if (var10 == 0) {
               field483[++field479 - 1] = 0;
            } else {
               field483[++field479 - 1] = (int)Math.pow((double)var10, (double)var5);
            }

            return 1;
         } else if (var0 == 4013) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            if (var10 == 0) {
               field483[++field479 - 1] = 0;
               return 1;
            } else {
               switch (var5) {
                  case 0:
                     field483[++field479 - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     field483[++field479 - 1] = var10;
                     break;
                  case 2:
                     field483[++field479 - 1] = (int)Math.sqrt((double)var10);
                     break;
                  case 3:
                     field483[++field479 - 1] = (int)Math.cbrt((double)var10);
                     break;
                  case 4:
                     field483[++field479 - 1] = (int)Math.sqrt(Math.sqrt((double)var10));
                     break;
                  default:
                     field483[++field479 - 1] = (int)Math.pow((double)var10, 1.0 / (double)var5);
               }

               return 1;
            }
         } else if (var0 == 4014) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var10 & var5;
            return 1;
         } else if (var0 == 4015) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var10 | var5;
            return 1;
         } else if (var0 == 4016) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            field483[++field479 - 1] = var10 < var5 ? var10 : var5;
            return 1;
         } else if (var0 == 4017) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var10 > var5 ? var10 : var5;
            return 1;
         } else if (var0 == 4018) {
            field479 -= 3;
            long var11 = (long)field483[field479];
            long var12 = (long)field483[1 + field479];
            long var13 = (long)field483[field479 + 2];
            field483[++field479 - 1] = (int)(var11 * var13 / var12);
            return 1;
         } else if (var0 == 4025) {
            var10 = class311.method1770(field483[--field479]);
            field483[++field479 - 1] = var10;
            return 1;
         } else if (var0 == 4026) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            field483[++field479 - 1] = var10 ^ 1 << var5;
            return 1;
         } else if (var0 == 4027) {
            field479 -= 3;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            var6 = field483[2 + field479];
            field483[++field479 - 1] = class311.method4046(var10, var5, var6);
            return 1;
         } else if (var0 == 4028) {
            field479 -= 3;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            var6 = field483[field479 + 2];
            field483[++field479 - 1] = class311.method598(var10, var5, var6);
            return 1;
         } else if (var0 == 4029) {
            field479 -= 3;
            var10 = field483[field479];
            var5 = field483[field479 + 1];
            var6 = field483[2 + field479];
            var7 = 31 - var6;
            field483[++field479 - 1] = var10 << var7 >>> var7 + var5;
            return 1;
         } else if (var0 == 4030) {
            field479 -= 4;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            var6 = field483[2 + field479];
            var7 = field483[field479 + 3];
            var10 = class311.method598(var10, var6, var7);
            var8 = class311.method4379(1 + (var7 - var6));
            if (var5 > var8) {
               var5 = var8;
            }

            field483[++field479 - 1] = var10 | var5 << var6;
            return 1;
         } else if (var0 == 4032) {
            field483[field479 - 1] = class467.method7613(field483[field479 - 1]);
            return 1;
         } else if (var0 == 4033) {
            field483[field479 - 1] = class424.method7607(field483[field479 - 1]);
            return 1;
         } else if (var0 == 4034) {
            field479 -= 2;
            var10 = field483[field479];
            var5 = field483[1 + field479];
            var6 = class467.method6949(var10, var5);
            field483[++field479 - 1] = var6;
            return 1;
         } else if (var0 == 4035) {
            field483[field479 - 1] = Math.abs(field483[field479 - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var4 = field484[--field486];
            var5 = -1;
            if (class380.method4205(var4)) {
               var5 = class380.method5731(var4);
            }

            field483[++field479 - 1] = var5;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static int method6481(int var0, class81 var1, boolean var2) {
      int var4;
      if (var0 == 4200) {
         var4 = field483[--field479];
         field484[++field486 - 1] = class185.method2355(var4).field1998;
         return 1;
      } else {
         class185 var6;
         int var7;
         if (var0 == 4201) {
            field479 -= 2;
            var4 = field483[field479];
            var7 = field483[1 + field479];
            var6 = class185.method2355(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.field1959[var7 - 1]) {
               field484[++field486 - 1] = var6.field1959[var7 - 1];
            } else {
               field484[++field486 - 1] = "";
            }

            return 1;
         } else if (var0 == 4202) {
            field479 -= 2;
            var4 = field483[field479];
            var7 = field483[1 + field479];
            var6 = class185.method2355(var4);
            if (var7 >= 1 && var7 <= 5 && null != var6.field1982[var7 - 1]) {
               field484[++field486 - 1] = var6.field1982[var7 - 1];
            } else {
               field484[++field486 - 1] = "";
            }

            return 1;
         } else if (var0 == 4203) {
            var4 = field483[--field479];
            field483[++field479 - 1] = class185.method2355(var4).field1976;
            return 1;
         } else if (var0 == 4204) {
            var4 = field483[--field479];
            field483[++field479 - 1] = class185.method2355(var4).field1975 == 1 ? 1 : 0;
            return 1;
         } else {
            class185 var5;
            if (var0 == 4205) {
               var4 = field483[--field479];
               var5 = class185.method2355(var4);
               if (var5.field1999 == -1 && var5.field1997 >= 0) {
                  field483[++field479 - 1] = var5.field1997;
               } else {
                  field483[++field479 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4206) {
               var4 = field483[--field479];
               var5 = class185.method2355(var4);
               if (var5.field1999 >= 0 && var5.field1997 >= 0) {
                  field483[++field479 - 1] = var5.field1997;
               } else {
                  field483[++field479 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4207) {
               var4 = field483[--field479];
               field483[++field479 - 1] = class185.method2355(var4).field1980 ? 1 : 0;
               return 1;
            } else if (var0 == 4208) {
               var4 = field483[--field479];
               var5 = class185.method2355(var4);
               if (-1 == var5.field1977 && var5.field2006 >= 0) {
                  field483[++field479 - 1] = var5.field2006;
               } else {
                  field483[++field479 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4209) {
               var4 = field483[--field479];
               var5 = class185.method2355(var4);
               if (var5.field1977 >= 0 && var5.field2006 >= 0) {
                  field483[++field479 - 1] = var5.field2006;
               } else {
                  field483[++field479 - 1] = var4;
               }

               return 1;
            } else if (var0 == 4210) {
               String var8 = field484[--field486];
               var7 = field483[--field479];
               Client.method2566(var8, var7 == 1);
               field483[++field479 - 1] = class160.field1760;
               return 1;
            } else if (var0 != 4211) {
               if (var0 == 4212) {
                  class154.field1419 = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var4 = field483[--field479];
                  var7 = class185.method2355(var4).method3547();
                  if (var7 == -1) {
                     field483[++field479 - 1] = var7;
                  } else {
                     field483[++field479 - 1] = var7 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = class185.method2355(var4).field2009;
                  return 1;
               } else if (var0 == 4215) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = class185.method2355(var4).field1978;
                  return 1;
               } else if (var0 == 4216) {
                  var4 = field483[--field479];
                  field483[++field479 - 1] = class185.method2355(var4).field1979;
                  return 1;
               } else if (var0 == 4217) {
                  var4 = field483[--field479];
                  var5 = class185.method2355(var4);
                  field483[++field479 - 1] = var5.field2011;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class83.field730 != null && class154.field1419 < class160.field1760) {
                  field483[++field479 - 1] = class83.field730[++class154.field1419 - 1] & '\uffff';
               } else {
                  field483[++field479 - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   static int method5883(int var0, class81 var1, boolean var2) {
      if (var0 == 5000) {
         field483[++field479 - 1] = Client.field1661;
         return 1;
      } else if (var0 == 5001) {
         field479 -= 3;
         Client.field1661 = field483[field479];
         class1.field7 = class536.method4387(field483[field479 + 1]);
         if (class1.field7 == null) {
            class1.field7 = class536.field5210;
         }

         Client.field1662 = field483[2 + field479];
         class308 var14 = class308.method8607(class309.field3448, Client.field1436.field1046);
         var14.field3351.writeByte(Client.field1661);
         var14.field3351.writeByte(class1.field7.field5213);
         var14.field3351.writeByte(Client.field1662);
         Client.field1436.method2148(var14);
         return 1;
      } else {
         String var4;
         class308 var7;
         int var9;
         int var11;
         if (var0 == 5002) {
            var4 = field484[--field486];
            field479 -= 2;
            var9 = field483[field479];
            var11 = field483[1 + field479];
            var7 = class308.method8607(class309.field3385, Client.field1436.field1046);
            var7.field3351.writeByte(PacketBuffer.getJagStringSize(var4) + 2);
            var7.field3351.writeString(var4);
            var7.field3351.writeByte(var9 - 1);
            var7.field3351.writeByte(var11);
            Client.field1436.method2148(var7);
            return 1;
         } else {
            class76 var6;
            int var8;
            if (var0 == 5003) {
               field479 -= 2;
               var8 = field483[field479];
               var9 = field483[field479 + 1];
               var6 = class119.method1962(var8, var9);
               if (null != var6) {
                  field483[++field479 - 1] = var6.field625;
                  field483[++field479 - 1] = var6.field634;
                  field484[++field486 - 1] = var6.field628 != null ? var6.field628 : "";
                  field484[++field486 - 1] = null != var6.field632 ? var6.field632 : "";
                  field484[++field486 - 1] = null != var6.field626 ? var6.field626 : "";
                  field483[++field479 - 1] = var6.method1545() ? 1 : (var6.method1548() ? 2 : 0);
               } else {
                  field483[++field479 - 1] = -1;
                  field483[++field479 - 1] = 0;
                  field484[++field486 - 1] = "";
                  field484[++field486 - 1] = "";
                  field484[++field486 - 1] = "";
                  field483[++field479 - 1] = 0;
               }

               return 1;
            } else {
               class76 var5;
               if (var0 == 5004) {
                  var8 = field483[--field479];
                  var5 = class119.method2285(var8);
                  if (var5 != null) {
                     field483[++field479 - 1] = var5.field627;
                     field483[++field479 - 1] = var5.field634;
                     field484[++field486 - 1] = null != var5.field628 ? var5.field628 : "";
                     field484[++field486 - 1] = null != var5.field632 ? var5.field632 : "";
                     field484[++field486 - 1] = var5.field626 != null ? var5.field626 : "";
                     field483[++field479 - 1] = var5.method1545() ? 1 : (var5.method1548() ? 2 : 0);
                  } else {
                     field483[++field479 - 1] = -1;
                     field483[++field479 - 1] = 0;
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field484[++field486 - 1] = "";
                     field483[++field479 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (class1.field7 == null) {
                     field483[++field479 - 1] = -1;
                  } else {
                     field483[++field479 - 1] = class1.field7.field5213;
                  }

                  return 1;
               } else {
                  class308 var12;
                  if (var0 == 5008) {
                     var4 = field484[--field486];
                     var9 = field483[--field479];
                     var12 = class533.method7051(var9, var4, field496, -1);
                     Client.field1436.method2148(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     field486 -= 2;
                     var4 = field484[field486];
                     String var10 = field484[1 + field486];
                     var12 = class308.method8607(class309.field3416, Client.field1436.field1046);
                     var12.field3351.writeShort(0);
                     int var13 = var12.field3351.offset;
                     var12.field3351.writeString(var4);
                     class324.method86(var12.field3351, var10);
                     var12.field3351.writeLengthShort(var12.field3351.offset - var13);
                     Client.field1436.method2148(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = field484[--field486];
                     field479 -= 2;
                     var9 = field483[field479];
                     var11 = field483[1 + field479];
                     var7 = class533.method7051(var9, var4, field496, var11);
                     Client.field1436.method2148(var7);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        field483[++field479 - 1] = Client.field1662;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = field483[--field479];
                        field483[++field479 - 1] = class119.method5748(var8);
                        return 1;
                     } else if (var0 == 5018) {
                        var8 = field483[--field479];
                        field483[++field479 - 1] = class119.method6595(var8);
                        return 1;
                     } else if (var0 == 5019) {
                        var8 = field483[--field479];
                        field483[++field479 - 1] = class364.method6636(var8);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = field484[--field486];
                        Client.method9009(var4);
                        return 1;
                     } else if (var0 == 5021) {
                        Client.field1663 = field484[--field486].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        field484[++field486 - 1] = Client.field1663;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = field484[--field486];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5030) {
                        field479 -= 2;
                        var8 = field483[field479];
                        var9 = field483[field479 + 1];
                        var6 = class119.method1962(var8, var9);
                        if (null != var6) {
                           field483[++field479 - 1] = var6.field625;
                           field483[++field479 - 1] = var6.field634;
                           field484[++field486 - 1] = null != var6.field628 ? var6.field628 : "";
                           field484[++field486 - 1] = null != var6.field632 ? var6.field632 : "";
                           field484[++field486 - 1] = var6.field626 != null ? var6.field626 : "";
                           field483[++field479 - 1] = var6.method1545() ? 1 : (var6.method1548() ? 2 : 0);
                           field484[++field486 - 1] = "";
                           field483[++field479 - 1] = 0;
                        } else {
                           field483[++field479 - 1] = -1;
                           field483[++field479 - 1] = 0;
                           field484[++field486 - 1] = "";
                           field484[++field486 - 1] = "";
                           field484[++field486 - 1] = "";
                           field483[++field479 - 1] = 0;
                           field484[++field486 - 1] = "";
                           field483[++field479 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var8 = field483[--field479];
                        var5 = class119.method2285(var8);
                        if (null != var5) {
                           field483[++field479 - 1] = var5.field627;
                           field483[++field479 - 1] = var5.field634;
                           field484[++field486 - 1] = null != var5.field628 ? var5.field628 : "";
                           field484[++field486 - 1] = null != var5.field632 ? var5.field632 : "";
                           field484[++field486 - 1] = null != var5.field626 ? var5.field626 : "";
                           field483[++field479 - 1] = var5.method1545() ? 1 : (var5.method1548() ? 2 : 0);
                           field484[++field486 - 1] = "";
                           field483[++field479 - 1] = 0;
                        } else {
                           field483[++field479 - 1] = -1;
                           field483[++field479 - 1] = 0;
                           field484[++field486 - 1] = "";
                           field484[++field486 - 1] = "";
                           field484[++field486 - 1] = "";
                           field483[++field479 - 1] = 0;
                           field484[++field486 - 1] = "";
                           field483[++field479 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (null != class146.field1362 && null != class146.field1362.field740) {
                        var4 = class146.field1362.field740.method9155();
                     } else {
                        var4 = "";
                     }

                     field484[++field486 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }

   static int method2195(int var0, class81 var1, boolean var2) {
      if (var0 == 5306) {
         field483[++field479 - 1] = Client.method5791();
         return 1;
      } else {
         int var4;
         if (var0 == 5307) {
            var4 = field483[--field479];
            if (var4 == 1 || var4 == 2) {
               class222.method4213(var4);
            }

            return 1;
         } else if (var0 == 5308) {
            field483[++field479 - 1] = class141.field1307.method1635();
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --field479;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = field483[--field479];
            if (var4 == 1 || var4 == 2) {
               class141.field1307.method1720(var4);
            }

            return 1;
         }
      }
   }

   static int method5341(int var0, class81 var1, boolean var2) {
      int var4;
      if (var0 == 5504) {
         field479 -= 2;
         var4 = field483[field479];
         int var5 = field483[1 + field479];
         if (!Client.field1689) {
            Client.field1649 = var4;
            Client.field1569 = var5;
         }

         return 1;
      } else if (var0 == 5505) {
         field483[++field479 - 1] = Client.field1649;
         return 1;
      } else if (var0 == 5506) {
         field483[++field479 - 1] = Client.field1569;
         return 1;
      } else if (var0 == 5530) {
         var4 = field483[--field479];
         if (var4 < 0) {
            var4 = 0;
         }

         Client.field1522 = var4;
         return 1;
      } else if (var0 == 5531) {
         field483[++field479 - 1] = Client.field1522;
         return 1;
      } else {
         return 2;
      }
   }

   static int method4214(int var0, class81 var1, boolean var2) {
      if (var0 == 5630) {
         Client.field1542 = 250;
         return 1;
      } else {
         return 2;
      }
   }

   static int method4613(int var0) {
      return (int)Math.pow(2.0, (double)((float)var0 / 256.0F + 7.0F));
   }

   static int method3257(int var0) {
      return (int)((Math.log((double)var0) / field495 - 7.0) * 256.0);
   }

   static int method1418(int var0, class81 var1, boolean var2) {
      if (var0 == 6200) {
         field479 -= 2;
         Client.field1703 = (short)method4613(field483[field479]);
         if (Client.field1703 <= 0) {
            Client.field1703 = 256;
         }

         Client.field1693 = (short)method4613(field483[1 + field479]);
         if (Client.field1693 <= 0) {
            Client.field1693 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         field479 -= 2;
         Client.field1515 = (short)field483[field479];
         if (Client.field1515 <= 0) {
            Client.field1515 = 256;
         }

         Client.field1706 = (short)field483[1 + field479];
         if (Client.field1706 <= 0) {
            Client.field1706 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         field479 -= 4;
         Client.field1707 = (short)field483[field479];
         if (Client.field1707 <= 0) {
            Client.field1707 = 1;
         }

         Client.field1508 = (short)field483[1 + field479];
         if (Client.field1508 <= 0) {
            Client.field1508 = 32767;
         } else if (Client.field1508 < Client.field1707) {
            Client.field1508 = Client.field1707;
         }

         Client.field1675 = (short)field483[2 + field479];
         if (Client.field1675 <= 0) {
            Client.field1675 = 1;
         }

         Client.field1710 = (short)field483[3 + field479];
         if (Client.field1710 <= 0) {
            Client.field1710 = 32767;
         } else if (Client.field1710 < Client.field1675) {
            Client.field1710 = Client.field1675;
         }

         return 1;
      } else if (var0 == 6203) {
         if (Client.field1611 != null) {
            Client.method843(0, 0, Client.field1611.field3598, Client.field1611.field3622, false);
            field483[++field479 - 1] = Client.field1456;
            field483[++field479 - 1] = Client.field1714;
         } else {
            field483[++field479 - 1] = -1;
            field483[++field479 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         field483[++field479 - 1] = Client.field1515;
         field483[++field479 - 1] = Client.field1706;
         return 1;
      } else if (var0 == 6205) {
         field483[++field479 - 1] = method3257(Client.field1703);
         field483[++field479 - 1] = method3257(Client.field1693);
         return 1;
      } else if (var0 == 6220) {
         field483[++field479 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         field483[++field479 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         field483[++field479 - 1] = class343.field3838;
         return 1;
      } else if (var0 == 6223) {
         field483[++field479 - 1] = class488.field4948;
         return 1;
      } else {
         return 2;
      }
   }

   static int method3382(int var0, class81 var1, boolean var2) {
      if (var0 == 6500) {
         field483[++field479 - 1] = class70.method1994() ? 1 : 0;
         return 1;
      } else {
         class70 var9;
         if (var0 == 6501) {
            var9 = class70.method533();
            if (null != var9) {
               field483[++field479 - 1] = var9.field565;
               field483[++field479 - 1] = var9.field568;
               field484[++field486 - 1] = var9.field572;
               field483[++field479 - 1] = var9.field573;
               field483[++field479 - 1] = var9.field562;
               field484[++field486 - 1] = var9.field571;
            } else {
               field483[++field479 - 1] = -1;
               field483[++field479 - 1] = 0;
               field484[++field486 - 1] = "";
               field483[++field479 - 1] = 0;
               field483[++field479 - 1] = 0;
               field484[++field486 - 1] = "";
            }

            return 1;
         } else if (var0 == 6502) {
            var9 = class419.method7529();
            if (var9 != null) {
               field483[++field479 - 1] = var9.field565;
               field483[++field479 - 1] = var9.field568;
               field484[++field486 - 1] = var9.field572;
               field483[++field479 - 1] = var9.field573;
               field483[++field479 - 1] = var9.field562;
               field484[++field486 - 1] = var9.field571;
            } else {
               field483[++field479 - 1] = -1;
               field483[++field479 - 1] = 0;
               field484[++field486 - 1] = "";
               field483[++field479 - 1] = 0;
               field483[++field479 - 1] = 0;
               field484[++field486 - 1] = "";
            }

            return 1;
         } else {
            int var4;
            class70 var5;
            int var11;
            if (var0 == 6506) {
               var4 = field483[--field479];
               var5 = null;

               for(var11 = 0; var11 < class70.field569; ++var11) {
                  if (class380.field4385[var11].field565 == var4) {
                     var5 = class380.field4385[var11];
                     break;
                  }
               }

               if (null != var5) {
                  field483[++field479 - 1] = var5.field565;
                  field483[++field479 - 1] = var5.field568;
                  field484[++field486 - 1] = var5.field572;
                  field483[++field479 - 1] = var5.field573;
                  field483[++field479 - 1] = var5.field562;
                  field484[++field486 - 1] = var5.field571;
               } else {
                  field483[++field479 - 1] = -1;
                  field483[++field479 - 1] = 0;
                  field484[++field486 - 1] = "";
                  field483[++field479 - 1] = 0;
                  field483[++field479 - 1] = 0;
                  field484[++field486 - 1] = "";
               }

               return 1;
            } else if (var0 == 6507) {
               field479 -= 4;
               var4 = field483[field479];
               boolean var10 = 1 == field483[field479 + 1];
               var11 = field483[field479 + 2];
               boolean var7 = field483[3 + field479] == 1;
               class70.method5288(var4, var10, var11, var7);
               return 1;
            } else if (var0 != 6511) {
               if (var0 == 6512) {
                  Client.field1692 = field483[--field479] == 1;
                  return 1;
               } else {
                  class199 var6;
                  int var8;
                  if (var0 == 6513) {
                     field479 -= 2;
                     var4 = field483[field479];
                     var8 = field483[field479 + 1];
                     var6 = class199.method6362(var8);
                     if (var6.method3800()) {
                        field484[++field486 - 1] = class191.method4208(var4).method3624(var8, var6.field2174);
                     } else {
                        field483[++field479 - 1] = class191.method4208(var4).method3616(var8, var6.field2177);
                     }

                     return 1;
                  } else if (var0 == 6514) {
                     field479 -= 2;
                     var4 = field483[field479];
                     var8 = field483[1 + field479];
                     var6 = class199.method6362(var8);
                     if (var6.method3800()) {
                        field484[++field486 - 1] = class98.method2042(var4).method3480(var8, var6.field2174);
                     } else {
                        field483[++field479 - 1] = class98.method2042(var4).method3457(var8, var6.field2177);
                     }

                     return 1;
                  } else if (var0 == 6515) {
                     field479 -= 2;
                     var4 = field483[field479];
                     var8 = field483[1 + field479];
                     var6 = class199.method6362(var8);
                     if (var6.method3800()) {
                        field484[++field486 - 1] = class185.method2355(var4).method3508(var8, var6.field2174);
                     } else {
                        field483[++field479 - 1] = class185.method2355(var4).method3507(var8, var6.field2177);
                     }

                     return 1;
                  } else if (var0 == 6516) {
                     field479 -= 2;
                     var4 = field483[field479];
                     var8 = field483[1 + field479];
                     var6 = class199.method6362(var8);
                     if (var6.method3800()) {
                        field484[++field486 - 1] = class210.method3928(var4).method3827(var8, var6.field2174);
                     } else {
                        field483[++field479 - 1] = class210.method3928(var4).method3826(var8, var6.field2177);
                     }

                     return 1;
                  } else if (var0 == 6518) {
                     field483[++field479 - 1] = Client.field1440 ? 1 : 0;
                     return 1;
                  } else if (var0 == 6519) {
                     field483[++field479 - 1] = Client.field1438;
                     return 1;
                  } else if (var0 == 6520) {
                     return 1;
                  } else if (var0 == 6521) {
                     return 1;
                  } else if (var0 == 6522) {
                     --field486;
                     --field479;
                     return 1;
                  } else if (var0 == 6523) {
                     --field486;
                     --field479;
                     return 1;
                  } else if (var0 == 6524) {
                     field483[++field479 - 1] = -1;
                     return 1;
                  } else if (var0 == 6525) {
                     field483[++field479 - 1] = 1;
                     return 1;
                  } else if (var0 == 6526) {
                     field483[++field479 - 1] = 1;
                     return 1;
                  } else if (var0 == 6527) {
                     field483[++field479 - 1] = Client.field1573;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var4 = field483[--field479];
               if (var4 >= 0 && var4 < class70.field569) {
                  var5 = class380.field4385[var4];
                  field483[++field479 - 1] = var5.field565;
                  field483[++field479 - 1] = var5.field568;
                  field484[++field486 - 1] = var5.field572;
                  field483[++field479 - 1] = var5.field573;
                  field483[++field479 - 1] = var5.field562;
                  field484[++field486 - 1] = var5.field571;
               } else {
                  field483[++field479 - 1] = -1;
                  field483[++field479 - 1] = 0;
                  field484[++field486 - 1] = "";
                  field483[++field479 - 1] = 0;
                  field483[++field479 - 1] = 0;
                  field484[++field486 - 1] = "";
               }

               return 1;
            }
         }
      }
   }

   static int method5340(int var0, class81 var1, boolean var2) {
      int var4;
      if (var0 == 6600) {
         var4 = class44.field306;
         int var17 = class342.field3837 + (class146.field1362.field949 >> 7);
         int var13 = class144.field1352 + (class146.field1362.field963 >> 7);
         Client.method1738().method8216(var4, var17, var13, true);
         return 1;
      } else {
         class253 var8;
         if (var0 == 6601) {
            var4 = field483[--field479];
            String var16 = "";
            var8 = Client.method1738().method8376(var4);
            if (var8 != null) {
               var16 = var8.method4945();
            }

            field484[++field486 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var4 = field483[--field479];
            Client.method1738().method8396(var4);
            return 1;
         } else if (var0 == 6603) {
            field483[++field479 - 1] = Client.method1738().method8231();
            return 1;
         } else if (var0 == 6604) {
            var4 = field483[--field479];
            Client.method1738().method8228(var4);
            return 1;
         } else if (var0 == 6605) {
            field483[++field479 - 1] = Client.method1738().method8233() ? 1 : 0;
            return 1;
         } else {
            class330 var15;
            if (var0 == 6606) {
               var15 = new class330(field483[--field479]);
               Client.method1738().method8235(var15.field3581, var15.field3583);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class330(field483[--field479]);
               Client.method1738().method8236(var15.field3581, var15.field3583);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class330(field483[--field479]);
               Client.method1738().method8237(var15.field3582, var15.field3581, var15.field3583);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class330(field483[--field479]);
               Client.method1738().method8238(var15.field3582, var15.field3581, var15.field3583);
               return 1;
            } else if (var0 == 6610) {
               field483[++field479 - 1] = Client.method1738().method8265();
               field483[++field479 - 1] = Client.method1738().method8240();
               return 1;
            } else {
               class253 var12;
               if (var0 == 6611) {
                  var4 = field483[--field479];
                  var12 = Client.method1738().method8376(var4);
                  if (null == var12) {
                     field483[++field479 - 1] = 0;
                  } else {
                     field483[++field479 - 1] = var12.method4948().method6190();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = field483[--field479];
                  var12 = Client.method1738().method8376(var4);
                  if (null == var12) {
                     field483[++field479 - 1] = 0;
                     field483[++field479 - 1] = 0;
                  } else {
                     field483[++field479 - 1] = (var12.method4942() - var12.method4974() + 1) * 64;
                     field483[++field479 - 1] = (var12.method4944() - var12.method4943() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = field483[--field479];
                  var12 = Client.method1738().method8376(var4);
                  if (var12 == null) {
                     field483[++field479 - 1] = 0;
                     field483[++field479 - 1] = 0;
                     field483[++field479 - 1] = 0;
                     field483[++field479 - 1] = 0;
                  } else {
                     field483[++field479 - 1] = var12.method4974() * 64;
                     field483[++field479 - 1] = var12.method4943() * 64;
                     field483[++field479 - 1] = var12.method4942() * 64 + 64 - 1;
                     field483[++field479 - 1] = var12.method4944() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = field483[--field479];
                  var12 = Client.method1738().method8376(var4);
                  if (null == var12) {
                     field483[++field479 - 1] = -1;
                  } else {
                     field483[++field479 - 1] = var12.method4940();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = Client.method1738().method8241();
                  if (null == var15) {
                     field483[++field479 - 1] = -1;
                     field483[++field479 - 1] = -1;
                  } else {
                     field483[++field479 - 1] = var15.field3581;
                     field483[++field479 - 1] = var15.field3583;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  field483[++field479 - 1] = Client.method1738().method8315();
                  return 1;
               } else if (var0 == 6617) {
                  var15 = new class330(field483[--field479]);
                  var12 = Client.method1738().method8219();
                  if (null == var12) {
                     field483[++field479 - 1] = -1;
                     field483[++field479 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.method4932(var15.field3582, var15.field3581, var15.field3583);
                     if (var11 == null) {
                        field483[++field479 - 1] = -1;
                        field483[++field479 - 1] = -1;
                     } else {
                        field483[++field479 - 1] = var11[0];
                        field483[++field479 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  class330 var6;
                  if (var0 == 6618) {
                     var15 = new class330(field483[--field479]);
                     var12 = Client.method1738().method8219();
                     if (null == var12) {
                        field483[++field479 - 1] = -1;
                        field483[++field479 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.method4933(var15.field3581, var15.field3583);
                        if (null == var6) {
                           field483[++field479 - 1] = -1;
                        } else {
                           field483[++field479 - 1] = var6.method6190();
                        }

                        return 1;
                     }
                  } else {
                     class330 var9;
                     if (var0 == 6619) {
                        field479 -= 2;
                        var4 = field483[field479];
                        var9 = new class330(field483[field479 + 1]);
                        method6677(var4, var9, false);
                        return 1;
                     } else if (var0 == 6620) {
                        field479 -= 2;
                        var4 = field483[field479];
                        var9 = new class330(field483[field479 + 1]);
                        method6677(var4, var9, true);
                        return 1;
                     } else if (var0 == 6621) {
                        field479 -= 2;
                        var4 = field483[field479];
                        var9 = new class330(field483[1 + field479]);
                        var8 = Client.method1738().method8376(var4);
                        if (var8 == null) {
                           field483[++field479 - 1] = 0;
                           return 1;
                        } else {
                           field483[++field479 - 1] = var8.method4998(var9.field3582, var9.field3581, var9.field3583) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        field483[++field479 - 1] = Client.method1738().method8242();
                        field483[++field479 - 1] = Client.method1738().method8280();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new class330(field483[--field479]);
                        var12 = Client.method1738().method8215(var15.field3582, var15.field3581, var15.field3583);
                        if (null == var12) {
                           field483[++field479 - 1] = -1;
                        } else {
                           field483[++field479 - 1] = var12.method4935();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        Client.method1738().method8312(field483[--field479]);
                        return 1;
                     } else if (var0 == 6625) {
                        Client.method1738().method8232();
                        return 1;
                     } else if (var0 == 6626) {
                        Client.method1738().method8246(field483[--field479]);
                        return 1;
                     } else if (var0 == 6627) {
                        Client.method1738().method8247();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = field483[--field479] == 1;
                           Client.method1738().method8248(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = field483[--field479];
                           Client.method1738().method8249(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = field483[--field479];
                           Client.method1738().method8250(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           Client.method1738().method8251();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = field483[--field479] == 1;
                           Client.method1738().method8252(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (var0 == 6633) {
                              field479 -= 2;
                              var4 = field483[field479];
                              var10 = field483[1 + field479] == 1;
                              Client.method1738().method8253(var4, var10);
                              return 1;
                           } else if (var0 == 6634) {
                              field479 -= 2;
                              var4 = field483[field479];
                              var10 = 1 == field483[field479 + 1];
                              Client.method1738().method8254(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              field483[++field479 - 1] = Client.method1738().method8338() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = field483[--field479];
                              field483[++field479 - 1] = Client.method1738().method8256(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = field483[--field479];
                              field483[++field479 - 1] = Client.method1738().method8257(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              field479 -= 2;
                              var4 = field483[field479];
                              var9 = new class330(field483[field479 + 1]);
                              var6 = Client.method1738().method8260(var4, var9);
                              if (null == var6) {
                                 field483[++field479 - 1] = -1;
                              } else {
                                 field483[++field479 - 1] = var6.method6190();
                              }

                              return 1;
                           } else {
                              class282 var7;
                              if (var0 == 6639) {
                                 var7 = Client.method1738().method8262();
                                 if (var7 == null) {
                                    field483[++field479 - 1] = -1;
                                    field483[++field479 - 1] = -1;
                                 } else {
                                    field483[++field479 - 1] = var7.method5405();
                                    field483[++field479 - 1] = var7.field3046.method6190();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = Client.method1738().method8263();
                                 if (var7 == null) {
                                    field483[++field479 - 1] = -1;
                                    field483[++field479 - 1] = -1;
                                 } else {
                                    field483[++field479 - 1] = var7.method5405();
                                    field483[++field479 - 1] = var7.field3046.method6190();
                                 }

                                 return 1;
                              } else {
                                 class197 var5;
                                 if (var0 == 6693) {
                                    var4 = field483[--field479];
                                    var5 = class197.method4100(var4);
                                    if (var5.field2154 == null) {
                                       field484[++field486 - 1] = "";
                                    } else {
                                       field484[++field486 - 1] = var5.field2154;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = field483[--field479];
                                    var5 = class197.method4100(var4);
                                    field483[++field479 - 1] = var5.field2156;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = field483[--field479];
                                    var5 = class197.method4100(var4);
                                    if (var5 == null) {
                                       field483[++field479 - 1] = -1;
                                    } else {
                                       field483[++field479 - 1] = var5.field2170;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = field483[--field479];
                                    var5 = class197.method4100(var4);
                                    if (var5 == null) {
                                       field483[++field479 - 1] = -1;
                                    } else {
                                       field483[++field479 - 1] = var5.field2152;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    field483[++field479 - 1] = class53.field389.field2992;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    field483[++field479 - 1] = class53.field389.field2995.method6190();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    field483[++field479 - 1] = class53.field389.field2994.method6190();
                                    return 1;
                                 } else {
                                    return 2;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   static int method1506(int var0, class81 var1, boolean var2) {
      if (var0 == 6754) {
         int var6 = field483[--field479];
         class191 var7 = class191.method4208(var6);
         field484[++field486 - 1] = null != var7 ? var7.field2080 : "";
         return 1;
      } else {
         class191 var4;
         if (var0 == 6764) {
            field479 -= 2;
            var4 = class191.method4208(field483[field479]);
            int var5 = field483[1 + field479];
            field483[++field479 - 1] = var4.method3623(var5);
            field483[++field479 - 1] = var4.method3629(var5);
            return 1;
         } else if (var0 == 6765) {
            var4 = class191.method4208(field483[--field479]);
            field483[++field479 - 1] = null != var4 ? var4.field2073 : 0;
            return 1;
         } else {
            return 2;
         }
      }
   }

   static int method1773(int var0, class81 var1, boolean var2) {
      return 2;
   }

   static int method3247(int var0, class81 var1, boolean var2) {
      return 2;
   }

   static int method3934(int var0, class81 var1, boolean var2) {
      if (var0 == 7108) {
         field483[++field479 - 1] = Client.method2054() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static int method498(int var0, class81 var1, boolean var2) {
      return 2;
   }

   static int method5290(int var0, class81 var1, boolean var2) {
      int var4;
      Object var5;
      int var6;
      class518 var7;
      int var8;
      if (var0 != 7500 && var0 != 7508) {
         if (var0 != 7501) {
            int var21;
            int var23;
            if (var0 == 7502) {
               field479 -= 3;
               var4 = field483[field479];
               var21 = field483[field479 + 1];
               var6 = field483[2 + field479];
               var23 = class511.method4906(var21);
               var8 = class511.method1574(var21);
               int var25 = class403.method7092(var21);
               class515 var26 = class428.method7643(var4);
               class505 var27 = class505.method7608(var23);
               int[] var28 = var27.field5066[var8];
               int var13 = 0;
               int var14 = var28.length;
               if (var25 >= 0) {
                  if (var25 >= var14) {
                     throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
                  }

                  var13 = var25;
                  var14 = var25 + 1;
               }

               Object[] var15 = var26.method8698(var8);
               if (var15 == null && null != var27.field5068) {
                  var15 = var27.field5068[var8];
               }

               int var16;
               int var17;
               if (null == var15) {
                  for(var16 = var13; var16 < var14; ++var16) {
                     var17 = var28[var16];
                     class507 var29 = class516.method7421(var17);
                     if (var29 == class507.field5072) {
                        field484[++field486 - 1] = "";
                     } else {
                        field483[++field479 - 1] = class516.method6377(var17);
                     }
                  }

                  return 1;
               } else {
                  var16 = var15.length / var28.length;
                  if (var6 >= 0 && var6 < var16) {
                     for(var17 = var13; var17 < var14; ++var17) {
                        int var18 = var17 + var28.length * var6;
                        class507 var19 = class516.method7421(var28[var17]);
                        if (class507.field5072 == var19) {
                           field484[++field486 - 1] = (String)var15[var18];
                        } else {
                           field483[++field479 - 1] = (Integer)var15[var18];
                        }
                     }

                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               }
            } else if (var0 == 7503) {
               field479 -= 2;
               var4 = field483[field479];
               var21 = field483[1 + field479];
               var6 = 0;
               var23 = class511.method4906(var21);
               var8 = class511.method1574(var21);
               class515 var24 = class428.method7643(var4);
               class505 var10 = class505.method7608(var23);
               int[] var11 = var10.field5066[var8];
               Object[] var12 = var24.method8698(var8);
               if (var12 == null && var10.field5068 != null) {
                  var12 = var10.field5068[var8];
               }

               if (var12 != null) {
                  var6 = var12.length / var11.length;
               }

               field483[++field479 - 1] = var6;
               return 1;
            } else if (var0 != 7504 && var0 != 7510) {
               if (var0 == 7505) {
                  var4 = field483[--field479];
                  class515 var22 = class428.method7643(var4);
                  field483[++field479 - 1] = var22.field5114;
                  return 1;
               } else if (var0 == 7506) {
                  var4 = field483[--field479];
                  var21 = -1;
                  if (class275.field3019 != null && var4 >= 0 && var4 < class275.field3019.size()) {
                     var21 = (Integer)class275.field3019.get(var4);
                  }

                  field483[++field479 - 1] = var21;
                  return 1;
               } else if (var0 != 7507 && var0 != 7509) {
                  return 2;
               } else {
                  var4 = field483[--field479];
                  var5 = method1730(var4);
                  var6 = field483[--field479];
                  var7 = Client.method8125(var6);
                  if (null == var7) {
                     throw new RuntimeException();
                  } else if (class511.method4906(var6) != Client.field1535) {
                     throw new RuntimeException();
                  } else if (class275.field3019 == null && class275.field3019.isEmpty()) {
                     throw new RuntimeException();
                  } else {
                     var8 = class403.method7092(var6);
                     List var9 = var7.method8724(var5, var8);
                     class275.field3019 = new LinkedList(class275.field3019);
                     if (null != var9) {
                        class275.field3019.retainAll(var9);
                     } else {
                        class275.field3019.clear();
                     }

                     class227.field2506 = class275.field3019.iterator();
                     if (var0 == 7507) {
                        field483[++field479 - 1] = class275.field3019.size();
                     }

                     return 1;
                  }
               }
            } else {
               --field479;
               var4 = field483[field479];
               class518 var20 = Client.method3241(var4);
               if (var20 == null) {
                  throw new RuntimeException();
               } else {
                  class275.field3019 = var20.method8724(0, 0);
                  var6 = 0;
                  if (null != class275.field3019) {
                     Client.field1535 = var4;
                     class227.field2506 = class275.field3019.iterator();
                     var6 = class275.field3019.size();
                  }

                  if (var0 == 7504) {
                     field483[++field479 - 1] = var6;
                  }

                  return 1;
               }
            }
         } else {
            if (null != class227.field2506 && class227.field2506.hasNext()) {
               field483[++field479 - 1] = (Integer)class227.field2506.next();
            } else {
               field483[++field479 - 1] = -1;
            }

            return 1;
         }
      } else {
         var4 = field483[--field479];
         var5 = method1730(var4);
         var6 = field483[--field479];
         var7 = Client.method8125(var6);
         if (var7 == null) {
            throw new RuntimeException();
         } else {
            var8 = class403.method7092(var6);
            class275.field3019 = var7.method8724(var5, var8);
            if (class275.field3019 != null) {
               Client.field1535 = class511.method4906(var6);
               class227.field2506 = class275.field3019.iterator();
               if (var0 == 7500) {
                  field483[++field479 - 1] = class275.field3019.size();
               }
            } else {
               Client.field1535 = -1;
               class227.field2506 = null;
               if (var0 == 7500) {
                  field483[++field479 - 1] = 0;
               }
            }

            return 1;
         }
      }
   }

   static int method1196(int var0, class81 var1, boolean var2) {
      return 2;
   }

   static void method1076(int var0) {
      if (var0 != -1) {
         if (class332.method1200(var0)) {
            class332[] var2 = class96.field884[var0];

            for(int var3 = 0; var3 < var2.length; ++var3) {
               class332 var4 = var2[var3];
               if (var4.field3705 != null) {
                  class87 var5 = new class87();
                  var5.field786 = var4;
                  var5.field790 = var4.field3705;
                  method2337(var5, 5000000, 0);
               }
            }

         }
      }
   }

   static void method6677(int var0, class330 var1, boolean var2) {
      class253 var4 = Client.method1738().method8376(var0);
      int var5 = class146.field1362.field759;
      int var6 = (class146.field1362.field949 >> 7) + class342.field3837;
      int var7 = (class146.field1362.field963 >> 7) + class144.field1352;
      class330 var8 = new class330(var5, var6, var7);
      Client.method1738().method8333(var4, var8, var1, var2);
   }

   static Object method2576(class507 var0) {
      if (var0 == null) {
         throw new IllegalStateException("popValueOfType() failure - null baseVarType");
      } else {
         switch (var0.field5075) {
            case 0:
               return field483[--field479];
            case 2:
               return field484[--field486];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
         }
      }
   }

   static Object method1730(int var0) {
      return method2576((class507)class373.method1724(class507.method8599(), var0));
   }
}
