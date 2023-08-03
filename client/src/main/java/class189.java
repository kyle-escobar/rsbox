public class class189 extends class476 {
   public static class290 field2030 = new class290(64);
   public static class342 field2034;
   public static int field2029;
   static String field2035;
   public int field2028 = 0;

   class189() {
   }

   public static class189 method3216(int var0) {
      class189 var2 = (class189)field2030.method5643((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field2034.method6381(16, var0);
         var2 = new class189();
         if (var3 != null) {
            var2.method3595(new Buffer(var3));
         }

         field2030.method5640(var2, (long)var0);
         return var2;
      }
   }

   static final void method3596(class86 var0, int var1, int var2, int var3) {
      class191 var5 = var0.field776;
      if (Client.field1594 < 400) {
         if (null != var5.field2066) {
            var5 = var5.method3652();
         }

         if (null != var5) {
            if (var5.field2082) {
               if (!var5.field2085 || Client.field1609 == var1) {
                  String var6 = var0.method1845();
                  int var7;
                  int var10;
                  if (var5.field2073 != 0 && 0 != var0.field1016) {
                     var7 = -1 != var0.field1016 ? var0.field1016 : var5.field2073;
                     var10 = class146.field1362.field743;
                     int var11 = var10 - var7;
                     String var9;
                     if (var11 < -9) {
                        var9 = class90.method5890(16711680);
                     } else if (var11 < -6) {
                        var9 = class90.method5890(16723968);
                     } else if (var11 < -3) {
                        var9 = class90.method5890(16740352);
                     } else if (var11 < 0) {
                        var9 = class90.method5890(16756736);
                     } else if (var11 > 9) {
                        var9 = class90.method5890(65280);
                     } else if (var11 > 6) {
                        var9 = class90.method5890(4259584);
                     } else if (var11 > 3) {
                        var9 = class90.method5890(8453888);
                     } else if (var11 > 0) {
                        var9 = class90.method5890(12648192);
                     } else {
                        var9 = class90.method5890(16776960);
                     }

                     var6 = var6 + var9 + " " + class90.field831 + class364.field4253 + var7 + class90.field830;
                  }

                  if (var5.field2085 && Client.field1692) {
                     Client.method3242(class364.field4185, class90.method5890(16776960) + var6, 1003, var1, var2, var3);
                  }

                  if (Client.field1494 == 1) {
                     Client.method3242(class364.field4277, Client.field1473 + " " + class90.field828 + " " + class90.method5890(16776960) + var6, 7, var1, var2, var3);
                  } else if (Client.field1657) {
                     if (2 == (class37.field195 & 2)) {
                        Client.method3242(Client.field1552, Client.field1650 + " " + class90.field828 + " " + class90.method5890(16776960) + var6, 8, var1, var2, var3);
                     }
                  } else {
                     var7 = var5.field2085 && Client.field1692 ? 2000 : 0;
                     String[] var8 = var5.field2072;
                     int var13;
                     if (var8 != null) {
                        for(var13 = 4; var13 >= 0; --var13) {
                           if (var0.method1844(var13) && var8[var13] != null && !var8[var13].equalsIgnoreCase(class364.field4186)) {
                              var10 = 0;
                              if (var13 == 0) {
                                 var10 = var7 + 9;
                              }

                              if (var13 == 1) {
                                 var10 = var7 + 10;
                              }

                              if (var13 == 2) {
                                 var10 = var7 + 11;
                              }

                              if (var13 == 3) {
                                 var10 = var7 + 12;
                              }

                              if (var13 == 4) {
                                 var10 = var7 + 13;
                              }

                              Client.method3242(var8[var13], class90.method5890(16776960) + var6, var10, var1, var2, var3);
                           }
                        }
                     }

                     if (null != var8) {
                        for(var13 = 4; var13 >= 0; --var13) {
                           if (var0.method1844(var13) && null != var8[var13] && var8[var13].equalsIgnoreCase(class364.field4186)) {
                              short var12 = 0;
                              if (class101.field934 != Client.field1461) {
                                 if (Client.field1461 == class101.field933 || Client.field1461 == class101.field932 && var5.field2073 > class146.field1362.field743) {
                                    var12 = 2000;
                                 }

                                 var10 = 0;
                                 if (var13 == 0) {
                                    var10 = var12 + 9;
                                 }

                                 if (var13 == 1) {
                                    var10 = var12 + 10;
                                 }

                                 if (var13 == 2) {
                                    var10 = var12 + 11;
                                 }

                                 if (var13 == 3) {
                                    var10 = var12 + 12;
                                 }

                                 if (var13 == 4) {
                                    var10 = var12 + 13;
                                 }

                                 Client.method3242(var8[var13], class90.method5890(16776960) + var6, var10, var1, var2, var3);
                              }
                           }
                        }
                     }

                     if (!var5.field2085 || !Client.field1692) {
                        Client.method3242(class364.field4185, class90.method5890(16776960) + var6, 1003, var1, var2, var3);
                     }
                  }

               }
            }
         }
      }
   }

   void method3595(Buffer var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method3594(var1, var3);
      }
   }

   void method3594(Buffer var1, int var2) {
      if (var2 == 5) {
         this.field2028 = var1.readUnsignedShort();
      }

   }
}
