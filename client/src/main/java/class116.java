public class class116 {
   static byte[] field1113 = new byte[2048];
   static class223[] field1114 = new class223[2048];
   static class519 field1125 = new class519(new byte[5000]);
   static class519[] field1111 = new class519[2048];
   static int field1116 = 0;
   static int field1118 = 0;
   static int field1121 = 0;
   static int[] field1115 = new int[2048];
   static int[] field1119 = new int[2048];
   static int[] field1120 = new int[2048];
   static int[] field1122 = new int[2048];
   static int[] field1123 = new int[2048];
   static int[] field1124 = new int[2048];

   class116() throws Throwable {
   }

   static final void method3290(class497 var0) {
      var0.method8476();
      int var2 = Client.field1716;
      class84 var3 = class146.field1362 = Client.field1527[var2] = new class84();
      var3.field755 = var2;
      int var4 = var0.method8483(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field945[0] = var6 - class342.field3837;
      var3.field949 = (var3.field945[0] << 7) + (var3.method1788() << 6);
      var3.field1012[0] = var7 - class144.field1352;
      var3.field963 = (var3.field1012[0] << 7) + (var3.method1788() << 6);
      class44.field306 = var3.field759 = var5;
      if (field1111[var2] != null) {
         var3.method1784(field1111[var2]);
      }

      field1116 = 0;
      field1120[++field1116 - 1] = var2;
      field1113[var2] = 0;
      field1118 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.method8483(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            field1115[var8] = var12 + (var10 << 28) + (var11 << 14);
            field1122[var8] = 0;
            field1123[var8] = -1;
            field1119[++field1118 - 1] = var8;
            field1113[var8] = 0;
         }
      }

      var0.method8482();
   }

   static final void method1963(class497 var0, int var1) {
      int var3 = var0.field5129;
      field1121 = 0;
      int var4 = 0;
      var0.method8476();

      byte[] var10000;
      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 < field1116; ++var5) {
         var6 = field1120[var5];
         if ((field1113[var6] & 1) == 0) {
            if (var4 > 0) {
               --var4;
               var10000 = field1113;
               var10000[var6] = (byte)(var10000[var6] | 2);
            } else {
               var7 = var0.method8483(1);
               if (var7 == 0) {
                  var4 = class134.method2468(var0);
                  var10000 = field1113;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  class348.method6498(var0, var6);
               }
            }
         }
      }

      var0.method8482();
      if (var4 != 0) {
         throw new RuntimeException();
      } else {
         var0.method8476();

         for(var5 = 0; var5 < field1116; ++var5) {
            var6 = field1120[var5];
            if (0 != (field1113[var6] & 1)) {
               if (var4 > 0) {
                  --var4;
                  var10000 = field1113;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  var7 = var0.method8483(1);
                  if (var7 == 0) {
                     var4 = class134.method2468(var0);
                     var10000 = field1113;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     class348.method6498(var0, var6);
                  }
               }
            }
         }

         var0.method8482();
         if (var4 != 0) {
            throw new RuntimeException();
         } else {
            var0.method8476();

            for(var5 = 0; var5 < field1118; ++var5) {
               var6 = field1119[var5];
               if ((field1113[var6] & 1) != 0) {
                  if (var4 > 0) {
                     --var4;
                     var10000 = field1113;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     var7 = var0.method8483(1);
                     if (var7 == 0) {
                        var4 = class134.method2468(var0);
                        var10000 = field1113;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else if (method3853(var0, var6)) {
                        var10000 = field1113;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     }
                  }
               }
            }

            var0.method8482();
            if (var4 != 0) {
               throw new RuntimeException();
            } else {
               var0.method8476();

               for(var5 = 0; var5 < field1118; ++var5) {
                  var6 = field1119[var5];
                  if (0 == (field1113[var6] & 1)) {
                     if (var4 > 0) {
                        --var4;
                        var10000 = field1113;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else {
                        var7 = var0.method8483(1);
                        if (var7 == 0) {
                           var4 = class134.method2468(var0);
                           var10000 = field1113;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        } else if (method3853(var0, var6)) {
                           var10000 = field1113;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        }
                     }
                  }
               }

               var0.method8482();
               if (var4 != 0) {
                  throw new RuntimeException();
               } else {
                  field1116 = 0;
                  field1118 = 0;

                  for(var5 = 1; var5 < 2048; ++var5) {
                     var10000 = field1113;
                     var10000[var5] = (byte)(var10000[var5] >> 1);
                     class84 var8 = Client.field1527[var5];
                     if (null != var8) {
                        field1120[++field1116 - 1] = var5;
                     } else {
                        field1119[++field1118 - 1] = var5;
                     }
                  }

                  method249(var0);
                  if (var0.field5129 - var3 != var1) {
                     throw new RuntimeException(var0.field5129 - var3 + " " + var1);
                  }
               }
            }
         }
      }
   }

   static boolean method3853(class497 var0, int var1) {
      int var3 = var0.method8483(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.method8483(1) != 0) {
            method3853(var0, var1);
         }

         var4 = var0.method8483(13);
         var5 = var0.method8483(13);
         boolean var12 = var0.method8483(1) == 1;
         if (var12) {
            field1124[++field1121 - 1] = var1;
         }

         if (Client.field1527[var1] != null) {
            throw new RuntimeException();
         } else {
            class84 var13 = Client.field1527[var1] = new class84();
            var13.field755 = var1;
            if (field1111[var1] != null) {
               var13.method1784(field1111[var1]);
            }

            var13.field1007 = field1122[var1];
            var13.field975 = field1123[var1];
            var8 = field1115[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.field998[0] = field1114[var1];
            var13.field759 = (byte)var9;
            var13.method1795((var10 << 13) + var4 - class342.field3837, var5 + (var11 << 13) - class144.field1352);
            var13.field744 = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.method8483(2);
         var5 = field1115[var1];
         field1115[var1] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
         return false;
      } else {
         int var6;
         int var7;
         if (var3 == 2) {
            var4 = var0.method8483(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = field1115[var1];
            var8 = (var7 >> 28) + var5 & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            field1115[var1] = (var8 << 28) + (var9 << 14) + var10;
            return false;
         } else {
            var4 = var0.method8483(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = field1115[var1];
            var9 = var5 + (var8 >> 28) & 3;
            var10 = var6 + (var8 >> 14) & 255;
            var11 = var7 + var8 & 255;
            field1115[var1] = var11 + (var10 << 14) + (var9 << 28);
            return false;
         }
      }
   }

   static final void method249(class497 var0) {
      for(int var2 = 0; var2 < field1121; ++var2) {
         int var3 = field1124[var2];
         class84 var4 = Client.field1527[var3];
         int var5 = var0.method8748();
         if ((var5 & 4) != 0) {
            var5 += var0.method8748() << 8;
         }

         if (0 != (var5 & 16384)) {
            var5 += var0.method8748() << 16;
         }

         byte var6 = class223.field2454.field2452;
         if (0 != (var5 & 512)) {
            class223[] var7 = field1114;
            class223[] var9 = new class223[]{class223.field2454, class223.field2457, class223.field2451, class223.field2450};
            var7[var3] = (class223)class373.method1724(var9, var0.method8784());
         }

         int var18;
         if ((var5 & 32) != 0) {
            var4.field975 = var0.method8792();
            var4.field975 += var0.method8748() << 16;
            var18 = 16777215;
            if (var4.field975 == var18) {
               var4.field975 = -1;
            }
         }

         int var8;
         if ((var5 & 2) != 0) {
            var18 = var0.method8749();
            if (var18 == 65535) {
               var18 = -1;
            }

            var8 = var0.method8781();
            class265.method5208(var4, var18, var8);
         }

         int var10;
         int var11;
         int var14;
         if ((var5 & 16) != 0) {
            var18 = var0.method8750();
            class361 var19 = (class361)class373.method1724(class361.method2121(), var0.method8782());
            boolean var20 = var0.method8748() == 1;
            var10 = var0.method8751();
            var11 = var0.field5129;
            if (null != var4.field740 && null != var4.field764) {
               boolean var12 = false;
               if (var19.field3997 && class165.field1782.method1096(var4.field740)) {
                  var12 = true;
               }

               if (!var12 && Client.field1553 == 0 && !var4.field760) {
                  field1125.field5129 = 0;
                  var0.method8806(field1125.field5127, 0, var10);
                  field1125.field5129 = 0;
                  String var13 = class407.method7161(class380.method2549(class307.method5741(field1125)));
                  var4.field971 = var13.trim();
                  var4.field965 = var18 >> 8;
                  var4.field966 = var18 & 255;
                  var4.field940 = 150;
                  var4.field947 = null;
                  var4.field962 = var20;
                  var4.field950 = var4 != class146.field1362 && var19.field3997 && !Client.field1663.isEmpty() && var13.toLowerCase().indexOf(Client.field1663) == -1;
                  if (var19.field3996) {
                     var14 = var20 ? 91 : 1;
                  } else {
                     var14 = var20 ? 90 : 2;
                  }

                  if (-1 != var19.field3995) {
                     class119.method7274(var14, class90.method2108(var19.field3995) + var4.field740.method9155(), var13);
                  } else {
                     class119.method7274(var14, var4.field740.method9155(), var13);
                  }
               }
            }

            var0.field5129 = var11 + var10;
         }

         if ((var5 & 8192) != 0) {
            for(var18 = 0; var18 < 3; ++var18) {
               var4.field742[var18] = var0.method8873();
            }
         }

         if (0 != (var5 & 4096)) {
            var4.field992 = var0.method8786();
            var4.field994 = var0.method8784();
            var4.field954 = var0.method8784();
            var4.field982 = var0.method8786();
            var4.field964 = var0.method8778() + Client.field1445;
            var4.field997 = var0.method8792() + Client.field1445;
            var4.field990 = var0.method8792();
            if (var4.field744) {
               var4.field992 += var4.field758;
               var4.field994 += var4.field766;
               var4.field954 += var4.field758;
               var4.field982 += var4.field766;
               var4.field1010 = 0;
            } else {
               var4.field992 += var4.field945[0];
               var4.field994 += var4.field1012[0];
               var4.field954 += var4.field945[0];
               var4.field982 += var4.field1012[0];
               var4.field1010 = 1;
            }

            var4.field1015 = 0;
         }

         if (0 != (var5 & 64)) {
            var4.field971 = var0.method8873();
            if (var4.field971.charAt(0) == '~') {
               var4.field971 = var4.field971.substring(1);
               class119.method7274(2, var4.field740.method9155(), var4.field971);
            } else if (var4 == class146.field1362) {
               class119.method7274(2, var4.field740.method9155(), var4.field971);
            }

            var4.field962 = false;
            var4.field965 = 0;
            var4.field966 = 0;
            var4.field940 = 150;
         }

         if ((var5 & '\u8000') != 0) {
            var6 = var0.method8786();
         }

         int var21;
         int var28;
         int var29;
         if ((var5 & 2048) != 0) {
            var18 = var0.method8792();
            var8 = var18 >> 8;
            var21 = var8 >= 13 && var8 <= 20 ? var8 - 12 : 0;
            class361 var22 = (class361)class373.method1724(class361.method2121(), var0.method8781());
            boolean var26 = var0.method8781() == 1;
            var28 = var0.method8781();
            var29 = var0.field5129;
            if (var4.field740 != null && var4.field764 != null) {
               boolean var30 = false;
               if (var22.field3997 && class165.field1782.method1096(var4.field740)) {
                  var30 = true;
               }

               if (!var30 && Client.field1553 == 0 && !var4.field760) {
                  field1125.field5129 = 0;
                  var0.method8997(field1125.field5127, 0, var28);
                  field1125.field5129 = 0;
                  String var15 = class407.method7161(class380.method2549(class307.method5741(field1125)));
                  var4.field971 = var15.trim();
                  var4.field965 = var18 >> 8;
                  var4.field966 = var18 & 255;
                  var4.field940 = 150;
                  byte[] var16 = null;
                  int var17;
                  if (var21 > 0 && var21 <= 8) {
                     var16 = new byte[var21];

                     for(var17 = 0; var17 < var21; ++var17) {
                        var16[var17] = var0.method8785();
                     }
                  }

                  var4.field947 = class533.method7678(var16);
                  var4.field962 = var26;
                  var4.field950 = class146.field1362 != var4 && var22.field3997 && !Client.field1663.isEmpty() && var15.toLowerCase().indexOf(Client.field1663) == -1;
                  if (var22.field3996) {
                     var17 = var26 ? 91 : 1;
                  } else {
                     var17 = var26 ? 90 : 2;
                  }

                  if (-1 != var22.field3995) {
                     class119.method7274(var17, class90.method2108(var22.field3995) + var4.field740.method9155(), var15);
                  } else {
                     class119.method7274(var17, var4.field740.method9155(), var15);
                  }
               }
            }

            var0.field5129 = var21 + var29 + var28;
         }

         if (0 != (var5 & 65536)) {
            var18 = var0.method8781();

            for(var8 = 0; var8 < var18; ++var8) {
               var21 = var0.method8751();
               var10 = var0.method8750();
               var11 = var0.method8804();
               var4.method2080(var21, var10, var11 >> 16, var11 & '\uffff');
            }
         }

         if (0 != (var5 & 8)) {
            var18 = var0.method8781();
            if (var18 > 0) {
               for(var8 = 0; var8 < var18; ++var8) {
                  var10 = -1;
                  var11 = -1;
                  var28 = -1;
                  var21 = var0.method8764();
                  if (var21 == 32767) {
                     var21 = var0.method8764();
                     var11 = var0.method8764();
                     var10 = var0.method8764();
                     var28 = var0.method8764();
                  } else if (var21 != 32766) {
                     var11 = var0.method8764();
                  } else {
                     var21 = -1;
                  }

                  var29 = var0.method8764();
                  var4.method2066(var21, var11, var10, var28, Client.field1445, var29);
               }
            }

            var8 = var0.method8782();
            if (var8 > 0) {
               for(var21 = 0; var21 < var8; ++var21) {
                  var10 = var0.method8764();
                  var11 = var0.method8764();
                  if (var11 != 32767) {
                     var28 = var0.method8764();
                     var29 = var0.method8748();
                     var14 = var11 > 0 ? var0.method8782() : var29;
                     var4.method2067(var10, Client.field1445, var11, var28, var29, var14);
                  } else {
                     var4.method2068(var10);
                  }
               }
            }
         }

         if ((var5 & 128) != 0) {
            var4.field977 = var0.method8778();
            if (var4.field1010 == 0) {
               var4.field1007 = var4.field977;
               var4.method2073();
            }
         }

         if (0 != (var5 & 256)) {
            var4.field941 = Client.field1445 + var0.method8750();
            var4.field1002 = Client.field1445 + var0.method8792();
            var4.field1003 = var0.method8786();
            var4.field996 = var0.method8785();
            var4.field1005 = var0.method8768();
            var4.field1006 = (byte)var0.method8748();
         }

         if ((var5 & 1) != 0) {
            var18 = var0.method8748();
            byte[] var23 = new byte[var18];
            class519 var27 = new class519(var23);
            var0.method8997(var23, 0, var18);
            field1111[var3] = var27;
            var4.method1784(var27);
         }

         if (var4.field744) {
            if (var6 == 127) {
               var4.method1795(var4.field758, var4.field766);
            } else {
               class223 var24;
               if (var6 != class223.field2454.field2452) {
                  class223[] var25 = new class223[]{class223.field2454, class223.field2457, class223.field2451, class223.field2450};
                  var24 = (class223)class373.method1724(var25, var6);
               } else {
                  var24 = field1114[var3];
               }

               var4.method1786(var4.field758, var4.field766, var24);
            }
         }
      }

   }

   static void method4187() {
      field1116 = 0;

      for(int var1 = 0; var1 < 2048; ++var1) {
         field1111[var1] = null;
         field1114[var1] = class223.field2457;
      }

   }
}
